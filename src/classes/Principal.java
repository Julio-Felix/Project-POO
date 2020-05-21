package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main (String[] args) {
		int num1 = 0;
			System.out.print("Ola, ");
		while (num1 != 7) {
			System.out.println("Digite: \n 1 para adicionar,\n 2 para buscar, \n 3 para remover, \n 4 para exibir, \n 5 para Avaliar, \n 6 para Favoritar, \n 7 para sair");
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
						System.out.println("Digite o Codigo do ator em numero Inteiro");
						int cod = sc1.nextInt();
						Ator ator = new Ator(name,cod);
						Ator.setAtores(ator);
						System.out.println("\nCerto");
						System.out.println();
						System.out.println("...Adicionar...");
						System.out
							.println("Digite: \n 1 para ATOR, \n 2 para USUARIO, \n 3 para MIDIAS, \n 4 para SAIR");
						num2 = sc1.nextInt();
					}
					if (num2 == 2) {
						sc1.nextLine();
						System.out.println("Digite o nome");
						String name = sc1.nextLine();
						System.out.println();
						System.out.println("Digite o email");
						String email = sc1.next();
						
						Usuario user = new Usuario(name,email);
						Usuario.setUsuarios(user);
						System.out.println("\nCerto");
						
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
						System.out.println("\nCerto, Deseja Adicionar Atores? Digite 1 para sim e 2 para não");
						int choose = sc1.nextInt();
						if(choose == 1) {
							while(choose == 1) {
								System.out.println();
								System.out.println("Digite o Codigo do ator em numero Inteiro");
								int cod = sc1.nextInt();
								Ator ator = Ator.consultar(cod);
								midia1.addAtor(ator);
								System.out.println("Deseja Continuar Adicionar Atores? Digite 1 para sim 2 para não");
								choose = sc1.nextInt();
							}
						}
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
						System.out.println("Digite o Codigo do ator");
						int cod = sc1.nextInt();
						Ator ator = Ator.consultar(cod);
						ator.exibir();
//						System.out.println(ator.getName());
//						System.out.println(ator.getCod_ator());
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
						Usuario.consultar(email).exibir();
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
				System.out.println();
				System.out.println("Digite \n 1 para CONTINUAR, \n 2 para SAIR");
				int num4 = sc1.nextInt();
				while (num4 != 2) {
					if (num4 == 1) {
						System.out.println();
						System.out.print("Digite o codigo do filme a ser avaliado:");
						int codigo = sc1.nextInt();
						System.out.println();
			    	    System.out.println("Quantas estrelas deseja adicionar para o filme?");
			    	    double estrelas = sc1.nextDouble();
						System.out.println();
			    	    System.out.println("Digite o email do Usuário que está avaliando essa Midia:");
			    	    String email = sc1.next();
			    	    Usuario user = Usuario.consultar(email);
			    	    if(user != null) {
			    	    	user.Avaliar(codigo, estrelas);
			    	    }else {
			    	    	System.out.println();
			    	    	System.out.println("Usuário não Existe");
			    	    }
						System.out.println();
			    	    System.out.println("Digite \n 1 para AVALIAR OUTRO FILME, \n 2 para SAIR");
						num4 = sc1.nextInt();
					}
				} 

		}
			if (num1 == 6) {
				System.out.println("Digite \n 1 para FAVORITAR, \n 2 para LISTAR FAVORITOS, \n 3 para SAIR");
				int num4 = sc1.nextInt();
				while (num4 != 3) {
					if (num4 == 1) {
						System.out.println();
						System.out.println("Digite o email do usuário que está favoritando essa midia");
			    	    String email = sc1.next();
			    	    Usuario user = Usuario.consultar(email);
			    	    if(user != null) {
							System.out.println();
			    	    	System.out.print("Digite o codigo do filme a ser favoritado:");
							int codigo = sc1.nextInt();
							Midias med = Midias.consultar(codigo);
							user.Favoritar(med);
			    	    }else {
			    	    	System.out.println();
			    	    	System.out.println("Usuário não Existe");
			    	    }
			    	    System.out.println();
			    	    System.out.println("Digite \n 1 para FAVORITAR, \n 2 para LISTAR FAVORITOS, \n 3 para SAIR");
						num4 = sc1.nextInt();
					}
					if (num4 == 2) {
						System.out.println();
						System.out.println("Digite o email do Usuário que deseja listar os favoritos:");
			    	    String email = sc1.next();
			    	    Usuario user = Usuario.consultar(email);
			    	    if(user != null) {
							user.listar_favs();
			    	    }else {
			    	    	System.out.println();
			    	    	System.out.println("Usuário não Existe");
			    	    }
						System.out.println();
			    	    System.out.println("Digite \n 1 para FAVORITAR, \n 2 para LISTAR FAVORITOS, \n 3 para SAIR");
						num4 = sc1.nextInt();
					}
				} 
		}
			if (num1 < 1 || num1 > 7) {
				System.out.println("numero invalido");
			}
	}

	}
}




