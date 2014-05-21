package br.com.caelum.vraptor.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.agenda.dao.ContatoDAO;
import br.com.caelum.vraptor.agenda.model.Contato;

@Controller
public class ContatosController {

	@Inject
	private Result result;
	@Inject
	private ContatoDAO contatos;
	
	public void adicionaForm() {
	}
	
	public void adiciona(Contato contato) {
		contatos.adiciona(contato);
		result.redirectTo(IndexController.class).index();
	}
	
}











//	@CustomBrutauthRules(LoginRule.class)

//	@Inject
//	private SimpleValidator validator;

//		validator.validate(contato.getNome(), lengthBiggerThan(4l).parameters("nome", 4l))
//				.onSuccessAddConfirmation("contato.adicionado", contato.getNome())
//				.onErrorRedirectTo(this).adicionaForm();