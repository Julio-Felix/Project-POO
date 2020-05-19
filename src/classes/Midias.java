package classes;
import java.util.*;

public class Midias {
	
	private String titulo;
	private int cod_titulo;
	private String genero;
	private String tipo;
	private double rating;
	private ArrayList<Ator> ator = new ArrayList<Ator>();
	private static ArrayList<Midias> medias = new ArrayList<Midias>();
	
	Midias(){
		
	}
	Midias(int cod, String tipo, double rating, String genero, String titulo){
		this.cod_titulo = cod;
		this.tipo = tipo;
		this.genero = genero;
		this.titulo = titulo;
		this.rating = rating;
	}
	

	public void exibir() {

			System.out.println("Codigo do Filme : " + cod_titulo);
			System.out.println("Tipo da midia : " + tipo );
			System.out.println("Titulo do Filme : " + titulo);
			System.out.println("Codigo do Filme : " + genero);

		
	}
	
	
	/* public void inserir(Midias m) {
		System.out.println("Inserindo uma Midia");
	}
	*/

	/* public static void excluir(String titulo) {
		for (int i = 0; i < medias.size(); i++) {
			if (medias.get(i) != null && medias.get(i).getTitulo() == titulo) {
				medias.remove(i);
			}
		}
	} */

	public static void excluir(int cod) {
		if (medias.size() == 0) {
			System.out.println();
			System.out.println("Nao tem midias....");
		} else {
		for (int i = 0; i < medias.size(); i++) {
			if (medias.get(i) != null && medias.get(i).cod_titulo == cod) {
				medias.remove(i);
				System.out.println("Excluido codigo: "+cod);
			}
		}
		}
	}

	/* public static int consultar(String titulo) {
		for (int i = 0; i < medias.size(); i++) {
			if (medias.get(i) != null && medias.get(i).getTitulo() == titulo) {
				return medias.get(i).getCod_titulo();
			}
		}
		return 0;
	}
	*/

	 public static Midias consultar(int cod ) {
		 
		for (int i = 0; i < medias.size(); i++) {
			if (medias.get(i).getCod_titulo() == cod) {
				return medias.get(i);
			}
		}
		return null;
	}

	
	static public void listar() {
		ListIterator<Midias> vs = medias.listIterator();
		if (vs.hasNext()) {
		while (vs.hasNext()) {

			Midias m = vs.next();
			System.out.println("-------------------");
			m.exibir();

		}
		}		

		else {
		System.out.println("Não tem mais usuarios");
		}
	}
	
	
	
	//   get & set ------------------------------------------------------
	
	
	

	public String getTitulo() {
		return titulo;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCod_titulo() {
		return cod_titulo;
	}

	public void setCod_titulo(int cod_titulo) {
		this.cod_titulo = cod_titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String isTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<Ator> getAtor() {
		return ator;
	}

	public void setAtor(ArrayList<Ator> ator) {
		this.ator = ator;
	}

	public ArrayList<Midias> getMidia() {
		return medias;
	}

	public static void setMidia(Midias midias) {
		medias.add(midias);
	}	
	
	
	
	

}




