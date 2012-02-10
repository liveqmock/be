package com.brightedu.client.panels.admin;

import java.util.List;

import com.brightedu.client.BrightEdu;
import com.brightedu.client.CommonAsyncCall;
import com.brightedu.client.panels.BasicAdminPanel;
import com.brightedu.model.edu.StudentClassified;
import com.brightedu.model.edu.Subjects;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.grid.ListGridField;

public class SubjectsAdminPanel extends BasicAdminPanel {

	@Override
	public void gotoPage(final int indexGoto, final boolean init) {
		AsyncCallback<List<Subjects>> callback = new CommonAsyncCall<List<Subjects>>() {
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
					Subjects sc = (Subjects) result.get(i);
					Record rec = new Record();
					rec.setAttribute("select", false);
					rec.setAttribute("id", sc.getSubject_id());
					rec.setAttribute("object", sc);
					rec.setAttribute("obj_name", sc.getSubject_name());
					rec.setAttribute("reg_time", sc.getRegister_date());
					listData[i] = rec;
				}
				resultList.setData(listData);
				setCurrentPage(indexGoto);
			}
		};
		if (init) {
			dbService.getSubjectsListAndTotalCounts((indexGoto - 1)
					* currentRowsInOnePage, currentRowsInOnePage, callback);
		} else {
			dbService.getSubjectsList((indexGoto - 1) * currentRowsInOnePage,
					currentRowsInOnePage, callback);
		}
	}

	@Override
	public ListGridField[] createGridFileds() {
		return parseGridFields(new String[] { "obj_name", "reg_time" },
				new String[] { "专业名称", "录入时间" }, new ListGridFieldType[] {
						ListGridFieldType.TEXT, ListGridFieldType.DATE },
				new boolean[] { true, false }, new int[] { -1, 200 });
	}

	@Override
	public void search(String keyWords, Record range) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRecords(List<Integer> deleteIds) {
		dbService.deleteSubject(deleteIds, delAsync);
	}

	@Override
	public void update(final Record rec) {
		final Subjects editedSubject = (Subjects) rec
				.getAttributeAsObject("object");
		final String oldName = editedSubject.getSubject_name();
		editedSubject.setSubject_name(rec.getAttributeAsString("obj_name"));
		dbService.saveSubject(editedSubject, new CommonAsyncCall<Boolean>() {
			@Override
			public void onSuccess(Boolean result) {
				BrightEdu.showTip("已保存!");
			}

			protected void failed() { // rollback in UI
				editedSubject.setSubject_name(oldName);
				rec.setAttribute("obj_name", oldName);
			}
		});
	}

	@Override
	public void add(Object model) {
		final String subjectName = ((String[]) model)[0];
		if (subjectName != null && subjectName.trim().length() > 0) {
			dbService.addSubject(subjectName, getAdminDialog().getAddAsync());
		} else {
			SC.say("内容不能为空！");
		}
	}

	@Override
	public AdminDialog createAdminDialog() {
		TextAdminDialog text = new TextAdminDialog();
		text.titles = new String[] { "专业" };
		text.adminPanel = this;
		return text;
	}

}