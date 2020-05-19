package classes;

import java.util.ArrayList;
import java.util.ListIterator;

public class Usuario extends Pessoa implements Operacoes {

	String email;
	ArrayList <Midias> favs = new ArrayList <Midias> ();
	static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	public Usuario(String name, String email) {
		super(name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Midias> getFavs() {
		return favs;
	}

	public void setFavs(ArrayList<Midias> favs) {
		this.favs = favs;
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(Usuario usuario) {
		Usuario.usuarios.add(usuario);
	}

	void inserir_favs(Midias m) {
		this.favs.add(m);
	}

	void deletar_favs(String titulo) {
		for (Midias Midias : this.favs) {
			if (Midias!= null && Midias.getTitulo() == titulo) {
				this.favs.remove(Midias);
			}
		}
	}

	void listar_favs() {
		for (Midias Midias : this.favs) {
	System.out.println("Codigo do Filme : " + Midias.getCod_titulo());
			System.out.println("Tipo da Midias : " + Midias.getTipo() );
			System.out.println("Titulo do Filme : " + Midias.getTitulo());
			System.out.println("------------------------------------------------------------" );
}
	}

	static void deletar (String email) {
		if (usuarios.size() == 0) {
			System.out.println();
			System.out.println("Nao tem usuarios....");
		} else {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getEmail().equals(email)) {
				usuarios.remove(i);
				System.out.println("Excluido Usuario: "+email);
			}
		}
		}
		
	}
	public void exibir() {
		System.out.println("Nome: " + this.nome);
	}
	public static String consultar(String email ) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getEmail().equals(email)) {
				return usuarios.get(i).getEmail();
			}
		}
		return "Nao encontrado";
	}

	static void listar() {
		ListIterator<Usuario> vs = usuarios.listIterator();

		if (vs.hasNext()) {
		while (vs.hasNext()) {

			Usuario m = vs.next();
			System.out.println("-------------------");
			m.exibir();

		}
		}
		else {
		System.out.println("Não tem mais usuarios");
		}

	}

	@Override
	public void Avaliar(int codigo, double estrelas) {
		Midias med = Midias.consultar(codigo);
		if (med != null){
			med.setRating(estrelas);
		}
	}
	

	@Override
	public void Favoritar(Midias midia) {
		this.favs.add(midia);
    	System.out.println("SEU FILME FOI ADICIONADO AOS FAVORITOS");

	}

	
}




