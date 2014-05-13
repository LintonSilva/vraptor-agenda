<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<tags:layout title="Novo contato">
	<form method="POST">
		<div class="row">
			<div class="large-12 columns">
				<label>Nome</label>
				<input name="contato.nome" type="text" placeholder="nome do contato" value="${contato.nome}"/>
			</div>
		</div>
		<div class="row">
			<div class="large-6 medium-6 columns">
				<label>Telefone</label>
				<input name="contato.telefone" type="text" placeholder="telefone do contato"  value="${contato.telefone}" />
			</div>
			<div class="large-6 medium-6 columns">
				<label>Email</label>
				<input  name="contato.email" type="text" placeholder="email do contato"  value="${contato.email}"/>
			</div>
		</div>
		<input type="submit" class="medium success button" value="Cadastrar"/>
	</form>
</tags:layout>
