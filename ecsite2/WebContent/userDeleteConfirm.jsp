<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>userDeleteConfirm画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>userDeleteConfirm画面</p></div>
		<div>
			<h2>ユーザーID<s:property value="loginId"/>を削除します。よろしいですか？</h2>
			<table>
				<tr>
					<td><s:form action="UserDeleteCompleteAction">
							<s:hidden name="loginId" value="%{loginId}"/>
							<s:submit value="ＯＫ"/>
						</s:form>
					</td>
					<td><s:form action="UserDetailsAction">
							<s:hidden name="loginId" value="%{loginId}"/>
							<s:submit value="キャンセル"/>
						</s:form>
					</td>
				</tr>
			</table>
			管理者ページは
			<a href='<s:url action="AdminAction"/>'>こちら</a>
		</div>
	</div>
</body>
</html>