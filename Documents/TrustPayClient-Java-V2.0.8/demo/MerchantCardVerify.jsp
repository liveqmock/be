<%
/*
 * @(#)MerchantFundPayment.jsp	V1.5.1	2005/10/31
 *
 * Project: BJP03004
 *
 * Description:
 *    �̻�֧������������
 *
 * Modify Information:
 *    Author        Date        Description
 *    ============  ==========  =======================================
 *    Wang Yaling   2005/10/31  V1.0 Release
 *    ������			2005-12-19  float to double �����޸�
 * Copyright Notice:
 *   Copyright (c) 2001-2005 Beijing HiTRUST Technology Co., Ltd.
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
<%
//1��ȡ��֧����������Ҫ����Ϣ
String tResultNotifyURL = request.getParameter("ResultNotifyURL");
String tCertificateType = request.getParameter("CertificateType");
String tCertificateNo   = request.getParameter("CertificateNo"  );

//2�����ɿ������֤�������
CardVerifyRequest tCardVerifyRequest = new CardVerifyRequest();
tCardVerifyRequest.setResultNotifyURL(tResultNotifyURL); //�趨֧������ش���ַ ����Ҫ��Ϣ��
tCardVerifyRequest.setCertificateType(tCertificateType);//�趨֤������
tCardVerifyRequest.setCertificateNo(tCertificateNo);//�趨֤������

//5�����Ϳ������֤����ȡ��֧����ַ
TrxResponse tTrxResponse = tCardVerifyRequest.postRequest();
if (tTrxResponse.isSuccess()) {
   //6���������֤�����ύ�ɹ������ͻ��˵���֧��ҳ��
   response.sendRedirect(tTrxResponse.getValue("VerifyURL"));
}
else {
   //7���������֤�����ύʧ�ܣ��̻��Զ���������
%>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-֧������</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>֧������<br>
<%
  out.println("ReturnCode   = [" + tTrxResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tTrxResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>