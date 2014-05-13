<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<tags:layout title="Minha Agenda">
	<h5>Contatos:</h5>
	<table width="100%">
	  <thead>
	    <tr>
	      <th>Nome</th>
	      <th>Telefone</th>
	      <th>Email</th>
	    </tr>
	  </thead>
	  <tbody>
		<c:forEach items="${contatos}" var="contato">
		    <tr>
		      <td>${contato.nome}</td>
		      <td>${contato.telefone}</td>
		      <td>${contato.email}</td>
		    </tr>
		</c:forEach>
	  </tbody>
	</table>
</tags:layout>
