package br.com.caelum.vraptor.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.agenda.model.Usuario;
import br.com.caelum.vraptor.agenda.sessao.Sessao;

@Controller
public class UsuariosController {

	private final Sessao sessao;
	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	public UsuariosController() {
		this(null, null);
	}
	
	@Inject
	public UsuariosController(Sessao sessao, Result result){
		this.sessao = sessao;
		this.result = result;
	}
	
	public void loginForm() {
	}
	
	public void login(Usuario usuario) {
		sessao.loga(usuario);
		result.redirectTo(IndexController.class).index();
	}
}
