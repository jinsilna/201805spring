<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--  tiles-config.xml 에서 tiles-definitions 을 정해줬으니깐 여기서 간추릴?수 있다. -->
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

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
<title>userPageList</title>
<%-- basiclb --%>
<%@include file="../common/basiclib.jsp"%>
<!-- cursor pointer : 손가락 모양으로바뀜 -->
<style type="text/css">
.userClick {
	cursor: pointer;
}
</style>

<script type="text/javascript">

/*
 	1. jsp요청 (userList, pageCnt) ==> 빈페이지 조회
 	2. 페이지 로딩이 완료되면 getUserList(1);
 	2-1. ajax call을 통해 json객체를 응답으로 받음
 	2-2. json 객체를 사용하여 html문서를 만듬
 	
 	//*********************************************
 	
 	1. jsp요청 (userList, pageCnt) ==> 빈페이지 조회
 	2. 페이지 로딩이 완료되면 getUserListHtml(1);
 	2-1. ajax call을 통해 html 응답으로 받음.
 
 */

$(document).ready(function() {
	console.log("document.ready");

	// tr에 대해 select (class="userClick")
	$("#userList").on("click", ".userClick",function() {
		console.log("userClick");
		var userId = $(this).children()[1].innerHTML;

		$("#userId").val(userId);
		$("#frm").submit();
	});
		getUserList(1);    //1페이지 나오게 하는거
		//getUserListHtml(1);
		//getUserPagenationHtml(1);
});
//-----------------------------------------------------------------------------
function getUserListHtml(page){
	var pageSize = 10;
	
	$.ajax({
		url : "/user/userPageListAjaxHtml",
		type : "GET",
		data : "page="+page+"&pageSize="+pageSize,
		success: function(dt) {
			$("#userList").html(dt);
		}
	})
}
//-----------------------------------------------------------------------------
function getUserPagenationHtml(page){
	var pageSize = 10;
	
	$.ajax({
		url : "/user/userPagenationHtml",
		type : "GET",
		data : "page="+page+"&pageSize="+pageSize,
		success: function(pz) {
			$(".pagination").html(pz);
		}
	})
}
// list
//-----------------------------------------------------------------------------
//page 인자를 받아서 해당페이지에 속하는 사용자 리스트 정보를 가져온다.
function getUserList(page){
	var pageSize = 10;       // pageSize 변수를 선언
	console.log("page" + page);

	// ajax, call
	// 사용자 리스트 데이터만 가져오기 
	// html(기존방식) --> json(바뀌는 방식) 데이터를 받는 형태로 변경한다.
	
	
	// parameter --> json 
	$.ajax({
		type : "GET",
		url : "/user/userPageListAjax",
		data : "page="+page+"&pageSize="+pageSize ,   // 파라미터로 보낸다.
		        // page = 1 & pageSize = 10
		success : function (data) {
			// data(사용자 json데이터) 를 바탕으로 사용자 리스트를 갱신 
			
			// 1. 기존 리스트를 삭제
			// 2. data를 이용하여 table 태그(tr) 작성
			// 3. 기존 리스트 위치에 붙여넣기
			// data.userList 10건, data.pageCnt =13건 
			
			console.log(data);
			var html = "";
			$.each(data.userList, function (idx,user) {
				console.log(user);
				html += "<tr class='userClick'>";
				html += "	<td>"+ user.rnum +"</td>";
				html += "	<td>"+ user.userId +"</td>";
				html += "	<td>"+ user.name +"</td>";
				html += "	<td>"+ user.formattedBirth +"</td>";
				html += "</tr>";
			});
			
			$("#userList").html("");
			$("#userList").html(html);
			
			// page 
			//-----------------------------------------------------------------------------

			var paging ="";
				paging +="<li><a href='javascript:getUserList("+ i +");'aria-label='Previous'><span aria-hidden='true'>&laquo;</span>";
			for(var i= 1; i<=data.pageCnt; i++) {
				paging += "<li><a href='javascript:getUserList("+ i +");'>"+ i+ "</a></li>";
			}
				paging +="<li><a href='javascript:getUserList("+ data.pageCnt +");'aria-label='Next'><span aria-hidden='true'>&raquo;</span>";
				$(".pagination").html(paging);
		}	
	});
}

</script>
</head>

<form id="frm" action="/user/userDetail" method="get">
	<input type="hidden" id="userId" name="userId" />
</form>
<body>
	<div class="col-sm-8 blog-main">
		<h2 class="sub-header">사용자</h2>
		<div class="table-responsive">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>번호</th>
						<th>사용자 아이디</th>
						<th>사용자 이름</th>
						<th>생일</th>
					</tr>
				</thead>
				<tbody id="userList">
					<%--  <c:forEach items="${userList }" var="vo">
					<tr class="userClick">
						<td>${vo.rnum}</td>
						<td>${vo.userId}</td>
						<td>${vo.name}</td>
						<td><fmt:formatDate value="${vo.birth}" pattern="yyyy-MM-dd" /></td>
					</tr>
				</c:forEach>    --%>
				</tbody>
			</table>
		</div>
		<a class="btn btn-default pull-right" href="/user/userForm">사용자 등록</a>

		<div class="text-center">
			<ul class="pagination">
			<%-- 	<!-- <li><a href="/user/userPageList?page=1&pageSize=10"aria-label="Previous"> -->
				<li><a href="javascript:getUserList(1);" aria-label="Previous">
						<span aria-hidden="true">&laquo;</span>
				</a></li>
				<li id="pageList"></li>
				<c:forEach begin="1" end="${pageCnt }" var="p">
					<li><a href="javascript:getUserList(${p});">${p }</a></li>
						<li><a href="/user/userPageList?page=${p }&pageSize=10">${p }</a></li>
				</c:forEach>
				<li><a href="javascript:getUserList(${pageCnt});"
					aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li> --%>
			</ul>
		</div>
	</div>
</body>
</html>
