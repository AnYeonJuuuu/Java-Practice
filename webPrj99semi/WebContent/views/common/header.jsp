<%@page import="com.kh.semi.member.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");
	String alertMsg = (String)session.getAttribute("alertMsg");
	session.removeAttribute("alertMsg");
%>    

<script >
<%if(alertMsg != null){%>
		
		alert('<%= alertMsg %>');
		
	<%}%>
</script>

<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>

<style>
    /* 공통 */
    html , body {
        padding: 0;
        margin: 0;
    }
    div{
        box-sizing: border-box;
    }

    /* 헤더 */
    #header{
        width: 60vw;
        height: 20vh;
        border: 1px solid blue;
        margin:auto;
    }
    #header-top{
        width: 100%;
        height: 100%;
    	display: grid;
        grid-template-columns: 2fr 5fr 2fr;
    }
    #header-bot{
        width: 100%;
        height: 20%;
        border: 1px solid red;
    }
    #logo-box{
        width: 100%;
        height: 100%;
    }
    #logo-box, #member-box{
        width: 100%;
        height: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    #member-box{
    	flex-direction: column;
    }

    #navi{
        width: 100%;
        height: 100%;
        background-color: black;
        color: white;
        font-size: 1.2rem;
        display: grid;
        grid-template-columns: repeat(4, 1fr);
    }

    #navi>div{
        width: 10vw;
        height: 100%;
        display: flex;
        justify-content: center;
    }

</style>



    <div id="header">

        <div id="header-top">
            <div></div>
            <div id="logo-box">
            	<a href="/semi">
	            	<img src="/semi/resources/img/logo.JPG" alt="로고이미지" width="200px" height="160px">
            	</a>
            </div>
            <div id="member-box">
            <%if( loginMember == null){%>
            		<!-- 폼태그는 로그인 안 되어있을 때만 보이게 -->
                <form action="/semi/member/login" method="post">
                    <table>
                        <tr>
                            <td>아이디</td>
                            <td><input type="text" name="memberId"></td>
                        </tr>
                        <tr>
                            <td>비밀번호</td>
                            <td><input type="password" name="memberPwd"></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="로그인"></td>
                            <td><input type="button" value="회원가입" onclick="location.href='/semi/member/join'"></td>
                        </tr>
                    </table>
                </form>
            	<%}else{%>
            		<!-- 로그인 된 상태 -->
            		<span><%= loginMember.getNick() %> 환영합니다.</span>
            		<div>
	            		<a href="/semi/member/logout">로그아웃</a>
	            		&nbsp;
	            		<a href="/semi/member/mypage">마이페이지</a>
            		</div>
            	<%}%>
            </div>
        </div>

        <div id="header-bot">
            <div id="navi">
                <div><a href="/semi">HOME</a></div>
                <div><a href="/semi/notice/list">공지사항</a></div>
                <div><a href="/semi/board/list">일반게시판</a></div>
                <div>사진게시판</div>
            </div>
        </div>

    </div>


	


