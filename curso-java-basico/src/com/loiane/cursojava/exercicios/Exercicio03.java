package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
//		3. Fa�a um Programa que pe�a dois n�meros e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, result;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		num2 = scan.nextInt();
		
		result = num1+num2;
		
		System.out.println("O resultado da soma dos 02 n�meros �: "+result);
		


		

	}

}
