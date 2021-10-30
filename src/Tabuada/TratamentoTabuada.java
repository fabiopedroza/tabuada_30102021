package Tabuada;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoTabuada {

	static Scanner sc 	= new Scanner(System.in);
	static Scanner sair = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int opcao = 0;
//		String sair;
	
		do {

			System.out.println("\n\nEscolha a tabuada de 1 até 10:");
			try {
				opcao = sc.nextInt();

				for (int i = 1; i <= 10; i++) {
					System.out.println("Tabuada  " + i + " * " + opcao + " = " + i * opcao);
				}

			} catch (InputMismatchException e) {
				// Testes
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("\n\nFoi digitado algo que apresentou erro!!!");
				break;
			}

			System.out.println("\n\nPara sair digite 0 :");
			sc.nextLine();
			opcao = sc.nextInt();

//			if ((opcao == "S" || opcao == "s")) {
//				System.out.println(sair);
//				break;
//			}

		} while (opcao != 0) ;

		System.out.println("\n\nEspero que tenha gostado do programa de tabuada!!! Até a próxima.");
	}

}
