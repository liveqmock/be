package com.brightedu.client.panels.admin.students;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import com.brightedu.client.BrightEdu;
import com.brightedu.client.CommonAsyncCall;
import com.brightedu.client.panels.BasicAdminPanel;
import com.brightedu.client.panels.MasterDetailAdmin;
import com.brightedu.client.panels.admin.AdminDialog;
import com.brightedu.model.edu.BatchIndex;
import com.brightedu.model.edu.College;
import com.brightedu.model.edu.EthnicGroup;
import com.brightedu.model.edu.MajorCategory;
import com.brightedu.model.edu.PoliticalStatus;
import com.brightedu.model.edu.RecruitAgent;
import com.brightedu.model.edu.School;
import com.brightedu.model.edu.StudentClassified;
import com.brightedu.model.edu.StudentInfo;
import com.brightedu.model.edu.StudentStatus;
import com.brightedu.model.edu.StudentType;
import com.brightedu.model.edu.Subjects;
import com.brightedu.model.edu.UserType;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.grid.ListGridField;

public class StudentsRegisterMasterPanel extends BasicAdminPanel {

	ListGridField[] fileds;

	LinkedHashMap<String, String> batchValues;
	LinkedHashMap<String, String> collegeValues;
	LinkedHashMap<String, String> sdudentClassfiedValues;
	LinkedHashMap<String, String> subjectsValues;
	/************* 这两个都来自recruit_agent **************************************/
	LinkedHashMap<String, String> fundAgentValues;
	LinkedHashMap<String, String> managedAgentValues;
	/***************************************************/
	LinkedHashMap<String, String> stu_statustValues;
	LinkedHashMap<String, String> ethnic_groupValues;
	LinkedHashMap<String, String> political_statusValues;
	LinkedHashMap<String, String> graduate_collegeValues;
	LinkedHashMap<String, String> student_typeValues;
	LinkedHashMap<String, String> major_categoryValues;

	String[] nameValuePareModels;

	MasterDetailAdmin admin;

	public StudentsRegisterMasterPanel(MasterDetailAdmin admin) {
		this.admin = admin;
		nameValuePareModels = new String[] { "BatchIndex", "College",
				"StudentClassified", "Subjects", "RecruitAgent",
				"StudentStatus", "EthnicGroup", "PoliticalStatus", "School",
				"StudentType", "MajorCategory" };
		initValueMaps();
	}

	private void initValueMaps() {
		batchValues = new LinkedHashMap<String, String>();
		collegeValues = new LinkedHashMap<String, String>();
		sdudentClassfiedValues = new LinkedHashMap<String, String>();
		subjectsValues = new LinkedHashMap<String, String>();
		fundAgentValues = new LinkedHashMap<String, String>();
		managedAgentValues = new LinkedHashMap<String, String>();
		stu_statustValues = new LinkedHashMap<String, String>();
		ethnic_groupValues = new LinkedHashMap<String, String>();
		political_statusValues = new LinkedHashMap<String, String>();
		graduate_collegeValues = new LinkedHashMap<String, String>();
		student_typeValues = new LinkedHashMap<String, String>();
		major_categoryValues = new LinkedHashMap<String, String>();
		dbService.getNameValuePareList(nameValuePareModels,
				new CommonAsyncCall<List>() {
					@Override
					public void onSuccess(List result) {
						parseValueMaps(result);
					}
				});
	}

	private void parseValueMaps(List totalNameValuePares) {
		StudentsRegisterEditorForm detailedForm = (StudentsRegisterEditorForm) admin
				.getDetailed().getDetailedForm();
		for (int i = 0; i < totalNameValuePares.size(); i++) {
			List nameValuePare = (List) totalNameValuePares.get(i);
			switch (i) {
			case 0:
				for (int x = 0; x < nameValuePare.size(); x++) {
					BatchIndex bi = (BatchIndex) nameValuePare.get(x);
					batchValues.put(bi.getBatch_id() + "", bi.getBatch_name());
				}

				break;
			case 1:
				for (int x = 0; x < nameValuePare.size(); x++) {
					College c = (College) nameValuePare.get(x);
					collegeValues.put(c.getCollege_id() + "",
							c.getCollege_name());
				}
				break;
			case 2:
				for (int x = 0; x < nameValuePare.size(); x++) {
					StudentClassified c = (StudentClassified) nameValuePare
							.get(x);
					sdudentClassfiedValues.put(c.getClassified_id() + "",
							c.getClassified_name());
				}
				break;
			case 3:
				for (int x = 0; x < nameValuePare.size(); x++) {
					Subjects c = (Subjects) nameValuePare.get(x);
					subjectsValues.put(c.getSubject_id() + "",
							c.getSubject_name());
				}
				break;
			case 4:
				for (int x = 0; x < nameValuePare.size(); x++) {
					RecruitAgent agent = (RecruitAgent) nameValuePare.get(x);

					fundAgentValues.put(agent.getAgent_id() + "",
							agent.getAgent_name());
					managedAgentValues.put(agent.getAgent_id() + "",
							agent.getAgent_name());
				}
				break;
			case 5:
				for (int x = 0; x < nameValuePare.size(); x++) {
					StudentStatus c = (StudentStatus) nameValuePare.get(x);
					stu_statustValues.put(c.getStu_status_id() + "",
							c.getStu_status_name());
				}
				break;
			case 6:
				for (int x = 0; x < nameValuePare.size(); x++) {
					EthnicGroup c = (EthnicGroup) nameValuePare.get(x);
					ethnic_groupValues.put(c.getEthnic_group_id() + "",
							c.getEthnic_group_name());
				}
				break;
			case 7:
				for (int x = 0; x < nameValuePare.size(); x++) {
					PoliticalStatus c = (PoliticalStatus) nameValuePare.get(x);
					political_statusValues.put(c.getPol_id() + "",
							c.getPol_name());
				}
				break;
			case 8:
				for (int x = 0; x < nameValuePare.size(); x++) {
					School c = (School) nameValuePare.get(x);
					graduate_collegeValues.put(c.getSchool_code(),
							c.getSchool_name());
				}
				break;
			case 9:
				for (int x = 0; x < nameValuePare.size(); x++) {
					StudentType c = (StudentType) nameValuePare.get(x);
					student_typeValues.put(c.getStudent_type_id() + "",
							c.getStudent_type_name());
				}
				break;
			case 10:
				for (int x = 0; x < nameValuePare.size(); x++) {
					MajorCategory c = (MajorCategory) nameValuePare.get(x);
					major_categoryValues.put(c.getStudent_major_category_id()
							+ "", c.getStudent_major_category_name());
				}
				break;
			default:
				break;
			}
		}
		detailedForm.setValueMaps(batchValues, collegeValues,
				sdudentClassfiedValues, subjectsValues, fundAgentValues,
				managedAgentValues, stu_statustValues, ethnic_groupValues,
				political_statusValues, graduate_collegeValues,
				student_typeValues, major_categoryValues);
		if (getAdminDialog() != null) {
			StudentsRegisterEditorForm editorForm = (StudentsRegisterEditorForm) getAdminDialog()
					.getContentForm();
			editorForm.setValueMaps(batchValues, collegeValues,
					sdudentClassfiedValues, subjectsValues, fundAgentValues,
					managedAgentValues, stu_statustValues, ethnic_groupValues,
					political_statusValues, graduate_collegeValues,
					student_typeValues, major_categoryValues);
		}
	}

	public void refresh() {
		this.initValueMaps();
		super.refresh();
	}

	@Override
	protected void gotoPage(final int indexGoto, final boolean init) {
		AsyncCallback<List> callback = new CommonAsyncCall<List>() {
			@Override
			public void onSuccess(List result) {
				int size = result.size();
				Record[] listData = init ? new Record[size - 1]
						: new Record[size];
				for (int i = 0; i < size; i++) {
					if (i == size - 1) {
						if (init) {
							int counts = (Integer) result.get(size - 1);
							setTotalCounts(counts);
							break;
						}
					}
					StudentInfo bi = (StudentInfo) result.get(i);
					Record rec = new Record();
					rec.setAttribute("select", false);
					rec.setAttribute("id", bi.getStudent_id());
					rec.setAttribute("object", bi);
					rec.setAttribute("obj_name", bi.getStudent_name());
					rec.setAttribute("identity_card", bi.getIdentity_card());
					rec.setAttribute("student_college_id",
							bi.getStudent_college_id());

					listData[i] = rec;
				}
				resultList.setData(listData);
				setCurrentPage(indexGoto);
			}
		};
		dbService.getStudentList((indexGoto - 1) * currentRowsInOnePage,
				currentRowsInOnePage, init, callback);
	}

	@Override
	public ListGridField[] createGridFileds() {
		fileds = parseGridFields(new String[] { "obj_name", "identity_card",
				"student_college_id" }, new String[] { "学生", "身份证", "学号" },
				new ListGridFieldType[] { ListGridFieldType.TEXT,
						ListGridFieldType.TEXT, ListGridFieldType.TEXT },
				new boolean[] { false, false, false },
				new int[] { 100, -1, -1 });

		return fileds;
	}

	@Override
	public void search(String keyWords, Record range) {
	}

	@Override
	public void deleteRecords(List<Integer> deleteIds) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Record record) {
		final StudentInfo newagt = (StudentInfo) admin.getDetailed()
				.getDetailedForm().getModel();
		final Record rec = resultList.getSelectedRecord();
		final StudentInfo oldagt = (StudentInfo) rec
				.getAttributeAsObject("object");
		newagt.setRegister_date(oldagt.getRegister_date());
		newagt.setUpdate_date(oldagt.getUpdate_date());

		dbService.saveModel(newagt, new CommonAsyncCall<Boolean>() {
			@Override
			public void onSuccess(Boolean result) {
				BrightEdu.showTip("已保存!");
				rec.setAttribute("object", newagt);
				rec.setAttribute("obj_name", newagt.getStudent_name());
				rec.setAttribute("identity_card", newagt.getIdentity_card());
				rec.setAttribute("student_college_id",
						newagt.getStudent_college_id());
				resultList.redraw();
			}

			protected void failed() { // rollback in UI
				// List UI would not be changed here
			}
		});
	}

	@Override
	public void add(Serializable model) {

		dbService.addModel(model, getAdminDialog().getAddAsync());

	}

	@Override
	public AdminDialog createAdminDialog() {
		AdminDialog adminDialog = new AdminDialog() {
			StudentsRegisterEditorForm form = new StudentsRegisterEditorForm(
					admin);

			public void init() {
				super.init();
				// form.setOverflow(Overflow.HIDDEN);
				// 这里form不能自适应大小，shit！
				form.setWidth(560);
				form.setHeight(280);
				form.hideSaveItem();
				form.setPadding(5);
				form.setWrapItemTitles(true);
				form.setValueMaps(batchValues, collegeValues,
						sdudentClassfiedValues, subjectsValues,
						fundAgentValues, managedAgentValues, stu_statustValues,
						ethnic_groupValues, political_statusValues,
						graduate_collegeValues, student_typeValues,
						major_categoryValues);
			}

			@Override
			protected DynamicForm createContentForm() {
				return form;
			}

			@Override
			protected Serializable getAddedModel() {
				return form.getModel();
			}

			public void show() {
				super.show();
			}
		};
		adminDialog.setAutoHeight();
		adminDialog.setAutoWidth();
		adminDialog.setSize("520", "340");
		adminDialog.setAdminPanel(this);
		return adminDialog;
	}

}
