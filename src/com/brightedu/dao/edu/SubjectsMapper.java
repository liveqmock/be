package com.brightedu.dao.edu;

import com.brightedu.model.edu.Subjects;
import com.brightedu.model.edu.SubjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SubjectsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int countByExample(SubjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int deleteByExample(SubjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	@Delete({ "delete from edu.subjects",
			"where subject_id = #{subject_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(Integer subject_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	@Insert({
			"insert into edu.subjects (subject_id, subject_name, ",
			"register_date)",
			"values (#{subject_id,jdbcType=NUMERIC}, #{subject_name,jdbcType=VARCHAR}, ",
			"#{register_date,jdbcType=TIMESTAMP})" })
	int insert(Subjects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int insertSelective(Subjects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	List<Subjects> selectByExample(SubjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	@Select({ "select", "subject_id, subject_name, register_date",
			"from edu.subjects",
			"where subject_id = #{subject_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	Subjects selectByPrimaryKey(Integer subject_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int updateByExampleSelective(@Param("record") Subjects record,
			@Param("example") SubjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int updateByExample(@Param("record") Subjects record,
			@Param("example") SubjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	int updateByPrimaryKeySelective(Subjects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.subjects
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	@Update({ "update edu.subjects",
			"set subject_name = #{subject_name,jdbcType=VARCHAR},",
			"register_date = #{register_date,jdbcType=TIMESTAMP}",
			"where subject_id = #{subject_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(Subjects record);
}