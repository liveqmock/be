package com.brightedu.dao.edu;

import com.brightedu.model.edu.ChargeType;
import com.brightedu.model.edu.ChargeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ChargeTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    int countByExample(ChargeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    int deleteByExample(ChargeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    @Delete({
        "delete from edu.charge_type",
        "where charge_type_id = #{charge_type_id,jdbcType=NUMERIC}"
    })
    int deleteByPrimaryKey(Integer charge_type_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    @Insert({
        "insert into edu.charge_type (charge_type_id, charge_type_name)",
        "values (#{charge_type_id,jdbcType=NUMERIC}, #{charge_type_name,jdbcType=VARCHAR})"
    })
    int insert(ChargeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    int insertSelective(ChargeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    List<ChargeType> selectByExample(ChargeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    @Select({
        "select",
        "charge_type_id, charge_type_name",
        "from edu.charge_type",
        "where charge_type_id = #{charge_type_id,jdbcType=NUMERIC}"
    })
    @ResultMap("BaseResultMap")
    ChargeType selectByPrimaryKey(Integer charge_type_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    int updateByExampleSelective(@Param("record") ChargeType record, @Param("example") ChargeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    int updateByExample(@Param("record") ChargeType record, @Param("example") ChargeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    int updateByPrimaryKeySelective(ChargeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.charge_type
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    @Update({
        "update edu.charge_type",
        "set charge_type_name = #{charge_type_name,jdbcType=VARCHAR}",
        "where charge_type_id = #{charge_type_id,jdbcType=NUMERIC}"
    })
    int updateByPrimaryKey(ChargeType record);
}