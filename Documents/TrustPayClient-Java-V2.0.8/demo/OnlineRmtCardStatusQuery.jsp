<%@ page contentType="text/html; charset=gb2312" %>
<% response.setHeader("Cache-Control", "no-cache"); %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
        <title>ũ������֧��ƽ̨-�̻��ӿڷ���-���ϸ������п�״̬��֤</title>
  </head>
  
   <BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>���ϸ������п�״̬��֤<br>
<%
		//1��ȡ�������֤��������Ҫ����Ϣ
        //2�����������֤�������
        com.hitrust.trustpay.client.b2c.OnlineRmtCardVerifyRequest tRequest = new com.hitrust.trustpay.client.b2c.OnlineRmtCardVerifyRequest();               
        String iBankCardNo = request.getParameter("txtBankCardNo");
        String iAccountName = new String(request.getParameter("txtAccountName").getBytes("8859_1"),"gb2312");
        
        tRequest.setBankCardNo(iBankCardNo);  //�����ʺ�       ����Ҫ��Ϣ��            
		tRequest.setAccountName(iAccountName);  //�ֿ�������       ����Ҫ��Ϣ��
		
        //3�����������֤����ȡ��֧����ַ
        com.hitrust.trustpay.client.TrxResponse tTrxResponse = tRequest.postRequest();
        StringBuffer strMessage = new StringBuffer("");
        if (tTrxResponse.isSuccess())
        {
            //4�������֤�����ύ�ɹ������ؽ����
            String tCardVerifyResult = tTrxResponse.getValue("Status").toString();
            strMessage.append(tCardVerifyResult);
        }
        else
        {
            //5�������֤�����ύʧ�ܣ��̻��Զ���������
            strMessage.append("ReturnCode   = [" + tTrxResponse.getReturnCode() + "]<br/>");
            strMessage.append("ErrorMessage = [" + tTrxResponse.getErrorMessage() + "]<br/>");
        }

        out.println(strMessage.toString());
 %>
<CENTER><a href='Merchant.html'>���̻���ҳ</a></CENTER>
 
  </body>
</html>
