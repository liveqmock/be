<%
/*
 * @(#)MerchantQueryOrder.jsp	V1.5.1	2004/11/10
 *
 * Project: BJP03004
 *
 * Description:
 *    �̻�������ѯ��������
 *
 * Modify Information:
 *    Author        Date        Description
 *    ============  ==========  =======================================
 *    HiTRUST       2004/01/05  V1.0 Release
 *    HiTRUST       2004/01/07  V1.0.1 Release
 *    HiTRUST       2004/04/16  V1.0.3 Release
 *    HiTRUST       2004/06/01  V1.0.4 Release
 *    HiTRUST       2004/08/30  V1.2 Release
 *    HiTRUST       2004/09/27  V1.5 Release
 *    HiTRUST       2004/11/10  V1.5.1 Release
 *
 * Copyright Notice:
 *   Copyright (c) 2001-2004 Beijing HiTRUST Technology Co., Ltd.
 *   1808 Room, Science & Technology Building, No. 9 South Street,
 *   Zhong Guan Cun, Haidian District, Beijing ,100081, China
 *   All rights reserved.
 *
 *   This software is the confidential and proprietary information of
 *   HiTRUST.COM, Inc. ("Confidential Information"). You shall not
 *   disclose such Confidential Information and shall use it only in
 *   accordance with the terms of the license agreement you entered
 *   into with HiTRUST.
 */
%>
<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<%@ page import = "com.hitrust.trustpay.client.*" %>
<%@ page import = "java.util.ArrayList" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-�̻�������ѯ</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>�̻�������ѯ<br>
<%
//1��ȡ���̻�������ѯ����Ҫ����Ϣ
String tOrderNo   = request.getParameter("OrderNo"  );
String tQueryType = request.getParameter("QueryType");
boolean tEnableDetailQuery = false;
if (tQueryType.equals("1"))
    tEnableDetailQuery = true;
    
//2�������̻�������ѯ�������
QueryOrderRequest tRequest = new QueryOrderRequest();
tRequest.setOrderNo       (tOrderNo          );  //������           ����Ҫ��Ϣ��
tRequest.enableDetailQuery(tEnableDetailQuery);  //�Ƿ��ѯ��ϸ��Ϣ ����Ҫ��Ϣ��

//3�������̻�������ѯ����ȡ�ö�����ѯ���
TrxResponse tResponse = tRequest.postRequest();

//4���ж��̻�������ѯ���״̬�����к�������
if (tResponse.isSuccess()) {
  //5�����ɶ�������
  Order tOrder = new Order(new XMLDocument(tResponse.getValue("Order")));
  out.println("OrderNo      = [" + tOrder.getOrderNo     () + "]<br>");
  out.println("OrderAmount  = [" + tOrder.getOrderAmount () + "]<br>");
  out.println("OrderDesc    = [" + tOrder.getOrderDesc   () + "]<br>");
  out.println("OrderDate    = [" + tOrder.getOrderDate   () + "]<br>");
  out.println("OrderTime    = [" + tOrder.getOrderTime   () + "]<br>");
  out.println("OrderURL     = [" + tOrder.getOrderURL    () + "]<br>");
  out.println("PayAmount    = [" + tOrder.getPayAmount   () + "]<br>");
  out.println("RefundAmount = [" + tOrder.getRefundAmount() + "]<br>");
  out.println("OrderStatus  = [" + tOrder.getOrderStatus () + "]<br>");
  
  //6��ȡ�ö�����ϸ
  ArrayList tOrderItems = tOrder.getOrderItems();
  for(int i = 0; i < tOrderItems.size(); i++) {
    OrderItem tOrderItem = (OrderItem) tOrderItems.get(i);
    out.println("ProductID   = [" + tOrderItem.getProductID  () + "]<br>");
    out.println("ProductName = [" + tOrderItem.getProductName() + "]<br>");
    out.println("UnitPrice   = [" + tOrderItem.getUnitPrice  () + "]<br>");
    out.println("Qty         = [" + tOrderItem.getQty        () + "]<br>");
  }
}
else {
  //7���̻�������ѯʧ��
  out.println("ReturnCode   = [" + tResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>