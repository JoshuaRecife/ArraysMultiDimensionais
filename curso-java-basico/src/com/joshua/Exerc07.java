package com.joshua;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
//		7. Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor
//		deles.
		
		//Contador inicial
		long tempoInicio = System.currentTimeMillis();  //Acrecentei para testar
		 
		/*
		* C�DIGO DO ALGORITMO AQUI
		*/
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, maior, menor;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("o num1 � MAIOR n�mero: " + num1);
		} else {
			if (num2 > num1 && num2 > num3) {
				System.out.println("o num2 � MAIOR n�mero: " + num2);
			} else {
				if (num3 > num2 && num3 > num1) {
					System.out.println("o num3 � MAIOR n�mero: " + num3);
				}
			}
		}

		if (num1 < num2 && num1 < num3) {
			System.out.println("o num1 � MENOR n�mero: " + num1);
		} else {
			if (num2 < num1 && num2 < num3) {
				System.out.println("o num2 � MENOR n�mero: " + num2);
			} else {
				if (num3 < num2 && num3 < num1) {
					System.out.println("o num3 � MENOR n�mero: " + num3);
				}
			}
		}

		// contador final
		System.out.println("Tempo Total: " + (System.currentTimeMillis() - tempoInicio));

		// O c�digo acima ir� te retornar o tempo gasto em milisegundos...
	}
}
