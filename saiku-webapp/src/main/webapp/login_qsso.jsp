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

    QSSO.attach('qunar_sso_login_btn', '<%=request.getContextPath()%>/users/login');
    var authStatus = document.getElementById("authStatus").innerHTML;
    if (!authStatus || authStatus == null || authStatus.replace(/(^s*)|(s*$)/g, "").length ==0){
        document.getElementById("qunar_sso_login_btn").click();
    } else {
        var statusObj = JSON.parse(authStatus)
        if (statusObj['canLogin']){
            document.getElementById("qunar_sso_login_btn").click();
        } else {
            alert(statusObj['description'])
        }
    }

    function logon() {
        var userName = document.form1.userName.value;
        var sign = document.form1.password.value;
        if (userName == null || "" == userName) {
            alert("用户名不能为空,请输入RTX对应用户名。");
            return false;
        }
        if (sign == null || "" == sign) {
            alert("密码不能为空!");
            return false;
        }
        document.form1.submit();
    }
</script>
</html>
