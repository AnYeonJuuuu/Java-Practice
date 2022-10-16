<%@page import="member.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
            <div id="member-box">
            <%if( loginMember == null){%>
            	<h1>로그인</h1>
            		<!-- 폼태그는 로그인 안 되어있을 때만 보이게 -->
                <form action="/exam/member/login" method="post">
                    <table>
                        <tr>
                            <td>아이디</td>
                            <td><input type="text" name="memberId"></td>
                        </tr>
                        <tr>
                            <td>암호</td>
                            <td><input type="password" name="memberPwd"></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="로그인"></td>
                            <td><input type="button" value="취소"></td>
                            <td><input type="button" value="회원가입" onclick="location.href='/exam/member/join'"></td>
                        </tr>
                    </table>
                </form>
            	<%}else{%>
            		<!-- 로그인 된 상태 -->
            		<h1>회원전용 페이지</h1>
            		<span><%= loginMember.getName() %> 환영합니다.</span>
            		<div>
	            		<a href="/exam/member/logout">로그아웃</a>
	            		&nbsp;
	            		<a href="/exam/member/edit">회원정보변경</a>
            		</div>
            	<%}%>
            </div>
        
</body>
</html>