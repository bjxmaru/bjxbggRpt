package com.bjx.dao.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bjx.controller.InitRptCtr;
import com.bjx.dao.mysql.FuncTreeDao;
import com.bjx.domain.mysql.FuncTree;
import com.bjx.domain.oracle.BdInvcl;
import com.bjx.service.MissSrv;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by bjx on 2017/4/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext-*.xml")

public class FuncTreeDaoTest {

    @Autowired
    private ApplicationContext ctx;


    @Test
    public void test01(){

        System.out.println("--------------测试   test01  开始");

        FuncTreeDao funcTreeDao = ctx.getBean("funcTreeDao" ,FuncTreeDao.class);

        FuncTree funcTree = funcTreeDao.selectByPrimaryKey("1");



        System.out.println(funcTree.getMenuName());



        System.out.println("--------------测试   test01 结束");
    }

     @Test
    public void test02(){

        System.out.println("--------------测试   test02  开始");

        FuncTreeDao funcTreeDao = ctx.getBean("funcTreeDao" ,FuncTreeDao.class);

        FuncTree funcTree = funcTreeDao.selectByPrimaryKey("10303");

        funcTree.setFnMapper("/invAgeInfo");

        funcTreeDao.updateByPrimaryKey(funcTree);

        System.out.println(funcTree.getFnMapper());



        System.out.println("--------------测试   test02 结束");
    }

    @Test
    public void test03(){

        System.out.println("--------------测试   test03  开始");

        InitRptCtr initRptCtr = ctx.getBean("initRptCtr" ,InitRptCtr.class);

        JSONArray  jsonArray =  initRptCtr.loadFuncTreeData(null);

        System.out.println(jsonArray.toJSONString());


        System.out.println("--------------测试   test03 结束");
    }

    @Test
    public void test04(){

        MissSrv missSrv = ctx.getBean("missSrv", MissSrv.class);

        BdInvcl  bdInvcl  = new BdInvcl()  ;
        bdInvcl.setInvclasscode("01%");
        bdInvcl.setInvclassname("%");

        long totalRowNumbers  = missSrv.selectInvClassTotalRowNumberByInvclass(bdInvcl);

        System.out.println(totalRowNumbers);

    }



}
