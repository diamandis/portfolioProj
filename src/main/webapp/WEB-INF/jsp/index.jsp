<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/static/bootstrap-3.5.5-dist/css/bootstrap.min.css">

    <title>Projetos</title>
  </head>
  <body>
  <header>     
      <div class="navbar navbar-dark bg-dark box-shadow">
        <div class="container d-flex justify-content-between">
          <a href="#" class="navbar-brand d-flex align-items-center">
            <strong>Projetos</strong>
          </a>          
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
		<c:forEach items="${projetos}" var="i">
          <div class="row">
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <div class="card-body">
                  <p class="card-text">${i.nomeProjeto}</p>
                  <p class="card-text">${i.descricao}</p>                  
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>
            </div>
            </c:forEach>
            </div>
            </div>
            <section>
            	<div>
            		<a href="${pageContext.request.contextPath}/novo">Novo Projeto</a>
            	</div>
            </section>
            
    </main>
    <script src="/static/lib/jquery-1.1.1.min.js"></script>
    <script src="/static/bootstrap-3.5.5-dist/js/bootstrap.min.js"></script>
  </body>
</html>