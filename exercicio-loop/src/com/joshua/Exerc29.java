package com.joshua;

import java.util.Scanner;

public class Exerc29 {

	public static void main(String[] args) {
//		29. Encontrar números primos é uma tarefa difícil. Faça um programa que
//			gera uma lista dos números primos existentes entre 1 e um número
//			inteiro informado pelo usuário.
		
		Scanner scan = new Scanner(System.in);

		int num;
		boolean primo;

		System.out.println("Digite um número inteiro acima do número '1'");
		num = scan.nextInt();

		System.out.println("Todos os números primos entre 1 e " + num);

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
