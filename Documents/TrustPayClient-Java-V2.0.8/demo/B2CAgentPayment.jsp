<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<%@ page import = "com.hitrust.trustpay.client.*" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-ί�пۿ�ʴ�������</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>ί�пۿ�ʴ�������<br>
<%
//1��ȡ��ί�пۿ�ʴ�����������Ҫ����Ϣ
String tOrderNo = request.getParameter("OrderNo");
String tRequestDate       = request.getParameter("RequestDate");
String tRequestTime       = request.getParameter("RequestTime");
String tCurrency          = request.getParameter("Currency");
String tAmount            = request.getParameter("Amount");
String tProductId         = request.getParameter("ProductId");
String tProductName       = request.getParameter("ProductName");
String tQuantity          = request.getParameter("Quantity");
String tCertificateNo     = request.getParameter("CertificateNo");
String tAgentSignNo 	  = request.getParameter("AgentSignNo");


//2������ί�пۿ�ʴ����������
B2CAgentPaymentRequest tRequest = new B2CAgentPaymentRequest();
tRequest.setIOrderNo(tOrderNo);//������ţ���Ҫ��Ϣ��
tRequest.setIRequestDate  (tRequestDate  ); //��֤�������� ����Ҫ��Ϣ - YYYY/MM/DD��
tRequest.setIRequestTime  (tRequestTime  ); //��֤����ʱ�� ����Ҫ��Ϣ - HH:MM:SS��
tRequest.setICurrency(tCurrency);
tRequest.setIAmount(tAmount);
tRequest.setIProductId(tProductId);
tRequest.setIProductName(tProductName);
tRequest.setIQuantity(tQuantity);
tRequest.setICertificateNo(tCertificateNo);
tRequest.setIAgentSignNo(tAgentSignNo);

//3������ί�пۿ�ʴ�������
TrxResponse tTrxResponse = tRequest.postRequest();
if (tTrxResponse.isSuccess()) {
   //4��ί�пۿ�ʴ��������ύ�ɹ�
   out.println("Success!!!");
}
else {
   //5��ί�пۿ�ʴ��������ύʧ�ܣ��̻��Զ���������
  out.println("ReturnCode   = [" + tTrxResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tTrxResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>