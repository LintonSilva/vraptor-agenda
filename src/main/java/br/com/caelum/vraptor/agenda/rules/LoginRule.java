package br.com.caelum.vraptor.agenda.rules;

import javax.inject.Inject;

import br.com.caelum.brutauth.auth.rules.CustomBrutauthRule;
import br.com.caelum.vraptor.agenda.sessao.Sessao;

public class LoginRule implements CustomBrutauthRule{

	@Inject	private Sessao sessao;

	public boolean isAllowed() {
		return sessao.estaLogado();
	}
	
}
