<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE HTML>
<!--
	Epilogue by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Epilogue by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="style/css/main.css" />
		<link rel="stylesheet" href="style/css/add.css" />
		<link rel="stylesheet" href="style/css/homePage.css" />
		
	</head>
	<body>
		<!-- 위로가기 -->
			<div id="top">
				<a href="#Login">Top</a>
			</div>
		<!-- Header -->
			<header id="header" class="alt">
				<div class="inner">
					<h1 class="title"><a href="homePage.jsp" style="text-decoration: none;">유기견매칭시스템</a></h1>
				</div>
				<div class="title_sub">
					<h4 class="menu__link"><a href="login.jsp">로그인</a></h4>
 					<h4 class="menu__link"><a href="#">회원가입</a></h4>
				</div>
			</header>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Banner -->
					<section id="intro" class="main">
						<nav class="menu_nav">
							<ul class="menu_nav_list">
								<li class="menu__item"><a href="dogSearch.jsp" class="menu__link">견종정보</a></li>
								
								<li class="menu__item"><a href="#" class="menu__link">사료정보</a></li>
			
								<li class="menu__item"><a href="#" class="menu__link">질병정보</a></li>
									
								<li class="menu__item"><a href="#" class="menu__link">센터정보</a></li>
								
								<li class="menu__item"><a href="votePage.jsp" id="vote_link" class="menu__link">설문조사</a></li>
							</ul>
						</nav>
					</section>

				<!-- CTA -->
					<section id="cta" class="main special">
						<h2>Etiam veroeros lorem</h2>
						<p>Phasellus ac augue ac magna auctor tempus proin<br />
						accumsan lacus a nibh commodo in pellentesque dui<br />
						in hac habitasse platea dictumst.</p>
						<ul class="actions">
							<li><a href="#" class="button big">Get Started</a></li>
						</ul>
					</section>

				<!-- Main -->
				<!--
					<section id="main" class="main">
						<header>
							<h2>Lorem ipsum dolor</h2>
						</header>
						<p>Fusce malesuada efficitur venenatis. Pellentesque tempor leo sed massa hendrerit hendrerit. In sed feugiat est, eu congue elit. Ut porta magna vel felis sodales vulputate. Donec faucibus dapibus lacus non ornare. Etiam eget neque id metus gravida tristique ac quis erat. Aenean quis aliquet sem. Ut ut elementum sem. Suspendisse eleifend ut est non dapibus. Nulla porta, neque quis pretium sagittis, tortor lacus elementum metus, in imperdiet ante lorem vitae ipsum. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Etiam eget neque id metus gravida tristique ac quis erat. Aenean quis aliquet sem. Ut ut elementum sem. Suspendisse eleifend ut est non dapibus. Nulla porta, neque quis pretium sagittis, tortor lacus elementum metus, in imperdiet ante lorem vitae ipsum. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>
					</section>
				-->

				<!-- Footer -->
					<footer id="footer">
						<ul class="icons">
							<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
							<li><a href="#" class="icon fa-linkedin"><span class="label">LinkedIn</span></a></li>
							<li><a href="#" class="icon fa-envelope"><span class="label">Email</span></a></li>
						</ul>
						<p class="copyright">&copy; Untitled. Design: <a href="https://templated.co">TEMPLATED</a>. Images: <a href="https://unsplash.com">Unsplash</a>.</p>
					</footer>

			</div>

		<!-- Scripts -->
			<script src="js/jquery.min.js"></script>
			<script src="js/skel.min.js"></script>
			<script src="js/util.js"></script>
			<script src="js/main.js"></script>
			
			<script src="js/classie.js"></script>
			<script src="js/clipboard.min.js"></script>
			<script>
				(function() {
					[].slice.call(document.querySelectorAll('.menu')).forEach(
							function(menu) {
								var menuItems = menu.querySelectorAll('.menu__link'), setCurrent = function(ev) {
									ev.preventDefault();

									var item = ev.target.parentNode; // li

									// return if already current
									if (classie.has(item, 'menu__item--current')) {
										return false;
									}
									// remove current
									classie.remove(menu.querySelector('.menu__item--current'),'menu__item--current');
									// set current
									classie.add(item, 'menu__item--current');
								};

								[].slice.call(menuItems).forEach(function(el) {
									el.addEventListener('click', setCurrent);
								});
							});
		
					[].slice.call(document.querySelectorAll('.link-copy')).forEach(
							function(link) {
								link.setAttribute('data-clipboard-text',location.protocol + '//' + location.host
												+ location.pathname + '#'+ link.parentNode.id);
								new Clipboard(link);
								link.addEventListener('click', function() {
									classie.add(link, 'link-copy--animate');
									setTimeout(function() {
										classie.remove(link, 'link-copy--animate');
									}, 300);
								});
							});
				})(window);
			</script>
	</body>
</html>