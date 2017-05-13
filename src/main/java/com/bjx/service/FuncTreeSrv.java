package com.bjx.service;

import com.bjx.domain.mysql.FuncTree;

import java.util.List;

/**
 * Created by bjx on 2017/4/18.
 */
public interface FuncTreeSrv {


    public FuncTree selectFuncTreeById(String id) ;

    public List<FuncTree> selectFuncTreeListByParentId(String parentId) ;

    public List<FuncTree> selectFuncTreeListWithChildById(String Id) ;


}
