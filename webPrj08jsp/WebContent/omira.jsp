<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    	System.out.println("여기는 jsp 파일");
    	String nick = request.getParameter("nick");
    	System.out.println(nick);
    	

    	out.write("<h1>" + nick + "님 환영합니다.</h1>");

    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	

	<h1>오늘 메뉴</h1>
	<%
	// out : 만든 적 없는데 동작 ? 
   	out.write("<h3>오늘은 금요일</h3>");
	%>
	
	<ul>
		<li>보쌈</li>
		<li>순대</li>
		<li>매실음료</li>
		<li>떡볶이</li>
		<li>양배추</li>
		<li>쫄면</li>
		<li>쌈무</li>
	</ul>
	
	두 코드는 같은 코드
	<h2>닉네임 :: <% out.write(nick); %> </h2>
	<h2>닉네임 :: <%= nick %> </h2>
</body>
</html>









