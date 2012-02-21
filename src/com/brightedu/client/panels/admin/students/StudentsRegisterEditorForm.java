package com.brightedu.client.panels.admin.students;

import java.io.Serializable;
import java.util.LinkedHashMap;

import com.brightedu.client.panels.DetailedEditorForm;
import com.brightedu.model.edu.StudentInfo;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.TextItem;

public class StudentsRegisterEditorForm extends DetailedEditorForm {

	TextItem student_nameItem = new TextItem("student_name", "姓名");
	TextItem identity_cardItem = new TextItem("identity_card", "身份证");
	SelectItem sexItem = new SelectItem("student_sex", "性别");
	TextItem exam_numItem = new TextItem("exam_num", "准考证");
	TextItem student_addressItem = new TextItem("student_address", "地址");
	TextItem student_phoneItem = new TextItem("student_phone", "电话");
	TextItem postal_codeItem = new TextItem("postal_code", "邮编");

	TextItem student_linkmanItem = new TextItem("student_linkman", "联系人");
	TextItem linkman_phoneItem = new TextItem("linkman_phone", "联系人电话");
	TextItem student_college_idItem = new TextItem("student_college_id", "学号");
	SelectItem collegwOwnerItem = new SelectItem("college_owner", "隶属学校");
	SelectItem batchItem = new SelectItem("batch_owner", "隶属批次");
	SelectItem classfiedItem = new SelectItem("classified_owner", "隶属层次");
	SelectItem subject_ownerItem = new SelectItem("subject_owner", "隶属专业");
	SelectItem agent_ownerItem = new SelectItem("agent_owner", "隶属招生点");
	SelectItem fund_agentItem = new SelectItem("fund_agent", "费用接收机构");
	SelectItem managed_agentItem = new SelectItem("managed_agent", "学生管理机构");
	SelectItem stu_status_idItem = new SelectItem("stu_status_id", "学生状态");

	TextItem birthdayItem = new TextItem("birthday", "出生年月日");
	SelectItem ethnic_group_idItem = new SelectItem("ethnic_group_id", "民族");
	SelectItem political_status_idItem = new SelectItem("political_status_id",
			"政治面貌");
	TextItem employerItem = new TextItem("employer", "工作单位");
	SelectItem graduate_college_idItem = new SelectItem("graduate_college_id",
			"之前毕业院校");
	TextItem graduate_dateItem = new TextItem("graduate_date", "之前毕业时间");
	TextItem graduate_certificate_numberItem = new TextItem(
			"graduate_certificate_number", "之前毕业证号码");

	SelectItem student_type_idItem = new SelectItem("student_type_id", "学生类型");
	SelectItem major_category_idItem = new SelectItem("major_category_id",
			"成教学生大类");
	TextItem register_dateItem = new TextItem("regster_date", "登记时间");
	TextItem update_dateItem = new TextItem("update_date", "更新时间");

	public StudentsRegisterEditorForm() {
		sexItem.setValueMap("男", "女");
		setFields(student_nameItem, identity_cardItem, sexItem, exam_numItem,
				student_addressItem, student_phoneItem, postal_codeItem,
				student_linkmanItem, linkman_phoneItem, student_college_idItem,
				collegwOwnerItem, batchItem, classfiedItem, subject_ownerItem,
				agent_ownerItem, fund_agentItem, managed_agentItem,
				stu_status_idItem, birthdayItem, ethnic_group_idItem,
				political_status_idItem, employerItem, graduate_college_idItem,
				graduate_dateItem, graduate_certificate_numberItem,
				student_type_idItem, major_category_idItem, register_dateItem,
				update_dateItem,saveBtn);
	}

	@Override
	public void setValue(Serializable model) {
		StudentInfo student = (StudentInfo) model;
		agent_ownerItem.setValue(student.getAgent_owner());
		batchItem.setValue(student.getBatch_owner());
		birthdayItem.setValue(student.getBirthday());
		classfiedItem.setValue(student.getClassified_owner());
		collegwOwnerItem.setValue(student.getCollege_owner());
		employerItem.setValue(student.getEmployer());
		ethnic_group_idItem.setValue(student.getEthnic_group_id());
		exam_numItem.setValue(student.getExam_num());
		fund_agentItem.setValue(student.getFund_agent());
		graduate_certificate_numberItem.setValue(student
				.getGraduate_certificate_number());
		graduate_college_idItem.setValue(student.getGraduate_college_id());
		graduate_dateItem.setValue(student.getGraduate_date());
		identity_cardItem.setValue(student.getIdentity_card());
		linkman_phoneItem.setValue(student.getLinkman_phone());
		major_category_idItem.setValue(student.getMajor_category_id());
		managed_agentItem.setValue(student.getManaged_agent());
		political_status_idItem.setValue(student.getPolitical_status_id());
		postal_codeItem.setValue(student.getPostal_code());
		register_dateItem.setValue(student.getRegister_date());
		stu_status_idItem.setValue(student.getStu_status_id());
		student_addressItem.setValue(student.getStudent_address());
		student_college_idItem.setValue(student.getStudent_college_id());
		// student.getStudent_id()
		student_linkmanItem.setValue(student.getStudent_linkman());
		student_nameItem.setValue(student.getStudent_name());
		student_phoneItem.setValue(student.getStudent_phone());
		sexItem.setValue(student.getStudent_sex());
		student_type_idItem.setValue(student.getStudent_type_id());
		subject_ownerItem.setValue(student.getSubject_owner());
		update_dateItem.setValue(student.getUpdate_date());
	}

	@Override
	public StudentInfo getModel() {
		StudentInfo s = new StudentInfo();
		s.setAgent_owner(Integer.parseInt(agent_ownerItem.getValueAsString()));
		s.setBatch_owner((Integer) (batchItem.getValue()));
		s.setBirthday(birthdayItem.getValueAsString());
		s.setClassified_owner(Integer.parseInt(classfiedItem.getValueAsString()));
		s.setCollege_owner(Integer.parseInt(collegwOwnerItem.getValueAsString()));
		s.setEmployer(employerItem.getValueAsString());
		s.setEthnic_group_id((Integer) ethnic_group_idItem.getValue());

		return s;
	}
	
	public void setValueMaps(LinkedHashMap<String, String>... valueMaps){
		if(valueMaps.length!=13){
			SC.say("数据结构所需数量未达到需求");
			return;
		}else{
//			batchValues = new LinkedHashMap<String, String>();
//			collegeValues = new LinkedHashMap<String, String>();
//			sdudentClassfiedValues = new LinkedHashMap<String, String>();
//			subjectsValues = new LinkedHashMap<String, String>();
//			agentOwnerValues = new LinkedHashMap<String, String>();
//			fundAgentValues = new LinkedHashMap<String, String>();
//			managedAgentValues = new LinkedHashMap<String, String>();
//			stu_statustValues = new LinkedHashMap<String, String>();
//			ethnic_groupValues = new LinkedHashMap<String, String>();
//			political_statusValues = new LinkedHashMap<String, String>();
//			graduate_collegeValues = new LinkedHashMap<String, String>();
//			student_typeValues = new LinkedHashMap<String, String>();
//			major_categoryValues = new LinkedHashMap<String, String>();
			batchItem.setValueMap(valueMaps[0]);
			collegwOwnerItem.setValueMap(valueMaps[1]);
			classfiedItem.setValueMap(valueMaps[2]);
			subject_ownerItem.setValueMap(valueMaps[3]);
			agent_ownerItem.setValueMap(valueMaps[4]);
			fund_agentItem.setValueMap(valueMaps[5]);
			managed_agentItem.setValueMap(valueMaps[6]);
			stu_status_idItem.setValueMap(valueMaps[7]);
			ethnic_group_idItem.setValueMap(valueMaps[8]);
			political_status_idItem.setValueMap(valueMaps[9]);
			graduate_college_idItem.setValueMap(valueMaps[10]);
			student_type_idItem.setValueMap(valueMaps[11]);
			major_category_idItem.setValueMap(valueMaps[12]);
		}
	}
}
