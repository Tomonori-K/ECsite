<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>userList画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>userList</p></div>
		<div>
			<table border="1">
				<tr>
					<td>id</td>
					<td>login_id</td>
					<td>login_pass</td>
					<td>user_name</td>
					<td>insert_date</td>
					<td>updated_date</td>
					<td>admin_flg</td>
					<td>詳細</td>
				</tr>
				<s:iterator value="userDTOList">
				<tr>
					<td><s:property value="userId"/></td>
					<td><s:property value="loginId"/></td>
					<td><s:property value="loginPass"/></td>
					<td><s:property value="userName"/></td>
					<td><s:property value="insert_date"/></td>
					<td><s:property value="updated_date"/></td>
					<td><s:property value="adminFlg"/></td>
					<td>
						<a href='<s:url action="UserDetailsAction">
						<s:param name="id" value="%{userId}"/>
						</s:url>'>詳細</a>
					</td>
				</tr>
				</s:iterator>
			</table>
			<s:form action="UserListDeleteConfirmAction">
				<s:submit value="削除"/>
			</s:form>
		</div>
	</div>
</body>
</html>