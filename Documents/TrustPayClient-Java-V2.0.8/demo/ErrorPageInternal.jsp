<%
/*
 * @(#)ErrorPageInternal.jsp	V1.0	2009/06/29
 *
 * Project: BJP03004
 *
 * Description:
 *    �̻�֧������������
 *
 * Modify Information:
 *    Author        Date        Description
 *    ============  ==========  =======================================
 *    ABC       	2009/06/29  V1.0 Release
 *
 * Copyright Notice:
 *   Copyright (c) 2001-2004 Beijing HiTRUST Technology Co., Ltd.
 *   1808 Room, Science & Technology Building, No. 9 South Street,
 *   Zhong Guan Cun, Haidian District, Beijing ,100081, China
 *   All rights reserved.
 *
 *   This software is the confidential and proprietary information of
 *   HiTRUST.COM, Inc. ("Confidential Information"). You shall not
 *   disclose such Confidential Information and shall use it only in
 *   accordance with the terms of the license agreement you entered
 *   into with HiTRUST.
 */
%>
<%@ page pageEncoding="gb2312" %>
<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.hitrust.trustpay.client.b2c.*" %>
<%@ page import = "com.hitrust.trustpay.client.*" %>
<% response.setHeader("Cache-Control", "no-cache"); %>
<% request.setCharacterEncoding("gb2312"); %>
<%
String tReturnCode=(String)request.getAttribute("tReturnCode");
String tErrorMsg=(String)request.getAttribute("tErrorMsg");
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
