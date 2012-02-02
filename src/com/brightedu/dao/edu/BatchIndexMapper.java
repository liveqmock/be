package com.brightedu.dao.edu;

import com.brightedu.model.edu.BatchIndex;
import com.brightedu.model.edu.BatchIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BatchIndexMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int countByExample(BatchIndexExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int deleteByExample(BatchIndexExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Delete({ "delete from edu.batch_index",
			"where batch_id = #{batch_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(Integer batch_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Insert({
			"insert into edu.batch_index (batch_id, batch_name, ",
			"register_date)",
			"values (#{batch_id,jdbcType=NUMERIC}, #{batch_name,jdbcType=VARCHAR}, ",
			"#{register_date,jdbcType=TIMESTAMP})" })
	int insert(BatchIndex record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int insertSelective(BatchIndex record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	List<BatchIndex> selectByExample(BatchIndexExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Select({ "select", "batch_id, batch_name, register_date",
			"from edu.batch_index",
			"where batch_id = #{batch_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	BatchIndex selectByPrimaryKey(Integer batch_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int updateByExampleSelective(@Param("record") BatchIndex record,
			@Param("example") BatchIndexExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int updateByExample(@Param("record") BatchIndex record,
			@Param("example") BatchIndexExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int updateByPrimaryKeySelective(BatchIndex record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.batch_index
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Update({ "update edu.batch_index",
			"set batch_name = #{batch_name,jdbcType=VARCHAR},",
			"register_date = #{register_date,jdbcType=TIMESTAMP}",
			"where batch_id = #{batch_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(BatchIndex record);
}