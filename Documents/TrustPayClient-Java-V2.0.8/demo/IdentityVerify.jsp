<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<%@ page import = "com.hitrust.trustpay.client.*" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-�����֤����</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>�����֤����<br>
<%
//1��ȡ�������֤��������Ҫ����Ϣ
String tCertificateType  = request.getParameter("CertificateType");
String tCertificateNo  = request.getParameter("CertificateNo");
String tBankCardNo = request.getParameter("BankCardNo");
String tResultNotifyURL  = request.getParameter("ResultNotifyURL");
String tRequestDate       = request.getParameter("RequestDate"      );
String tRequestTime       = request.getParameter("RequestTime"      );

//2�����������֤�������
IdentityVerifyRequest tRequest = new IdentityVerifyRequest();
tRequest.setBankCardNo(tBankCardNo);      //�����ʺ�       ����Ҫ��Ϣ��
tRequest.setCertificateNo(tCertificateNo);   //֤������       ����Ҫ��Ϣ��
tRequest.setCertificateType(tCertificateType); //֤������       ����Ҫ��Ϣ��
tRequest.setResultNotifyURL(tResultNotifyURL); //�����֤�ش���ַ����Ҫ��Ϣ��
tRequest.setRequestDate  (tRequestDate  ); //��֤�������� ����Ҫ��Ϣ - YYYY/MM/DD��
tRequest.setRequestTime  (tRequestTime  ); //��֤����ʱ�� ����Ҫ��Ϣ - HH:MM:SS��

//3�����������֤����ȡ��֧����ַ
TrxResponse tTrxResponse = tRequest.postRequest();
if (tTrxResponse.isSuccess()) {
   //4�������֤�����ύ�ɹ������ͻ��˵��������֤ҳ��
   response.sendRedirect(tTrxResponse.getValue("VerifyURL"));
}
else {
   //5�������֤�����ύʧ�ܣ��̻��Զ���������
  out.println("ReturnCode   = [" + tTrxResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tTrxResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>