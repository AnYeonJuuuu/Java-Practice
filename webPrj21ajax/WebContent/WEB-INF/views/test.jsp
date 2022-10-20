<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

</head>
<body>
	<h1>test</h1>
	
	<input type="text" name="memberId">
	<button onclick="dupCheck()">중복체크</button>
	<br>
	<div id="result">@@@@@@@</div>
	
	<script type="text/javascript">
		
		function dupCheck() {
			/* alert("버튼 클릭~~~~~");
			$('#result').load("/app21/data"); */
			
			//jQury안에 ajax를 호출 : 비동기통신
			x = {}; // 자스에서 객체 만들기
 			$.ajax({
 				url : "/app21/data" , // ** 어디에 보낼지는 반드시 알려줘야 함!
 				method : "GET" , // method == type
				data :  { 
					"msg" : "h1i 나는 클라이언트~", 
					"msg2" : " 내일은 금요일일 !!! "
					} , //내가 보내고싶은 데이터
				success : function (x) {
					alert("통신 성공");
					console.log(x);
					$('#result').text(x);
				},
				error : function (y) {
					alert("통신 실패");
					console.log(y);
				},
				complete : function () {
					alert("통신 끝");
				}
 			});
		}
	
	</script>
	
</body>
</html>