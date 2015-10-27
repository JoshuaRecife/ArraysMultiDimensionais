package com.joshua;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
//		7. Faça um Programa que leia três números e mostre o maior e o menor
//		deles.
		
		//Contador inicial
		long tempoInicio = System.currentTimeMillis();  //Acrecentei para testar
		 
		/*
		* CÓDIGO DO ALGORITMO AQUI
		*/
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, maior, menor;
		
		System.out.println("Digite o primeiro número:");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro número:");
		num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("o num1 é MAIOR número: " + num1);
		} else {
			if (num2 > num1 && num2 > num3) {
				System.out.println("o num2 é MAIOR número: " + num2);
			} else {
				if (num3 > num2 && num3 > num1) {
					System.out.println("o num3 é MAIOR número: " + num3);
				}
			}
		}

		if (num1 < num2 && num1 < num3) {
			System.out.println("o num1 é MENOR número: " + num1);
		} else {
			if (num2 < num1 && num2 < num3) {
				System.out.println("o num2 é MENOR número: " + num2);
			} else {
				if (num3 < num2 && num3 < num1) {
					System.out.println("o num3 é MENOR número: " + num3);
				}
			}
		}

		// contador final
		System.out.println("Tempo Total: " + (System.currentTimeMillis() - tempoInicio));

		// O código acima irá te retornar o tempo gasto em milisegundos...
	}
}
