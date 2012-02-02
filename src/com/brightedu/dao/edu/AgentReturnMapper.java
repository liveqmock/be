package com.brightedu.dao.edu;

import com.brightedu.model.edu.AgentReturn;
import com.brightedu.model.edu.AgentReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AgentReturnMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int countByExample(AgentReturnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int deleteByExample(AgentReturnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Delete({ "delete from edu.agent_return",
			"where ag_return_id = #{ag_return_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(Integer ag_return_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Insert({
			"insert into edu.agent_return (ag_return_id, agent_id, ",
			"college_id, batch_id, ",
			"head_count, return_percent)",
			"values (#{ag_return_id,jdbcType=NUMERIC}, #{agent_id,jdbcType=NUMERIC}, ",
			"#{college_id,jdbcType=NUMERIC}, #{batch_id,jdbcType=NUMERIC}, ",
			"#{head_count,jdbcType=NUMERIC}, #{return_percent,jdbcType=NUMERIC})" })
	int insert(AgentReturn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int insertSelective(AgentReturn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	List<AgentReturn> selectByExample(AgentReturnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Select({
			"select",
			"ag_return_id, agent_id, college_id, batch_id, head_count, return_percent",
			"from edu.agent_return",
			"where ag_return_id = #{ag_return_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	AgentReturn selectByPrimaryKey(Integer ag_return_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int updateByExampleSelective(@Param("record") AgentReturn record,
			@Param("example") AgentReturnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int updateByExample(@Param("record") AgentReturn record,
			@Param("example") AgentReturnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int updateByPrimaryKeySelective(AgentReturn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agent_return
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Update({ "update edu.agent_return",
			"set agent_id = #{agent_id,jdbcType=NUMERIC},",
			"college_id = #{college_id,jdbcType=NUMERIC},",
			"batch_id = #{batch_id,jdbcType=NUMERIC},",
			"head_count = #{head_count,jdbcType=NUMERIC},",
			"return_percent = #{return_percent,jdbcType=NUMERIC}",
			"where ag_return_id = #{ag_return_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(AgentReturn record);
}