<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>userDetails画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>userDetails</p></div>
		<div>
			<s:if test="userInfoDTOList == null">
				<h3>ユーザー情報がありません</h3>
			</s:if>
			<s:elseif test="message == null">
			<h3>ユーザー情報は以下になります</h3>
			<table border="1">
			<tr>
				<td>id</td>
				<td>login_id</td>
				<td>login_pass</td>
				<td>user_name</td>
				<td>insert_date</td>
				<td>update_date</td>
				<td>admin_flg</td>
			</tr>
			<s:iterator value="userInfoDTOList">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="loginId"/></td>
				<td><s:property value="loginPass"/></td>
				<td><s:property value="userName"/></td>
				<td><s:property value="insert_date"/></td>
				<td><s:property value="updated_date"/></td>
				<td><s:property value="adminFlg"/></td>
			</tr>
			</s:iterator>
			</table>
			<br>
			<s:form action="UserDeleteConfirmAction">
				<s:hidden name="loginId" value="%{userInfoDTOList.get(0).loginId}"/>
				<s:submit value="削除"/>
			</s:form>
			</s:elseif>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>