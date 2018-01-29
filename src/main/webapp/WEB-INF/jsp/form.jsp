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
		<form:input path="nomeProjeto" />
		<label>Data de Início:</label>
		<form:input path="dataInicio" />
		<label>Data Prevista para Conclusão:</label>
		<form:input path="dataPrevista" />
		<label>Data da Finalização:</label>
		<form:input path="dataFim" />
		<label>Orçamento:</label>
		<form:input path="orcamento" />
		<label>Status:</label>
		<form:select path="status">
			<form:option value="status" />
			<form:options items="${status}" />
		</form:select>
		<label>Risco:</label>
		<form:select path="risco">
			<form:option value="risco" />
			<form:options items="${risco}" />
		</form:select>
		<label>Gerente:</label>
		<form:select path="gerente">
			<form:option value="gerente.nomePessoa" />
			<form:options items="${funcionarios}" />
		</form:select>
		<input type="submit" value="Salvar" />
	</form:form>
</body>
</html>