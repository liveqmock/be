package com.brightedu.model.edu;

public class StudentInfoWithBLOBs extends StudentInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_info.student_photo
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	private byte[] student_photo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_info.identity_copy
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	private byte[] identity_copy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_info.diploma_copy
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	private byte[] diploma_copy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_info.network_copy
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	private byte[] network_copy;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_info.student_photo
	 * @return  the value of edu.student_info.student_photo
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public byte[] getStudent_photo() {
		return student_photo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_info.student_photo
	 * @param student_photo  the value for edu.student_info.student_photo
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public void setStudent_photo(byte[] student_photo) {
		this.student_photo = student_photo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_info.identity_copy
	 * @return  the value of edu.student_info.identity_copy
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public byte[] getIdentity_copy() {
		return identity_copy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_info.identity_copy
	 * @param identity_copy  the value for edu.student_info.identity_copy
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public void setIdentity_copy(byte[] identity_copy) {
		this.identity_copy = identity_copy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_info.diploma_copy
	 * @return  the value of edu.student_info.diploma_copy
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public byte[] getDiploma_copy() {
		return diploma_copy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_info.diploma_copy
	 * @param diploma_copy  the value for edu.student_info.diploma_copy
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public void setDiploma_copy(byte[] diploma_copy) {
		this.diploma_copy = diploma_copy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_info.network_copy
	 * @return  the value of edu.student_info.network_copy
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public byte[] getNetwork_copy() {
		return network_copy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_info.network_copy
	 * @param network_copy  the value for edu.student_info.network_copy
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public void setNetwork_copy(byte[] network_copy) {
		this.network_copy = network_copy;
	}
}