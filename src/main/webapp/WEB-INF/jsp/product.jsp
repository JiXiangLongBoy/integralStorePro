<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>产品详情</title>
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
            //效果测试，程序对接可将其删除
            $(".btmNav a:first").click(function(){
                $(".topCart em").html(parseInt($(".topCart em").html())+1);
            });
        });
    </script>
</head>
<body>
<!--header-->
<header>
    <a href="javascript:history.go(-1);" class="iconfont backIcon">&#60;</a>
    <h1>产品详情</h1>
    <a href="cart.html" class="topCart"><em>0</em></a>
</header>
<div style="height:1rem;"></div>
<div class="pro_bigImg">
    <img src="${pageContext.request.contextPath}/${goods.goodsImgUrl}"/>
</div>
<!--base information-->
<section class="pro_baseInfor">
    <h2>${goods.goodsName}</h2>
    <c:if test="${goods.discount > 0}">
        <p>
            <strong>${goods.price}</strong>
            <del>${goods.discount}</del>
        </p>
    </c:if>
    <c:if test="${goods.discount < 1}">
        <p>
            <strong>${goods.price}</strong>
        </p>
    </c:if>
</section>
<!--product attr-->
<dl class="pro_attr">
    <dt>产品属性信息</dt>
    <dd>
        <ul>
            <li>
                <span>上市时间</span>
                <em>${goods.time}</em>
            </li>
            <li>
                <span>产品规格</span>
                <em>尺寸φ${goods.standrd} </em>
            </li>
            <li>
                <span>产品重量</span>
                <em>${goods.weight}</em>
            </li>
            <li>
                <span>包装方式</span>
                <em>${goods.pack}</em>
            </li>
            <li>
                <span>保质期</span>
                <em>${goods.endTime}</em>
            </li>
            <li>
                <span>所属品牌</span>
                <em>${goods.brandName}</em>
            </li>
        </ul>
    </dd>
</dl>
<img src="${pageContext.request.contextPath}/${goods.goodsInfoUrl}" style="width:100%;"/>
<!--bottom nav-->
<div style="height:1rem;"></div>
<aside class="btmNav">
    <a style="background:#64ab5b;color:white;text-shadow:none;">加入购物车</a>
    <a style="background:#87a983;color:white;text-shadow:none;">加入常购单</a>
</aside>
</body>
</html>
