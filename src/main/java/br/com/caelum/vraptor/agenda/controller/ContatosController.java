package br.com.caelum.vraptor.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.agenda.dao.ContatoDAO;
import br.com.caelum.vraptor.agenda.model.Contato;
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

	public void adicionaForm() {
	}
	
	public void adiciona(Contato contato) {
		
		
		contatos.adiciona(contato);
		result.redirectTo(IndexController.class).index();
	}
	
}





//	@CustomBrutauthRules(LoginRule.class)


//		validator.validate(contato.getNome(), ValidationStrategies.lengthBiggerThan(4l).parameters("nome",4l))
//				.validate(contato.getTelefone(), ValidationStrategies.lengthBiggerThan(4l).parameters("telefone",4l))
//				.onSuccessAddConfirmation("contato.adicionado", contato.getNome())
//				.onErrorRedirectTo(this).adicionaForm();