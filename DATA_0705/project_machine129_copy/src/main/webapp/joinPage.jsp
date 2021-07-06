<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" type="text/css" href="css/joinpage.css" />
</head>
<body>



	<form action="Joincon" method="post">
		<div id="JoinBox" align="center">
			
				<div>
					<h1>
						<a href="homePage.jsp">회원가입</a>
					</h1>
				</div>

				<h4>아이디</h4>
				<input type="text" name="id"  id="input_id" placeholder="아이디" class="input">
				<br>
				 <input type="button" value="ID중복체크"
              						 onclick="idCheck()" > <span id="sp"></span>
				<br>
				<h4>이름</h4>
				<input type="text" name="name" placeholder="이름" class="input">
				<br>
				<h4>비밀번호</h4>
				<input type="password" name="pw" placeholder="비밀번호" class="input">
				<br>
				<h4>이메일</h4>
				<input type="text" name="email" placeholder="이메일" class="input">
				<br>
				<h4>전화번호</h4>
				<input type="text" name="tel" placeholder="전화번호" class="input">
				<br>
				<h4>주소</h4>
				<select name="address" class="input"
					style="width: 360px; height: 35px">
					<option value="gg">경기도</option>
					<option value="gw">강원도</option>
					<option value="gss">경상남도</option>
					<option value="gsn">경상북도</option>
					<option value="jrn">전라북도</option>
					<option value="jrs">전라남도</option>
					<option value="ccn">충청북도</option>
					<option value="ccs">충청남도</option>
					
				</select> <!-- <input type="text"name="gender"placeholder="성별"class="input"> -->
				<br>
				<input type="submit" value="가입하기" class="join_btn">
			</div>
			
	</form>
	
	
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>


			
	
	
	<script>
			function idCheck(){
				var input_id = document.getElementById("input_id");
				$.ajax({
					type : "post", //데이터 전송 방식
					data : {'id' : input_id.value}, //서버로 보낼 데이터
					url : "Idcheckcon", //데이터 보낼 서버 페이지
					dataType : "text", //데이터 타입
					//요청성공시 실행할 함수 정의 ture / false
					success : function(data){
						alert(data);
						var sp = document.getElementById("sp");
						if (data == "true"){
							sp.innerHTML = "불가능한 ID입니다.";
						}else{
							sp.innerHTML = "가능한 ID입니다.";
						}
						
					},
					error : function(){
						alert("전송실패");
						
					}	
				});
			}//펑션끝
			</script>
	

</body>
</html>