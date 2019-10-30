<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>ItemCreate</p></div>
		<div>
			<s:if test="errorMessage == ''">
				<s:property value="errorMessage"/>
			</s:if>
				<h3>登録する情報を入力してください</h3>
				<s:form action="ItemCreateConfirmAction">
					<tr>
						<td>商品名：</td>
						<td><input type="text" name="itemName"></td>
					</tr>
					<tr>
						<td>値段：</td>
						<td><input type="text" name="itemPrice"></td>
					</tr>
					<tr>
						<td>在庫：</td>
						<td><input type="text" name="itemStock"></td>
					</tr>
					<tr>
						<td><s:submit value="登録"/></td>
					</tr>
				</s:form>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>