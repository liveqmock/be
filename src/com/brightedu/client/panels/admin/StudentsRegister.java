package com.brightedu.client.panels.admin;

import java.io.Serializable;
import java.util.List;

import com.brightedu.client.panels.BasicAdminDetailPanel;
import com.brightedu.client.panels.BasicAdminPanel;
import com.brightedu.client.panels.DetailedEditorForm;
import com.brightedu.client.panels.FunctionPanel;
import com.brightedu.client.panels.MasterDetailAdmin;
import com.brightedu.client.panels.PanelFactory;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.grid.events.SelectionChangedHandler;
import com.smartgwt.client.widgets.grid.events.SelectionEvent;
import com.smartgwt.client.widgets.layout.VLayout;

/**
 * 专业代码维护
 * 
 * @author chetwang
 * 
 */
public final class StudentsRegister extends MasterDetailAdmin {

	public static String DESCRIPTION = "学生注册";

	IButton saveBtn = new IButton("修改");

	public StudentsRegister() {
		detailedV.setMembersMargin(15);
		detailedV.addMember(saveBtn);
		// saveBtn.setMargin(2);
		saveBtn.setWidth(70);
		saveBtn.disable();
		((StudentsRegisterDetailedPanel) detailed).infoForm.hideSaveItem(); // 这里不用这个saveItem
		saveBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				if (master.getResultList().getSelectedRecord() != null) {
					((StudentsRegisterDetailedPanel) detailed).infoForm
							.update();
				}
			}
		});
	}

	public static class Factory implements PanelFactory {
		String id;

		public Canvas create() {
			StudentsRegister panel = new StudentsRegister();
			id = panel.getID();
			return panel;
		}

		public String getID() {
			return id;
		}

	}

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

	protected void initSelectionChange() {
		master.getResultList().addSelectionChangedHandler(
				new SelectionChangedHandler() {

					@Override
					public void onSelectionChanged(SelectionEvent event) {
						StudentsRegisterDetailedPanel detailed = (StudentsRegisterDetailedPanel) getDetailed();
						detailed.studentTabSet.selectTab(0);
						if (event.getState()) {
							detailed.getInfoForm().setValue(
									(Serializable) event.getRecord()
											.getAttributeAsObject("object"));
							saveBtn.enable();
						} else {
							detailed.getInfoForm().reset();
							detailed.cleanPictures();
							saveBtn.disable();
						}
					}
				});
	}

	@Override
	public BasicAdminPanel createMasterPanel() {
		return new StudentsRegisterMasterPanel(this);
	}

	@Override
	public BasicAdminDetailPanel createDetailPanel() {
		return new StudentsRegisterDetailedPanel(this);
	}

	@Override
	protected String getMasterTitle() {
		return "学生信息汇总";
	}

	@Override
	protected String getDetialTitle() {
		return "学生详细信息";
	}
}
