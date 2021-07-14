<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@page import="model.memberDTO"%>
	<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>머신 129 (유기견매칭)</title>
<meta name="description"
	content="An open collection of menu styles that use the line as a creative design element" />
<meta name="keywords"
	content="web design, styles, inspiration, line, pseudo-element, SVG, animation" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="favicon.ico">
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<link rel="stylesheet" type="text/css" href="css/homepage.css" />

<!--[if IE]>
			<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->

</head>

<body>
	<!-- 위로가기 -->
	<div id="top">
		<a href="#Login">Top</a>
	</div>
	<div class="container">


		<section class="section section--menu" id="Alonso">
			<h3>
				<a id="Login" href="loginPage.jsp">로그인</a>
			</h3>


			<!-- 타이틀 -->
			<a href="homePage.jsp"><h1 class="section__title">머신129</h1></a>


			<nav class="menu menu--alonso">
				<ul class="menu__list">
					<!--  메인으로 -->

					<li class="menu__item"><a href="" class="menu__link">공지</a>
					<ul class=menu__menu>
							<li><a href="">서비스소개</a></li>
						</ul>
						</li>
					<li class="menu__item"><a href="#" class="menu__link">센터찾기</a>
					<ul class=menu__menu>
							<li><a href="">지역별 찾기</a></li>
						</ul>
					</li>	

					<!-- 설문조사 링크 -->
					<li class="menu__item menu__item--current"><a href="votePage.jsp" id="vote_link" class="menu__link">설문조사 </a></li>

					<li class="menu__item"><a href="dogSearch.jsp" class="menu__link">견종 정보</a>
					<ul class=menu__menu>
							<!-- 견종 테이블 써서 이름,피지컬정보,주요질병보여주는 페이지 -->
							<li><a href="dogSearch.jsp">견종백과</a></li>
						</ul>
						</li>
					<li class="menu__item"><a href="#" class="menu__link">상품추천</a>
						<ul class=menu__menu>
							
							<li><a href="food.jsp">사료추천</a></li>
							<li><a href="">미용추천</a></li>
						</ul>
					</li>
				</ul>
			</nav>
		</section>

	
</body>
</html>