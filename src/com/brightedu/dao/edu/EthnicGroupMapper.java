package com.brightedu.dao.edu;

import com.brightedu.model.edu.EthnicGroup;
import com.brightedu.model.edu.EthnicGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EthnicGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    int countByExample(EthnicGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    int deleteByExample(EthnicGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    @Delete({
        "delete from edu.sd_ethnic_group",
        "where ethnic_group_id = #{ethnic_group_id,jdbcType=NUMERIC}"
    })
    int deleteByPrimaryKey(Integer ethnic_group_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    @Insert({
        "insert into edu.sd_ethnic_group (ethnic_group_id, ethnic_group_name)",
        "values (#{ethnic_group_id,jdbcType=NUMERIC}, #{ethnic_group_name,jdbcType=VARCHAR})"
    })
    int insert(EthnicGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    int insertSelective(EthnicGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    List<EthnicGroup> selectByExample(EthnicGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    @Select({
        "select",
        "ethnic_group_id, ethnic_group_name",
        "from edu.sd_ethnic_group",
        "where ethnic_group_id = #{ethnic_group_id,jdbcType=NUMERIC}"
    })
    @ResultMap("BaseResultMap")
    EthnicGroup selectByPrimaryKey(Integer ethnic_group_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    int updateByExampleSelective(@Param("record") EthnicGroup record, @Param("example") EthnicGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    int updateByExample(@Param("record") EthnicGroup record, @Param("example") EthnicGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    int updateByPrimaryKeySelective(EthnicGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.sd_ethnic_group
     *
     * @mbggenerated Sun Feb 12 11:48:59 CST 2012
     */
    @Update({
        "update edu.sd_ethnic_group",
        "set ethnic_group_name = #{ethnic_group_name,jdbcType=VARCHAR}",
        "where ethnic_group_id = #{ethnic_group_id,jdbcType=NUMERIC}"
    })
    int updateByPrimaryKey(EthnicGroup record);
}