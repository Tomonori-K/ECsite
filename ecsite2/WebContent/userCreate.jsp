<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserCreate画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>UserCreate</p></div>
		<div>
			<s:form action="UserCreateConfirmAction">
			<s:if test="errorMessage!=''">
				<s:property value="errorMessage" escape="false"/>
			</s:if>
			<h3>登録するユーザー情報を入力ください</h3>
			<table>
				<tr>
					<td>ログインID：</td>
					<td><input type="text" name="loginUserId"/></td>
				</tr>
				<tr>
					<td>ログインPASS：</td>
					<td><input type="password" name="loginPassword"/></td>
				</tr>
				<tr>
					<td>ユーザー名：</td>
					<td><input type="text" name="userName"/></td>
				</tr>
				<tr>
					<s:submit value="登録"/>
				</tr>
			</table>
			</s:form>

			<br/>
				<p>前画面に戻る場合は
				<a href='<s:url action="LoginAction"/>'>こちら</a></p>
		</div>
	</div>
</body>
</html>