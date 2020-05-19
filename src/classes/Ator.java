package classes;

import java.util.*;

public class Ator extends Pessoa {

	static ArrayList<Ator> atores = new ArrayList<Ator>();

	Ator(String name) {
		super(name);

	}

	static void deletar(String nome) {
		if (atores.size() == 0) {
			System.out.println();
			System.out.println("Nao tem atores...");
		} else {
			for (int i = 0; i < atores.size(); i++) {
				if (atores.get(i).getName().equals(nome)) {
					atores.remove(i);
				}
			}
		}
	}

	public static String consultar(String nome) {
		for (int i = 0; i < atores.size(); i++) {
//			Boolean sdsa = atores.get(i).getName().equals(nome);
//			System.out.println(sdsa);
//			System.out.println("ator get name" + atores.get(i).getName());
			if (atores.get(i).getName().equals(nome)) {
				return atores.get(i).getName();
			}
		}
		return "Nao encontrado";
	}

	public void exibir() {
		System.out.println("Nome: " + super.getNome());
	}

	static void listar() {
		ListIterator<Ator> vs = atores.listIterator();

		if (vs.hasNext()) {
		while (vs.hasNext()) {

			Ator m = vs.next();
			System.out.println("-------------------");
			m.exibir();

		}
		}		

		else {
		System.out.println("Não tem mais usuarios");
	}
	}

	public String getName() {
		return this.nome;
	}

	public void setName(String name) {
		super.setNome(name);
	}

	public static ArrayList<Ator> getAtores() {
		return atores;
	}

	public static void setAtores(Ator ator) {

		atores.add(ator);
	}

}
