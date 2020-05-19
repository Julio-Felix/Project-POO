package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main (String[] args) {
		int num1 = 0;
			System.out.print("Ol, ");
		while (num1 != 6) {
			System.out.println("Digite: \n 1 para adicionar,\n 2 para buscar, \n 3 para remover, \n 4 para exibir, \n 5 para avaliar, \n 6 para sair");
			Scanner sc1 = new Scanner(System.in);
			num1 = sc1.nextInt();
		
			if (num1 == 1) {
				System.out.println();
				System.out.println("...Adicionar...");
				System.out
						.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
				int num2 = 0;
				num2 = sc1.nextInt();
				while (num2 != 4) {
					if (num2 == 1) {
						System.out.println();
						System.out.println("Digite o nome do ator");
						sc1.nextLine();
						String name = sc1.nextLine();
						Ator ator = new Ator(name);
						Ator.setAtores(ator);
						System.out.println("\nOkay");
						System.out.println();
						System.out.println("...Adicionar...");
						System.out
							.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num2 = sc1.nextInt();
					}
					if (num2 == 2) {
						System.out.println();
						System.out.println("Digite o nome");
						sc1.nextLine();
						String name = sc1.nextLine();
						System.out.println();
						System.out.println("Digite o email");
						sc1.nextLine();
						String email = sc1.nextLine();
						
						Usuario user = new Usuario(name,email);
						Usuario.setUsuarios(user);
						System.out.println("\nOkay");
						
						System.out.println();
						System.out.println("...Adicionar...");
						System.out
							.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num2 = sc1.nextInt();
					}
					if (num2 == 3) {
						System.out.println();
						System.out.println("Digite o titulo");
						sc1.nextLine();
						String titulo = sc1.nextLine();
						Midias midia1 = new Midias ();
						midia1.setTitulo(titulo);
						System.out.println();
						System.out.println("Digite o codigo");
						int codigo = sc1.nextInt();
						midia1.setCod_titulo(codigo);
						
						Midias.setMidia(midia1);
						System.out.println("\nOkay");

						System.out.println();
						System.out.println("...Adicionar...");
						System.out
							.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num2 = sc1.nextInt();
					}
					if (num2 < 1 || num2 > 4) {
						System.out.println();
						System.out.println("Numero invalido!");
						System.out.println();
						System.out.println("...Adicionar...");
						System.out
							.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num2 = sc1.nextInt();
					}
				}
			}

			if (num1 == 2) {
				System.out.println();
				System.out.println("...Buscar...");
				System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
				int num3 = 0;
				num3 = sc1.nextInt();
				while (num3 != 4) {
					if (num3 == 1) {
						System.out.println();
						System.out.println("Digite o nome do ator");
						sc1.nextLine();
						String name = sc1.nextLine();
						System.out.println(Ator.consultar(name));
						System.out.println();
						System.out.println("...Buscar...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
					if (num3 == 2) {
						System.out.println();
						System.out.println("Digite Email do usuario");
						sc1.nextLine();
						String email = sc1.nextLine();
						System.out.println(Usuario.consultar(email));
						System.out.println();
						System.out.println("...Buscar...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
					if (num3 == 3) {
						System.out.println();
						System.out.println("Digite o codigo");
						int cod = sc1.nextInt();
						Midias med = Midias.consultar(cod);
						if(med != null) {
							med.exibir();
						}else {
							System.out.println("Não encontrado");
						}
						System.out.println();
						System.out.println("...Buscar...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
					if (num3 < 1 || num3 > 4) {
						System.out.println();
						System.out.println("Numero invalido!");
						System.out.println();
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
				}
			}
			if (num1 == 3) {
				System.out.println("...Remover...");
				System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
				int num3 = 0;
				num3 = sc1.nextInt();
				while (num3 != 4) {
					if (num3 == 1) {
						System.out.println();
						System.out.println("Digite o nome do ator");
						sc1.nextLine();
						String name = sc1.nextLine();
						Ator.deletar(name);
						System.out.println();
						System.out.println("...Remover...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
					if (num3 == 2) {
						System.out.println();
						System.out.println("Digite email do usuario");
						sc1.nextLine();
						String email = sc1.nextLine();
						Usuario.deletar(email);
						System.out.println();
						System.out.println("...Remover...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
					if (num3 == 3) {
						System.out.println();
						System.out.println("Digite o codigo");
						int cod = sc1.nextInt();
						Midias.excluir(cod);
						System.out.println();
						System.out.println("...Remover...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
					if (num3 < 1 || num3 > 4) {
						System.out.println();
						System.out.println("Numero invalido!");
						System.out.println();
						System.out.println("...Remover...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
				}
			}
			if (num1 == 4) {
				System.out.println("...Listar...");
				System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
				int num3 = 0;
				num3 = sc1.nextInt();
				while (num3 != 4) {
					if (num3 == 1) {
						System.out.println();
						System.out.println("Listando atores");
						Ator.listar();
						System.out.println();
						System.out.println("...Listar...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
					if (num3 == 2) {
						System.out.println();
						System.out.println("Listando usuarios");
						Usuario.listar();
						System.out.println();
						System.out.println("...Listar...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
					if (num3 == 3) {
						System.out.println();
						System.out.println("Listando midias");
						Midias.listar();
						System.out.println();
						System.out.println("...Listar...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
					if (num3 < 1 || num3 > 4) {
						System.out.println();
						System.out.println("Numero invalido!");
						System.out.println();
						System.out.println("...Listar...");
						System.out.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num3 = sc1.nextInt();
					}
				}
			}
			if (num1 == 5) {
				System.out.println("Digite 1 para AVALIAR, 2 para EXIBIR os filmes e suas avaliações, 3 para SAIR");
				int num4 = sc1.nextInt();
				while (num4 != 3) {
					if (num4 == 1) {
						System.out.print("DIGITE O CODIGO FILME A SER PROCURADO:");
						int codigo = sc1.nextInt();
			    	    System.out.println("QUANTAS ESTRELAS DESEJA ADICIONAR A ESSE FILME?");
			    	    double estrelas = sc1.nextDouble();
			    	    Usuario usu = new Usuario (null, null);
			    	    usu.Avaliar(codigo, estrelas);
					}
				} 

			if (num1 < 1 || num1 > 6) {
				System.out.println("numero invalido");
			}
		}
	}

	}
}




