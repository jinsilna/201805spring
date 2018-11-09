<%@page import="java.text.SimpleDateFormat"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--  tiles-config.xml 에서 tiles-definitions 을 정해줬으니깐 여기서 간추릴?수 있다. -->
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<head>
<%@include file="../common/basiclb.jsp"%>

<!-- jquery ui API  -->
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<!-- daum 주소 API -->
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<!-- jquery ui api -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<%
	request.setCharacterEncoding("utf-8");
%>
<script>
	$(document).ready(function() {

		//주소검색 버튼의 click event가 발생했을 시 실행
		$("#addrSearchBtn").click(function() {
			new daum.Postcode({
				oncomplete : function(data) {
					// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
					// 예제를 참고하여 다양한 활용법을 확인해 보세요.
					console.log(data);
					//주소 : roadAddress
					//상세주소 : ""
					//우편번호 : zonecode

					//주소 input value 설정: data.roadAddress
					//우편번호 input value 설정: data.zonecode
					$("#addr1").val(data.roadAddress);
					$("#zip").val(data.zonecode);
				}
			}).open();
		});

		//datePicker
		$(function() {
			//$("#birth").val("");
			$("#birth").datepicker({
				yearRange : "1930:2018",
				dateFormat : "yyyy-MM-dd",
				changeMonth : true,
				changeYear : true
			});
		});

	});
</script>
</head>
<body>
<div class="col-sm-8 blog-main">
		<!-- 파일을 parameter로 넘겨주기 위해서 enctype="multipart/form-data" 반드시 사용해야함 -->
		<form action="/user/userUpdate" method="post" class="form-horizontal"
			role="form" enctype="multipart/form-data">
			<div class="form-group">
				<label for="userNm" class="col-sm-2 control-label">사용자 사진</label>
				<div class="col-sm-10">
					<img alt="" src="${userVo.profile }"> <input type="file"
						id="profile" name="profilePic" />
				</div>
			</div>
			<div class="form-group">
				<label for="userNm" class="col-sm-2 control-label">사용자 아이디</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="userId" name="userId"
						value="${userVo.userId }" placeholder="사용자 아이디"
						readonly="readonly">
				</div>
			</div>

			<div class="form-group">
				<label for="userNm" class="col-sm-2 control-label">비밀번호</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pass" name="pass"
						value="${userVo.pass }" placeholder="비밀번호">
				</div>
			</div>

			<div class="form-group">
				<label for="userNm" class="col-sm-2 control-label">이름</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="name" name="name"
						value="${userVo.name }" placeholder="이름">
				</div>
			</div>
			<div class="form-group">
				<label for="userNm" class="col-sm-2 control-label">주소</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="add1" name="add1"
						value="${userVo.add1 }" placeholder="주소" readonly="readonly">
					<!-- 주소 검색 버튼 -->
					<button id="addrSearchButton" type="button" class="btn btn-default">주소
						검색</button>
				</div>
			</div>
			<div class="form-group">
				<label for="pass" class="col-sm-2 control-label">상세주소</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="add2" name="add2"
						value="${userVo.add2 }" placeholder="상세주소">
				</div>
			</div>

			<div class="form-group">
				<label for="pass" class="col-sm-2 control-label">우편번호</label>
				<div class="col-sm-10">
					<!--  readonly = 읽기전용으로 편집이 불가능 또다른 속성으로 disable을 사용할수 도 있지만 그렇게 되면 값이 넘어가지 않는다. -->
					<input type="text" class="form-control" id="zip" name="zip"
						value="${userVo.zip }" placeholder="우편번호" readonly="readonly">
				</div>
			</div>

			<div class="form-group">
				<label for="birth" class="col-sm-2 control-label">생년월일</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="birth" name="birth"
						placeholder="생년월일"
						value="<fmt:formatDate value="${userVo.birth }" pattern="yyyy-MM-dd" />">
				</div>
			</div>

			<div class="form-group">
				<label for="pass" class="col-sm-2 control-label">이메일</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="email" name="email"
						value="${userVo.email }" placeholder="이메일 ">
				</div>
			</div>

			<div class="form-group">
				<label for="pass" class="col-sm-2 control-label">전화</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="tel" name="tel"
						value="${userVo.tel }" placeholder="전화">
				</div>
			</div>

			<div class="form-group">
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">수정</button>
					</div>
				</div>
				<div class="col-sm-10"></div>
			</div>
		</form>
	</div>	
		
</body>
</html>