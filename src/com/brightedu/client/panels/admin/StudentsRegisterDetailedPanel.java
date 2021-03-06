package com.brightedu.client.panels.admin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.brightedu.client.BrightEdu;
import com.brightedu.client.CommonAsyncCall;
import com.brightedu.client.panels.BasicAdminDetailPanel;
import com.brightedu.client.panels.DetailedEditorForm;
import com.brightedu.model.edu.PictureType;
import com.brightedu.model.edu.StudentInfo;
import com.brightedu.model.edu.StudentPicture;
import com.brightedu.shared.Constants;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.types.Side;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.Layout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;
import com.smartgwt.client.widgets.tab.events.TabSelectedEvent;
import com.smartgwt.client.widgets.tab.events.TabSelectedHandler;

public class StudentsRegisterDetailedPanel extends BasicAdminDetailPanel {
	TabSet studentTabSet;
	// StudentsRegisterPictureForm picForm;
	StudentsRegisterEditorForm infoForm;

	LinkedHashMap<String, String> pic_typeValues;
	HLayout picPanel = new HLayout();
	List<StudentsRegisterPictureForm> picForms = new ArrayList<StudentsRegisterPictureForm>();

	public StudentsRegisterDetailedPanel(StudentsRegister reg) {
		super(reg);

		studentTabSet = new TabSet();
		Layout paneContainerProperties = new Layout();
		paneContainerProperties.setLayoutMargin(0);
		paneContainerProperties.setLayoutTopMargin(1);
		studentTabSet.setPaneContainerProperties(paneContainerProperties);

		studentTabSet.addTabSelectedHandler(new TabSelectedHandler() {
			public void onTabSelected(TabSelectedEvent event) {
				Tab selectedTab = event.getTab();
				String historyToken = selectedTab.getAttribute("historyToken");
				if (historyToken != null) {
					History.newItem(historyToken, false);
				} else {
					History.newItem("main", false);
				}
			}
		});
		Tab studentInfoTab = new Tab();

		studentInfoTab.setPrompt("学生信息");
		studentInfoTab.setAttribute("height", "50");
		studentInfoTab.setIcon("student_info.gif");
		// studentInfoTab.setWidth(80);

		HLayout studentTabPanel = new HLayout();
		studentTabPanel.setHeight100();
		studentTabPanel.setWidth100();
		studentInfoTab.setPane(studentTabPanel);

		Tab picTab = new Tab();
		// picTab.setTitle("照片信息");
		picTab.setPrompt("照片信息");
		picTab.setIcon("student_pic.png");
		picTab.setAttribute("height", "50");
		// picTab.setWidth(80);
		HLayout picTabPanel = new HLayout();
		picTabPanel.setHeight100();
		picTabPanel.setWidth100();
		picTab.setPane(picTabPanel);

		createPicPanel();
		infoForm = new StudentsRegisterEditorForm(reg);
		// infoForm.setWidth100();
		// infoForm.setHeight100();
		picTabPanel.addMember(picPanel);
		studentTabPanel.addMember(infoForm);
		studentTabSet.addTab(studentInfoTab);
		studentTabSet.addTab(picTab);
		studentTabSet.setWidth100();
		studentTabSet.setHeight100();
		studentTabSet.setTabBarPosition(Side.LEFT);
		addMember(studentTabSet);
		setWidth100();
		setHeight100();
		picTab.addTabSelectedHandler(new TabSelectedHandler() {
			@Override
			public void onTabSelected(TabSelectedEvent event) {
				showPictures();
			}
		});
	}

	private void createPicPanel() {
		BrightEdu.createDataBaseRPC().getNameValuePareList(
				new String[] { "PictureType" }, new CommonAsyncCall<List>() {

					@Override
					public void onSuccess(List result) {
						List<PictureType> types = (List<PictureType>) result
								.get(0);
						for (PictureType type : types) {
							VLayout layout = new VLayout();
							String typeName = type.getPic_type_name();
							final StudentsRegisterPictureForm picForm = new StudentsRegisterPictureForm(
									getMasterDetail(), typeName, type
											.getPic_type_id());
							layout.addMember(picForm);
							final Img img = new Img();
							IButton removeBtn = new IButton("删除");
							removeBtn.setWidth(50);
							img.setPadding(10);
							img.setBorder("1px solid gray");
							img.setWidth(200);
							img.setHeight(200);
							layout.addMember(img);
							layout.addMember(picForm.getBrightFrame());
							picForm.setViewImg(img);
							picForms.add(picForm);
							picPanel.addMember(layout);
							picPanel.addMember(removeBtn);
							removeBtn.addClickHandler(new ClickHandler() {

								@Override
								public void onClick(ClickEvent event) {
									img.setSrc(Constants.BLANK_IMAGE);
									picForm.serverTempFile = null;
									picForm.getBrightFrame().setLoaded(true);
								}
							});
						}
						picPanel.redraw();
					}
				});
	}

	private void showPictures() {
		Record selectRecord = getMasterDetail().getMaster().getResultList()
				.getSelectedRecord();
		StudentInfo student = selectRecord != null ? (StudentInfo) selectRecord
				.getAttributeAsObject("object") : null;
		// 不是同一个学生就要刷新

		// 先清空
		cleanPictures();
		// 再刷
		if (selectRecord != null) {
			if (student != picForms.get(0).getStudent()) {
				refreshPicture(student);
			}
		}
	}

	public void refreshPicture(StudentInfo student) {
		BrightEdu.createDataBaseRPC().getPictures(student.getStudent_id(),
				new CommonAsyncCall<List<StudentPicture>>() {
					@Override
					public void onSuccess(List<StudentPicture> result) {
						for (StudentPicture pic : result) {
							// war/data/student_pics/register_year/pic_type_id/stu_id_pic.abc.jpg
							StudentsRegisterPictureForm picForm = getPicForm(pic
									.getPic_type_id());
							if (pic.getPic() != null
									&& !pic.getPic().trim().equals("")) {
								picForm.getViewImg().setSrc(
										GWT.getHostPageBaseURL()
												+ pic.getPic());
							} else {
								picForm.getViewImg().setSrc(
										Constants.BLANK_IMAGE);
							}
							picForm.setPicture(pic);
						}
					}
				});
	}

	private StudentsRegisterPictureForm getPicForm(int pic_type_id) {
		for (StudentsRegisterPictureForm form : picForms) {
			if (form.getPicTypeId() == pic_type_id) {
				return form;
			}
		}
		return null;
	}

	@Override
	public DetailedEditorForm createDetailEditorForm() {
		// this is not used here
		return null;
	}

	public List<StudentsRegisterPictureForm> getPictureForms() {
		return picForms;
	}

	public StudentsRegisterEditorForm getInfoForm() {
		return infoForm;
	}

	public void cleanPictures() {
		List<StudentsRegisterPictureForm> picForms = getPictureForms();
		if (picForms != null) {
			for (StudentsRegisterPictureForm f : picForms) {
				f.clean();
			}
		}
	}
}
