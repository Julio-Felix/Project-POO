package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main (String[] args) {
		int num1 = 0;
		while (num1 != 6) {
			System.out.println("1 para adicionasrasd, 2 para buscar, 3 para remover, 4 para exibir, 5 para avaliar, 6 para sair");
			Scanner sc1 = new Scanner(System.in);
			num1 = sc1.nextInt();
		
			if (num1 == 1) {
				System.out
						.println("digite 1 para adicionar ator, 2 para usuario, 3 para adicionar midias, 4 para sair");
				int num2 = 0;
				num2 = sc1.nextInt();
				while (num2 != 4) {
					if (num2 == 1) {
						System.out.println("Digite o nome do ator");
						sc1.nextLine();
						String name = sc1.nextLine();
						Ator ator = new Ator(name);
						Ator.setAtores(ator);
						System.out.println(
								"digite 1 para adicionar ator, 2 para usuario, 3 para adicionar midias, 4 para sair");
						num2 = sc1.nextInt();
					}
					if (num2 == 2) {
						System.out.println("Digite o nome");
						sc1.nextLine();
						String name = sc1.nextLine();
						System.out.println("Digite o email");
						sc1.nextLine();
						String email = sc1.nextLine();
						
						Usuario user = new Usuario(name,email);
						Usuario.setUsuarios(user);
						
						System.out.println(
								"digite 1 para adicionar ator, 2 para usuario, 3 para adicionar midias, 4 para sair");
						num2 = sc1.nextInt();
					}
					if (num2 == 3) {
						System.out.println("Digite o titulo");
						sc1.nextLine();
						String titulo = sc1.nextLine();
						Midias midia1 = new Midias ();
						midia1.setTitulo(titulo);
						System.out.println("Digite o codigo");
						int codigo = sc1.nextInt();
						midia1.setCod_titulo(codigo);
						
						Midias.setMidia(midia1);
						
						System.out.println(
								"digite 1 para adicionar ator, 2 para usuario, 3 para adicionar midias, 4 para sair");
						num2 = sc1.nextInt();
					}
					if (num2 < 1 || num2 > 4) {
						System.out.println("numero invalido");
						System.out.println(
								"digite 1 para adicionar ator, 2 para usuario, 3 para adicionar midias, 4 para sair");
						num2 = sc1.nextInt();
					}
				}
			}

			if (num1 == 2) {
				System.out.println("digite 1 para buscar ator, 2 para usuario, 3 para midias, 4 para sair");
				int num3 = 0;
				num3 = sc1.nextInt();
				while (num3 != 4) {
					if (num3 == 1) {
						System.out.println("Digite o nome do ator");
						sc1.nextLine();
						String name = sc1.nextLine();
						System.out.println(Ator.consultar(name));
						System.out.println("digite 1 para buscar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 2) {
						System.out.println("Digite Email do usuario");
						sc1.nextLine();
						String email = sc1.nextLine();
						System.out.println(Usuario.consultar(email));
						System.out.println("digite 1 para buscar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 3) {
						System.out.println("Digite o codigo");
						int cod = sc1.nextInt();
						Midias med = Midias.consultar(cod);
						if(med != null) {
							med.exibir();
						}else {
							System.out.println("Não encontrado");
						}
						
						System.out.println("digite 1 para buscar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 < 1 || num3 > 4) {
						System.out.println("numero invalido");
						System.out.println("digite 1 para buscar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
				}
			}
			if (num1 == 3) {
				System.out.println("digite 1 para remover ator, 2 para usuario, 3 para midias, 4 para sair");
				int num3 = 0;
				num3 = sc1.nextInt();
				while (num3 != 4) {
					if (num3 == 1) {
						System.out.println("Digite o nome do ator");
						sc1.nextLine();
						String name = sc1.nextLine();
						Ator.deletar(name);
						System.out.println("digite 1 para remover ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 2) {
						System.out.println("Digite email do usuario");
						sc1.nextLine();
						String email = sc1.nextLine();
						Usuario.deletar(email);
						System.out.println("Excluido Usuario: "+email);
						System.out.println("digite 1 para remover ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 3) {
						System.out.println("Digite o codigo");
						int cod = sc1.nextInt();
						Midias.excluir(cod);
						System.out.println("Excluido codigo: "+cod);
						System.out.println("digite 1 para remover ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 < 1 || num3 > 4) {
						System.out.println("numero invalido");
						System.out.println("digite 1 para remover ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
				}
			}
			if (num1 == 4) {
				System.out.println("digite 1 para exibir ator, 2 para usuario, 3 para midias, 4 para sair");
				int num3 = 0;
				num3 = sc1.nextInt();
				while (num3 != 4) {
					if (num3 == 1) {
						System.out.println("exibir Ator");
						Ator.listar();
						System.out.println("digite 1 para exibir ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 2) {
						System.out.println("exibir usuario");
						Usuario.listar();
						System.out.println("digite 1 para exibir ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 3) {
						System.out.println("exibir midia");
						Midias.listar();
						System.out.println("digite 1 para exibir ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 < 1 || num3 > 4) {
						System.out.println("numero invalido");
						System.out.println("digite 1 para exibir ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
				}
			}
			if (num1 == 5) {
				System.out.print("DIGITE O FILME A SER PROCURADO:");
				int codigo = sc1.nextInt();
	    	    System.out.println("QUANTAS ESTRELAS DESEJA ADICIONAR A ESSE FILME?");
	    	    double estrelas = sc1.nextDouble();
	    	    Usuario usu = new Usuario (null, null);
	    	    usu.Avaliar(codigo, estrelas);

			if (num1 < 1 || num1 > 6) {
				System.out.println("numero invalido");
			}
		}
	}

	}
}




