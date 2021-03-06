package com.brightedu.client.nav;

import com.brightedu.client.BrightEdu;
import com.smartgwt.client.types.SelectionStyle;
import com.smartgwt.client.types.SortArrow;
import com.smartgwt.client.types.TreeModelType;
import com.smartgwt.client.widgets.tree.Tree;
import com.smartgwt.client.widgets.tree.TreeGrid;
import com.smartgwt.client.widgets.tree.TreeGridField;

public class FunctionTree extends TreeGrid {

	private String idSuffix = "idsuffix";

	private ExplorerTreeNode[] navTreeData = BrightEdu.getNavTreeData();

	public FunctionTree() {
		setWidth100();
		setHeight100();
		setSelectionType(SelectionStyle.SINGLE);
		setCustomIconProperty("icon");
		setAnimateFolderTime(100);
		setAnimateFolders(true);
		setAnimateFolderSpeed(1000);
		setNodeIcon("silk/application_view_list.png");
		setShowSortArrow(SortArrow.CORNER);
		setShowAllRecords(true);
		setLoadDataOnDemand(false);
		setCanSort(false);
		
		TreeGridField field = new TreeGridField("name","<b>功能导航</b>"); //这个field不能指定宽度，否则会引起split和resize不正常！
     	setFields(field);
		
		Tree tree = new Tree();
		
		tree.setModelType(TreeModelType.PARENT);
		tree.setNameProperty("name");
		tree.setOpenProperty("isOpen");
		tree.setIdField("nodeID");
		tree.setParentIdField("parentNodeID");
		tree.setRootValue("root" + idSuffix);
		tree.setTitleProperty("title");
		
		
		tree.setData(navTreeData);
		
		
		
   
		setData(tree);
	}

	public ExplorerTreeNode[] getShowcaseData() {
		return navTreeData;
	}
}
