package com.joshua;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
//		13. Faça um programa que peça dois números, base e expoente, calcule e
//		    mostre o primeiro número elevado ao segundo número. Não utilize a
//		    função de potência da linguagem.
		
		Scanner scan = new Scanner(System.in);
		double base, expo;
		double calc = 1;
		
		System.out.println("Digite a base de um número.");
		base = scan.nextDouble();
		
		System.out.println("Digite o expoente de um número.");
		expo = scan.nextDouble();
		
		for(int i = 1;i <= expo;i++){
			calc *= base ;
		}
		 System.out.println(calc);
	}
}
