<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="com.hitrust.trustpay.client.b2c.*"%>
<%@ page import="com.hitrust.trustpay.client.*"%>
<%@ page import="java.util.ArrayList"%>
<%
	request.setCharacterEncoding("GBK");
	response.setHeader("Cache-Control", "no-cache");
%>
<HTML>
<HEAD>
<TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-ί�пۿ�����������</TITLE>
</HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF'
	ALINK='#FF0000'>
<CENTER>ί�пۿ�����������<br>
<%
	//1��ȡ����ء��ֺ졢����������Ϣ
	String tBatchNo = request.getParameter("BatchNo");
	String tBatchDate = request.getParameter("BatchDate");

	//2�������������
	B2CAgentBatchQueryRequest tRequest = new B2CAgentBatchQueryRequest();
	tRequest.setBatchNo(tBatchNo); //�������κ�       ����Ҫ��Ϣ��
	tRequest.setBatchDate(tBatchDate); //��������      YYYY/MM/DD

	//3����������ȡ�ý��
	TrxResponse tResponse = tRequest.postRequest();

	//4���жϽ��״̬�����к�������
	if (tResponse.isSuccess()) {
		//5������ɹ�
		//5���̻����˵����سɹ������ɶ��˵�����
		AgentBatch tAgentBatch = new AgentBatch(new XMLDocument(tResponse.getValue("AgentBatch")));
		out.println("BatchNo  = [" + tAgentBatch.getBatchNo() + "]<br>");
		out.println("BatchDate    = [" + tAgentBatch.getBatchDate() + "]<br>");
		out.println("BatchTime    = [" + tAgentBatch.getBatchTime() + "]<br>");
		out.println("AgentAmount  = [" + tAgentBatch.getAgentAmount() + "]<br>");
		out.println("AgentCount    = [" + tAgentBatch.getAgentCount() + "]<br>");
		out.println("BatchStatus    = [" + tAgentBatch.getBatchStatus() + "]<br>");
		out.println("BatchStatusZH    = [" + tAgentBatch.getBatchSatusChinese(tAgentBatch.getBatchStatus()) + "]<br>");
		//6��ȡ�ö��˵���ϸ
		ArrayList tAgentBatchDetails = tAgentBatch.getAgentBatchDetail();
		for (int i = 0; i < tAgentBatchDetails.size(); i++) {
			AgentBatchDetail tAgentBatchDetail = (AgentBatchDetail) tAgentBatchDetails.get(i);
			out.println("SeqNo   = [" + (i + 1) + "],");
			out.println("OrderNo   = [" + tAgentBatchDetail.getOrderNo() + "],");
			out.println("OrderAmount = [" + tAgentBatchDetail.getOrderAmount() + "],");
			out.println("CertificateNo  = [" + tAgentBatchDetail.getCertificateNo() + "],");
			out.println("ContractID = [" + tAgentBatchDetail.getContractID() + "],");
			out.println("ProductID   = [" + tAgentBatchDetail.getProductID() + "],");
			out.println("ProductName = [" + tAgentBatchDetail.getProductName() + "],");
			out.println("ProductNum  = [" + tAgentBatchDetail.getProductNum() + "],");
			out.println("OrderStatus  = [" + tAgentBatchDetail.getOrderStatus() + "],");
			out.println("OrderStatusZH  = [" + tAgentBatchDetail.getStatusChinese(tAgentBatchDetail.getOrderStatus()) + "]<br>");
		}

	} else {
		//6�����������ѯʧ��
		out.println("ReturnCode   = [" + tResponse.getReturnCode() + "]<br>");
		out.println("ErrorMessage = [" + tResponse.getErrorMessage() + "]<br>");
	}
%> <a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY>
</HTML>