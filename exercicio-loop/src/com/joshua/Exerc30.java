package com.joshua;

import java.util.Scanner;

public class Exerc30 {

	public static void main(String[] args) {

//		30. Desenvolva um programa que faça a tabuada de um número qualquer
//			inteiro que será digitado pelo usuário, mas a tabuada não deve
//			necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
//			devem ser informados também pelo usuário, conforme exemplo
//			abaixo:
		
//		o Montar a tabuada de: 5
//		o Começar por: 4
//		o Terminar em: 7
//		o
//		o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
//		o 5 X 4 = 20
//		o 5 X 5 = 25
//		o 5 X 6 = 30
//		o 5 X 7 = 35
		
//		Obs: Você deve verificar se o usuário não digitou o final menor
//		que o inicial.
		
		Scanner scan = new Scanner(System.in);
		int num, num2, num3;
		int mult = 1;
		boolean sair = true;
		
		System.out.println("Montar a tabuada com valor inicial e final informados pelo usuário");
		System.out.println();
		
		System.out.print("o Montar a tabuada de: ");
		num = scan.nextInt();
		
		do {
			System.out.print("o Começar por: ");
			num2 = scan.nextInt();

			System.out.print("o Terminar em: ");
			num3 = scan.nextInt();

			if (num3 < num2) {
				System.out.println("O número, " + num3 + " é menor que " + num2 + ". Digite valores válidos");
				sair = false;
			}else{
				sair = true;
			}
			
		} while (!sair);
		
		System.out.println("o ");
		System.out.println("o Vou começar a tabuada de "+num+" começando em "+num2+" e terminando em "+num3+":");
		
		for (int i = 1, j = num2; i <= num3 & j <= num3; i++, j++) {
			mult = (num * j);
			System.out.println("o " + num + " x " + j + " = " + mult);
		}
	}
}
