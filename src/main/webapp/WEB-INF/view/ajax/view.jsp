<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "/WEB-INF/view/common/basiclib.jsp" %>
<script type="text/javascript">
	$(document).ready(function () {
		var userVo = {userId : "brown", alias :"곰", name :"브라운", pass:"brownpass"};
		
		// 자바스크립트 객체를 문자열로 변환하는 메소드 : stringify
		$("#sendData").html(JSON.stringify(userVo));
		$("#send").on("click", function(){
		$.ajax({
			contentType : "application/json; charset=utf-8", 
			url :"/ajax/getRangers",
			type :"post",
			data : JSON.stringify(userVo),  //json
			success : function (dt) {
				$("#result").html(JSON.stringify(dt));
			} 
		});
	});
});
	</script>
</head>
<body>
	<h2>view.jsp</h2>
	<button id = "send">전송</button><br>
	전송데이터 : <span id="sendData"></span><br>
	응답결과 : <span id ="result"></span><br>
</body>
</html>