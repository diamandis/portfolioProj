<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

<title>Projetos</title>
</head>
<body>
	<header>
		<div class="navbar navbar-default box-shadow">
			<div class="container d-flex justify-content-between">
			<ul class="nav navbar-nav">
			<li class="active">
				<a href="${pageContext.request.contextPath}/index"
					class="navbar-brand d-flex align-items-center"> <strong>Projetos</strong>
				</a>
				</li>
				<li><a 
				href="${pageContext.request.contextPath}/novo">Novo Projeto</a>
				</li>
				</ul>
			</div>
		</div>
	</header>

	<main role="main">
	<section class="jumbotron text-center">
		<div class="container">
			<h1 class="jumbotron-heading">Projetos</h1>
		</div>
	</section>

	<div class="album py-5 bg-light">
		<div class="container">			
			<div class="row">
				<c:forEach items="${projetos}" var="i">

					<div class="col-md-4">
						<div class="card mb-4 box-shadow">
							<div class="card-body">
							<a href="${pageContext.request.contextPath}/edit/${i.id}"
									role="button" class="btn btn-default btn-sm">Detalhes</a>
								<h3>${i.nomeProjeto}</h3>
								<p class="card-text">${i.descricao}</p>								
								<div class="d-flex justify-content-between align-items-center">
									<div class="btn-group">
										<span class="label label-primary">${i.status.descricao}</span>
										<span class="label label-info">${i.risco.descricao}</span>
									</div>									
								</div>
								<small class="text-muted">Previsto para: <fmt:formatDate
											pattern="dd-MM-yyyy" value="${i.dataPrevista}" /></small>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>

	</main>
	<script
		src="${pageContext.request.contextPath}/static/lib/jquery-1.1.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/bootstrap-3.5.5-dist/js/bootstrap.min.js"></script>
</body>
</html>