<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter client</title>
<link rel="stylesheet" href="resources/css/styles.css">
</head>
<body>
	<div class="container">
		<div class="content">
			<h2 style="color: white">Ajouter un client</h2>
			<s:form action="addclient">
				<s:textfield label="Code" name="client.code"></s:textfield>
				<s:textfield label="Nom" name="client.nom"></s:textfield>
				<s:textfield label="Prenom" name="client.prenom"></s:textfield>
				<s:textfield label="Age" name="client.age"></s:textfield>
				<s:textfield label="Ville" name="client.ville"></s:textfield>
				<s:submit value="Ajouter"></s:submit>
			</s:form>
		</div>
	</div>
</body>
</html>