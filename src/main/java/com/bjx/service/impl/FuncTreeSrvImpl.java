package com.bjx.service.impl;

import com.bjx.dao.mysql.FuncTreeDao;
import com.bjx.domain.mysql.FuncTree;
import com.bjx.domain.mysql.FuncTreeExample;
import com.bjx.service.FuncTreeSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bjx on 2017/4/18.
 */


@Service("funcTreeSrv")
public class FuncTreeSrvImpl  implements FuncTreeSrv{

    @Autowired
    private FuncTreeDao funcTreeDao ;


    @Override
    public FuncTree selectFuncTreeById(String id) {
        return funcTreeDao.selectByPrimaryKey(id);
    }

    @Override
    public List<FuncTree> selectFuncTreeListByParentId(String parentId) {
        FuncTreeExample funcTreeExample = new FuncTreeExample() ;
        funcTreeExample.createCriteria().andParentEqualTo(parentId);
        List<FuncTree> funcTrees = funcTreeDao.selectByExample(funcTreeExample);
        return funcTrees;
    }

    @Override
    public List<FuncTree> selectFuncTreeListWithChildById(String Id) {
        FuncTree funcTree = funcTreeDao.selectByPrimaryKey(Id);
        funcTree.setChildList(this.selectFuncTreeListByParentId(Id));
        List<FuncTree> funcTreeList = new ArrayList<FuncTree>(1) ;
        funcTreeList.add(funcTree);
        return funcTreeList;
    }
}
