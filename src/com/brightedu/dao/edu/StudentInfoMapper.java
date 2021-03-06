package com.brightedu.dao.edu;

import com.brightedu.model.edu.StudentInfo;
import com.brightedu.model.edu.StudentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    int countByExample(StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    int deleteByExample(StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    @Delete({
        "delete from edu.student_info",
        "where student_id = #{student_id,jdbcType=NUMERIC}"
    })
    int deleteByPrimaryKey(Integer student_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    @Insert({
        "insert into edu.student_info (student_id, student_name, ",
        "identity_card, student_sex, ",
        "exam_num, student_address, ",
        "student_phone, student_linkman, ",
        "linkman_phone, student_college_id, ",
        "college_owner, batch_owner, ",
        "classified_owner, subject_owner, ",
        "agent_owner, fund_agent, ",
        "managed_agent, stu_status_id, ",
        "register_date, update_date, ",
        "birthday, ethnic_group_id, ",
        "political_status_id, employer, ",
        "graduate_college_id, graduate_date, ",
        "graduate_certificate_number, postal_code, ",
        "student_type_id, major_category_id, ",
        "upload_flag, edu_level, ",
        "college_passwd, exam_passwd, ",
        "care_type, edu_type)",
        "values (#{student_id,jdbcType=NUMERIC}, #{student_name,jdbcType=VARCHAR}, ",
        "#{identity_card,jdbcType=VARCHAR}, #{student_sex,jdbcType=VARCHAR}, ",
        "#{exam_num,jdbcType=VARCHAR}, #{student_address,jdbcType=VARCHAR}, ",
        "#{student_phone,jdbcType=VARCHAR}, #{student_linkman,jdbcType=VARCHAR}, ",
        "#{linkman_phone,jdbcType=VARCHAR}, #{student_college_id,jdbcType=VARCHAR}, ",
        "#{college_owner,jdbcType=NUMERIC}, #{batch_owner,jdbcType=NUMERIC}, ",
        "#{classified_owner,jdbcType=NUMERIC}, #{subject_owner,jdbcType=NUMERIC}, ",
        "#{agent_owner,jdbcType=NUMERIC}, #{fund_agent,jdbcType=NUMERIC}, ",
        "#{managed_agent,jdbcType=NUMERIC}, #{stu_status_id,jdbcType=NUMERIC}, ",
        "#{register_date,jdbcType=TIMESTAMP}, #{update_date,jdbcType=TIMESTAMP}, ",
        "#{birthday,jdbcType=VARCHAR}, #{ethnic_group_id,jdbcType=NUMERIC}, ",
        "#{political_status_id,jdbcType=NUMERIC}, #{employer,jdbcType=VARCHAR}, ",
        "#{graduate_college_id,jdbcType=NUMERIC}, #{graduate_date,jdbcType=TIMESTAMP}, ",
        "#{graduate_certificate_number,jdbcType=VARCHAR}, #{postal_code,jdbcType=VARCHAR}, ",
        "#{student_type_id,jdbcType=NUMERIC}, #{major_category_id,jdbcType=NUMERIC}, ",
        "#{upload_flag,jdbcType=BIT}, #{edu_level,jdbcType=VARCHAR}, ",
        "#{college_passwd,jdbcType=VARCHAR}, #{exam_passwd,jdbcType=VARCHAR}, ",
        "#{care_type,jdbcType=VARCHAR}, #{edu_type,jdbcType=VARCHAR})"
    })
    int insert(StudentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    int insertSelective(StudentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    List<StudentInfo> selectByExample(StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    @Select({
        "select",
        "student_id, student_name, identity_card, student_sex, exam_num, student_address, ",
        "student_phone, student_linkman, linkman_phone, student_college_id, college_owner, ",
        "batch_owner, classified_owner, subject_owner, agent_owner, fund_agent, managed_agent, ",
        "stu_status_id, register_date, update_date, birthday, ethnic_group_id, political_status_id, ",
        "employer, graduate_college_id, graduate_date, graduate_certificate_number, postal_code, ",
        "student_type_id, major_category_id, upload_flag, edu_level, college_passwd, ",
        "exam_passwd, care_type, edu_type",
        "from edu.student_info",
        "where student_id = #{student_id,jdbcType=NUMERIC}"
    })
    @ResultMap("BaseResultMap")
    StudentInfo selectByPrimaryKey(Integer student_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    int updateByPrimaryKeySelective(StudentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.student_info
     *
     * @mbggenerated Tue Mar 13 12:18:27 CST 2012
     */
    @Update({
        "update edu.student_info",
        "set student_name = #{student_name,jdbcType=VARCHAR},",
          "identity_card = #{identity_card,jdbcType=VARCHAR},",
          "student_sex = #{student_sex,jdbcType=VARCHAR},",
          "exam_num = #{exam_num,jdbcType=VARCHAR},",
          "student_address = #{student_address,jdbcType=VARCHAR},",
          "student_phone = #{student_phone,jdbcType=VARCHAR},",
          "student_linkman = #{student_linkman,jdbcType=VARCHAR},",
          "linkman_phone = #{linkman_phone,jdbcType=VARCHAR},",
          "student_college_id = #{student_college_id,jdbcType=VARCHAR},",
          "college_owner = #{college_owner,jdbcType=NUMERIC},",
          "batch_owner = #{batch_owner,jdbcType=NUMERIC},",
          "classified_owner = #{classified_owner,jdbcType=NUMERIC},",
          "subject_owner = #{subject_owner,jdbcType=NUMERIC},",
          "agent_owner = #{agent_owner,jdbcType=NUMERIC},",
          "fund_agent = #{fund_agent,jdbcType=NUMERIC},",
          "managed_agent = #{managed_agent,jdbcType=NUMERIC},",
          "stu_status_id = #{stu_status_id,jdbcType=NUMERIC},",
          "register_date = #{register_date,jdbcType=TIMESTAMP},",
          "update_date = #{update_date,jdbcType=TIMESTAMP},",
          "birthday = #{birthday,jdbcType=VARCHAR},",
          "ethnic_group_id = #{ethnic_group_id,jdbcType=NUMERIC},",
          "political_status_id = #{political_status_id,jdbcType=NUMERIC},",
          "employer = #{employer,jdbcType=VARCHAR},",
          "graduate_college_id = #{graduate_college_id,jdbcType=NUMERIC},",
          "graduate_date = #{graduate_date,jdbcType=TIMESTAMP},",
          "graduate_certificate_number = #{graduate_certificate_number,jdbcType=VARCHAR},",
          "postal_code = #{postal_code,jdbcType=VARCHAR},",
          "student_type_id = #{student_type_id,jdbcType=NUMERIC},",
          "major_category_id = #{major_category_id,jdbcType=NUMERIC},",
          "upload_flag = #{upload_flag,jdbcType=BIT},",
          "edu_level = #{edu_level,jdbcType=VARCHAR},",
          "college_passwd = #{college_passwd,jdbcType=VARCHAR},",
          "exam_passwd = #{exam_passwd,jdbcType=VARCHAR},",
          "care_type = #{care_type,jdbcType=VARCHAR},",
          "edu_type = #{edu_type,jdbcType=VARCHAR}",
        "where student_id = #{student_id,jdbcType=NUMERIC}"
    })
    int updateByPrimaryKey(StudentInfo record);
}