<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>おみくじ結果</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<% int r = new java.util.Random().nextInt(4); %>

<% if(r == 0){ %>
	<img alt="omikuji" src="img/omikuji_daikichi.png">
	<p>大吉でした。やったね。</p>
<% } else if (r == 1) { %>
	<img alt="omikuji" src="img/omikuji_kichi.png">
	<p>吉でした。普通だ。</p>
<% } else if (r == 2) { %>
	<img alt="omikuji" src="img/omikuji_kyou.png">
	<p>凶でした。そんな日もあるさ。</p>
<% } else { %>
	<img alt="omikuji" src="img/omikuji_daikyou.png">
	<p>大凶でした。不吉ですね。</p>
<% } %>


<button type="button" onclick="location.href='index.jsp'">戻る</button>


</body>
</html>