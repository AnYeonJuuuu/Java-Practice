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

	<div id="div-result">
	
	</div>

	<h1>인덱스</h1>
	<!-- /부터 입력 == 절대경로 -->
	<a href="/app05/test">요청 보내기 ~~</a>
	
	<hr>
	
	<form action="/app05/test" method="get">
		<input type="submit">
	</form>
	
	<hr>
	
	<button onclick="f01();">버튼</button>
	
	<hr>
	
	<button onclick="f02();">AJAX 버튼</button>
	
	<script type="text/javascript">
		function f01() {
			location.href = '/app05/test';
		}
		
		function f02() {
			//ajax로 /app05/test 에 요청을 보냄
			$.ajax({
				url : "/app05/test",
				method : "get",
				data : {
					"age" : 20,
					nick : "Y_Juice"
				},
				success : function(str){
					const resultDiv = document.querySelector('#div-result');
					resultDiv.innerText = str;
				}				
			});
			
		}
	</script>
	
</body>
</html>