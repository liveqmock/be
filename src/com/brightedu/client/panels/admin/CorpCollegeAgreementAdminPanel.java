package com.brightedu.client.panels.admin;

import java.util.List;
import java.util.Map;

import com.brightedu.client.panels.BasicAdminPanel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.user.client.ui.NamedFrame;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.types.ContentsType;
import com.smartgwt.client.types.Encoding;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.widgets.HTMLPane;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.ValuesManager;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.UploadItem;
import com.smartgwt.client.widgets.grid.ListGridField;

public class CorpCollegeAgreementAdminPanel extends BasicAdminPanel {

	private Map<String, String> colleges;
	private Map<String, String> agents;

	@Override
	public void gotoPage(int indexGoto, boolean init) {

	}

	@Override
	public ListGridField[] createGridFileds() {
		initCollegesAndAgents();
		ListGridField[] fields = parseGridFields(new String[] { "college",
				"agent", "status", "user", "modify_date", "create_date",
				"agreement" }, new String[] { "合作高校", "我方学校", "状态", "处理人",
				"修改时间", "录入时间", "协议" }, new ListGridFieldType[] {
				ListGridFieldType.TEXT, ListGridFieldType.TEXT,
				ListGridFieldType.TEXT, ListGridFieldType.TEXT,
				ListGridFieldType.DATE, ListGridFieldType.DATE,
				ListGridFieldType.IMAGEFILE }, new boolean[] { true, true,
				true, false, false, false, false }, new int[] { -1, -1, 100,
				100, 200, 200, 50 });

		return fields;
		// http://stackoverflow.com/questions/3053462/open-save-file-in-smartgwt
	}

	private void initCollegesAndAgents() {

	}

	@Override
	public void search(String keyWords, Record range) {

	}

	@Override
	public void deleteRecords(List<Integer> deleteIds) {

	}

	@Override
	public void update(Record record) {

	}

	@Override
	public void add(Object model) {

	}

	@Override
	public AdminDialog createAdminDialog() {

		return new AgreementDialog();
	}

	private class AgreementDialog extends AdminDialog {

		private String faketarget = "fakeuploadframe";

		private SelectItem collegeItem = new SelectItem("college", "合作高校");
		private SelectItem agentItem = new SelectItem("agent", "我方学校");
		private SelectItem statusItem = new SelectItem("status", "状态");
		UploadItem fileItem = new UploadItem("agreement", "协议");
		DynamicForm form = new DynamicForm();
		ValuesManager vm = new ValuesManager();
		boolean fakeFrameLoaded = false;
		Img busyImg = new Img("loadingSmall.gif");

		public void init() {

			NamedFrame frame = new NamedFrame(faketarget);
			frame.setWidth("1");
			frame.setHeight("1");
			frame.setVisible(false);
			frame.addLoadHandler(new LoadHandler() {

				@Override
				public void onLoad(LoadEvent event) {
					if (!fakeFrameLoaded) {
						fakeFrameLoaded = true;
					} else {
						hide();
					}

				}
			});
			bottomLayout.addMember(frame);
			busyImg.setSize("16", "16");
			busyImg.setVisible(false);
			bottomLayout.addMember(busyImg);
			super.init();
			setSize("325", "170");
			form.setAction(GWT.getModuleBaseURL() + "formwithfile");
		}

		@Override
		protected Object getAddedModel() {
			return null;
		}

		// here it is form submit action
		protected void add() {
			busyImg.setVisible(true);
			okBtn.disable();
			form.submitForm();
		}

		protected void reset() {
			okBtn.enable();
			busyImg.setVisible(false);
			super.reset();
		}

		@Override
		protected DynamicForm getContentForm() {
			// fileItem.setIcons(chooseIcon);
			collegeItem.setValue("南开");
			agentItem.setValue("今明本部");
			int len = 250;
			collegeItem.setWidth(len);
			agentItem.setWidth(len);
			statusItem.setWidth(len);
			// fileItem.disable();
			fileItem.setWidth("100%");
			fileItem.setHeight(30);
			
			form.setPadding(5);
			form.setFields(collegeItem, agentItem, statusItem, fileItem);
			form.setValuesManager(vm);
			form.setEncoding(Encoding.MULTIPART);
			form.setTarget(faketarget);
			return form;
		}

	}

}