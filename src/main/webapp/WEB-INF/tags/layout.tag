<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@attribute name="title" required="true"%>
<!doctype html>
<html class="no-js" lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Foundation | Welcome</title>
    <link rel="stylesheet" href="<c:url value='/css/normalize.css'/>" />
    <link rel="stylesheet" href="<c:url value='/css/foundation.css'/>" />
    <link rel="stylesheet" href="<c:url value='/css/custom.css'/>" />
    <script src="<c:url value='/js/vendor/modernizr.js'/>"></script>
  </head>
  <body>
	<nav class="top-bar" data-topbar>
		<ul class="title-area">
			<li class="name">
				<h1><a href="${linkTo[IndexController].index()}">Agenda</a></h1>
			</li>
			<li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
		</ul>
		<section class="top-bar-section">
			<ul class="left">
	  			<li class="has-form">
	  				<a class="button" href="${linkTo[ContatosController].adicionaForm()}">Adicionar</a>
  				</li>
			</ul>
			<c:if test="${!sessao.estaLogado()}">
				<ul class="right">
		  			<li class="has-form">
		  				<a class="button" href="${linkTo[UsuariosController].loginForm()}">Login</a>
	  				</li>
				</ul>
			</c:if>
		</section>
	</nav>
	<div class="row">
		<div class="large-12 columns">
	        <h1>${title}</h1>
			<hr>
		    <ul>
		        <c:forEach var="error" items="${errors}">
		            <li data-alert class="close alert-box alert">${error.message}</li>
		        </c:forEach>
		        
		        <c:forEach var="confirmation" items="${confirmations}">
		            <li data-alert class="close alert-box success">${confirmation.message}</li>
		        </c:forEach>
		    </ul>
			<jsp:doBody/>
		</div>	
	</div>
	
	    
    <script src="<c:url value='/js/vendor/jquery.js'/>"></script>
    <script src="<c:url value='/js/foundation.min.js'/>"></script>
    <script>
      $(document).foundation();
    </script>
  </body>
</html>
