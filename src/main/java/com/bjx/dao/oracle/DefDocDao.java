package com.bjx.dao.oracle;

import com.bjx.domain.oracle.BdDefdoc;
import com.bjx.domain.oracle.BdDefdocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DefDocDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    long countByExample(BdDefdocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    int deleteByExample(BdDefdocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String pkDefdoc);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    int insert(BdDefdoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    int insertSelective(BdDefdoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    List<BdDefdoc> selectByExample(BdDefdocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    BdDefdoc selectByPrimaryKey(String pkDefdoc);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BdDefdoc record, @Param("example") BdDefdocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BdDefdoc record, @Param("example") BdDefdocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BdDefdoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BdDefdoc record);
}