package br.com.caelum.vraptor.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.agenda.dao.ContatoDAO;

@Controller
public class IndexController {

	private final Result result;
	private final ContatoDAO contatos;

	/**
	 * @deprecated CDI eyes only
	 */
	public IndexController() {
		this(null, null);
	}
	
	@Inject
	public IndexController(Result result, ContatoDAO contatos) {
		this.result = result;
		this.contatos = contatos;
	}
	
	@Path("/")
	public void index() {
		result.include("contatos", contatos.todos());
	}
	
	@Path("/cheat")
	public void cheatSheet() {
	}
}