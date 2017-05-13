package com.bjx.service.impl;

import com.bjx.dao.oracle.InvClassDao;
import com.bjx.domain.oracle.BdInvcl;
import com.bjx.domain.oracle.BdInvclExample;
import com.bjx.service.MissSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by bjx on 2017/4/23.
 */

@Service("missSrv")
public class MissSrvImpl   implements MissSrv {

    private JdbcTemplate  jdbcTemplate ;

    @Autowired
    private InvClassDao invClassDao ;

    @Autowired
    @Qualifier("dataSourceOracle")
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public long selectInvClassTotalRowNumber() {
        return invClassDao.countByExample(null);

    }



    @Override
    public BdInvcl selectInvclassById(String id) {
        return invClassDao.selectByPrimaryKey(id);
    }

    @Override
    public List<BdInvcl> selectInvClassListInvClassCode(String invClassCode) {
        BdInvclExample bdInvclExample = new BdInvclExample();
        bdInvclExample.createCriteria().andInvclasscodeLike(invClassCode) ;
        return invClassDao.selectByExample(bdInvclExample);
    }

    @Override
    public List<BdInvcl> selectInvClassListByPageInfo(Integer pageNumber, Integer pageSize) {

        int rowStart = (pageNumber - 1) * pageSize+1;
        int rowEnd =  rowStart + pageSize ;
        String sql = " select * from (select bd_invcl.* ,rownum rowNumber from bd_invcl where rownum < ? )  where  rowNumber >=? " ;

        return  jdbcTemplate.query(sql, new RowMapper<BdInvcl>() {
            @Override
            public BdInvcl mapRow(ResultSet rs, int rowNum) throws SQLException {
                BdInvcl bdInvcl = new BdInvcl();
                bdInvcl.setPkInvcl(rs.getString("pk_invcl"));
                bdInvcl.setInvclasscode(rs.getString("invClassCode"));
                bdInvcl.setInvclassname(rs.getString("invclassname"));
                return bdInvcl;
            }
        } , rowEnd , rowStart) ;

    }


    @Override
    public List<BdInvcl> selectInvClassListByInvclass(BdInvcl bdInvcl, Integer pageNumber, Integer pageSize) {

        int rowStart = (pageNumber - 1) * pageSize+1;
        int rowEnd =  rowStart + pageSize ;
        String sql = " select * from (select bd_invcl.* ,rownum rowNumber from bd_invcl where  rownum < ?   and   invclasscode like ?  and invclassname like  ? )  where  rowNumber >=? " ;

        return  jdbcTemplate.query(sql, new RowMapper<BdInvcl>() {
            @Override
            public BdInvcl mapRow(ResultSet rs, int rowNum) throws SQLException {
                BdInvcl bdInvcl = new BdInvcl();
                bdInvcl.setPkInvcl(rs.getString("pk_invcl"));
                bdInvcl.setInvclasscode(rs.getString("invClassCode"));
                bdInvcl.setInvclassname(rs.getString("invclassname"));
                return bdInvcl;
            }
        } , rowEnd ,  bdInvcl.getInvclasscode()==null?"%":bdInvcl.getInvclasscode() , bdInvcl.getInvclassname()==null? "%":bdInvcl.getInvclassname() , rowStart) ;
    }


    @Override
    public long selectInvClassTotalRowNumberByInvclass(BdInvcl bdInvcl) {
        String sql = " select count(pk_invcl)  totalNumbers  from bd_invcl where   invclasscode like ?  and invclassname like  ? "  ;
        return jdbcTemplate.queryForObject(sql, Long.class, bdInvcl.getInvclasscode(), bdInvcl.getInvclassname());
    }
}
