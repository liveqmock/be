package com.brightedu.dao.edu;

import com.brightedu.model.edu.College;
import com.brightedu.model.edu.CollegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.SelectKey;

public interface CollegeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int countByExample(CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int deleteByExample(CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	@Delete({ "delete from edu.co_college",
			"where college_id = #{college_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(Integer college_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	@Insert({
			"insert into edu.co_college (college_id, college_name, ",
			"register_date)",
			"values (#{college_id,jdbcType=NUMERIC}, #{college_name,jdbcType=VARCHAR}, ",
			"#{register_date,jdbcType=TIMESTAMP})" })
	int insert(College record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int insertSelective(College record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	List<College> selectByExample(CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	@Select({ "select", "college_id, college_name, register_date",
			"from edu.co_college",
			"where college_id = #{college_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	College selectByPrimaryKey(Integer college_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int updateByExampleSelective(@Param("record") College record,
			@Param("example") CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int updateByExample(@Param("record") College record,
			@Param("example") CollegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int updateByPrimaryKeySelective(College record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.co_college
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	@Update({ "update edu.co_college",
			"set college_name = #{college_name,jdbcType=VARCHAR},",
			"register_date = #{register_date,jdbcType=TIMESTAMP}",
			"where college_id = #{college_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(College record);
}