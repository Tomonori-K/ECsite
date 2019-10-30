<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemDeleteComplete画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>ItemDeleteComplete</p></div>
		<div>
			<h3>削除が完了しました。</h3>
				<p><a href='<s:url action="MyPageAction"/>'>マイページ</a>から購入情報の確認が可能です。</p>
				<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>