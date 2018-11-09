<%@page import="kr.or.ddit.board.model.BoardVo"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<head>
<%@include file="../common/basiclb.jsp"%>
</head>

<body>
	<%@ include file="../common/header.jsp"%>
	<div class="container-fluid">
		<div class="row">
			<%-- left --%>
			<%@ include file="../common/left.jsp"%>

			<%request.setCharacterEncoding("utf-8"); %>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<form class="form-horizontal" role="form">
			
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">제품아이디</label>
						<div class="col-sm-10">
							<label class="col-sm-2 control-label">${prodVo.prod_id}</label>
						</div>
					</div>

					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">제품명</label>
						<div class="col-sm-10">
							<label class="control-label">${prodVo.prod_name}</label>
						</div>
					</div>
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">제품그룹명</label>
						<div class="col-sm-10">
							<label class="control-label">${prodVo.lprod_nm}</label>
						</div>
					</div>
					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">바이어이름</label>
						<div class="col-sm-10">
							<label class="control-label">${prodVo.buyer_name}</label>
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">바이어 이메일</label>
						<div class="col-sm-10">
							<label class="control-label">${prodVo.buyer_mail}</label>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>