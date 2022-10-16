<%@page import="member.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	MemberVo vo = (MemberVo)request.getAttribute("vo");
%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	#main{
		width: 60vw;
		height: 60vh;
		border: 5px solid black;
		margin: auto;
	}

	form{
		width: 100%;
		height: 100%;
	}

	#join-area{
		width: 100%;
		height: 70%;
		border: 1px solid red;
		display: grid;
		/* 열에 대한 처리 */
		grid-template-columns: 1fr 4fr;
		grid-template-rows: repeat(7, 1fr);
		justify-items: center;
	}

	#join-area>div{
		width: 80%;
	}

</style>
<body>


	<div id="main">
		<h1 align="center">회원 수정</h1>

		<form action="/exam/member/edit" method="post">

			<div id="join-area">
				<div>이름</div>
				<div><input type="text" name="memberName" value="<%= vo.getName()%>"></div>
				<div>아이디</div>
				<div><input type="text" name="memberId" value="<%= vo.getId()%>"></div>
				<div>암호</div>
				<div><input type="password" name="memberPwd1" value="<%= vo.getPwd()%>"></div>
				<div>암호 확인</div>
				<div><input type="password" name="memberPwd2"></div>
				<div>이메일</div>
				<div><input type="email" name="eMail" value="<%= vo.geteMail()%>"></div>
				<div>전화번호</div>
				<div><input type="tel" name="phone" value="<%= vo.getPhone()%>"></div>
				<div>등급</div>
				<div>
					<label for="">일반회원
						<input type="radio" name="grade" value="gen">
					</label>
					<label for="">관리자
						<input type="radio" name="grade" value="admin">
					</label>
				</div>

				<div><input type="submit" value="확인"></div>
				<div><input type="button" value="취소"></div>
			</div>

		</form>

		
	</div>

	<script>
		// 비밀번호 일치여부 체크
		const pwd1 = document.querySelector("input[name=memberPwd1]");
		const pwd2 = document.querySelector("input[name=memberPwd2]");
	
		function check() {
			
			if(pwd1.value.length > 0 && pwd1.value == pwd2.value){
				return true;
			}else{
				alert('패스워드가 일치하지 않습니다.');
				return false;
			}
			
		}
	</script>
	
</body>
</html>


