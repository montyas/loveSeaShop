<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=7" />
		<title>商品上下架信息采集</title>
		<link rel="icon" href="resource/favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" type="text/css" href="resource/js/themes/default/easyui.css" />
		<link rel="stylesheet" type="text/css" href="resource/css/newstyle.css?r=<%=new Random().nextInt() %>"/>
		<script type="text/javascript" src="resource/js/jquery-1.7.2.js"></script>
		<script type="text/javascript" src="resource/js/jquery.validate.min.js"></script>
		<script type="text/javascript" src="resource/js/jquery.form.js"></script>
		<script type="text/javascript" src="resource/shop.js?r=<%=new Random().nextInt() %>"></script>
		<style type="text/css">
			a{ text-decoration:none;} a:hover{ text-decoration:underline;}
		</style>
	</head>
	<body onload="shopForm()">
<div id="content">
<form action="*" method="POST" id="shopForm">
    <p class="field1">
        <label class="label">宝贝地址:</label>
        <input type="text" class="text" size="60" id="detail_url" name="detail_url" value="http://detail.tmall.com/item.htm?spm=a1z10.1.w5473162-2797453408.1.qQnq1s&id=19127401164">
        <input type="submit" class="submit" value="开始分析" id="savePush">
    </p>
    <div style="background-image: url('resource/images/line.png');background-repeat: repeat-x">&nbsp;</div>
     <p class="field">
	 	 <label class="label">店铺昵称:</label><span id="nick"></span>&nbsp;&nbsp;&nbsp;&nbsp;
	 </p>
	   <p class="field">
	 	 <label class="label">创店时间:</label><span id="created"></span>&nbsp;&nbsp;&nbsp;&nbsp;
	 </p>
	  <p class="field">
	 	 <label class="label">所在地:</label><span id="location"></span>
	 </p>
     <p class="field">
	 	 <label class="label">标&nbsp;&nbsp;&nbsp;&nbsp;题:</label><span id="title"></span>
	 </p>
	 <p class="field">
	 	 <label class="label">总&nbsp;销&nbsp;量:</label><span id="totalSQ"></span>
	 </p>
	 <p class="field">
	 	 <label class="label">库&nbsp;&nbsp;&nbsp;&nbsp;存:</label><span id="num"></span>
	 </p>
	 <p class="field">
	 	 <label class="label">原&nbsp;&nbsp;&nbsp;价:</label><span id="price"></span>
	 </p>
	  <p class="field">
	 	 <label class="label">修改时间:</label><span id="modified"></span>
	 </p>
	 <p class="field">
	 	 <label class="label">上架时间:</label><span id="starts"></span>
	 </p>
     <p class="field">
	 	 <label class="label">下架时间:</label><span id="ends"></span>
	 </p>
	 <p class="field">
	 	 <label class="label">下架周期:</label><span id="valid_thru"></span>
	 </p>
	 <p class="field">
	 	 <label class="label">会员打折:</label><span id="discount"></span>
	 </p>
	 <p class="field1">
	 	 <label class="label">主&nbsp;&nbsp;&nbsp;&nbsp;图:</label>
	 	 <img alt="" src="resource/images/bgimg.png" id="imgs" width="400" height="350">
	 </p>
</form>
<div>
	
</div>
</div>
</body>
</html>

