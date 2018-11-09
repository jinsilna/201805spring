<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri ="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>view.jsp</title>
<c:set var = "lang" value="${param.lang==null?'ko':param.lang }"/>
<script src ="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		// select box value set
		$("#lang").val("${lang}");
		
		$("#lang").on("change",function(){
			$("#lang").submit();
		});
	});
</script>
</head>
<body>
lang : ${param.lang } <br>
hello : <spring:message code ="hello"/><br>
visitor : <spring:message code ="visitor" arguments="brown"/><br>
<form action="/messageView" method="post" id = "frm">
	<select name="lang" id ="lang">
		<option value="ko">한국어</option>
		<option value="en">ENGLISH</option>
		<option value="ja">日本語</option>
	</select>
	<input type="submit" value="전송" />
</form>
</body>
</html>