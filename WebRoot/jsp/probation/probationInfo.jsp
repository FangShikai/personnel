<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

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
		<title>GIO人事管理系统-试用期信息</title>
		<meta name="description" content="这是一个 table 页面">
		<meta name="keywords" content="table">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="icon" type="image/png" href="<%=path%>/jsp/assets/i/favicon.png">
		<link rel="apple-touch-icon-precomposed" href="<%=path%>/jsp/assets/i/app-icon72x72@2x.png">
		<meta name="apple-mobile-web-app-title" content="Amaze UI" />
		<link rel="stylesheet" href="<%=path%>/jsp/assets/css/amazeui.min.css" />
		<link rel="stylesheet" href="<%=path%>/jsp/assets/css/admin.css">
		
		<script type="text/javascript">
		 function validate(){ 
		          var obj = document.getElementById("pro_id");  
			      if((/^\d{1,4}$/.test(obj.value))||(obj.value=="")){ 
		          return true; 
		          }else{
		          alert("试用期ID输入有误，请输入1-4位数字!");  
		          return false;
		          }  
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
			<div class="admin-content">

				<div class="am-cf am-padding">
					<div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">试用期信息</strong> <small></small></div>
				</div>

				<div class="am-g">
					<div class="am-u-md-6 am-cf">
						<div class="am-fl am-cf">
							<div class="am-btn-toolbar am-fl">
								<div class="am-btn-group am-btn-group-xs">
									<button type="button" class="am-btn am-btn-default" onclick="window.location.href='<%=path %>/jsp/probation/addProbation.jsp'"><span class="am-icon-plus"></span> 添加试用期</button>

								</div>

								<div class="am-form-group am-margin-left am-fl">
								</div>
							</div>
						</div>
					</div>
					<div class="am-u-md-3 am-cf">
						<div class="am-fr">

							<div class="am-input-group am-input-group-sm">

								<form action="<%=path %>/probation/selectPassEmployee.action" method="post">
									<span class="am-input-group-btn">
				  	
				  	<input class="am-btn am-btn-default" type="submit" value="搜索转正员工信息">
				  	 </span>
								</form>

								<form action="<%=path %>/probation/selectProbationById.action" method="post" onsubmit="return validate();">
									<span class="am-input-group-btn">
				  	             <input type="text"  class="am-form-field" style="width: 150px"  placeholder="请输入试用期ID" name="pro_id" id="pro_id" >&nbsp;&nbsp;&nbsp;
				  	
							  	<input class="am-btn am-btn-default" type="submit" value="搜索">
							  	 </span>
								</form>
							</div>
						</div>
					</div>
				</div>

				<div class="am-g">
					<div class="am-u-sm-12">
						<form class="am-form">
							<table class="am-table am-table-striped am-table-hover table-main">

								<tr>
									<th class="table-id">试用期编号</th>
									<th class="table-title">员工ID</th>
									<th class="table-type">员工姓名</th>
									<th class="table-author">部门</th>
									<th class="table-date">岗位</th>
									<th class="table-set">开始日期</th>
									<th class="table-author">结束日期</th>
									<th class="table-date">评估</th>
									<th class="table-set">结果</th>
									<th class="table-set">说明</th>
									<th class="table-set">操作</th>
								</tr>

								<c:forEach items="${allProbation }" var="probation">

									<tr>

										<td>${probation.pro_id }</td>
										<td>${probation.employee.emp_id}</td>
										<td>${probation.employee.emp_name}</td>
										<td>${probation.employee.department.dep_name}</td>
										<td>${probation.employee.post.post_name}</td>
										<td>
											<fmt:formatDate value="${probation.start_date }" pattern="yyyy-MM-dd" />
										</td>
										<td>
											<fmt:formatDate value="${probation.end_date }" pattern="yyyy-MM-dd" />
										</td>
										<td>${probation.evaluate }</td>
										<td>
											<c:if test="${probation.result=='1' }">转正</c:if>
											<c:if test="${probation.result=='2' }">延期</c:if>
											<c:if test="${probation.result=='3' }">不予录用</c:if>
										</td>
										<td>${probation.note }</td>

										<td>
											<div class="am-btn-toolbar">
												<div class="am-btn-group am-btn-group-xs">
													<button type="button" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='<%=path%>/probation/updateProbation.action?id=${probation.pro_id }&operate=1'"><span class="am-icon-pencil-square-o"></span>转正</button>
													<button type="button" class="am-btn am-btn-default am-btn-xs am-text-danger" onclick="window.location.href='<%=path%>/probation/updateProbation.action?id=${probation.pro_id }&operate=2 '"><span class="am-icon-trash-o"></span>延期</button>
													<button type="button" class="am-btn am-btn-default am-btn-xs am-text-danger" onclick="window.location.href='<%=path%>/probation/updateProbation.action?id=${probation.pro_id }&operate=3'"><span class="am-icon-trash-o"></span>不予录用</button>
												</div>
											</div>
										</td>
									</tr>
								</c:forEach>
							</table>

							<hr />

						</form>
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
		<script src="<%=path%>/jsp/assets/js/jquery.min.js"></script>
		<script src="<%=path%>/jsp/assets/js/amazeui.min.js"></script>
		<!--<![endif]-->
		<script src="<%=path%>/jsp/assets/js/app.js"></script>
	</body>

</html>