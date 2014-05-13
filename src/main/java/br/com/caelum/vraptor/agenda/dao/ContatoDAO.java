package br.com.caelum.vraptor.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.caelum.vraptor.agenda.model.Contato;

@ApplicationScoped
public class ContatoDAO {

	private List<Contato> contatos = new ArrayList<>();
	
	public ContatoDAO() {
		contatos.add(new Contato("Leonardo", "912378909", "leo@leo.com"));
		contatos.add(new Contato("Guilherme", "912342351", "gui@gui.com"));
		contatos.add(new Contato("João", "973458909", "joao@joao.com"));
		contatos.add(new Contato("Pablo", "923781238", "pablo@pablo.com"));
	}
	
	public List<Contato> todos() {
		return contatos;
	}

	public void adiciona(Contato contato) {
		contatos.add(contato);
	}

}
