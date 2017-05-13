package com.bjx.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bjx.domain.mysql.FuncTree;
import com.bjx.service.FuncTreeSrv;
import com.bjx.util.Json2ObjectUtil;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.function.DoubleToIntFunction;

/**
 * Created by bjx on 2017/4/21.
 */

@RequestMapping("/initRptCtr")
@Controller("initRptCtr")

public class InitRptCtr {

    @Resource(name="funcTreeSrv")
    private FuncTreeSrv funcTreeSrv ;

    public  static  final String WEB_INF_JSP = "/WEB-INF/jsp" ;

    @RequestMapping("/initPage")
    public String initFunctreePage() {
        return WEB_INF_JSP + "/init.jsp";
    }


    @RequestMapping("/loadFuncTreeData")
    @ResponseBody
    public JSONArray loadFuncTreeData(String  id) {

        List<FuncTree> funcTreeList =  null;

        if( id == null) {

            id = "1" ;

            funcTreeList = funcTreeSrv.selectFuncTreeListWithChildById(id) ;

        } else {

            funcTreeList = funcTreeSrv.selectFuncTreeListByParentId(id) ;
        }



        JSONArray jsonArray = new JSONArray( );


        if( funcTreeList != null &&  funcTreeList.size() > 0 ) {

            for( FuncTree funcTree : funcTreeList) {

                JSONObject jsonObject = new JSONObject() ;

                Json2ObjectUtil.funcTreeJsonUtil (jsonObject, funcTree);

                jsonArray.add(jsonObject);
            }

        }

        return  jsonArray ;
    }


    @RequestMapping("/tabHrefJspDisp")
    public String  tabHrefJspDisp(String funcTreeId ){

        //根究functreeid,得到所点击的功能树的数据
        final FuncTree  funcTree = funcTreeSrv.selectFuncTreeById(funcTreeId);

        return "forward:" + funcTree.getFnMapper() ;

    }




}
