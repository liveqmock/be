<%
/*
 * @(#)MerchantOvrdueRefund.jsp	V1.0	2009/05/12
 *
 *
 * 
*/
%>
<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<%@ page import = "com.hitrust.trustpay.client.*" %>
<%@ page import = "java.util.ArrayList"%>

<% response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-�����˿�</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>�����˿�<br>
<%
//1��ȡ�ó����˿�����Ҫ����Ϣ
 String tTotalCount = request.getParameter("TotalCount");
 String tTotalAmount = request.getParameter("TotalAmount");
 String tRemark = request.getParameter("Remark");

 
 String orderno_arr[] = null ;
 String orderamount_arr[] = null ;
  int iTotalCount    = Integer.parseInt(tTotalCount);
  double  iTotalAmount   = Double.parseDouble(tTotalAmount);
  
   System.out.println("TotalCount="+iTotalCount);
   System.out.println("iTotalAmount="+iTotalAmount);
   System.out.println("tRemark="+tRemark);
  
   if(iTotalCount == 1) {
    String orderno = request.getParameter("orderno") ;
	String orderamount = request.getParameter("orderamount") ;
	orderno_arr = new String[]{orderno} ;
	orderamount_arr = new String[]{orderamount} ;
   }
   else
   {
     orderno_arr = request.getParameterValues("orderno") ;
	  orderamount_arr = request.getParameterValues("orderamount") ;
   }
   ArrayList tOrderList = new ArrayList() ;
   for(int i=0;i<orderno_arr.length;i++)
   {
      String [] torder = new String[2];
      torder[0] = orderno_arr[i];
      System.out.println("orderno_arr["+i+"]="+orderno_arr[i]);
      torder[1] = orderamount_arr[i];
       System.out.println("orderamount_arr["+i+"]="+orderamount_arr[i]);
      tOrderList.add(torder);
       
   }
  //2�����ɳ����˿��������
 OverdueRefundRequest tOverdueRequest = new OverdueRefundRequest();
 tOverdueRequest.setTotalCount  (iTotalCount  );  //�ܱ���  ����Ҫ��Ϣ��
 tOverdueRequest.setTotalAmount(iTotalAmount);  //�ܽ�� ����Ҫ��Ϣ��
 tOverdueRequest.setRemark(tRemark);//��ע
 tOverdueRequest.setOrderDital(tOrderList);

 //3�����ͳ����˿�����ȡ�ý��
 TrxResponse tResponse = tOverdueRequest.postRequest();

//4���жϳ����˿���״̬�����к�������
if (tResponse.isSuccess()) {
  //5�������˿�ɹ�
  
  out.println("TrxType   = [" + tResponse.getValue("TrxType"  ) + "]<br>");
  out.println("TotalCount  = [" + tResponse.getValue("TotalCount"  ) + "]<br>");
  out.println("TotalAmount = [" + tResponse.getValue("TotalAmount") + "]<br>");
  out.println("SerialNumber  = [" + tResponse.getValue("SerialNumber"  ) + "]<br>");
  out.println("HostDate  = [" + tResponse.getValue("HostDate" ) + "]<br>");
  out.println("HostTime  = [" + tResponse.getValue("HostTime" ) + "]<br>");
  out.println("ResultMessage   = [" + tResponse.getErrorMessage() + "]<br>");
}
else {
  //6�����˿�ʧ��
  out.println("ReturnCode   = [" + tResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>