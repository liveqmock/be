<%
/*
 * @(#)B2CAgentSignResult.jsp	V1.5.1	2009/05/05
 */
%>
<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-ί�пۿ�ǩԼ��Լ�������</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>ί�пۿ�ǩԼ��Լ���<br>
<%
//1��ȡ��MSG�����������ô˲���ֵ������֤�������
B2CAgentSignResult tResult = new B2CAgentSignResult(request.getParameter("MSG"));
//System.out.println(request.getParameter("MSG"));
//2���ж���֤���״̬�����к�������
if (tResult.isSuccess()) {
  //3��ǩԼ��Լ�ɹ�
  if(tResult.getValue("TrxType").equals(TrxType.TRX_TYPE_B2C_AgentSignContract_REQ))
  {
    out.println("ǩԼ�ɹ�<br>");
    out.println("ǩԼЭ���: [" + tResult.getValue("AgentSignNo") + "]<br>");
    out.println("ǩԼ���ź�4λ: [" + tResult.getValue("Last4CardNo") + "]<br>");
  }else if(tResult.getValue("TrxType").equals(TrxType.TRX_TYPE_B2C_AgentUnsignContract_REQ))
  {
  	out.println("��Լ�ɹ�<br>");
  }
  out.println("OrderNo         = [" + tResult.getValue("OrderNo"        ) + "]<br>");

}
else {
  //4��ǩԼ��Լʧ��
  out.println("ReturnCode   = [" + tResult.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tResult.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>