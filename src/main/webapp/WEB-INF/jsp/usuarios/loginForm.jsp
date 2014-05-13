<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<tags:layout title="Logar">
	<form method="POST">
		<div class="row">
			<div class="large-6 medium-6 columns">
				<label>Login</label>
				<input name="usuario.login" type="text" placeholder="digite seu login"  value="${usuario.login}" />
			</div>
			<div class="large-6 medium-6 columns">
				<label>Senha</label>
				<input  name="usuario.senha" type="password" placeholder="digite sua senha"/>
			</div>
		</div>
		<input type="submit" class="medium success button" value="Entrar"/>
	</form>
</tags:layout>
