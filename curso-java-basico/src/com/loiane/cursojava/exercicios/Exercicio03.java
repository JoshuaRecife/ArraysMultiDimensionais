package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
//		3. Faça um Programa que peça dois números e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, result;
		
		System.out.println("Digite o primeiro número:");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		num2 = scan.nextInt();
		
		result = num1+num2;
		
		System.out.println("O resultado da soma dos 02 números é: "+result);
		


		

	}

}
