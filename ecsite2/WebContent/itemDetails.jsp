<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>itemDetails画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>itemDetails</p></div>
		<div>
			<table border="1">
			<tr>
				<td>id</td>
				<td>item_name</td>
				<td>item_price</td>
				<td>item_stock</td>
				<td>insert_date</td>
				<td>update_date</td>
			</tr>
			<s:iterator value="itemInfoDTOList">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="itemName"/></td>
				<td><s:property value="itemPrice"/></td>
				<td><s:property value="itemStock"/></td>
				<td><s:property value="insert_date"/></td>
				<td><s:property value="update_date"/></td>
			</tr>
			</s:iterator>

			</table>
			<br>
			<s:form action="ItemDeleteConfirmAction">
				<s:hidden name="id" value="%{id}"/>
				<s:submit value="削除"/>
			</s:form>
		</div>
	</div>
</body>
</html>