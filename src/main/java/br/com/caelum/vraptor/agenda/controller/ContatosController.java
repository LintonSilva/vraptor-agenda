package br.com.caelum.vraptor.agenda.controller;

import static br.com.caelum.vraptor.simplevalidator.ValidationStrategies.notEmptyNorNull;

import javax.inject.Inject;

import br.com.caelum.brutauth.auth.annotations.CustomBrutauthRules;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.agenda.dao.ContatoDAO;
import br.com.caelum.vraptor.agenda.model.Contato;
import br.com.caelum.vraptor.agenda.rules.LoginRule;
import br.com.caelum.vraptor.simplevalidator.SimpleValidator;

@Controller
public class ContatosController {

	private final Result result;
	private final ContatoDAO contatos;
	private final SimpleValidator validator;

	/**
	 * @deprecated CDI eyes only
	 */
	public ContatosController() {
		this(null, null, null);
	}
	
	@Inject
	public ContatosController(Result result, ContatoDAO contatos, SimpleValidator validator) {
		this.result = result;
		this.contatos = contatos;
		this.validator = validator;
	}

	@Get("/adiciona-contato")
	@CustomBrutauthRules(LoginRule.class)
	public void adicionaForm() {
	}
	
	@Post("/adiciona-contato")
	public void adiciona(Contato contato) {
		
		validator.validate(contato.getNome(), notEmptyNorNull().key("campo_vazio", "nome"))
				.validate(contato.getTelefone(), notEmptyNorNull().key("campo_vazio", "telefone"))
				.validate(contato.getEmail(), notEmptyNorNull().key("campo_vazio", "email"))
				.onSuccessAddConfirmation("contato.adicionado", contato.getNome())
				.onErrorRedirectTo(this).adicionaForm();
		
		contatos.adiciona(contato);
		result.redirectTo(IndexController.class).index();
	}
	
}