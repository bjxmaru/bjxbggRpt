package com.bjx.service;

import com.bjx.domain.oracle.BdInvcl;
import com.bjx.domain.oracle.BdInvclExample;

import java.util.List;

/**
 * Created by bjx on 2017/4/23.
 */
public interface MissSrv {


    public BdInvcl selectInvclassById(String id);

    public List<BdInvcl> selectInvClassListInvClassCode(String invClassCode);

    public List<BdInvcl> selectInvClassListByPageInfo(Integer pageNumber, Integer pageSize);

    public long selectInvClassTotalRowNumber()  ;

    public long selectInvClassTotalRowNumberByInvclass(BdInvcl  bdInvcl) ;

    public List<BdInvcl>  selectInvClassListByInvclass(BdInvcl bdInvcl , Integer pageNumber, Integer pageSize) ;

}
