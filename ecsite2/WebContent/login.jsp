<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Login画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>Login</p></div>
		<div>
			<s:form action="LoginAction">
				<s:textfield name="loginUserId"/>
				<s:password name="loginPassword"/>
				<s:submit value="ログイン"/>
			</s:form>
		</div>
		<br/>
		<div>
			<p>新規ユーザー登録は
			<a href='<s:url action="UserCreateAction"/>'>こちら</a></p>
			<p>前画面に戻る場合は
			<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>