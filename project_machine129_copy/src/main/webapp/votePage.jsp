<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" type="text/css" href="css/votepage.css" />
</head>

<body background="img/back_ground1.png">
<%@ include file = "newHome.jsp" %>


	<form action="voteResult.jsp">
	 <div>
	 
		<fieldset >
			<table style="align-contents: center;">
				<legend>
					<h1>설문조사</h1>
					<tr>
						<td>
							<!-- 설문조사 내용 -->1. 반려견의 크기를 선택해주세요.
						</td>
						<!-- 설문조사와 radio버튼 사이 간격설정 공백 -->
						<td></td>
						<td>
							<!-- 예 아니오 체크 *name값 value값 주어야함 --> 
							소형견<input type="radio" value="check" name=""> 
							중형견<input type="radio" value="check" name="">
							대형견<input type="radio" value="check" name="">
						</td>
					</tr>
					<tr>
						<td>
							<!-- 설문조사 내용 --> 2. 실제 반려견과 함께 생활하는 주거환경을 선택해주세요. 
						</td>
						<!-- 설문조사와 radio버튼 사이 간격설정 공백 -->
						<td></td>
						<td>
							<!-- 예 아니오 체크 *name값 value값 주어야함 --> 예<input type="radio"
							value="check" name=""> 아니오<input type="radio"
							value="check" name="">
						</td>
					</tr>
					<tr>
						<td>
							<!-- 설문조사 내용 --> 1. 내용설문조사 내용
						</td>
						<!-- 설문조사와 radio버튼 사이 간격설정 공백 -->
						<td></td>
						<td>
							<!-- 예 아니오 체크 *name값 value값 주어야함 --> 예<input type="radio"
							value="check" name=""> 아니오<input type="radio"
							value="check" name="">
						</td>
					</tr>
				</legend>
			</table>
			<div>
				<input type="submit" value="설문완료" class="submit">
			</div>
			
		</fieldset>
		</div>
	</form>
</body>
</html>