package com.joshua;

import java.util.Scanner;

public class Exerc28 {

	public static void main(String[] args) {
//		28. Os números primos possuem várias aplicações dentro da
//			Computação, por exemplo na Criptografia. Um número primo é aquele
//			que é divisível apenas por um e por ele mesmo. Faça um programa
//			que peça um número inteiro e determine se ele é ou não um número
//			primo.
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		
		System.out.println("Digite um número inteiro para determinar se é primo ou não");
		num = scan.nextInt();
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo - divisível por: " + i);
				primo = false;
			}
		}

		if (primo) {
			System.out.println("Este número é primo!");
		}
	}
}
