package com.joshua;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
//		13. Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e
//		    mostre o primeiro n�mero elevado ao segundo n�mero. N�o utilize a
//		    fun��o de pot�ncia da linguagem.
		
		Scanner scan = new Scanner(System.in);
		double base, expo;
		double calc = 1;
		
		System.out.println("Digite a base de um n�mero.");
		base = scan.nextDouble();
		
		System.out.println("Digite o expoente de um n�mero.");
		expo = scan.nextDouble();
		
		for(int i = 1;i <= expo;i++){
			calc *= base ;
		}
		 System.out.println(calc);
	}
}
