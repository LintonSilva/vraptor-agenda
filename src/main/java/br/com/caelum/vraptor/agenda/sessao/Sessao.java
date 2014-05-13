package br.com.caelum.vraptor.agenda.sessao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.caelum.vraptor.agenda.model.Usuario;

@SessionScoped
@Named("sessao")
public class Sessao implements Serializable{
	private Usuario usuario;

	public void loga(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public boolean estaLogado() {
		return this.usuario != null;
	}
	
}
