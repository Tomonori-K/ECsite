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
		<div id="top"><p>UserCreateConfirm</p></div>
		<div>
			<h3>登録する内容は以下の通りでよろしいでしょうか。</h3>
			<s:form action="UserCreateCompleteAction">
			<table>
				<tr>
					<td>ログインID：</td>
					<td><s:property value="session.loginUserId"/></td>
				</tr>
				<tr>
					<td>ログインPASS：</td>
					<td><s:property value="session.loginPassword"/></td>
				</tr>
				<tr>
					<td>ユーザー名：</td>
					<td><s:property value="session.userName"/></td>
				</tr>
				<tr>
					<s:submit value="完了"/>
				</tr>
			</table>
			</s:form>
		</div>
	</div>
</body>
</html>