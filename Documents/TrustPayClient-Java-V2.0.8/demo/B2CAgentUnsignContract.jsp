<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<%@ page import = "com.hitrust.trustpay.client.*" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-ί�пۿ��Լ����</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>�����֤����<br>
<%
//1��ȡ��ί�пۿ��Լ��������Ҫ����Ϣ
String tOrderNo = request.getParameter("OrderNo");
String tCertificateType  = request.getParameter("CertificateType");
String tCertificateNo  = request.getParameter("CertificateNo");
String tResultNotifyURL  = request.getParameter("ResultNotifyURL");
String tRequestDate       = request.getParameter("RequestDate");
String tRequestTime       = request.getParameter("RequestTime");
String tNotifyType		  = request.getParameter("NotifyType");
String tAgentSignNo 	  = request.getParameter("AgentSignNo");


//2������ί�пۿ��Լ�������
B2CAgentUnsignContractRequest tRequest = new B2CAgentUnsignContractRequest();
tRequest.setIOrderNo(tOrderNo);//������ţ���Ҫ��Ϣ��
tRequest.setICertificateNo(tCertificateNo);   //֤������       ����Ҫ��Ϣ��
tRequest.setICertificateType(tCertificateType); //֤������       ����Ҫ��Ϣ��
tRequest.setIResultNotifyURL(tResultNotifyURL); //�����֤�ش���ַ����Ҫ��Ϣ��
tRequest.setIRequestDate  (tRequestDate  ); //��֤�������� ����Ҫ��Ϣ - YYYY/MM/DD��
tRequest.setIRequestTime  (tRequestTime  ); //��֤����ʱ�� ����Ҫ��Ϣ - HH:MM:SS��
tRequest.setINotifyType(tNotifyType);
tRequest.setIAgentSignNo(tAgentSignNo);

//3������ί�пۿ��Լ����ȡ��ǩԼ��ַ
TrxResponse tTrxResponse = tRequest.postRequest();
if (tTrxResponse.isSuccess()) {
   //4��ί�пۿ��Լ�����ύ�ɹ������ͻ��˵���ǩԼҳ��
   response.sendRedirect(tTrxResponse.getValue("B2CAgentSignContractURL"));
}
else {
   //5��ί�пۿ��Լ�����ύʧ�ܣ��̻��Զ���������
  out.println("ReturnCode   = [" + tTrxResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tTrxResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>