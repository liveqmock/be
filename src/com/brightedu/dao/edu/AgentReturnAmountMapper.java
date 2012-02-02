package com.brightedu.dao.edu;

import com.brightedu.model.edu.AgentReturnAmount;
import com.brightedu.model.edu.AgentReturnAmountExample;
import com.brightedu.model.edu.AgentReturnAmountKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AgentReturnAmountMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int countByExample(AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int deleteByExample(AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Delete({ "delete from edu.ag_return_amount",
			"where agent_id = #{agent_id,jdbcType=NUMERIC}",
			"and batch_id = #{batch_id,jdbcType=NUMERIC}",
			"and ag_return_id = #{ag_return_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(AgentReturnAmountKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Insert({
			"insert into edu.ag_return_amount (agent_id, batch_id, ",
			"ag_return_id, sum_amount)",
			"values (#{agent_id,jdbcType=NUMERIC}, #{batch_id,jdbcType=NUMERIC}, ",
			"#{ag_return_id,jdbcType=NUMERIC}, #{sum_amount,jdbcType=NUMERIC})" })
	int insert(AgentReturnAmount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int insertSelective(AgentReturnAmount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	List<AgentReturnAmount> selectByExample(AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Select({ "select", "agent_id, batch_id, ag_return_id, sum_amount",
			"from edu.ag_return_amount",
			"where agent_id = #{agent_id,jdbcType=NUMERIC}",
			"and batch_id = #{batch_id,jdbcType=NUMERIC}",
			"and ag_return_id = #{ag_return_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	AgentReturnAmount selectByPrimaryKey(AgentReturnAmountKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int updateByExampleSelective(@Param("record") AgentReturnAmount record,
			@Param("example") AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int updateByExample(@Param("record") AgentReturnAmount record,
			@Param("example") AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	int updateByPrimaryKeySelective(AgentReturnAmount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	@Update({ "update edu.ag_return_amount",
			"set sum_amount = #{sum_amount,jdbcType=NUMERIC}",
			"where agent_id = #{agent_id,jdbcType=NUMERIC}",
			"and batch_id = #{batch_id,jdbcType=NUMERIC}",
			"and ag_return_id = #{ag_return_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(AgentReturnAmount record);
}