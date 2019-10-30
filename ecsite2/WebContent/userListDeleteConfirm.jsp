<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>userListDeleteConfirm画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>userListDeleteConfirm</p></div>
		<div>
			<h2>管理者ユーザー以外のユーザー情報を削除します。よろしいですか？</h2>
			<table>
				<tr>
					<td><s:form action="UserListDeleteCompleteAction">
							<s:submit value="ＯＫ"/>
						</s:form>
					</td>
					<td><s:form action="UserListAction">
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