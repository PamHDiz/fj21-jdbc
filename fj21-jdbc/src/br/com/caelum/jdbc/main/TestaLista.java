package br.com.caelum.jdbc.main;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		
		List<Contato> listaContatos = dao.getLista();
		
		for(Contato contato : listaContatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endere?o: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + 
					contato.getDataNascimento().getTime() + "\n");
		}

	}

}
