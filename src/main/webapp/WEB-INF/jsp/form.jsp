<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Novo Projeto</h1>
	<form:form method="POST"
		action="${pageContext.request.contextPath}/salvar"
		modelAttribute="projeto">
		<label>Nome:</label>
		<form:input path="projeto.nomeProjeto" />
		<label>Data de Início:</label>
		<form:input path="projeto.dataInicio" />
		<label>Data Prevista para Conclusão:</label>
		<form:input path="projeto.dataPrevista" />
		<label>Data da Finalização:</label>
		<form:input path="projeto.dataFim" />
		<label>Orçamento:</label>
		<form:input path="projeto.orcamento" />
		<label>Status:</label>
		<form:select path="projeto.status" />
		<label>Risco:</label>
		<form:select path="projeto.risco">
			<form:option value="projeto.risco" />
			<form:options items="${risco}" />
		</form:select>
		<label>Gerente:</label>
		<form:select path="projeto.gerente">
			<form:option value="projeto.gerente.nomePessoa" />
			<form:options items="${funcionarios}" />
		</form:select>






		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>