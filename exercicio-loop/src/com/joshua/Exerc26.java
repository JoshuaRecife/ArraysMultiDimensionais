package com.joshua;

import java.util.Scanner;

public class Exerc26 {

	public static void main(String[] args) {
//		26. Fa�a um programa que calcule o fatorial de um n�mero inteiro
//			fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120. A sa�da deve ser
//			conforme o exemplo abaixo:
//		o Fatorial de: 5
//		o 5! = 5 . 4 . 3 . 2 . 1 = 120
		
		Scanner scan = new Scanner(System.in);
				
		int num;
		int mult = 1;
		
		
		System.out.println("Digite um n�mero inteiro para ser mostrado o Fatorial");
		num = scan.nextInt();
		
		System.out.println("o Fatorial de: "+num);
		System.out.print("o "+num+"! = ");
		
		for(int i = num; i > 1; i--){
			mult *= i;
			System.out.print(" "+i+" . ");
		}

		System.out.println(" 1 = "+mult);
	}
}
