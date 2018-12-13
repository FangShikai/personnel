<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html class="no-js">
  <head>
    <base href="<%=basePath%>">
    
  
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>GIO人事管理系统-添加员工</title>
		<meta name="description" content="这是一个form页面">
		<meta name="keywords" content="form">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="icon" type="image/png" href="<%=path%>/jsp/assets/i/favicon.png">
		<link rel="apple-touch-icon-precomposed" href="<%=path%>/jsp/assets/i/app-icon72x72@2x.png">
		<meta name="apple-mobile-web-app-title" content="Amaze UI" />
		<link rel="stylesheet" href="<%=path%>/jsp/assets/css/amazeui.min.css" />
		<link rel="stylesheet" href="<%=path%>/jsp/assets/css/admin.css">
		<script type="text/javascript">
		 window.onload = function()
   {
        document.getElementById("frm1").onsubmit =
               function(){
                      var d1 = this.d1.value;
                      var d2 = this.d2.value;
                      var d3 = this.d3.value;
                      if(!compareDate(d1,d2)){
                      alert("工作日期不能比入职日期小");
                      return false;
                      }else if(adult(d3, d1)<6570){
                      alert("对不起，该员工未满十八岁，不能入职");
                      return false;
                      }else{
                      return true;
                      }
                                   
               };
        }
        function compareDate(d1,d2)
        {
               var arrayD1 = d1.split("-");
               var date1 = new Date(arrayD1[0],arrayD1[1],arrayD1[2]);
               var arrayD2 = d2.split("-");
               var date2 = new Date(arrayD2[0],arrayD2[1],arrayD2[2]);
               if(date1 > date2) return false;             
               return true;
        }
        
        
         function adult(d3, d1){
         var sArr = d1.split("-");
		var eArr = d3.split("-");
		var sRDate = new Date(sArr[0], sArr[1], sArr[2]);
		var eRDate = new Date(eArr[0], eArr[1], eArr[2]);
		var days = (sRDate-eRDate)/(24*60*60*1000); 
         return days;
		 }
		</script>
  </head>
  
  <body>
  	<header class="am-topbar admin-header">
			<div class="am-topbar-brand">
				<strong>GIO</strong> <small>人事管理系统</small>
			</div>

			<div class="am-collapse am-topbar-collapse" id="topbar-collapse">

    <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
      <li></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <span class="am-icon-users"></span> <%=session.getAttribute("username")%>
 
        </a>
      
      </li>
      <li></li>
    </ul>
  </div>
		</header>

		<div class="am-cf admin-main">
			<!-- sidebar start -->
			<div class="admin-sidebar">
				<ul class="am-list admin-sidebar-list">
					<li>
						<a href="<%=path %>/jsp/index.jsp"><span class="am-icon-home"></span> 首页</a>
					</li>

					<li>
						<a href="<%=path %>/employee/selectAllEmployee.action"><span class="am-icon-table"></span> 员工入职管理</a>
					</li>
					<li>
						<a href="<%=path %>/department/selectAllDepartment.action"><span class="am-icon-table"></span> 部门管理</a>
					</li>
					<li>
						<a href="<%=path %>/post/selectAllPost.action"><span class="am-icon-table"></span> 岗位管理</a>
					</li>
					<li>
						<a href="<%=path %>/probation/selectAllProbation.action"><span class="am-icon-table"></span> 员工试用期管理</a>
					</li>

					<li class="admin-parent">
						<a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 员工调转信息管理 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
						<ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
							<li>
								<a href="<%=path %>/jsp/dep_trans/dep_trans.jsp"><span class="am-icon-puzzle-piece"></span> 部门调转信息</a>
							</li>
							<li>
								<a href="<%=path %>/jsp/post_trans/transChoose.jsp"><span class="am-icon-puzzle-piece"></span> 岗位调转信息</a>
							</li>
						</ul>
					</li>

					<li>
						<a href="<%=path %>/dimission/selectAllDimission_not.action"><span class="am-icon-table"></span> 员工离职管理</a>
					</li>
					<li>
						<a href="<%=path %>/jsp/reporter/reporter.jsp"><span class="am-icon-table"></span> 报表管理</a>
					</li>
				</ul>

				<div class="am-panel am-panel-default admin-sidebar-panel">
					<div class="am-panel-bd">
						<p><span class="am-icon-bookmark"></span> 公告</p>
						<p style="font-size: 13px;">逃避，就一直是输家。唯有面对，才是要赢的第一步。<br /> &nbsp;&nbsp;&nbsp;——刘同《你的孤独，虽败犹荣》
						</p>
					</div>
				</div><br /><br />
			</div>
			<!-- sidebar end -->

			<!-- content start -->
			<div class="admin-content" >

				<div class="am-cf am-padding">
					<div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">添加员工</strong> <small></small></div>
				</div>

				<div class="am-tabs am-margin " data-am-tabs>
					<ul class="am-tabs-nav am-nav am-nav-tabs">
						<li class="am-active">
							<a href="#tab1">基本信息</a>
						</li>

					</ul>

					<div class="am-tabs-bd">
						<div class="am-tab-panel am-fade am-in am-active" id="tab1" style="margin-left: 80px; background-image: url(<%=path %>/jsp/assets/i/addbackground.png);">

							<form action="<%=path %>/employee/addEmployee.action" method="post" class="am-form am-form-inline" id="frm1">
								<!--员工姓名-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">
										员工姓名
									</div>
									<div class="am-u-sm-10">
										<div class="am-form-group ">
											<input style="width: 178px;" type="text" class="am-form-field am-input-sm" name="emp_name" required="required" onsubmit="return adult();">
										</div>
									</div>
								</div>

								<!--性别-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">性别</div>
									<div class="am-u-sm-10">
										<select style="width: 178px;" name="emp_sex">
											<option value="1">男</option>
											<option value="2">女</option>
										</select>
									</div>
								</div>

								<!--出生日期-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">
										出生日期
									</div>
									<div class="am-u-sm-10">
										<div class="am-form-group am-form-icon">
											<i class="am-icon-calendar"></i>
											<input type="date" class="am-form-field am-input-sm" name="birthday" id="d3" required="required">
										</div>
									</div>
								</div>

								<!--所在部门-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">所在部门</div>
									<div class="am-u-sm-10">
										<select style="width: 178px;" name="department.dep_id">
											<c:forEach items="${allDepartment }" var="department">
												<option value="${department.dep_id}">${department.dep_name}</option>
											</c:forEach>
										</select>
									</div>
								</div>

								<!--所在岗位-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">所在岗位</div>
									<div class="am-u-sm-10">
										<select style="width: 178px;" name="post.post_id">
											<c:forEach items="${allPost }" var="post">
												<option value="${post.post_id}">${post.post_name}</option>
											</c:forEach>
										</select>
									</div>
								</div>

								<!--入职日期-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">
										入职日期
									</div>
									<div class="am-u-sm-10">
										<div class="am-form-group am-form-icon">
											<i class="am-icon-calendar"></i>
											<input type="date" class="am-form-field am-input-sm" name="entry_date" id="d1" required="required" >
										</div>
									</div>
								</div>
								<!--工作日期-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">
										工作日期
									</div>
									<div class="am-u-sm-10">
										<div class="am-form-group am-form-icon">
											<i class="am-icon-calendar"></i>
											<input type="date" class="am-form-field am-input-sm" name="work_date" id="d2"  required="required">
										</div>
									</div>
								</div>

								<!--工作类型-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">用工形式</div>
									<div class="am-u-sm-10">
										<select style="width: 178px;" name="work_type">
											<option value="1">正式员工</option>
											<option value="2">临时员工</option>
										</select>
									</div>
								</div>

								<!--民族-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">
										民族
									</div>
									<div class="am-u-sm-10">
										<div class="am-form-group ">
											<input style="width: 178px;" type="text" class="am-form-field am-input-sm" name="nation">
										</div>
									</div>
								</div>
								<!--电话-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">
										电话
									</div>
									<div class="am-u-sm-10">
										<div class="am-form-group ">
											<input style="width: 178px;" type="text" class="am-form-field am-input-sm" name="emp_phone">
										</div>
									</div>
								</div>
								<!--邮箱-->
								<div class="am-g am-margin-top">
									<div class="am-u-sm-2 am-text-right">
										邮箱
									</div>
									<div class="am-u-sm-10">
										<div class="am-form-group ">
											<input style="width: 178px;" type="text" class="am-form-field am-input-sm" name="email">
										</div>
									</div>
								</div>

								<div class="am-margin" style="margin-left: 400px;">
									<button type="submit" class="am-btn am-btn-primary am-btn-xs">保存</button>
									<button type="reset" class="am-btn am-btn-primary am-btn-xs">重置</button>
								</div>

							</form>

						</div>

					</div>

				</div>

			</div>
			<!-- content end -->

		</div>

		<footer>
			<hr>
			<p class="am-padding-left">© 2018 Go Into Overdrive, Inc. Licensed under MIT license.</p>
		</footer>

		<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

		<!--[if (gte IE 9)|!(IE)]><!-->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/amazeui.min.js"></script>
		<!--<![endif]-->
		<script src="assets/js/app.js"></script>
  </body>
</html>
