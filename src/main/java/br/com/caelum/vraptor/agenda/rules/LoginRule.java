package br.com.caelum.vraptor.agenda.rules;

import javax.inject.Inject;

import br.com.caelum.brutauth.auth.rules.CustomBrutauthRule;
import br.com.caelum.vraptor.agenda.sessao.Sessao;

public class LoginRule implements CustomBrutauthRule{

	private Sessao sessao;

	/**
	 * @deprecated CDI eyes only
	 */
	public LoginRule() {
	}
	
	@Inject
	public LoginRule(Sessao sessao) {
		this.sessao = sessao;
	}
	
	public boolean isAllowed() {
		return sessao.estaLogado();
	}
	
}
