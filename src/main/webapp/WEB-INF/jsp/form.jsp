<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap-3.3.5-dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/index.css">

<title>Cadastro</title>
</head>
<body>
	<header>
		<div class="navbar navbar-default box-shadow">
			<div class="container d-flex justify-content-between">
				<a href="${pageContext.request.contextPath}/index" class="navbar-brand d-flex align-items-center"> <strong>Projetos</strong>
				</a>
			</div>
		</div>
	</header>
	<h1 class="jumbotron-heading">Novo Projeto</h1>
	<div class="form-group">
		<form:form method="POST"
			action="${pageContext.request.contextPath}/novo"
			modelAttribute="projeto">
			<input type="hidden" name="id" value="${projeto.id}"/>
			<label>Nome:</label>
			<form:input path="nomeProjeto" class="form-control" placeholder="Nome" />
			<label>Data de Início:</label>
			<form:input path="dataInicio" class="form-control" placeholder="dd/mm/yyyy"/>
			<label>Data Prevista para Conclusão:</label>
			<form:input path="dataPrevista" class="form-control" placeholder="dd/mm/yyyy" />
			<label>Data da Finalização:</label>
			<form:input path="dataFim" class="form-control" placeholder="dd/mm/yyyy"/>
			<label>Orçamento:</label>
			<form:input path="orcamento" class="form-control" placeholder="R$"/>
			<label>Status:</label>
			<form:select path="status" class="form-control">				
				<form:options items="${status}" itemLabel="descricao" />
			</form:select>
			<label>Risco:</label>
			<form:select path="risco" class="form-control">
				<form:options items="${risco}" itemLabel="descricao" />
			</form:select>
			<label>Gerente:</label>
			<form:select path="gerente" class="form-control">
				<form:option value="${projeto.gerente}" label="nomePessoa"/>
				<form:options items="${funcionarios}" itemLabel="nomePessoa" itemValue="id"/>
			</form:select>
			<label>Descrição:</label>
			<form:textarea class="form-control" path="descricao" maxlength="250" rows ="4" cols="50" paceholder="Descrição do projeto"/>
			<input type="submit" class="btn btn-primary" value="Salvar" />
		</form:form>
	</div>
	<script
		src="${pageContext.request.contextPath}/static/lib/jquery-1.1.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/bootstrap-3.5.5-dist/js/bootstrap.min.js"></script>

</body>
</html>