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
	<h1>나이 확인</h1>
	
	<input type="text" name="age">
	<button onclick="check();">확인</button>
	
	<script >
		function check() {
			
			//입력된 나이 가져오기 ((*체크 함수 안 쪽에 넣어주어야 함!!))
			//제이쿼리이므로 .val() 함수로 가져올 수 있음 - 순수 자바스크립트였다면 .value 로 입력해야함
			let age = $('input[name="age"]').val();
			
			//ajax 이용해서, " 서버한테 데이터 보내고 응답받기 "
			$.ajax({
				url : "/app21/test2" ,
				type : "post",
				data : 
				{
					"age" : age	
				},
				// 서버가 보낸? x 를 담아줌
				success : function (x) {
					alert(x);
				},
				error : function () {
					alert("에러발생....")
				}
			});
		}
	</script>
	
	
</body>
</html>