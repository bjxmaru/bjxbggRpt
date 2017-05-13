package com.bjx.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bjx.dao.oracle.InvClassDao;
import com.bjx.domain.mysql.FuncTree;
import com.bjx.domain.oracle.BdInvcl;
import com.bjx.service.FuncTreeSrv;
import com.bjx.service.MissSrv;
import com.bjx.util.StaticVariable;
import com.sun.corba.se.spi.ior.ObjectKey;
import com.sun.glass.ui.TouchInputSupport;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsCsvView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.function.DoubleToIntFunction;

/**
 * Created by bjx on 2017/4/21.
 */

@Controller("invClassCtr")
@RequestMapping("/invClassCtr")
public class InvClassCtr {

    @Autowired
    private FuncTreeSrv  funcTreeSrv ;

    @Autowired
    private MissSrv missSrv ;



    @RequestMapping("/invClassHrefForCol")
    public String  invClassHrefForCol(String funcTreeId , Model model) {

        model.addAttribute("funcTreeObj" ,funcTreeSrv.selectFuncTreeById(funcTreeId) );
        model.addAttribute("initPageSize", StaticVariable.INIT_PAGE_SIZE) ;
        model.addAttribute("initPageNumber", 1);

        return "/WEB-INF/jsp/invClassHrefForCol.jsp" ;
    }


    @RequestMapping("/invClassData")
    @ResponseBody
    public  JSONObject invClassData( BdInvcl bdInvclParam, Integer page, Integer rows) {

        //获取总行数
        long totalRowNumber = missSrv.selectInvClassTotalRowNumberByInvclass(bdInvclParam);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("total", totalRowNumber);

        JSONArray jsonArray = new JSONArray();
        List<BdInvcl> bdInvcls = missSrv.selectInvClassListByInvclass(bdInvclParam,page, rows);
        for (BdInvcl bdInvcl : bdInvcls) {

            JSONObject tmpJson = new JSONObject(true);
            tmpJson.put("pkInvcl", bdInvcl.getPkInvcl());
            tmpJson.put("invclasscode", bdInvcl.getInvclasscode());
            tmpJson.put("invclassname", bdInvcl.getInvclassname());

            jsonArray.add(tmpJson);
        }

        jsonObject.put("rows", jsonArray);

        return  jsonObject;
    }


    @RequestMapping("/invClassDataExcel")
    public String   exportExcel(HttpServletRequest request , HttpServletResponse response ) throws IOException {

        String fileName =  "测试导出EXCEL.xls";

        List<BdInvcl> bdInvcls = missSrv.selectInvClassListInvClassCode("%");

        HSSFWorkbook  workBook = new HSSFWorkbook();//创建一个工作薄对象

        HSSFSheet sheet = workBook.createSheet("存货分类");
        HSSFRow rowHead = sheet.createRow(0);
        rowHead.createCell(0).setCellValue("存货类别主键");
        rowHead.createCell(1).setCellValue("存货类别编码");
        rowHead.createCell(2).setCellValue("存货类别名称");

        int rowNumber = 1;
        for (BdInvcl bdInvcl : bdInvcls) {
            HSSFRow row = sheet.createRow(rowNumber++);
            int  colnumber = 0 ;
            row.createCell(colnumber++).setCellValue(bdInvcl.getPkInvcl());
            row.createCell(colnumber++).setCellValue(bdInvcl.getInvclasscode());
            row.createCell(colnumber++).setCellValue(bdInvcl.getInvclassname());
        }



        fileName = new String(fileName.getBytes("GBK"), "ISO-8859-1");
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-disposition", "attachment;filename="+fileName);
        response.setBufferSize(1024);

        workBook.write(response.getOutputStream()) ;
        response.getOutputStream().close();
        return null;

    }

    @RequestMapping("/invClassDataWithCond")
    public String invClassDataWithCond(BdInvcl bdInvcl) {

        System.out.println(bdInvcl.getInvclasscode());
        System.out.println("----");

        return null;
    }




}
