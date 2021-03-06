package com.brightedu.client.panels.admin;

import com.brightedu.client.frame.BrightFrame;
import com.brightedu.client.frame.BrightFrame.LoadHandler;
import com.brightedu.client.panels.MasterDetailAdmin;
import com.brightedu.model.edu.StudentInfo;
import com.brightedu.model.edu.StudentPicture;
import com.brightedu.shared.Constants;
import com.brightedu.shared.UUID;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Event;
import com.smartgwt.client.types.Encoding;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.UploadItem;
import com.smartgwt.client.widgets.form.fields.events.ChangeEvent;
import com.smartgwt.client.widgets.form.fields.events.ChangeHandler;

public class StudentsRegisterPictureForm extends DynamicForm {

	MasterDetailAdmin masterDetail;
	StudentsRegisterMasterPanel master;
	BrightFrame brightFrame;
	boolean fakeFrameLoaded = false;
	private Img viewImg;
	String serverTempFile;
	int picTypeId;
	String defaultSrc;
	StudentInfo student;
	StudentPicture picture;

	public StudentsRegisterPictureForm(MasterDetailAdmin masterDetail,
			String title, int picTypeId) {
		this.picTypeId = picTypeId;
		this.masterDetail = masterDetail;
		String faketarget = UUID.uuid();
		master = (StudentsRegisterMasterPanel) masterDetail.getMaster();
		brightFrame = new BrightFrame(faketarget);
		setTarget(faketarget);
		brightFrame.setWidth("1");
		brightFrame.setHeight("1");
		brightFrame.setVisible(false);

		brightFrame.addMyLoadHandler(new LoadHandler() {

			@Override
			public void onLoad(Event event) {
				if (!fakeFrameLoaded) {
					fakeFrameLoaded = true;
				} else {
					if (!brightFrame.isSuccess()) {
						SC.warn("保存失败!" + brightFrame.getMessage());
					} else {
						// 保存成功
						String tempfile = brightFrame.getMessage();
						setServerTempFile(tempfile);
						brightFrame.setLoaded(true);
						viewImg.setSrc(GWT.getHostPageBaseURL() + tempfile);
					}
				}
			}
		});
		UploadItem fileItem = new UploadItem(title.trim(), title);
		fileItem.addChangeHandler(new ChangeHandler() {

			@Override
			public void onChange(ChangeEvent event) {
				submitForm();
			}
		});

		setAction(GWT.getModuleBaseURL() + Constants.FILE_HANDLE_SERVLET_NAMAE
				+ "?action=" + Constants.ACTION_UPLOAD_PICTURE);
		setWrapItemTitles(false);
		setFields(fileItem);
		setEncoding(Encoding.MULTIPART);
	}

	public String getServerTempFile() {
		return serverTempFile;
	}

	public void setServerTempFile(String serverTempFile) {
		this.serverTempFile = serverTempFile;
	}

	public BrightFrame getBrightFrame() {
		return brightFrame;
	}

	public Img getViewImg() {
		return viewImg;
	}

	public void setViewImg(Img viewImg) {
		this.viewImg = viewImg;
	}

	public int getPicTypeId() {
		return picTypeId;
	}

	public void setPicTypeId(int picTypeId) {
		this.picTypeId = picTypeId;
	}

	public void clean() {
		serverTempFile = null;
		brightFrame.setLoaded(false);
		viewImg.setSrc(Constants.BLANK_IMAGE);
	}

	public StudentInfo getStudent() {
		return student;
	}

	public void setStudent(StudentInfo student) {
		this.student = student;
	}

	public StudentPicture getPicture() {
		return picture;
	}

	public void setPicture(StudentPicture picture) {
		this.picture = picture;
	}

}
