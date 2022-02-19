package br.com.caelum.jdbc.main;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("João das Neves");
		contato.setEmail("joaodasneves@jao.com.br");
		contato.setEndereco("Rua Winterfell 111 apto 133b");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado");
	}

}
