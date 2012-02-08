<%
/*
 * @(#)MerchantTrxSettle.jsp	V1.5.1	2004/11/10
 *
 * Project: BJP03004
 *
 * Description:
 *    �̻����׶��˵����ط�������
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
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-ָ��ʱ��ν��׶��˵�����</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>ָ��ʱ��ν��׶��˵�����<br>
<%
//1��ȡ���̻����˵���������Ҫ����Ϣ
String tSettleDate = request.getParameter("SettleDate");
String tSettleStartHour = request.getParameter("SettleStartHour");
String tSettleEndHour = request.getParameter("SettleEndHour");
    
//2�������̻����˵������������
SettleRequest tRequest = new SettleRequest();
tRequest.setSettleDate(tSettleDate);               //��������YYYY/MM/DD ����Ҫ��Ϣ��
tRequest.setSettleType(SettleFile.SETTLE_TYPE_TRX_BYHOUR);//�������� ����Ҫ��Ϣ��
                     //SettleFile.SETTLE_TYPE_TRX_BYHOUR��ָ��ʱ��ν��׶��˵�
tRequest.setSettleStartHour(tSettleStartHour);		//���ʿ�ʼʱ��Σ�0-23��
tRequest.setSettleEndHour(tSettleEndHour);				//���ʽ�ֹʱ��Σ�0-23��

//3�������̻����˵���������ȡ�ö��˵�
TrxResponse tResponse = tRequest.postRequest();

//4���ж��̻����˵����ؽ��״̬�����к�������
if (tResponse.isSuccess()) {
  //5���̻����˵����سɹ������ɶ��˵�����
  SettleFile tSettleFile = new SettleFile(tResponse);
  out.println("SettleDate        = [" + tSettleFile.getSettleDate       () + "]<br>");
  out.println("SettleType        = [" + tSettleFile.getSettleType       () + "]<br>");
  out.println("NumOfPayments     = [" + tSettleFile.getNumOfPayments    () + "]<br>");
  out.println("SumOfPayAmount    = [" + tSettleFile.getSumOfPayAmount   () + "]<br>");
  out.println("NumOfRefunds      = [" + tSettleFile.getNumOfRefunds     () + "]<br>");
  out.println("SumOfRefundAmount = [" + tSettleFile.getSumOfRefundAmount() + "]<br>");

  //6��ȡ�ö��˵���ϸ
  String[] tRecords = tSettleFile.getDetailRecords();
  for(int i = 0; i < tRecords.length; i++) {
    out.println("Record-" + i + " = [" + tRecords[i] + "]<br>");
  }
}
else {
  //7���̻��˵�����ʧ��
  out.println("ReturnCode   = [" + tResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>