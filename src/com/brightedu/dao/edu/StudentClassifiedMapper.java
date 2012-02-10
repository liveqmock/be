package com.brightedu.dao.edu;

import com.brightedu.model.edu.StudentClassified;
import com.brightedu.model.edu.StudentClassifiedExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentClassifiedMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int countByExample(StudentClassifiedExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int deleteByExample(StudentClassifiedExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	@Delete({ "delete from edu.student_classified",
			"where classified_id = #{classified_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(Integer classified_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	@Insert({
			"insert into edu.student_classified (classified_id, classified_name, ",
			"register_date)",
			"values (#{classified_id,jdbcType=NUMERIC}, #{classified_name,jdbcType=VARCHAR}, ",
			"#{register_date,jdbcType=TIMESTAMP})" })
	int insert(StudentClassified record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int insertSelective(StudentClassified record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	List<StudentClassified> selectByExample(StudentClassifiedExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	@Select({ "select", "classified_id, classified_name, register_date",
			"from edu.student_classified",
			"where classified_id = #{classified_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	StudentClassified selectByPrimaryKey(Integer classified_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int updateByExampleSelective(@Param("record") StudentClassified record,
			@Param("example") StudentClassifiedExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int updateByExample(@Param("record") StudentClassified record,
			@Param("example") StudentClassifiedExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int updateByPrimaryKeySelective(StudentClassified record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_classified
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	@Update({ "update edu.student_classified",
			"set classified_name = #{classified_name,jdbcType=VARCHAR},",
			"register_date = #{register_date,jdbcType=TIMESTAMP}",
			"where classified_id = #{classified_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(StudentClassified record);
}