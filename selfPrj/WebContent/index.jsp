<%@page import="memberVo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");
	String alertMsg = (String)session.getAttribute("alertMsg");
	session.removeAttribute("alertMsg");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

		<%if(alertMsg != null){%>
				alert('<%=alertMsg%>');
			<%}%>

</script>
</head>
<body>
	<h1>잘 나오니?</h1>
	<form action="">
		아이디 : <input type="text" name="userId">
		비밀번호 : <input type="password" name="userPwd">
		<br> <br>
		<input type="submit" value="로그인">
		<input type="button" value="회원가입" onclick="location.href='/selfapp/member/join'">
	</form>
</body>
</html>