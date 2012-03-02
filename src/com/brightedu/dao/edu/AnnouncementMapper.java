package com.brightedu.dao.edu;

import com.brightedu.model.edu.Announcement;
import com.brightedu.model.edu.AnnouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AnnouncementMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	int countByExample(AnnouncementExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	int deleteByExample(AnnouncementExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	@Delete({ "delete from edu.announcement",
			"where ann_id = #{ann_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(Integer ann_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	@Insert({
			"insert into edu.announcement (ann_id, ann_title, ",
			"ann_body, reg_date, ",
			"created_by, last_edited_by, ",
			"update_time)",
			"values (#{ann_id,jdbcType=NUMERIC}, #{ann_title,jdbcType=VARCHAR}, ",
			"#{ann_body,jdbcType=VARCHAR}, #{reg_date,jdbcType=TIMESTAMP}, ",
			"#{created_by,jdbcType=NUMERIC}, #{last_edited_by,jdbcType=NUMERIC}, ",
			"#{update_time,jdbcType=TIMESTAMP})" })
	int insert(Announcement record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	int insertSelective(Announcement record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	List<Announcement> selectByExample(AnnouncementExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	@Select({
			"select",
			"ann_id, ann_title, ann_body, reg_date, created_by, last_edited_by, update_time",
			"from edu.announcement",
			"where ann_id = #{ann_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	Announcement selectByPrimaryKey(Integer ann_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	int updateByExampleSelective(@Param("record") Announcement record,
			@Param("example") AnnouncementExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	int updateByExample(@Param("record") Announcement record,
			@Param("example") AnnouncementExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	int updateByPrimaryKeySelective(Announcement record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	@Update({ "update edu.announcement",
			"set ann_title = #{ann_title,jdbcType=VARCHAR},",
			"ann_body = #{ann_body,jdbcType=VARCHAR},",
			"reg_date = #{reg_date,jdbcType=TIMESTAMP},",
			"created_by = #{created_by,jdbcType=NUMERIC},",
			"last_edited_by = #{last_edited_by,jdbcType=NUMERIC},",
			"update_time = #{update_time,jdbcType=TIMESTAMP}",
			"where ann_id = #{ann_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(Announcement record);
}