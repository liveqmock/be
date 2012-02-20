package com.brightedu.server;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.brightedu.client.DataBaseRPC;
import com.brightedu.client.ds.Page;
import com.brightedu.dao.edu.AgentTypeMapper;
import com.brightedu.dao.edu.BatchIndexMapper;
import com.brightedu.dao.edu.ChargeTypeMapper;
import com.brightedu.dao.edu.CollegeAgreementMapper;
import com.brightedu.dao.edu.CollegeMapper;
import com.brightedu.dao.edu.CollegeSubjectMapper;
import com.brightedu.dao.edu.CollegeSubjectViewMapper;
import com.brightedu.dao.edu.CurrentBatchMapper;
import com.brightedu.dao.edu.FeeTypeMapper;
import com.brightedu.dao.edu.PictureTypeMapper;
import com.brightedu.dao.edu.RecruitAgentMapper;
import com.brightedu.dao.edu.RecruitPlanMapper;
import com.brightedu.dao.edu.RightsCategoryFunctionMapper;
import com.brightedu.dao.edu.RightsCategoryMapper;
import com.brightedu.dao.edu.RightsDefaultMapper;
import com.brightedu.dao.edu.RightsFunctionMapper;
import com.brightedu.dao.edu.StudentClassifiedMapper;
import com.brightedu.dao.edu.StudentStatusMapper;
import com.brightedu.dao.edu.StudentTypeMapper;
import com.brightedu.dao.edu.SubjectsMapper;
import com.brightedu.dao.edu.UserMapper;
import com.brightedu.dao.edu.UserTypeMapper;
import com.brightedu.model.edu.AgentType;
import com.brightedu.model.edu.AgentTypeExample;
import com.brightedu.model.edu.BatchIndex;
import com.brightedu.model.edu.BatchIndexExample;
import com.brightedu.model.edu.BatchIndexExample.Criteria;
import com.brightedu.model.edu.ChargeType;
import com.brightedu.model.edu.ChargeTypeExample;
import com.brightedu.model.edu.College;
import com.brightedu.model.edu.CollegeAgreement;
import com.brightedu.model.edu.CollegeAgreementExample;
import com.brightedu.model.edu.CollegeExample;
import com.brightedu.model.edu.CollegeSubject;
import com.brightedu.model.edu.CollegeSubjectExample;
import com.brightedu.model.edu.CollegeSubjectView;
import com.brightedu.model.edu.CollegeSubjectViewExample;
import com.brightedu.model.edu.CurrentBatch;
import com.brightedu.model.edu.FeeType;
import com.brightedu.model.edu.FeeTypeExample;
import com.brightedu.model.edu.PictureType;
import com.brightedu.model.edu.PictureTypeExample;
import com.brightedu.model.edu.RecruitAgent;
import com.brightedu.model.edu.RecruitAgentExample;
import com.brightedu.model.edu.RecruitPlan;
import com.brightedu.model.edu.RecruitPlanExample;
import com.brightedu.model.edu.RightsCategory;
import com.brightedu.model.edu.RightsCategoryExample;
import com.brightedu.model.edu.RightsCategoryFunctionExample;
import com.brightedu.model.edu.RightsCategoryFunctionKey;
import com.brightedu.model.edu.RightsDefaultExample;
import com.brightedu.model.edu.RightsDefaultKey;
import com.brightedu.model.edu.RightsFunction;
import com.brightedu.model.edu.RightsFunctionExample;
import com.brightedu.model.edu.StudentClassified;
import com.brightedu.model.edu.StudentClassifiedExample;
import com.brightedu.model.edu.StudentStatus;
import com.brightedu.model.edu.StudentStatusExample;
import com.brightedu.model.edu.StudentType;
import com.brightedu.model.edu.StudentTypeExample;
import com.brightedu.model.edu.Subjects;
import com.brightedu.model.edu.SubjectsExample;
import com.brightedu.model.edu.User;
import com.brightedu.model.edu.UserExample;
import com.brightedu.model.edu.UserType;
import com.brightedu.model.edu.UserTypeExample;
import com.brightedu.server.util.ConnectionManager;
import com.brightedu.server.util.Log;
import com.brightedu.server.util.ServerProperties;

public class DataBaseRPCAgent implements DataBaseRPC {
	SqlSessionFactory sessionFactory;
	BrightServlet remoteServlet;

	public DataBaseRPCAgent() {
		sessionFactory = ConnectionManager.getSessionFactory();
	}

	public static DataBaseRPC createAgentProxy(BrightServlet servlet) {
		DataBaseRPCAgent agt = new DataBaseRPCAgent();
		agt.setRemoteServlet(servlet);
		DataBaseRPCHandler handler = new DataBaseRPCHandler(agt);
		return (DataBaseRPC) Proxy.newProxyInstance(agt.getClass()
				.getClassLoader(), agt.getClass().getInterfaces(), handler);
	}

	/*********************** 批次管理 ************************************/

	public List getBatchList(int offset, int limit, boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			BatchIndexExample ex = new BatchIndexExample();
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			ex.setOrderByClause("batch_id desc");

			BatchIndexMapper map = session.getMapper(BatchIndexMapper.class);
			List result = map.selectByExample(ex);
			if (needTotalCounts) {
				Integer counts = map.countByExample(null);
				result.add(counts);
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addBatch(String batch_name) {
		SqlSession session = sessionFactory.openSession();
		try {
			BatchIndexMapper bim = session.getMapper(BatchIndexMapper.class);
			BatchIndex bi = new BatchIndex();
			bi.setBatch_name(batch_name);
			int count = bim.insertSelective(bi);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteBatch(List<Integer> batch_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			BatchIndexMapper bim = session.getMapper(BatchIndexMapper.class);
			// int count = bim.deleteByPrimaryKey(batch_id);
			BatchIndexExample ex = new BatchIndexExample();
			Criteria cr = ex.createCriteria();
			cr.andBatch_idIn(batch_ids);
			bim.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveBatch(BatchIndex editedBatch) {
		SqlSession session = sessionFactory.openSession();
		try {
			BatchIndexMapper bim = session.getMapper(BatchIndexMapper.class);
			bim.updateByPrimaryKey(editedBatch);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 学生层次管理 ************************************/
	@Override
	public List getStudentClassesList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentClassifiedMapper mp = session
					.getMapper(StudentClassifiedMapper.class);

			StudentClassifiedExample ex = new StudentClassifiedExample();
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			ex.setOrderByClause("classified_id desc");
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				Integer counts = mp.countByExample(null);
				result.add(counts);
			}
			return result;
		} finally {
			session.close();
		}

	}

	@Override
	public boolean addStudentClass(StudentClassified studentClass) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentClassifiedMapper scm = session
					.getMapper(StudentClassifiedMapper.class);
			int count = scm.insertSelective(studentClass);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteStudentClasses(List<Integer> studentClassesId) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentClassifiedMapper scm = session
					.getMapper(StudentClassifiedMapper.class);
			StudentClassifiedExample ex = new StudentClassifiedExample();
			StudentClassifiedExample.Criteria cr = ex.createCriteria();
			cr.andClassified_idIn(studentClassesId);
			scm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveStudentClasses(StudentClassified studentClass) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentClassifiedMapper scm = session
					.getMapper(StudentClassifiedMapper.class);
			scm.updateByPrimaryKey(studentClass);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 学生类型管理 ************************************/
	@Override
	public List<StudentType> getStudentTypeList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentTypeMapper mp = session.getMapper(StudentTypeMapper.class);
			StudentTypeExample ex = new StudentTypeExample();
			ex.setOrderByClause("student_type_id desc");
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				Integer counts = mp.countByExample(null);
				result.add(counts);
			}
			// List<StudentType> result = session.selectList(
			// "com.brightedu.dao.edu.StudentTypeMapper.selectByExample",
			// ex, new RowBounds(offset, limit));
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addStudentType(String studentTypeName) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentTypeMapper scm = session.getMapper(StudentTypeMapper.class);
			StudentType st = new StudentType();
			st.setStudent_type_name(studentTypeName);
			int count = scm.insertSelective(st);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteStudentType(List<Integer> studentTypeId) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentTypeMapper scm = session.getMapper(StudentTypeMapper.class);
			StudentTypeExample ex = new StudentTypeExample();
			StudentTypeExample.Criteria cr = ex.createCriteria();
			cr.andStudent_type_idIn(studentTypeId);
			scm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveStudentType(StudentType studenttype) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentTypeMapper scm = session.getMapper(StudentTypeMapper.class);
			scm.updateByPrimaryKey(studenttype);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 合作高校代码维护 ************************************/

	@Override
	public List<College> getCollegeList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			CollegeExample ex = new CollegeExample();
			ex.setOrderByClause("college_id desc");
			CollegeMapper cm = session.getMapper(CollegeMapper.class);
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			List result = cm.selectByExample(ex);
			if (needTotalCounts) {
				Integer counts = cm.countByExample(null);
				result.add(counts);
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addCollege(String collegeName) {
		SqlSession session = sessionFactory.openSession();
		try {
			CollegeMapper cm = session.getMapper(CollegeMapper.class);
			College co = new College();
			co.setCollege_name(collegeName);

			int count = cm.insertSelective(co);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteCollege(List<Integer> college_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			CollegeMapper cm = session.getMapper(CollegeMapper.class);
			CollegeExample ex = new CollegeExample();
			CollegeExample.Criteria cr = ex.createCriteria();
			cr.andCollege_idIn(college_ids);
			cm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveCollege(College college) {
		SqlSession session = sessionFactory.openSession();
		try {
			CollegeMapper cm = session.getMapper(CollegeMapper.class);
			cm.updateByPrimaryKey(college);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 专业代码维护 ************************************/
	@Override
	public List<Subjects> getSubjectsList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			SubjectsExample ex = new SubjectsExample();
			ex.setOrderByClause("subject_id desc");
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			SubjectsMapper mp = session.getMapper(SubjectsMapper.class);
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				Integer counts = mp.countByExample(null);
				result.add(counts);
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addSubject(String subjectName) {
		SqlSession session = sessionFactory.openSession();
		try {
			SubjectsMapper cm = session.getMapper(SubjectsMapper.class);
			Subjects co = new Subjects();
			co.setSubject_name(subjectName);
			int count = cm.insertSelective(co);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteSubject(List<Integer> subject_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			SubjectsMapper cm = session.getMapper(SubjectsMapper.class);
			SubjectsExample ex = new SubjectsExample();
			SubjectsExample.Criteria cr = ex.createCriteria();
			cr.andSubject_idIn(subject_ids);
			cm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveSubject(Subjects subject) {
		SqlSession session = sessionFactory.openSession();
		try {
			SubjectsMapper cm = session.getMapper(SubjectsMapper.class);
			cm.updateByPrimaryKey(subject);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 机构类型维护 ************************************/
	@Override
	public List<AgentType> getAgentTypeList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			AgentTypeExample ex = new AgentTypeExample();
			ex.setOrderByClause("agent_type_id desc");
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			AgentTypeMapper mp = session.getMapper(AgentTypeMapper.class);
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				Integer counts = mp.countByExample(null);
				result.add(counts);
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addAgentType(AgentType agentType) {
		SqlSession session = sessionFactory.openSession();
		try {
			AgentTypeExample ex = new AgentTypeExample();
			Page p = new Page();
			AgentTypeMapper cm = session.getMapper(AgentTypeMapper.class);
			int count = cm.insertSelective(agentType);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteAgentType(List<Integer> agentType_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			AgentTypeMapper cm = session.getMapper(AgentTypeMapper.class);
			AgentTypeExample ex = new AgentTypeExample();
			AgentTypeExample.Criteria cr = ex.createCriteria();
			cr.andAgent_type_idIn(agentType_ids);
			cm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveAgentType(AgentType agenttype) {
		SqlSession session = sessionFactory.openSession();
		try {
			AgentTypeMapper cm = session.getMapper(AgentTypeMapper.class);
			cm.updateByPrimaryKey(agenttype);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 费用类型维护 ************************************/
	@Override
	public List<FeeType> getFeeTypeList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			FeeTypeExample ex = new FeeTypeExample();
			ex.setOrderByClause("fee_id desc");
			FeeTypeMapper mp = session.getMapper(FeeTypeMapper.class);
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				result.add(mp.countByExample(null));
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addFeeType(FeeType feetype) {
		SqlSession session = sessionFactory.openSession();
		try {
			FeeTypeMapper scm = session.getMapper(FeeTypeMapper.class);
			int count = scm.insertSelective(feetype);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deletFeeType(List<Integer> feeType_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			FeeTypeMapper scm = session.getMapper(FeeTypeMapper.class);
			FeeTypeExample ex = new FeeTypeExample();
			FeeTypeExample.Criteria cr = ex.createCriteria();
			cr.andFee_idIn(feeType_ids);
			scm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveFeeType(FeeType agenttype) {
		SqlSession session = sessionFactory.openSession();
		try {
			FeeTypeMapper bim = session.getMapper(FeeTypeMapper.class);
			bim.updateByPrimaryKey(agenttype);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 入账类型维护 ************************************/
	@Override
	public List<ChargeType> getChargeTypeList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			ChargeTypeMapper mp = session.getMapper(ChargeTypeMapper.class);
			ChargeTypeExample ex = new ChargeTypeExample();
			ex.setOrderByClause("charge_type_id desc");
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				result.add(mp.countByExample(null));
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addChargeType(String typeName) {
		SqlSession session = sessionFactory.openSession();
		try {
			ChargeTypeMapper scm = session.getMapper(ChargeTypeMapper.class);
			ChargeType sc = new ChargeType();
			sc.setCharge_type_name(typeName);
			int count = scm.insertSelective(sc);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deletChargeType(List<Integer> ChargeType_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			ChargeTypeMapper scm = session.getMapper(ChargeTypeMapper.class);
			ChargeTypeExample ex = new ChargeTypeExample();
			ChargeTypeExample.Criteria cr = ex.createCriteria();
			cr.andCharge_type_idIn(ChargeType_ids);
			scm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveChargeType(ChargeType agenttype) {
		SqlSession session = sessionFactory.openSession();
		try {
			ChargeTypeMapper bim = session.getMapper(ChargeTypeMapper.class);
			bim.updateByPrimaryKey(agenttype);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 用户类型维护 ************************************/
	@Override
	public List<UserType> getUserTypeList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			UserTypeExample ex = new UserTypeExample();
			ex.setOrderByClause("user_type_id desc");
			UserTypeMapper mp = session.getMapper(UserTypeMapper.class);
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				result.add(mp.countByExample(null));
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addUserType(String typeName) {
		SqlSession session = sessionFactory.openSession();
		try {
			UserTypeMapper scm = session.getMapper(UserTypeMapper.class);
			UserType sc = new UserType();
			sc.setUser_type_name(typeName);
			int count = scm.insertSelective(sc);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deletUserType(List<Integer> UserType_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			UserTypeMapper scm = session.getMapper(UserTypeMapper.class);
			UserTypeExample ex = new UserTypeExample();
			UserTypeExample.Criteria cr = ex.createCriteria();
			cr.andUser_type_idIn(UserType_ids);
			scm.deleteByExample(ex);
			
			//TODO: also need to delete records from RightsDefault
			
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveUserType(UserType agenttype) {
		SqlSession session = sessionFactory.openSession();
		try {
			UserTypeMapper bim = session.getMapper(UserTypeMapper.class);
			bim.updateByPrimaryKey(agenttype);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 照片类型维护 ************************************/

	@Override
	public List<PictureType> getPictureTypeList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			PictureTypeMapper mp = session.getMapper(PictureTypeMapper.class);
			PictureTypeExample ex = new PictureTypeExample();
			ex.setOrderByClause("pic_type_id desc");
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				result.add(mp.countByExample(null));
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addPictureType(String typeName) {
		SqlSession session = sessionFactory.openSession();
		try {
			PictureTypeMapper scm = session.getMapper(PictureTypeMapper.class);
			PictureType sc = new PictureType();
			sc.setPic_type_name(typeName);
			int count = scm.insertSelective(sc);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deletPictureType(List<Integer> PictureType_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			PictureTypeMapper scm = session.getMapper(PictureTypeMapper.class);
			PictureTypeExample ex = new PictureTypeExample();
			PictureTypeExample.Criteria cr = ex.createCriteria();
			cr.andPic_type_idIn(PictureType_ids);
			scm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean savePictureType(PictureType agenttype) {
		SqlSession session = sessionFactory.openSession();
		try {
			PictureTypeMapper bim = session.getMapper(PictureTypeMapper.class);
			bim.updateByPrimaryKey(agenttype);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 学生状态类型维护 ************************************/

	@Override
	public List<StudentStatus> getStudentStatusList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentStatusMapper mp = session
					.getMapper(StudentStatusMapper.class);
			StudentStatusExample ex = new StudentStatusExample();
			ex.setOrderByClause("stu_status_id desc");
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				result.add(mp.countByExample(null));
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addStudentStatus(String typeName) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentStatusMapper scm = session
					.getMapper(StudentStatusMapper.class);
			StudentStatus sc = new StudentStatus();
			sc.setStu_status_name(typeName);
			int count = scm.insertSelective(sc);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deletStudentStatus(List<Integer> StudentStatus_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentStatusMapper scm = session
					.getMapper(StudentStatusMapper.class);
			StudentStatusExample ex = new StudentStatusExample();
			StudentStatusExample.Criteria cr = ex.createCriteria();
			cr.andStu_status_idIn(StudentStatus_ids);
			scm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveStudentStatus(StudentStatus agenttype) {
		SqlSession session = sessionFactory.openSession();
		try {
			StudentStatusMapper bim = session
					.getMapper(StudentStatusMapper.class);
			bim.updateByPrimaryKey(agenttype);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	public BrightServlet getRemoteServlet() {
		return remoteServlet;
	}

	public void setRemoteServlet(BrightServlet remoteServlet) {
		this.remoteServlet = remoteServlet;
	}

	/************************** agent管理 ************************************/

	public List<RecruitAgent> getRecruitAgentList(int offset, int limit,
			boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			RecruitAgentExample ex = new RecruitAgentExample();
			ex.setOrderByClause("agent_id desc");

			RecruitAgentMapper cm = session.getMapper(RecruitAgentMapper.class);
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			List result = cm.selectByExample(ex);
			if (needTotalCounts) {
				Integer counts = cm.countByExample(null);
				result.add(counts);
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addRecruitAgent(RecruitAgent agent) {
		SqlSession session = sessionFactory.openSession();
		User user = (User) remoteServlet.getUser();
		agent.setUser_id(user.getUser_id());
		try {
			RecruitAgentMapper mp = session.getMapper(RecruitAgentMapper.class);
			int i = mp.insertSelective(agent);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deletRecruitAgent(List<Integer> agent_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			RecruitAgentMapper scm = session
					.getMapper(RecruitAgentMapper.class);
			RecruitAgentExample ex = new RecruitAgentExample();
			RecruitAgentExample.Criteria cr = ex.createCriteria();
			cr.andAgent_idIn(agent_ids);
			scm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveRecruitAgent(RecruitAgent agent) {
		SqlSession session = sessionFactory.openSession();
		try {
			RecruitAgentMapper bim = session
					.getMapper(RecruitAgentMapper.class);
			bim.updateByPrimaryKey(agent);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	/*********************** 招生计划维护 ************************************/

	@Override
	public List<CollegeSubjectView> getCollegeSubjectList(int college,
			int level, int batch) {
		SqlSession session = sessionFactory.openSession();
		try {
			CollegeSubjectViewMapper mp = session
					.getMapper(CollegeSubjectViewMapper.class);
			CollegeSubjectViewExample ex = new CollegeSubjectViewExample();
			// ex.setOrderByClause("subeject_id");
			ex.createCriteria().andBatch_idEqualTo(batch)
					.andCollege_idEqualTo(college)
					.andClassified_idEqualTo(level);

			List<CollegeSubjectView> result = mp.selectByExample(ex);
			return result;

		} finally {
			session.close();
		}
	}

	@Override
	public boolean addCollegeSubject(List<CollegeSubject> collegeSubjects) {
		SqlSession session = sessionFactory.openSession();
		try {
			CollegeSubjectMapper mp = session
					.getMapper(CollegeSubjectMapper.class);

			// 先删除比较保险,连续调用两个RPC可能导致还没删除就已经开始插入了

			CollegeSubjectExample ex = new CollegeSubjectExample();
			ex.createCriteria()
					.andBatch_idEqualTo(collegeSubjects.get(0).getBatch_id())
					.andClassified_idEqualTo(
							collegeSubjects.get(0).getClassified_id())
					.andCollege_idEqualTo(
							collegeSubjects.get(0).getCollege_id());
			mp.deleteByExample(ex);

			for (int i = 0; i < collegeSubjects.size(); i++) {
				mp.insertSelective(collegeSubjects.get(i));
			}

			session.commit();
			return true;

		} finally {
			session.close();
		}
	}

	@Override
	public List<RecruitPlan> getRecruitPlanList(int batch) {
		SqlSession session = sessionFactory.openSession();
		try {
			RecruitPlanMapper mp = session.getMapper(RecruitPlanMapper.class);
			RecruitPlanExample ex = new RecruitPlanExample();
			ex.setOrderByClause("college_name,classified_name,subject_name");
			ex.createCriteria().andBatch_idEqualTo(batch);
			List<RecruitPlan> result = mp.selectByExample(ex);
			return result;

		} finally {
			session.close();
		}
	}

	@Override
	public boolean deletCollegeSubject(CollegeSubject collegeSubjects) {
		SqlSession session = sessionFactory.openSession();
		try {
			CollegeSubjectMapper mp = session
					.getMapper(CollegeSubjectMapper.class);

			CollegeSubjectExample ex = new CollegeSubjectExample();
			ex.createCriteria()
					.andBatch_idEqualTo(collegeSubjects.getBatch_id())
					.andClassified_idEqualTo(collegeSubjects.getClassified_id())
					.andCollege_idEqualTo(collegeSubjects.getCollege_id());
			mp.deleteByExample(ex);
			session.commit();
			return true;

		} finally {
			session.close();
		}
	}

	/*********************** 当前批次设置 ************************************/
	@Override
	public boolean addOrUpdateCurrentBatch(Integer batchNo) {
		SqlSession session = sessionFactory.openSession();
		try {
			CurrentBatchMapper mp = session.getMapper(CurrentBatchMapper.class);
			CurrentBatch cb = new CurrentBatch();
			cb.setCurrent_batch_id(batchNo);
			cb.setUpdate_date(new Date());

			if (mp.countByExample(null) > 0) {
				// update
				mp.updateByExample(cb, null);
			} else {
				// insert
				mp.insertSelective(cb);
			}
			session.commit();
			return true;

		} finally {
			session.close();
		}
	}

	@Override
	public Integer getCurrentBatch() {
		SqlSession session = sessionFactory.openSession();
		try {
			CurrentBatchMapper mp = session.getMapper(CurrentBatchMapper.class);
			ArrayList<CurrentBatch> cb = new ArrayList<CurrentBatch>();
			cb = (ArrayList<CurrentBatch>) mp.selectByExample(null);
			if (cb.size() == 0)
				return -1;

			return cb.get(0).getCurrent_batch_id();

		} finally {
			session.close();
		}
	}

	/*********************** 合作高校协议维护 ************************************/

	@Override
	public List<CollegeAgreement> getCollegeAgreementList(int offset,
			int limit, boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			CollegeAgreementMapper mp = session
					.getMapper(CollegeAgreementMapper.class);
			CollegeAgreementExample ex = new CollegeAgreementExample();
			ex.setOrderByClause("agreement_id desc");
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				Integer counts = mp.countByExample(null);
				result.add(counts);
			}
			return result;

		} finally {
			session.close();
		}
	}

	@Override
	public Serializable getObjectById(String mapperClassName, int id) {
		SqlSession session = sessionFactory.openSession();
		try {
			Class mapperClass = Class.forName(mapperClassName);
			Object mapper = session.getMapper(mapperClass);

			Method method = mapperClass.getMethod("selectByPrimaryKey",
					Integer.class);
			return (Serializable) method.invoke(mapper, id);

		} catch (Exception e) {
			Log.e("", e);
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public boolean addCollegeAgreement(CollegeAgreement agreement) {
		SqlSession session = ConnectionManager.getSessionFactory()
				.openSession();
		try {
			CollegeAgreementMapper bim = session
					.getMapper(CollegeAgreementMapper.class);
			bim.insertSelective(agreement);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteCollegeAgreement(List<CollegeAgreement> agreements) {
		SqlSession session = sessionFactory.openSession();
		try {
			List<Integer> ids = new ArrayList<Integer>();
			String agreementSubDir = new File(
					ServerProperties.getDataLocation()).getAbsolutePath()
					+ "/agreement/";
			for (CollegeAgreement c : agreements) {
				ids.add(c.getAgreement_id());
				try {
					File aggFile = new File(agreementSubDir
							+ c.getAgreement_name());
					if (aggFile.exists()) {
						aggFile.delete();
					}
				} catch (Exception e) {
					Log.e("", e);
				}
			}
			CollegeAgreementMapper cm = session
					.getMapper(CollegeAgreementMapper.class);
			CollegeAgreementExample ex = new CollegeAgreementExample();
			CollegeAgreementExample.Criteria cr = ex.createCriteria();
			cr.andAgreement_idIn(ids);
			cm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveCollegeAgreement(CollegeAgreement agreement) {
		SqlSession session = sessionFactory.openSession();
		try {
			CollegeAgreementMapper bim = session
					.getMapper(CollegeAgreementMapper.class);
			bim.updateByPrimaryKey(agreement);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}


	/************************ 权限基础数据设置 *********************************/
	
	@Override
	public List<RightsCategory> getRightsCategory() {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsCategoryMapper mp = session
					.getMapper(RightsCategoryMapper.class);

			List<RightsCategory> result = mp.selectByExample(null);
			return result;


		} finally {
			session.close();
		}
	}

	@Override
	public List<RightsFunction> getRightsFunction() {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsFunctionMapper mp = session
					.getMapper(RightsFunctionMapper.class);

			List<RightsFunction> result = mp.selectByExample(null);
			return result;

		} finally {
			session.close();
		}
	}

	@Override
	public List<RightsCategoryFunctionKey> getRightsCategoryFunction(
			String categoryID) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsCategoryFunctionMapper mp = session
					.getMapper(RightsCategoryFunctionMapper.class);
			RightsCategoryFunctionExample ex = new RightsCategoryFunctionExample();
			ex.createCriteria().andCategory_idEqualTo(categoryID);
			List<RightsCategoryFunctionKey> result = mp.selectByExample(ex);
			return result;

		} finally {
			session.close();
		}
	}

	@Override
	public boolean addRightsCategory(RightsCategory category) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsCategoryMapper scm = session
					.getMapper(RightsCategoryMapper.class);

			int count = scm.insertSelective(category);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addRightsFunction(RightsFunction function) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsFunctionMapper scm = session
					.getMapper(RightsFunctionMapper.class);

			int count = scm.insertSelective(function);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addRightsCatetoryFunctions(
			List<RightsCategoryFunctionKey> rightsCategoryFunctionList) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsCategoryFunctionMapper mp = session
					.getMapper(RightsCategoryFunctionMapper.class);

			// 先删除比较保险,连续调用两个RPC可能导致还没删除就已经开始插入了

			RightsCategoryFunctionExample ex = new RightsCategoryFunctionExample();
			ex.createCriteria().andCategory_idEqualTo(rightsCategoryFunctionList.get(0).getCategory_id());

			mp.deleteByExample(ex);

			for (int i = 0; i < rightsCategoryFunctionList.size(); i++) {
				mp.insertSelective(rightsCategoryFunctionList.get(i));
			}

			session.commit();
			return true;

		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteRightsCategory(RightsCategory category) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsCategoryMapper mp = session
					.getMapper(RightsCategoryMapper.class);
			RightsCategoryExample ex = new RightsCategoryExample();
			ex.createCriteria().andCategory_idEqualTo(category.getCategory_id());
			
			int result = mp.deleteByExample(ex);
			session.commit();
			return true;

		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteRightsFunction(List<String> function) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsFunctionMapper mp = session
					.getMapper(RightsFunctionMapper.class);

			RightsFunctionExample ex = new RightsFunctionExample();
			ex.createCriteria().andFunction_idIn(function);
			mp.deleteByExample(ex);
			
			//also delete record from CategoryFunction 
			RightsCategoryFunctionMapper mp2 = session
					.getMapper(RightsCategoryFunctionMapper.class);

			RightsCategoryFunctionExample ex2 = new RightsCategoryFunctionExample();
			ex2.createCriteria().andFunction_idIn(function);

			mp2.deleteByExample(ex2);

			session.commit();
			return true;

		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteRightsCatetoryFunctions(
			String rightsCategoryFunctionList) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsCategoryFunctionMapper mp = session
					.getMapper(RightsCategoryFunctionMapper.class);



			RightsCategoryFunctionExample ex = new RightsCategoryFunctionExample();
			ex.createCriteria().andCategory_idEqualTo(rightsCategoryFunctionList);

			mp.deleteByExample(ex);

			session.commit();
			return true;

		} finally {
			session.close();
		}

	}

	@Override
	public List<RightsDefaultKey> getRightsDefault(String user_typ_Id) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsDefaultMapper mp = session
					.getMapper(RightsDefaultMapper.class);
			RightsDefaultExample ex = new RightsDefaultExample();
			ex.createCriteria().andUser_type_idEqualTo(new Integer(user_typ_Id));
			List<RightsDefaultKey> result = mp.selectByExample(ex);
			return result;

		} finally {
			session.close();
		}
	}

	@Override
	public boolean addRightsDefault(List<RightsDefaultKey> rightDefaultList) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsDefaultMapper mp = session
					.getMapper(RightsDefaultMapper.class);

			// 先删除比较保险,连续调用两个RPC可能导致还没删除就已经开始插入了

			RightsDefaultExample ex = new RightsDefaultExample();
			ex.createCriteria().andUser_type_idEqualTo(rightDefaultList.get(0).getUser_type_id());

			mp.deleteByExample(ex);

			for (int i = 0; i < rightDefaultList.size(); i++) {
				mp.insertSelective(rightDefaultList.get(i));
			}

			session.commit();
			return true;

		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteRightsDefault(Integer userType_id) {
		SqlSession session = sessionFactory.openSession();
		try {
			RightsDefaultMapper mp = session
					.getMapper(RightsDefaultMapper.class);



			RightsDefaultExample ex = new RightsDefaultExample();
			ex.createCriteria().andUser_type_idEqualTo(userType_id);
			mp.deleteByExample(ex);
			session.commit();
			return true;

		} finally {
			session.close();
		}

	}

	
	/************************ 用户管理 *********************************/
	
	@Override
	public List<User> getUserList(int offset, int limit, boolean needTotalCounts) {
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper mp = session
					.getMapper(UserMapper.class);

			UserExample ex = new UserExample();
			if (offset != -1 || limit != -1) {
				ex.setPage(new Page(offset, limit));
			}
			ex.setOrderByClause("user_id desc");
			List result = mp.selectByExample(ex);
			if (needTotalCounts) {
				Integer counts = mp.countByExample(null);
				result.add(counts);
			}
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addUser(User user) {
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper bim = session.getMapper(UserMapper.class);
			int count = bim.insertSelective(user);
			session.commit();
			return true;
		} finally {
			session.close();
		}

	}

	@Override
	public boolean deletUser(List<Integer> user_ids) {
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper scm = session
					.getMapper(UserMapper.class);
			UserExample ex = new UserExample();
			UserExample.Criteria cr = ex.createCriteria();
			cr.andUser_idIn(user_ids);
			scm.deleteByExample(ex);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean saveUser(User user) {
		SqlSession session = sessionFactory.openSession();
		try {
			UserMapper scm = session
					.getMapper(UserMapper.class);
			scm.updateByPrimaryKey(user);
			session.commit();
			return true;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean setOverridePriv(List<RightsCategoryFunctionKey> list,
			boolean addOrRemove) {
		
		return false;

	}

}
