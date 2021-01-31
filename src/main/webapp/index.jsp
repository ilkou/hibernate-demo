<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accueil</title>
<link rel="stylesheet" href="resources/css/styles.css">
</head>
<body>
	<div class="nav">
		<ul>
			<li class="index"><a class="active" href="index">Accueil</a></li>
			<li class="ajouter"><a href="ajouter">Ajouter</a></li>
			<li class="supprimer"><a href="supprimer">Supprimer</a></li>
			<li class="modifier"><a href="modifier">Modifier</a></li>
		</ul>
		<table>
			<tr>
				<td>Code</td>
				<td>Nom</td>
				<td>Prenom</td>
				<td>Age</td>
				<td>Ville</td>
			</tr>

			<s:iterator value="clients">
				<tr>
					<td><s:property value="code" /></td>
					<td><s:property value="nom" /></td>
					<td><s:property value="prenom" /></td>
					<td><s:property value="age" /></td>
					<td><s:property value="ville" /></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>