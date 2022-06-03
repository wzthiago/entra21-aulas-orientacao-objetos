package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import java.util.Scanner;

public class Revisao {

	static Scanner input = new Scanner(System.in);
	static Professor oliota;

	public static void revisar() {

		byte opcao = 0;
		
		gerarDados();
		
		do {

			System.out.println("Menu");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			opcao = input.nextByte();

			switch (opcao) {

			case 0:
				System.out.println("Obrigado por usar o programa!");
				break;

			case 1:
				
				break;

			default:
				System.out.println("Opção inválida");
				break;

			}

		} while (opcao != 0);

	}

	private static void gerarDados() {
		oliota = new Professor("Oliota",(byte) 33, "12345611134");

}
}
