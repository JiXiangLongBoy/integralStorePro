<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>找回密码-生鲜通</title>
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
	   alert("测试跳转效果，程序对接予以删除!");
	   location.href="login.html";
	   });	
});
</script>
</head>
<body>
<header>
 <a href="javascript:history.go(-1);" class="iconfont backIcon">&#60;</a>
 <h1>找回密码</h1>
</header>
<div style="height:1rem;"></div>
<ul class="formarea">
 <li>
  <label class="lit">账号：</label>
  <input type="text" placeholder="手机号码" class="textbox"/>
 </li>
 <li style="padding:0;"><a class="checkCode">获取手机校验码</a></li>
 <li>
  <label class="lit">校验码：</label>
  <input type="text" placeholder="六位校验码" class="textbox"/>
 </li>
 <li>
  <label class="lit">新密码：</label>
  <input type="password" placeholder="设置新密码" class="textbox"/>
 </li>
 <li>
  <label class="lit">确认密码：</label>
  <input type="password" placeholder="确认新密码" class="textbox"/>
 </li>
 <li>
  <input type="button" value="立即修改"/>
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
