package com.brightedu.dao.edu;

import com.brightedu.model.edu.StudentChange;
import com.brightedu.model.edu.StudentChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentChangeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	int countByExample(StudentChangeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	int deleteByExample(StudentChangeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	@Delete({ "delete from edu.student_change",
			"where change_id = #{change_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(Integer change_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	@Insert({
			"insert into edu.student_change (change_id, student_id, ",
			"change_content, register_date)",
			"values (#{change_id,jdbcType=NUMERIC}, #{student_id,jdbcType=NUMERIC}, ",
			"#{change_content,jdbcType=VARCHAR}, #{register_date,jdbcType=TIMESTAMP})" })
	int insert(StudentChange record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	int insertSelective(StudentChange record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	List<StudentChange> selectByExample(StudentChangeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	@Select({ "select", "change_id, student_id, change_content, register_date",
			"from edu.student_change",
			"where change_id = #{change_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	StudentChange selectByPrimaryKey(Integer change_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	int updateByExampleSelective(@Param("record") StudentChange record,
			@Param("example") StudentChangeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	int updateByExample(@Param("record") StudentChange record,
			@Param("example") StudentChangeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	int updateByPrimaryKeySelective(StudentChange record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.student_change
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	@Update({ "update edu.student_change",
			"set student_id = #{student_id,jdbcType=NUMERIC},",
			"change_content = #{change_content,jdbcType=VARCHAR},",
			"register_date = #{register_date,jdbcType=TIMESTAMP}",
			"where change_id = #{change_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(StudentChange record);
}