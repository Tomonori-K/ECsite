<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemCreateConfirm画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top"><p>ItemCreateConfirm</p></div>
		<div>
			<h3>登録する内容は以下の通りでよろしいでしょうか。</h3>
			<s:form action="ItemCreateCompleteAction">
			<table>
				<tr>
					<td>商品名：</td>
					<td><s:property value="session.itemName"/></td>
				</tr>
				<tr>
					<td>値段：</td>
					<td><s:property value="session.itemPrice"/><span>円</span></td>
				</tr>
				<tr>
					<td>在庫：</td>
					<td><s:property value="session.itemStock"/><span>個</span></td>
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