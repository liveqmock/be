<%@ page pageEncoding="gb2312" %>
<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<%@ page import = "com.hitrust.trustpay.client.*" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<% request.setCharacterEncoding("gb2312"); %>
<%
String tReturnCode=request.getParameter("ReturnCode");
String tErrorMsg=request.getParameter("ErrorMessage");
%>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-֧������</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>֧������<br>
<%
  out.println("ReturnCode   = [" +tReturnCode+ "]<br>");
  out.println("ErrorMessage = [" + tErrorMsg+ "]<br>");
%>
<a href='MerchantPaymentIE.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>
