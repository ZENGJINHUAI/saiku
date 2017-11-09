<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>支付中心多维分析系统</title>
</head>
<body id="login">

<div id="login-wrapper" class="png_bg">
  <center>
    <h1>登 录</h1>
  </center>
  <div id="login-content">
    <center>
      <form name="form1" <%--action="<%=request.getContextPath()%>/users/login"--%> method="post">
        <div style="display: none" id="authStatus">${authStatus}</div>
        <input class="button" type="button" id='qunar_sso_login_btn'
               title="使用公司的SSO登陆" value="公司SSO登录"/>
      </form>
    </center>
  </div>
  <!-- End #login-content -->
</div>
<!-- End #login-wrapper -->
</body>
<script src="https://qsso.corp.qunar.com/lib/qsso-auth.js?t=<?=rand()?>"></script>
<script type="text/javascript">
  QSSO.attach('qunar_sso_login_btn', '<%=request.getContextPath()%>/saiku/login.jsp');
</script>

<%
  out.print(request.getCookies());
  out.print(request.getAuthType());
  out.print(request.getHeaderNames());
  out.print(request.getRequestURI());
  out.print(request.getParameterMap());
%>
</html>
