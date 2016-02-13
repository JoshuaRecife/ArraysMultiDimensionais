package com.joshua;

import java.util.Scanner;

public class Exerc29 {

	public static void main(String[] args) {
//		29. Encontrar n�meros primos � uma tarefa dif�cil. Fa�a um programa que
//			gera uma lista dos n�meros primos existentes entre 1 e um n�mero
//			inteiro informado pelo usu�rio.
		
		Scanner scan = new Scanner(System.in);

		int num;
		boolean primo;

		System.out.println("Digite um n�mero inteiro acima do n�mero '1'");
		num = scan.nextInt();

		System.out.println("Todos os n�meros primos entre 1 e " + num);

		for (int i = 1; i < num; i++) {

			primo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {

					primo = false;
				}
			}

			if (primo) {
				System.out.println(i);
			}

		}

	}
}
