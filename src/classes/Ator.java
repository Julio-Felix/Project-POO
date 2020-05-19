package classes;

import java.util.*;

public class Ator extends Pessoa {

	static ArrayList<Ator> atores = new ArrayList<Ator>();
	private int cod_ator;
	Ator(String name,int Cod) {
		super(name);
		this.cod_ator=Cod;
	}
	public int getCod_ator() {
		return cod_ator;
	}
	public void setCod_ator(int cod_ator) {
		this.cod_ator = cod_ator;
	}
	Ator(String name) {
		super(name);

	}


	static void deletar(String nome) {
		if (atores.size() == 0) {
			System.out.println();
			System.out.println("Nao tem atores....");
		} else {
			for (int i = 0; i < atores.size(); i++) {
				if (atores.get(i).getName().equals(nome)) {
					atores.remove(i);
				}
			}
		}
	}

	public static Ator consultar(int Cod) {
		for (int i = 0; i < atores.size(); i++) {
//			Boolean sdsa = atores.get(i).getName().equals(nome);
//			System.out.println(sdsa);
//			System.out.println("ator get name" + atores.get(i).getName());
			if (atores.get(i).getCod_ator() == Cod) {
				return atores.get(i);
			}
		}
		return null;
	}
	
	

	public void exibir() {
		System.out.println("Nome: " + super.getNome());
		System.out.println("Codigo do Ator: " + this.getCod_ator());
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
