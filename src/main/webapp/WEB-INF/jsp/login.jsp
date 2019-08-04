<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>登录</title>
<meta name="keywords"  content="KEYWORDS..." />
<meta name="description" content="DESCRIPTION..." />
<meta name="author" content="DeathGhost" />
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name='apple-touch-fullscreen' content='yes'>
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta name="format-detection" content="address=no">
<link rel="icon" href="${pageContext.request.contextPath}/images/icon/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon-precomposed" sizes="57x57" href="${pageContext.request.contextPath}/images/icon/apple-touch-icon-57x57-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="120x120" href="${pageContext.request.contextPath}/images/icon/apple-touch-icon-120x120-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="196x196" href="${pageContext.request.contextPath}/images/icon/apple-touch-icon-196x196-precomposed.png">
<meta name="viewport" content="initial-scale=1, width=device-width, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script>
$(document).ready(function(){
   $(".formarea li:last input[type='button']").click(function(){

    $.ajax({
     url: '${pageContext.request.contextPath}/user/islogin',
     type: 'POST',
     data: {
      userName: $('#username').val(),
      passWord: $('#password').val()
      // rememberMe: $('#rememberMe').is(':checked'),
      // backurl: BACK_URL
     },
     success: function(data){

      if (data.status== '1') {

       location.href = "${pageContext.request.contextPath}/goods/showindex";
      } else {
       alert("失败");
      }
     },
     error: function(error){
      console.log(error);
     }
    });
	   });	
});
</script>
</head>
<body>
<section class="formLogo">
 <h2>&#35;</h2>
</section>
<ul class="formarea">
 <li>
  <label class="lit">账号：</label>
  <input id="username" type="text" placeholder="手机号码" class="textbox"/>
 </li>
 <li>
  <label class="lit">密码：</label>
  <input id="password" type="password" placeholder="登陆密码" class="textbox"/>
 </li>
 <li class="liLink lg_liLink">
  <span><label><input type="checkbox"/>记住密码</label></span>
  <span><a href="${pageContext.request.contextPath}/user/showregister">新用户注册</a></span>
  <span><a href="${pageContext.request.contextPath}/user/showfindpwd">忘记密码?</a></span>
 </li>
 <li>
  <input type="button" value="立即登陆"/>
 </li>
</ul>
<div style="height:1.2rem;"></div>
<nav>
 <a href="index.html" class="homeIcon">首页</a>
 <a href="category.html" class="categoryIcon">分类</a>
 <a href="cart.html" class="cartIcon">购物车</a>
 <a href="user.html" class="userIcon">我的</a>
</nav>
<script>
  document.oncontextmenu=new Function("event.returnValue=false;");
  document.onselectstart=new Function("event.returnValue=false;"); 
</script>

</body>
</html>
