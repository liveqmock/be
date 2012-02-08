<%
/*
 * @(#)MerchantVoidPayment.jsp	V1.5.1	2004/11/10
 *
 * Project: BJP03004
 *
 * Description:
 *    �̻�ȡ��֧����������
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
<% response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-ȡ��֧��</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>ȡ��֧��<br>
<%
//1��ȡ��ȡ��֧������Ҫ����Ϣ
String tOrderNo = request.getParameter("OrderNo");

//2������ȡ��֧���������
VoidPaymentRequest tRequest = new VoidPaymentRequest();
tRequest.setOrderNo(tOrderNo);  //�����ţ���Ҫ��Ϣ��

//3������ȡ��֧������ȡ��ȡ��֧�����
TrxResponse tResponse = tRequest.postRequest();

//4���ж�ȡ��֧�����״̬�����к�������
if (tResponse.isSuccess()) {
  //5��ȡ��֧���ɹ�
  out.println("TrxType   = [" + tResponse.getValue("TrxType"  ) + "]<br>");
  out.println("OrderNo   = [" + tResponse.getValue("OrderNo"  ) + "]<br>");
  out.println("PayAmount = [" + tResponse.getValue("PayAmount") + "]<br>");
  out.println("BatchNo   = [" + tResponse.getValue("BatchNo"  ) + "]<br>");
  out.println("VoucherNo = [" + tResponse.getValue("VoucherNo") + "]<br>");
  out.println("HostDate  = [" + tResponse.getValue("HostDate" ) + "]<br>");
  out.println("HostTime  = [" + tResponse.getValue("HostTime" ) + "]<br>");
}
else {
  //6��ȡ��֧��ʧ��
  out.println("ReturnCode   = [" + tResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>