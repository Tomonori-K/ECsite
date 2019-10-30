<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>BuyItem</title>
</head>
<body>
	<div id="top"></div>
	<div id="main">
		<div id="top"><p>BuyItem</p></div>
		<div>
			<div>
				<s:if test="errorMessage != null">
					<h3><s:property value="errorMessage"/></h3>
				</s:if>
			</div>
			<s:form action="BuyItemAction">
			<table>
				<tr>
					<td>商品名</td>
					<td><s:property value="session.buyItem_name"/></td>
				</tr>
				<tr>
					<td>値段</td>
					<td><s:property value="session.buyItem_price"/><span>円</span></td>
				</tr>
				<tr>
					<td>購入個数</td>
					<td>
						<select name="count">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>支払い方法</td>
					<td><input type="radio" name="pay" value="1" checked="checked">現金払い
						<input type="radio" name="pay" value="2">クレジットカード
					</td>
				</tr>
				<tr>
					<s:submit value="購入"/>
				</tr>
			</table>
			</s:form>
			<br/>
			<div>
				<p>前画面に戻る場合は
				<a href='<s:url action="LoginAction"/>'>こちら</a></p>
				<p>マイページは
				<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
			</div>
		</div>
	</div>
</body>
</html>