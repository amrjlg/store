<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/jstl.jspf" %>
<base href="${basePath }/"/>
<!DOCTYPE html PUBLIC"-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>付款成功页面</title>
<link rel="stylesheet"  type="text/css" href="AmazeUI-2.4.2/assets/css/amazeui.css"/>
<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
<link href="basic/css/demo.css" rel="stylesheet" type="text/css" />

<link href="css/sustyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="basic/js/jquery-1.7.min.js"></script>

</head>

<body>


<!--顶部导航条 -->
<div class="am-container header">
  <ul class="message-l">
    <div class="topMessage">
                <c:if test="${user eq null}">
                    <div class="menu-hd">
                        <a href="login.jsp" target="_top" class="h">亲，请登录</a>
                        <a href="register/list.do" target="_top">免费注册</a>
                    </div>
                </c:if>
            </div>
  </ul>
  <ul class="message-r">
    <div class="topMessage home"><div class="menu-hd"><a href="home/list.do" target="_top" class="h">商城首页</a></div></div>
    <div class="topMessage my-shangcheng"><div class="menu-hd MyShangcheng"><a href="personalData/list.do" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div></div>
    <div class="topMessage mini-cart"><div class="menu-hd"><a id="mc-menu-hd" href="javascript:;" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div></div>
    <div class="topMessage favorite"><div class="menu-hd"><a href="favorite/show.do" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
  </ul>
</div>

<!--悬浮搜索框-->

<div class="nav white">
	<div class="logo"><img src="images/logo.png" /></div>
    <div class="logoBig">
      <li><img src="images/logobig.png" /></li>
    </div>
    
    <div class="search-bar pr">
        <a name="index_none_header_sysc" href="javascript:;"></a>       
        <form>
        <input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
        <input id="ai-topsearch" class="submit" value="搜索" index="1" type="submit"></form>
    </div>     
</div>

<div class="clear"></div>



<div class="take-delivery">
 <div class="status">
   <h2>您已成功付款</h2>
   <div class="successInfo">
     <ul>
       <li>付款金额<em>¥${price }</em></li>
       <div class="user-info">
         <p>收货人：${addrPeople }</p>
         <p>联系电话：${addrPhone }</p>
         <p>收货地址：${addrDetail }</p>
       </div>
             请认真核对您的收货信息，如有错误请联系客服
                             
     </ul>
     <div class="option">
       <span class="info">您可以</span>
        <a href="orderInfo/listSucceed.do" class="J_MakePoint">查看<span>已买到的宝贝</span></a>
        <a href="person/orderinfo.html" class="J_MakePoint">查看<span>交易详情</span></a>
     </div>
    </div>
  </div>
</div>


<div class="footer" >
 <div class="footer-hd">
 <p>
 <a href="javascript:;">恒望科技</a>
 <b>|</b>
 <a href="home/list.do">商城首页</a>
 <b>|</b>
 <a href="javascript:;">支付宝</a>
 <b>|</b>
 <a href="javascript:;">物流</a>
 </p>
 </div>
 <div class="footer-bd">
 <p>
 <a href="javascript:;">关于恒望</a>
 <a href="javascript:;">合作伙伴</a>
 <a href="javascript:;">联系我们</a>
 <a href="javascript:;">网站地图</a>
 
 </p>
 </div>
</div>


</body>
</html>
