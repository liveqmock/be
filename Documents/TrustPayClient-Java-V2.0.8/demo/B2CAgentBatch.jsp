<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="com.hitrust.trustpay.client.b2c.*"%>
<%@ page import="com.hitrust.trustpay.client.*"%>
<%
	request.setCharacterEncoding("GBK");
	response.setHeader("Cache-Control", "no-cache");
%>
<HTML>
<HEAD>
<TITLE>ũ������֧��ƽ̨-�̻��ӿڷ���-ί�пۿ�����</TITLE>
</HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF'
	ALINK='#FF0000'>
<CENTER>ί�пۿ�����</CENTER>
<%
	//1��ȡ��ί�пۿ�������Ҫ����Ϣ
	String batchNo = request.getParameter("BatchNo");
	String batchDate = request.getParameter("BatchDate");
	String agentCount = request.getParameter("AgentCount");
	String agentAmount = request.getParameter("AgentAmount");
	String orderno_arr[] = null;
	String orderamount_arr[] = null;
	String certificateno_arr[] = null;
	String contractid_arr[] = null;
	String productid_arr[] = null;
	String productname_arr[] = null;
	String productnum_arr[] = null;

	int iBatchSize = Integer.parseInt(agentCount);
	if (iBatchSize == 1) {
		String orderno = request.getParameter("orderno");
		String orderamount = request.getParameter("orderamount");
		String certificateno = request.getParameter("certificateno");
		String contractid = request.getParameter("contractid");
		String productid = request.getParameter("productid");
		String productname = request.getParameter("productname");
		String productnum = request.getParameter("productnum");

		orderno_arr = new String[] { orderno };
		orderamount_arr = new String[] { orderamount };
		certificateno_arr = new String[] { certificateno };
		contractid_arr = new String[] { contractid };
		productid_arr = new String[] { productid };
		productname_arr = new String[] { productname };
		productnum_arr = new String[] { productnum };

	} else {
		orderno_arr = request.getParameterValues("orderno");
		orderamount_arr = request.getParameterValues("orderamount");
		certificateno_arr = request.getParameterValues("certificateno");
		contractid_arr = request.getParameterValues("contractid");
		productid_arr = request.getParameterValues("productid");
		productname_arr = request.getParameterValues("productname");
		productnum_arr = request.getParameterValues("productnum");
		
	}
	//2������ί�пۿ������������
	AgentBatch iAgentBatch = new AgentBatch();
	iAgentBatch.setBatchNo(batchNo);
	iAgentBatch.setBatchDate(batchDate);
	iAgentBatch.setAgentAmount(new Double(agentAmount).doubleValue());
	iAgentBatch.setAgentCount(Integer.parseInt(agentCount));

	B2CAgentBatchRequest aB2CAgentBatchRequest = new B2CAgentBatchRequest();
	aB2CAgentBatchRequest.setAgentBatch(iAgentBatch);
	//����˳��ž���ÿ�����ΰ�������AgentBatchDetail
	for (int i = 0; i < orderno_arr.length; i++) {

		AgentBatchDetail aAgentBatchDetail = new AgentBatchDetail();
		aAgentBatchDetail.setOrderNo(orderno_arr[i]);
		aAgentBatchDetail.setOrderAmount(new Double(orderamount_arr[i]).doubleValue());
		aAgentBatchDetail.setCertificateNo(certificateno_arr[i]);
		aAgentBatchDetail.setContractID(contractid_arr[i]);
		aAgentBatchDetail.setProductID(productid_arr[i]);
		aAgentBatchDetail.setProductName(productname_arr[i]);
		aAgentBatchDetail.setProductNum(new Integer(productnum_arr[i]).intValue());


		aB2CAgentBatchRequest.addAgentBatchDetail(aAgentBatchDetail);
	}
	TrxResponse tResponse = aB2CAgentBatchRequest.postRequest();

	if (tResponse.isSuccess()) {
		out.print("��������ɹ�!");
	} else {
		out.println("ReturnCode   = [" + tResponse.getReturnCode() + "]<br>");
		out.println("ErrorMessage = [" + tResponse.getErrorMessage() + "]<br>");
	}
%>
<CENTER><a href='Merchant.html'>���̻���ҳ</a></CENTER>
</BODY>
</HTML>