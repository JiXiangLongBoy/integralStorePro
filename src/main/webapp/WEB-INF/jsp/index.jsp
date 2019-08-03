<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>积分商城</title>
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
    <script src="${pageContext.request.contextPath}/js/swiper.min.js"></script>
    <script>
        $(document).ready(function(){
            var mySwiper = new Swiper('#slide',{
                autoplay:5000,
                visibilityFullFit : true,
                loop:true,
                pagination : '.pagination',
            });
            //product list:Tab
            $(".tab_proList dd").eq(0).show().siblings(".tab_proList dd").hide();
            $(".tab_proList dt a").eq(0).addClass("currStyle");
            $(".tab_proList dt a").click(function(){
                var liindex = $(".tab_proList dt a").index(this);
                $(this).addClass("currStyle").siblings().removeClass("currStyle");
                $(".tab_proList dd").eq(liindex).fadeIn(150).siblings(".tab_proList dd").hide();
            });
            //飞入动画，具体根据实际情况调整
            $(".addToCart").click(function(){
                $(".hoverCart a").html(parseInt($(".hoverCart a").html())+1);/*测试+1*/
                var shopOffset = $(".hoverCart").offset();
                var cloneDiv = $(this).parent().siblings(".goodsPic").clone();
                var proOffset = $(this).parent().siblings(".goodsPic").offset();
                cloneDiv.css({ "position": "absolute", "top": proOffset.top, "left": proOffset.left });
                $(this).parent().siblings(".goodsPic").parent().append(cloneDiv);
                cloneDiv.animate({
                    width:0,
                    height:0,
                    left: shopOffset.left,
                    top: shopOffset.top,
                    opacity:1
                },"slow");
            });
        });
    </script>
</head>
<body>
<!--header-->
<header>
    <a href="location.html" class="location">北京市</a>
    <div style="text-align:center;width:100%;">积分商城</div>
    <a href="search.html" class="rt_searchIcon">&#37;</a>
</header>
<div style="height:1rem;"></div>
<!--slide-->
<div id="slide">
    <div class="swiper-wrapper">

        <c:forEach items="${indexBanner}" var="bannerUrl">
            <div class="swiper-slide">
                <a href="#">
                    <img src="${pageContext.request.contextPath}/${bannerUrl}"/>
                </a>
            </div>
        </c:forEach>
    </div>
    <div class="pagination"></div>
</div>
<!--categoryList-->
<ul class="categoryLiIcon">
    <c:forEach items="${goodsTypeList}" var="type">
        <li>
            <a href="product_list.html?typeid=${type.id}">
                <img src="${pageContext.request.contextPath}/${type.typeImgUrl}" />
                <em>${type.typeName}</em>
            </a>
        </li>
    </c:forEach>
</ul>
<!--Tab:productList-->
<dl class="tab_proList">
    <dt>
        <a>热销</a>
        <a>新品</a>
        <a>打折</a>
    </dt>
    <dd>
        <ul>
            <li>
                <a href="product.html" class="goodsPic">
                    <img src="upload/goods001.jpg"/>
                </a>
                <div class="goodsInfor">
                    <h2>
                        <a href="product.html">COV橘子庄园 6秒急速电动开</a>
                    </h2>
                    <p>
                        <del>1200</del>
                    </p>
                    <p>
                        <strong class="price">1000</strong>
                    </p>
                    <a class="addToCart">&#126;</a>
                </div>
            </li>
            <li>
                <a href="product.html" class="goodsPic">
                    <img src="upload/goods002.jpg"/>
                </a>
                <div class="goodsInfor">
                    <h2>
                        <a href="product.html">IBOH艾铂赫煎锅H863 家用</a>
                    </h2>
                    <p>
                        <del>1200</del>
                    </p>
                    <p>
                        <strong class="price">1000</strong>
                    </p>
                    <a class="addToCart">&#126;</a>
                </div>
            </li>
            <li>
                <a href="product.html" class="goodsPic">
                    <img src="upload/goods003.jpg"/>
                </a>
                <div class="goodsInfor">
                    <h2>
                        <a href="product.html">德国GESS 减肥腰带懒人甩脂</a>
                    </h2>
                    <p>
                        <del>1200</del>
                    </p>
                    <p>
                        <strong class="price">1000</strong>
                    </p>
                    <a class="addToCart">&#126;</a>
                </div>
            </li>
        </ul>
    </dd>
    <dd>
        <ul>
            <li>
                <a href="product.html" class="goodsPic">
                    <img src="upload/goods004.jpg"/>
                </a>
                <div class="goodsInfor">
                    <h2>
                        <a href="product.html">人民本（RMBook）N3系列</a>
                    </h2>
                    <p>
                        <del>600</del>
                    </p>
                    <p>
                        <strong class="price">500</strong>
                    </p>
                    <a class="addToCart">&#126;</a>
                </div>
            </li>
            <li>
                <a href="product.html" class="goodsPic">
                    <img src="upload/goods008.jpg"/>
                </a>
                <div class="goodsInfor">
                    <h2>
                        <a href="product.html">人民本（RMBook）N3系列</a>
                    </h2>
                    <p>
                        <del>600</del>
                    </p>
                    <p>
                        <strong class="price">500</strong>
                    </p>
                    <a class="addToCart">&#126;</a>
                </div>
            </li>
            <li>
                <a href="product.html" class="goodsPic">
                    <img src="upload/goods009.jpg"/>
                </a>
                <div class="goodsInfor">
                    <h2>
                        <a href="product.html">人民本（RMBook）N3系列</a>
                    </h2>
                    <p>
                        <del>500</del>
                    </p>
                    <p>
                        <strong class="price">3.90</strong>
                    </p>
                    <a class="addToCart">&#126;</a>
                </div>
            </li>
    </dd>
    <dd>
        <ul>
            <li>
                <a href="product.html" class="goodsPic">
                    <img src="upload/goods005.jpg"/>
                </a>
                <div class="goodsInfor">
                    <h2>
                        <a href="product.html">人民本（RMBook）N3系列</a>
                    </h2>
                    <p>
                        <del>400</del>
                    </p>
                    <p>
                        <strong class="price">300</strong>
                    </p>
                    <a class="addToCart">&#126;</a>
                </div>
            </li>
            <li>
                <a href="product.html" class="goodsPic">
                    <img src="upload/goods006.jpg"/>
                </a>
                <div class="goodsInfor">
                    <h2>
                        <a href="product.html">人民本（RMBook）N3系列</a>
                    </h2>
                    <p>
                        <del>400</del>
                    </p>
                    <p>
                        <strong class="price">300</strong>
                    </p>
                    <a class="addToCart">&#126;</a>
                </div>
            </li>
            <li>
                <a href="product.html" class="goodsPic">
                    <img src="upload/goods007.jpg"/>
                </a>
                <div class="goodsInfor">
                    <h2>
                        <a href="product.html">人民本（RMBook）N3系列</a>
                    </h2>
                    <p>
                        <del>400</del>
                    </p>
                    <p>
                        <strong class="price">300</strong>
                    </p>
                    <a class="addToCart">&#126;</a>
                </div>
            </li>
    </dd>
</dl>
<!--floatCart-->
<div class="hoverCart">
    <a href="cart.html">0</a>
</div>
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
