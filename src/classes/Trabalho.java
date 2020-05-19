package classes;

import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
		int num1 = 0;
		while (num1 != 5) {
			System.out.println("Olá, aperte: \n 1 para adicionar,\n 2 para buscar,\n 3 para remover,\n 4 para atualizar,\n 5 para sair");
			Scanner sc1 = new Scanner(System.in);
			num1 = sc1.nextInt();
			if (num1 == 1) {
				System.out
						.println("digite: \n1 para adicionar ator, \n2 para usuario, \n3 para adicionar midias, \n4 para sair");
				int num2 = 0;
				num2 = sc1.nextInt();
				while (num2 != 4) {
					if (num2 == 1) {
						System.out.println("adicionar ator");
						System.out.println(
								"digite: \n1 para adicionar ator, \n2 para usuario, \n3 para adicionar midias, \n4 para sair");
						num2 = sc1.nextInt();
					}
					if (num2 == 2) {
						System.out.println("adicionar usuario");
						System.out.println(
								"digite: \n1 para adicionar ator, \n2 para usuario, \n3 para adicionar midias, \n4 para sair");
						num2 = sc1.nextInt();
					}
					if (num2 == 3) {
						System.out.println("adicionar midia");
						System.out.println(
								"digite: \n1 para adicionar ator, \n2 para usuario, \n3 para adicionar midias, \n4 para sair");
						num2 = sc1.nextInt();
					}
					if (num2 < 1 || num2 > 4) {
						System.out.println("numero invalido");
						System.out.println(
								"digite: \n1 para adicionar ator, \n2 para usuario, \n3 para adicionar midias, \n4 para sair");
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
						System.out.println("buscar ator");
						System.out.println("digite 1 para buscar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 2) {
						System.out.println("buscar usuario");
						System.out.println("digite 1 para buscar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 3) {
						System.out.println("buscar midia");
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
						System.out.println("remover ator");
						System.out.println("digite 1 para remover ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 2) {
						System.out.println("remover usuario");
						System.out.println("digite 1 para remover ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 3) {
						System.out.println("remover midia");
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
				System.out.println("digite 1 para atualizar ator, 2 para usuario, 3 para midias, 4 para sair");
				int num3 = 0;
				num3 = sc1.nextInt();
				while (num3 != 4) {
					if (num3 == 1) {
						System.out.println("atualizar ator");
						System.out.println("digite 1 para atualizar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 2) {
						System.out.println("atualizar usuario");
						System.out.println("digite 1 para atualizar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 == 3) {
						System.out.println("atualizar midia");
						System.out.println("digite 1 para atualizar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
					if (num3 < 1 || num3 > 4) {
						System.out.println("numero invalido");
						System.out.println("digite 1 para atualizar ator, 2 para usuario, 3 para midias, 4 para sair");
						num3 = sc1.nextInt();
					}
				}
			}
			if (num1 < 1 || num1 > 5) {
				System.out.println("numero invalido");
			}
		}
	}
}