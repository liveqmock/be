<%@ page contentType="text/html; charset=gb2312" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<html>
  <head>
    <title>ũ������֧��ƽ̨-�̻��ӿ�ʾ��-���ϸ�����Ϣ����</title>
  </head>
  <BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>���ϸ�����Ϣ����<br>
<%
//1��ȡ�����ϸ�������Ҫ����Ϣ
        String tSerialNumber = request.getParameter("SerialNumber");
        String tTotalCount = request.getParameter("TotalCount");
        String tTotalAmount = request.getParameter("TotalAmount");
        String tCheckType = request.getParameter("CheckType");
        String tRemark = request.getParameter("Remark");
        
        //2��ȡ���б���
        String[] NO_arr = null;
        String[] CardNo_arr = null;
        String[] CardName_arr = null;
        String[] RemitAmount_arr = null;
        String[] Purpose_arr = null;
        int iTotalCount = 0;
        double iTotalAmount = 0D;
        
        try
        {
            iTotalCount = Integer.parseInt(tTotalCount);
        }
        catch(Exception ex)
        {
            out.println("ReturnCode   = [1101]<br/>");
            out.println("ErrorMessage = [�����ܱ������Ϸ���" + tTotalCount + "]<br/>");
            return;
        }
        
        try
        {
            iTotalAmount = Double.parseDouble(tTotalAmount);
        }
        catch(Exception ex)
        {
            out.println("ReturnCode   = [1101]<br/>");
            out.println("ErrorMessage = [�����ܽ��Ϸ�" + tTotalAmount + "]<br/>");
            return;
        }
        
        if (iTotalCount == 1)
        {
            String NO = request.getParameter("NO");
            String CardNo = request.getParameter("CardNo");
            String CardName = request.getParameter("CardName");
            String RemitAmount = request.getParameter("RemitAmount");
            String Purpose = request.getParameter("Purpose");

            NO_arr = new String[] { NO };
            CardNo_arr = new String[] { CardNo };
            CardName_arr = new String[] { CardName };
            RemitAmount_arr = new String[] { RemitAmount };
            Purpose_arr = new String[] { Purpose };
        }
        else
        {
            NO_arr = request.getParameterValues("NO");
            
            CardNo_arr = request.getParameterValues("CardNo");
            CardName_arr = request.getParameterValues("CardName");
            RemitAmount_arr = request.getParameterValues("RemitAmount");
            Purpose_arr = request.getParameterValues("Purpose");
        }
        java.util.ArrayList tRemitList = new java.util.ArrayList(); 
        for (int i = 0; i < CardNo_arr.length; i++)
        {
            String[] tremit = new String[5];
            tremit[0] = NO_arr[i];
            tremit[1] = CardNo_arr[i];
            tremit[2] = CardName_arr[i];
            tremit[3] = RemitAmount_arr[i];
            tremit[4] = Purpose_arr[i];
            tRemitList.add(tremit);
        }
        //2���������ϸ����������
        com.hitrust.trustpay.client.b2c.OnlineRemitRequest tOnlineRemitRequest = new com.hitrust.trustpay.client.b2c.OnlineRemitRequest();
        tOnlineRemitRequest.setTotalCount(iTotalCount);//�ܱ���  ����Ҫ��Ϣ��
        tOnlineRemitRequest.setTotalAmount(iTotalAmount); //�ܽ�� ����Ҫ��Ϣ��  
        tOnlineRemitRequest.setSerialNumber(tSerialNumber);
        //tOnlineRemitRequest.setCheckType(tCheckType);
        tOnlineRemitRequest.setRemark(tRemark);//��ע
        tOnlineRemitRequest.setRemitList(tRemitList);

        //3���������ϸ�������ȡ�ý��
        com.hitrust.trustpay.client.TrxResponse tResponse = tOnlineRemitRequest.postRequest();

        //4���ж����ϸ�����״̬�����к�������
        if (tResponse.isSuccess())
        {
            //5�����ϸ���ͳɹ�
            out.println("TrxType   = [" + tResponse.getValue("TrxType") + "]<br/>");
            out.println("TotalCount  = [" + tResponse.getValue("TotalCount") + "]<br/>");
            out.println("TotalAmount = [" + tResponse.getValue("TotalAmount") + "]<br/>");
            out.println("SerialNumber  = [" + tResponse.getValue("SerialNumber") + "]<br/>");
            out.println("ResultMessage   = [" + tResponse.getErrorMessage() + "]<br/>");
        }
        else
        {
            //6�����ϸ����ʧ��
            out.println("ReturnCode   = [" + tResponse.getReturnCode() + "]<br/>");
            out.println("ErrorMessage = [" + tResponse.getErrorMessage() + "]<br/>");
        }
        
 %>
<CENTER><a href='Merchant.html'>���̻���ҳ</a></CENTER>
  </body>
</html>
