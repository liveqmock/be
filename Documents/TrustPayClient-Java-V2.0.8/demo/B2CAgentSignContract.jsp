<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<%@ page import = "com.hitrust.trustpay.client.*" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-ί�пۿ�ǩԼ����</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>�����֤����<br>
<%
//1��ȡ��ί�пۿ�ǩԼ��������Ҫ����Ϣ
String tOrderNo = request.getParameter("OrderNo");
String tCertificateType  = request.getParameter("CertificateType");
String tCertificateNo  = request.getParameter("CertificateNo");
String tResultNotifyURL  = request.getParameter("ResultNotifyURL");
String tRequestDate       = request.getParameter("RequestDate");
String tRequestTime       = request.getParameter("RequestTime");
//String tInvaidDate		  = request.getParameter("InvaidDate");
//String tALimitAmt         = request.getParameter("ALimitAmt");
//String tADayLimitAmt	  = request.getParameter("ADayLimitAmt");
String tNotifyType		  = request.getParameter("NotifyType");

//2������ί�пۿ�ǩԼ�������
B2CAgentSignContractRequest tRequest = new B2CAgentSignContractRequest();
tRequest.setIOrderNo(tOrderNo);//������ţ���Ҫ��Ϣ��
tRequest.setICertificateNo(tCertificateNo);   //֤������       ����Ҫ��Ϣ��
tRequest.setICertificateType(tCertificateType); //֤������       ����Ҫ��Ϣ��
tRequest.setIResultNotifyURL(tResultNotifyURL); //�����֤�ش���ַ����Ҫ��Ϣ��
tRequest.setIRequestDate  (tRequestDate  ); //��֤�������� ����Ҫ��Ϣ - YYYY/MM/DD��
tRequest.setIRequestTime  (tRequestTime  ); //��֤����ʱ�� ����Ҫ��Ϣ - HH:MM:SS��
//tRequest.setIInvaidDate(tInvaidDate);
//tRequest.setIALimitAmt(tALimitAmt);
//tRequest.setIADayLimitAmt(tADayLimitAmt);
tRequest.setINotifyType(tNotifyType);

//3������ί�пۿ�ǩԼ����ȡ��ǩԼ��ַ
TrxResponse tTrxResponse = tRequest.postRequest();
if (tTrxResponse.isSuccess()) {
   //4��ί�пۿ�ǩԼ�����ύ�ɹ������ͻ��˵���ǩԼҳ��
   response.sendRedirect(tTrxResponse.getValue("B2CAgentSignContractURL"));
}
else {
   //5��ί�пۿ�ǩԼ�����ύʧ�ܣ��̻��Զ���������
  out.println("ReturnCode   = [" + tTrxResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tTrxResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>