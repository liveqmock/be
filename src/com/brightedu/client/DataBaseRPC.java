/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.brightedu.client;

import java.io.Serializable;
import java.util.List;

import com.brightedu.model.edu.AgentType;
import com.brightedu.model.edu.BatchIndex;
import com.brightedu.model.edu.ChargeType;
import com.brightedu.model.edu.College;
import com.brightedu.model.edu.CollegeAgreement;
import com.brightedu.model.edu.CollegeSubject;
import com.brightedu.model.edu.CollegeSubjectView;
import com.brightedu.model.edu.FeeType;
import com.brightedu.model.edu.PictureType;
import com.brightedu.model.edu.RecruitAgent;
import com.brightedu.model.edu.RecruitPlan;
import com.brightedu.model.edu.RightsCategory;
import com.brightedu.model.edu.RightsCategoryFunctionKey;
import com.brightedu.model.edu.RightsFunction;
import com.brightedu.model.edu.StudentClassified;
import com.brightedu.model.edu.StudentStatus;
import com.brightedu.model.edu.StudentType;
import com.brightedu.model.edu.Subjects;
import com.brightedu.model.edu.UserType;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("DataBaseRPC")
public interface DataBaseRPC extends RemoteService {

	/*********************** 批次管理 ************************************/
	public List<BatchIndex> getBatchList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addBatch(String batch_name);

	public boolean deleteBatch(List<Integer> batch_ids);

	boolean saveBatch(BatchIndex editedBatch);

	/*********************** 学生层次管理 ************************************/
	public List<StudentClassified> getStudentClassesList(int offset, int limit,
			boolean needTotalCounts);

	boolean addStudentClass(StudentClassified studentClass);

	public boolean deleteStudentClasses(List<Integer> studentClassesId);

	boolean saveStudentClasses(StudentClassified studentClass);

	/*********************** 学生层次管理 ************************************/
	public List<StudentType> getStudentTypeList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addStudentType(String studentClassName);

	public boolean deleteStudentType(List<Integer> studentClassesId);

	boolean saveStudentType(StudentType studentType);

	/*********************** 合作高校代码维护 ************************************/
	public List<College> getCollegeList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addCollege(String collegeName);

	public boolean deleteCollege(List<Integer> college_ids);

	boolean saveCollege(College college);
	
	/*********************** 合作高校协议维护 ************************************/
	public List<CollegeAgreement> getCollegeAgreementList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addCollegeAgreement(CollegeAgreement agreement); 

	public boolean deleteCollegeAgreement(List<CollegeAgreement> agreements);

	boolean saveCollegeAgreement(CollegeAgreement agreement);

	/*********************** 专业代码维护 ************************************/
	public List<Subjects> getSubjectsList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addSubject(String subjectName);

	public boolean deleteSubject(List<Integer> subject_ids);

	boolean saveSubject(Subjects subject);

	/*********************** 机构类型维护 ************************************/

	public List<AgentType> getAgentTypeList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addAgentType(AgentType agentType);

	public boolean deleteAgentType(List<Integer> agentType_ids);

	public boolean saveAgentType(AgentType agenttype);

	/*********************** 费用类型维护 ************************************/
	public List<FeeType> getFeeTypeList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addFeeType(FeeType typeName);

	public boolean deletFeeType(List<Integer> feeType_ids);

	public boolean saveFeeType(FeeType agenttype);

	/*********************** 入账类型维护 ************************************/
	public List<ChargeType> getChargeTypeList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addChargeType(String typeName);

	public boolean deletChargeType(List<Integer> chargeType_ids);

	public boolean saveChargeType(ChargeType chargetype);

	/*********************** 用户类型维护 ************************************/
	public List<UserType> getUserTypeList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addUserType(String typeName);

	public boolean deletUserType(List<Integer> userType_ids);

	public boolean saveUserType(UserType usertype);

	/*********************** 照片类型维护 ************************************/
	public List<PictureType> getPictureTypeList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addPictureType(String typeName);

	public boolean deletPictureType(List<Integer> pictureType_ids);

	public boolean savePictureType(PictureType picturetype);

	/*********************** 学生状态类型维护 ************************************/
	public List<StudentStatus> getStudentStatusList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addStudentStatus(String typeName);

	public boolean deletStudentStatus(List<Integer> studentStatus_ids);

	public boolean saveStudentStatus(StudentStatus studentStatus);

	/*********************** RecruitAgent维护 ************************************/
	public List<RecruitAgent> getRecruitAgentList(int offset, int limit,
			boolean needTotalCounts);

	public boolean addRecruitAgent(RecruitAgent agent);

	public boolean deletRecruitAgent(List<Integer> agent_ids);

	public boolean saveRecruitAgent(RecruitAgent agent);

	/*********************** 招生计划维护 ************************************/
	public List<CollegeSubjectView> getCollegeSubjectList(int college, int level,
			int batch);

	public boolean addCollegeSubject(List<CollegeSubject> collegeSubjects);

	public boolean deletCollegeSubject(CollegeSubject collegeSubjects);
	
	public List<RecruitPlan> getRecruitPlanList(int batch);
	
	/*********************** 当前批次设置 ************************************/
	public boolean addOrUpdateCurrentBatch(Integer batchNo);
	public Integer getCurrentBatch();

	

	/************************ 权限基础数据设置 *********************************/
	
	public List<RightsCategory> getRightsCategory();
	public List<RightsFunction> getRightsFunction();
	public List<RightsCategoryFunctionKey> getRightsCategoryFunction(String categoryID);
	public boolean addRightsCategory(RightsCategory category);
	public boolean addRightsFunction(RightsFunction function);
	public boolean addRightsCatetoryFunctions(List<RightsCategoryFunctionKey> rightsCategoryFunctionList);
	public boolean deleteRightsCategory(RightsCategory category);
	public boolean deleteRightsFunction(RightsFunction function);
	public boolean deleteRightsCatetoryFunctions(String rightsCategoryFunctionList);
	

	
	/*******************通用方法***************************/
	public Serializable getObjectById(String mapperClassName, int id);
	


}
