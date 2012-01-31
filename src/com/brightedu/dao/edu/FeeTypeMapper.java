package com.brightedu.dao.edu;

import com.brightedu.model.edu.FeeType;
import com.brightedu.model.edu.FeeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FeeTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	int countByExample(FeeTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	int deleteByExample(FeeTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	@Delete({ "delete from edu.fee_type",
			"where fee_id = #{fee_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(Integer fee_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	@Insert({ "insert into edu.fee_type (fee_id, fee_name)",
			"values (#{fee_id,jdbcType=NUMERIC}, #{fee_name,jdbcType=VARCHAR})" })
	int insert(FeeType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	int insertSelective(FeeType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	List<FeeType> selectByExample(FeeTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	@Select({ "select", "fee_id, fee_name", "from edu.fee_type",
			"where fee_id = #{fee_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	FeeType selectByPrimaryKey(Integer fee_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	int updateByExampleSelective(@Param("record") FeeType record,
			@Param("example") FeeTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	int updateByExample(@Param("record") FeeType record,
			@Param("example") FeeTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	int updateByPrimaryKeySelective(FeeType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.fee_type
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	@Update({ "update edu.fee_type",
			"set fee_name = #{fee_name,jdbcType=VARCHAR}",
			"where fee_id = #{fee_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(FeeType record);
}