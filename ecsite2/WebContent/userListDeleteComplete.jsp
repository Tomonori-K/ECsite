<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>userListDeleteComplete</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>userListDeleteComplete</p></div>
		<div>
			<h2>削除が完了しました。</h2>
			ユーザー情報一覧ページは
			<a href='<s:url action="UserListAction"/>'>こちら</a>
			<br>
			管理者ページは
			<a href='<s:url action="AdminAction"/>'>こちら</a>
		</div>
	</div>
	<div id="footer"></div>

</body>
</html>