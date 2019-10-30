<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>itemListDeleteComplete</title>
</head>
<body>
	<h2>削除が完了しました。</h2>
	商品情報一覧ページは
	<a href='<s:url action="ItemListAction"/>'>こちら</a>
	<br>
	管理者ページは
	<a href='<s:url action="AdminAction"/>'>こちら</a>

</body>
</html>