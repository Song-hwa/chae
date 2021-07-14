<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html네>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/voteResult.css">

</head>
<body>

    <h1>내 설문조사 결과</h1>
    <form>
      <div class="main">
          <ul class="best_dog_list">
              <li data-sipu-result="">
                  <span class="thumb_detail">자세히보기</span>
                  <span class="d_thumb">
                      <img data-sipu-resultimage="" src="#" alt="" title="" />
                  </span>
                  <span data-sipu-resultpoint="" class="point"><span>%</span></span>
                  <span data-sipu-resultname="" class="name"></span>
              </li>
          </ul>
         
          <ul class="best_dog_list">
              <li data-sipu-result="">
                  <span class="thumb_detail">자세히보기</span>
                  <span class="d_thumb">
                      <img data-sipu-resultimage="" src="#" alt="" title="" />
                  </span>
                  <span data-sipu-resultpoint="" class="point"><span>%</span></span>
                  <span data-sipu-resultname="" class="name"></span>
              </li>
              <li data-sipu-result="">
                  <span class="thumb_detail">자세히보기</span>
                  <span class="d_thumb">
                      <img data-sipu-resultimage="" src="#" alt="" title="" />
                  </span>
                  <span data-sipu-resultpoint="" class="point"><span>%</span></span>
                  <span data-sipu-resultname="" class="name"></span>
              </li>
          </ul>
      </div>
      <div class="footer">
        <a href="votePage.jsp">
          <img alt="다시하기" src="https://interactive.hankookilbo.com/v/e4fe0c1ef9294bdbb8e34c3b326ec2ed/images/result/bt_re_game.png">
        </a>
       </div>
   
      </form>
    
</body>
</html>