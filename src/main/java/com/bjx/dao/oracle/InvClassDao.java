package com.bjx.dao.oracle;

import com.bjx.domain.oracle.BdInvcl;
import com.bjx.domain.oracle.BdInvclExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvClassDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    long countByExample(BdInvclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    int deleteByExample(BdInvclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String pkInvcl);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    int insert(BdInvcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    int insertSelective(BdInvcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    List<BdInvcl> selectByExample(BdInvclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    BdInvcl selectByPrimaryKey(String pkInvcl);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BdInvcl record, @Param("example") BdInvclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BdInvcl record, @Param("example") BdInvclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BdInvcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_INVCL
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BdInvcl record);
}