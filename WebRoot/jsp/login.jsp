<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head lang="en">
  <meta charset="UTF-8">
  <title>欢迎登陆</title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
  <meta name="format-detection" content="telephone=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="alternate icon" type="image/png" href="<%=path %>/jsp/assets/i/favicon.png">
  <link rel="stylesheet" href="<%=path %>/jsp/assets/css/amazeui.min.css"/>
  <style>
    .header {
      text-align: center;
    }
    .header h1 {
      font-size: 200%;
      color: #333;
      margin-top: 30px;
    }
    .header p {
      font-size: 14px;
    }
  </style>
  
  <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
    

  <body style="background:url(<%=path %>/jsp/assets/i/login_bg.png)">
 <div class="header"> 
  <hr />
</div>
<div class="am-g">
  <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
    <h3>登录</h3>
    <hr>
    <div class="am-btn-group">
      <a href="https://github.com/" class="am-btn am-btn-secondary am-btn-sm"><i class="am-icon-github am-icon-sm"></i> Github</a>
      <a href="http://www.google.cn/" class="am-btn am-btn-success am-btn-sm"><i class="am-icon-google-plus-square am-icon-sm"></i> Google+</a>
      <a href="https://stackoverflow.com/" class="am-btn am-btn-primary am-btn-sm"><i class="am-icon-stack-overflow am-icon-sm"></i> stackOverflow</a>
    </div>
    <br>
    <br>

    <form method="post" action="<%=path %>/checkUser.action" class="am-form">
      <label for="email">用户名:</label>
      <input type="text" name="username" >
      <br>
      <label for="password">密码:</label>
      <input type="password" name="pwd">
      <br>
      <br>
      <select name="role"  class="am-btn am-btn-default am-btn-sm am-fr">
  		<option value="0">人事经理</option>
  		<option value="1">管理员</option>
  	  </select><br><br>
      
     
      <br />
      <div class="am-cf">
        <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
        
      </div>
    </form>
    <hr>
    <p>© 2018 GIO 版权所有.</p>
  </div>
</div>
  </body>
</html>
