<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<%@ page import = "com.hitrust.trustpay.client.*" %>
<%@ page import = "java.util.ArrayList" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-�˿����������ѯ</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>�˿����������ѯ<br>
<%
//1��ȡ���˿����������ѯ��������Ҫ����Ϣ
String tSerialNumber         = request.getParameter("SerialNumber");

//2�������˿����������ѯ�������
QueryBatchRequest tQueryBatchRequest = new QueryBatchRequest();
tQueryBatchRequest.setSerialNumber      (tSerialNumber); //�趨�˿����������ѯ�������ˮ�ţ���Ҫ��Ϣ��

//3�������˿����������ѯ����ȡ�ý��
TrxResponse tResponse = tQueryBatchRequest.postRequest();
//4���ж��˿����������ѯ״̬�����к�������
if (tResponse.isSuccess()) {
 //5��������������
  Batch tBatch = new Batch(new XMLDocument(tResponse.getValue("RefundBatch")));
  out.println("BatchNo      = [" + tBatch.getSerialNumber     () + "]<br>");
  out.println("RefundAmount  = [" + tBatch.getRefundAmount () + "]<br>");
  out.println("RefundCount    = [" + tBatch.getRefundCount   () + "]<br>");
  out.println("BatchStatus    = [" + tBatch.getStatus   () + "]<br>");
  
  //6��ȡ�ö�����ϸ
  ArrayList tOrders = tBatch.getOrder();
  for(int i = 0; i < tOrders.size(); i++) {
    Order tOrder = (Order) tOrders.get(i);
    out.println("OrderNo   = [" + tOrder.getOrderNo  () + "]<br>");
    out.println("RefundAmount = [" + tOrder.getRefundAmount() + "]<br>");
    out.println("OrderStatus  = [" + tOrder.getOrderStatus () + "]<br>");
  }
}
else {
  //7���˿����������ѯʧ��
  out.println("ReturnCode   = [" + tResponse.getReturnCode  () + "]<br>");
  out.println("ErrorMessage = [" + tResponse.getErrorMessage() + "]<br>");
}
%>
<a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY></HTML>