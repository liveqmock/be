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

import java.util.List;

import com.brightedu.model.edu.BatchIndex;
import com.brightedu.model.edu.College;
import com.brightedu.model.edu.RecruitAgent;
import com.brightedu.model.edu.StudentClassified;
import com.brightedu.model.edu.StudentType;
import com.brightedu.model.edu.Subjects;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("DataBaseRPC")
public interface DataBaseRPC extends RemoteService {
	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static DataBaseRPCAsync instance;
		public static DataBaseRPCAsync getInstance(){
			if (instance == null) {
				instance = GWT.create(DataBaseRPC.class);
			}
			return instance;
		}
	}
	
	/*********************** 批次管理 ************************************/
	public List<BatchIndex> getBatchList(int offset, int limit);
	public List<BatchIndex> getBatchListAndTotalCounts(int offset, int limit);
	public boolean addBatch(String batch_name);
	public boolean deleteBatch(List<Integer> batch_ids);
	boolean saveBatch(BatchIndex editedBatch);
	
	/*********************** 学生层次管理 ************************************/
	public List<StudentClassified> getStudentClassesList(int offset, int limit);
	public List<StudentClassified> getStudentClasseshListAndTotalCounts(int offset, int limit);
	public boolean addStudentClass(String studentClassName);
	public boolean deleteStudentClasses(List<Integer> studentClassesId);
	boolean saveStudentClasses(StudentClassified studentClass);

	/*********************** 学生层次管理 ************************************/
	public List<StudentType> getStudentTypeList(int offset, int limit);
	public List<StudentType> getStudentTypeListAndTotalCounts(int offset, int limit);
	public boolean addStudentType(String studentClassName);
	public boolean deleteStudentType(List<Integer> studentClassesId);
	boolean saveStudentType(StudentType studentType);
	
	/***********************合作高校代码维护************************************/
	public List<College> getCollegeList(int offset, int limit);
	public List<College> getCollegeListAndTotalCounts(int offset, int limit);
	public boolean addCollege(String collegeName);
	public boolean deleteCollege(List<Integer> college_ids);
	boolean saveCollege(College college);
	
	/***********************专业代码维护************************************/
	public List<Subjects> getSubjectsList(int offset, int limit);
	public List<Subjects> getSubjectsListAndTotalCounts(int offset, int limit);
	public boolean addSubject(String subjectName);
	public boolean deleteSubject(List<Integer> subject_ids);
	boolean saveSubject(Subjects subject);
	
	/**
	 * 获取agent列表
	 * @return
	 */
	public List<RecruitAgent> getRecruitAgentList(int offset, int limit);
}
