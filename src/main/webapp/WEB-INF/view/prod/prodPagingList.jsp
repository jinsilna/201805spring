<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<title>boardPagingList.jsp</title>
<%-- basiclb --%>
<%@include file="../common/basiclb.jsp"%>
<!-- cursor pointer : 손가락 모양으로바뀜 -->
<style type="text/css">
	.userClick{
		cursor : pointer;
	}
</style>
<script type="text/javascript">
	$(document).ready(function(){
		console.log("document.ready");
		
		// tr에 대해 select (class="userClick")
		$("#prodList").on("click", ".userClick",function(){
			console.log("userClick");
			var prod_id = $(this).children()[1].innerHTML;
			
			$("#prod_id").val(prod_id);
			  $("#frm").submit();
		});
		getProdList(1);
	});
	
	// list
	//-------------------------------------------------------------
	function getProdList(page){
		var pageSize = 10;
		console.log("page" + page);
		
		$.ajax({
			type: "GET",
			url : "/prod/prodPageListAjax",
			data : "page="+page+"&pageSize="+pageSize,
			success : function (data) {
				console.log(data);
				
			var html ="";
			$.each(data.prodList, function (idx, prod) {
				console.log(prod);
				html += "<tr class='userClick'>";
				html += "<td>"+prod.rnum+"</td>";
				html += "<td>"+prod.prod_id+"</td>";
				html += "<td>"+prod.prod_name+"</td>";
				html += "<td>"+prod.lprod_nm+"</td>";
				html += "<td>"+prod.prod_insdate+"</td>";
				html += "</tr>";
			});
			
			$("#prodList").html("");
			$("#prodList").html(html);
				
			// page
			//-------------------------------------------------------------
			var paging ="";
				paging +="<li><a href='javascript:getProdList("+ i +");'aria-label='Previous'><span aria-hidden='true'>&laquo;</span>";
			for(var i= 1; i<=data.pageCnt; i++) {
				paging += "<li><a href='javascript:getProdList("+ i +");'>"+ i+ "</a></li>";
			}
				paging +="<li><a href='javascript:getProdList("+ data.pageCnt +");'aria-label='Next'><span aria-hidden='true'>&raquo;</span>";
				$(".pagination").html(paging);
			}	
		});
	}
</script>
</head>

<form  id = "frm" action="/prod/Detail" method = "get">
	<input type = "hidden" id = "prod_id" name = "prod_id"/>
</form>
<body>
	<%-- header --%>
	<%@include file="../common/header.jsp"%>
	<div class="container-fluid">
		<div class="row">
			<%-- left --%>
			<%@include file="../common/left.jsp"%>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<div class="row">
	<div class="col-sm-8 blog-main">
		<h2 class="sub-header">사용자</h2>
		<div class="table-responsive">
			<table class="table table-striped table-hover" >
			   <thead>
				<tr class = "userClick">
					<th>번호 </th>
					<th>제품아이디</th>
					<th>제품명</th>
					<th>제품그룹명</th>
					<th>제품등록일</th>
				</tr>
				</thead>
				<tbody id ="prodList">
				<%-- <c:forEach items="${prodList }" var = "vo" >
				<tr class= "userClick">
					<td>${vo.rnum}</td>
					<td>${vo.prod_id}</td>
					<td>${vo.prod_name}</td>
					<td>${vo.lprod_nm}</td>
					<td>${vo.prod_insdate}</td>
				</tr>
				</c:forEach> --%>
				</tbody>
			</table>
		</div>

		<a class="btn btn-default pull-right" href = "/boardForm">제품 등록</a>

		<div class="text-center">
			<ul class="pagination">
				 <%--  	<li>
				     	 <a href="/prod/pagingList?page=1&pageSize=10" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      	</a>
		    		</li>
				 <c:forEach begin="1" end = "${pageCnt }" var="p">
				      <li><a href="/prod/pagingList?page=${p }&pageSize=10">${p }</a></li>
				 </c:forEach>
				      <li>
				      <a href="/prod/pagingList?page=${pageCnt }>&pageSize=10" aria-label="Next"> 
				        <span aria-hidden="true">&raquo;</span>
				      </a>
  				  </li> --%>
			</ul>
		</div>
	</div>
</div>
			</div>
		</div>
	</div>

</body>
</html>
