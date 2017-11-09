<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="org.saiku.service.ISessionService" %>
<%@ page import="com.qunar.security.QSSO" %>
<%@ page import="com.qunar.security.qsso.model.QUser" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>支付中心多维分析系统</title>
</head>
<body id="login">
<%
  if(request.getParameter("token") == null){
%>
<div class="qsso" style="text-align: center">
  <p>
    <img src="https://qsso.corp.qunar.com/img/logo.png" border="0" alt="" />
  </p>
  <!-- 添加一个登录按钮 -->
  <button id="qsso-login" class="mybutton">QSSO登录</button>
</div>

</body>
<script src="https://qsso.corp.qunar.com/lib/qsso-auth.js?t=<?=rand()?>"></script>
<script type="text/javascript">
  QSSO.attach('qsso-login', '<%=request.getContextPath()%>/login.jsp');
</script>

<%
  }else{
    ServletContext sc = this.getServletConfig().getServletContext();
    ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);

    ISessionService sessionService = (ISessionService)ac.getBean("sessionService");
    QUser user = QSSO.getQUser(request.getParameter("token"));

    if(null == user) {
      response.setStatus(response.SC_MOVED_TEMPORARILY);
      response.setHeader("Location", "/saiku/login.jsp");
    }

    try {
      sessionService.loginWithDefaultPass(request, user.getUserId());
      response.setStatus(response.SC_MOVED_TEMPORARILY);
      response.setHeader("Location", "/saiku/index.html");
    }catch (Exception e){
%>
<div style="text-align: center">
  <p>
    <img src="https://qsso.corp.qunar.com/img/logo.png" border="0" alt="" />
  </p>
  <!-- 添加一个登录按钮 -->
  <p>没有该系统权限，添加权限请联系　jinhuai.zeng</p>
</div>
<%
    }
  }
%>
</html>
