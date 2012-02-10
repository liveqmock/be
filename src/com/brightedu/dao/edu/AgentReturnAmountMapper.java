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
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int countByExample(AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int deleteByExample(AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	@Delete({ "delete from edu.ag_return_amount",
			"where agent_return_id = #{agent_return_id,jdbcType=NUMERIC}" })
	int deleteByPrimaryKey(Long agent_return_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	@Insert({
			"insert into edu.ag_return_amount (agent_return_id, agent_id, ",
			"batch_id, headcount, ",
			"fee_id, amount_flag, ",
			"sum_amount, admin_id, ",
			"register_date)",
			"values (#{agent_return_id,jdbcType=NUMERIC}, #{agent_id,jdbcType=NUMERIC}, ",
			"#{batch_id,jdbcType=NUMERIC}, #{headcount,jdbcType=NUMERIC}, ",
			"#{fee_id,jdbcType=NUMERIC}, #{amount_flag,jdbcType=BIT}, ",
			"#{sum_amount,jdbcType=NUMERIC}, #{admin_id,jdbcType=NUMERIC}, ",
			"#{register_date,jdbcType=TIMESTAMP})" })
	int insert(AgentReturnAmount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int insertSelective(AgentReturnAmount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	List<AgentReturnAmount> selectByExample(AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	@Select({
			"select",
			"agent_return_id, agent_id, batch_id, headcount, fee_id, amount_flag, sum_amount, ",
			"admin_id, register_date", "from edu.ag_return_amount",
			"where agent_return_id = #{agent_return_id,jdbcType=NUMERIC}" })
	@ResultMap("BaseResultMap")
	AgentReturnAmount selectByPrimaryKey(Long agent_return_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int updateByExampleSelective(@Param("record") AgentReturnAmount record,
			@Param("example") AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int updateByExample(@Param("record") AgentReturnAmount record,
			@Param("example") AgentReturnAmountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	int updateByPrimaryKeySelective(AgentReturnAmount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.ag_return_amount
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	@Update({ "update edu.ag_return_amount",
			"set agent_id = #{agent_id,jdbcType=NUMERIC},",
			"batch_id = #{batch_id,jdbcType=NUMERIC},",
			"headcount = #{headcount,jdbcType=NUMERIC},",
			"fee_id = #{fee_id,jdbcType=NUMERIC},",
			"amount_flag = #{amount_flag,jdbcType=BIT},",
			"sum_amount = #{sum_amount,jdbcType=NUMERIC},",
			"admin_id = #{admin_id,jdbcType=NUMERIC},",
			"register_date = #{register_date,jdbcType=TIMESTAMP}",
			"where agent_return_id = #{agent_return_id,jdbcType=NUMERIC}" })
	int updateByPrimaryKey(AgentReturnAmount record);
}