<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Supprimer client</title>
<link rel="stylesheet" href="resources/css/styles.css">
</head>
<body>
	<div class="container">
		<div class="content">
			<h2 style="color: white">Supprimer un client</h2>
			<s:form action="deleteclient">
				<s:textfield label="Code" name="client.code"></s:textfield>
				<s:submit value="Supprimer"></s:submit>
			</s:form>
		</div>
	</div>
</body>
</html>