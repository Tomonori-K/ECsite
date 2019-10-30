<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style2.css">
<title>admin画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>admin</p></div>
		<div>
			<table>
				<tr>
					<td>商品</td>
					<td>ユーザー</td>
				</tr>
				<tr>
					<td><s:form action="ItemCreateAction">
							<s:submit value="新規登録"/>
						</s:form>
					</td>
					<td><s:form action="UserCreateAction">
							<s:submit value="新規登録"/>
						</s:form>
					</td>
				</tr>
				<tr>
					<td><s:form action="ItemListAction">
							<s:submit value="一覧"/>
						</s:form>
					</td>
					<td><s:form action="UserListAction">
							<s:submit value="一覧"/>
						</s:form>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>