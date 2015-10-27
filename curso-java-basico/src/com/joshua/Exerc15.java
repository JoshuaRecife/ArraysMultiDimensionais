package com.joshua;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
//		15. Faça um Programa que peça os 3 lados de um triângulo. O programa
//		deverá informar se os valores podem ser um triângulo. Indique, caso
//		os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
//		escaleno.
//		 Dicas:
//		 Três lados formam um triângulo quando a soma de quaisquer
//			dois lados for maior que o terceiro;
//		 Triângulo Equilátero: três lados iguais;
//		 Triângulo Isósceles: quaisquer dois lados iguais;
//		 Triângulo Escaleno: três lados diferentes;
		
		Scanner scan = new Scanner(System.in);

		double a, b, c;

		System.out.println("Digite 3 lados de um triângulo para informar se é: equilátero, isósceles ou escaleno");
		System.out.println("Digite o primeiro lado (A)");
		a = scan.nextDouble();

		System.out.println("Digite o segundo lado (B)");
		b = scan.nextDouble();

		System.out.println("Digite o terceiro lado (C)");
		c = scan.nextDouble();

		if (a == b && b == c) {
			System.out.println("Equilátero");
		} else {
			if (a == b || a == c || b == c) {
				System.out.println("Isósceles");
			} else {
				if (a != b && a != c && c != b) {
					System.out.println("Escaleno");
				}
			}
		}
	}
}
