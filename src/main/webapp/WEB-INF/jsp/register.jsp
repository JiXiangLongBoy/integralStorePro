<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>注册</title>
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

 <script type="text/javascript">
  //注册时候判断
  function validateMm(){
      var v1= $("#password").val();
      var v2= $("#password02").val();

      if(v1!='' && v1==v2){

          return true;
      }else{
          $("#passMsg").text("两次密码不一致，请检查");
          $("#passMsg").css("color","red");
          return false;
      }
  }
  $(function(){

      $("#password02").blur(function(){
          validateMm();
      });
  });
  var result = true;
  function validateuserName(){
   var name = $("#userName").val();
   if(name!=''){
    $.get("${pageContext.request.contextPath}/user/validateUserName?userName="+name,function(data){
     //alert(data);
     if(data=="success"){
      $("#message").text("该用户名可以用");
      $("#message").css("color","green");
      result = true;
     }else{
      $("#message").text("该用户名已经被占用");
      $("#message").css("color","red");
      result = false;
     }
    });
   }else{
    result = false;
    $("#message").text("该用户名不能为空");
    $("#message").css("color","red");
   }

  }

  $(function(){

   $("#userName").blur(function(){
       validateuserName();
   });
  });
 </script>
<script>
$(document).ready(function(){
   $(".formarea li:last input[type='button']").click(function(){
	  // alert("测试跳转效果，程序对接予以删除!");
       $.ajax({

           url:'${pageContext.request.contextPath}/user/insertUser',
           data: {
               userName: $('#userName').val(),
               passWord: $('#password').val(),
               city: $('#city').val(),
               estaurantName: $('#estaurantName').val(),
               consignee: $('#consignee').val(),
               phone: $('#phone').val(),
               address: $('#address').val()

           },
           type:"POST",
           success:function(data){
               if(data=='success'){
                   //注册框消失
                   //$("#reg").addClass("hidden");
                   //
                   // $("#account").text($("#regEmail").val());
                   // //将注册的user信息展示
                   // $("#regBlock").css("display","none");
                   // $("#userBlock").css("display","block");
                   location.href = "${pageContext.request.contextPath}/user/showLogin";
               }
           },
           error:function(){
               alert("联系管理员");
           }

       })



	   });	
});
</script>
</head>
<body>
<!--header-->
<header>
 <a href="javascript:history.go(-1);" class="iconfont backIcon">&#60;</a>
 <h1>注册</h1>
</header>
<div style="height:1rem;"></div>
<mark class="formMark">这里放电话做什么，请联系400-8200-5385</mark>
<ul class="formarea" id="regForm">
 <li>
  <label class="lit">用户名：</label>
  <input id="userName" type="tel" placeholder="用户名" class="textbox"/><span id="message" style="font-size:18px"></span>
 </li>
 <li>
  <label  class="lit">密码：</label>
  <input id="password" type="password" placeholder="设置密码" class="textbox"/>
 </li>
 <li>
  <label  class="lit">确认密码：</label>
  <input id="password02" type="password" placeholder="确认密码" class="textbox"/><span id="passMsg"></span>
 </li>
 <li>
  <label class="lit">所在城市：</label>
  <select id="city">
   <optgroup label="河南省">
    <option>郑州市</option>
    <option>信阳市</option>
    <option>洛阳市</option>
    <option>安阳市</option>
   </optgroup>
  </select>
 </li>
 <li>
  <label class="lit">餐馆名称：</label>
  <input id="estaurantName" type="text" placeholder="餐馆名称" class="textbox"/>
 </li>
 <li>
  <label class="lit">收货人：</label>
  <input id="consignee" type="text" placeholder="收件人真实姓名" class="textbox"/>
 </li>
 <li>
  <label class="lit">联系电话：</label>
  <input id="phone" type="tel" placeholder="联系电话" class="textbox"/>
 </li>
 <li>
  <label class="lit">收货地址：</label>
  <input id="address" type="text" placeholder="区-街道-小区-门牌号" class="textbox"/>
 </li>
 <li class="liLink">
  <a href="article.html" class="fl">《用户协议》</a>
  <a href="${pageContext.request.contextPath}/user/showLogin" class="fr">已有账号，登陆</a>
 </li>
 <li>
  <input type="button" value="立即注册"/>
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
