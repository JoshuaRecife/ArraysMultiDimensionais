package com.joshua;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
//		15. Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa
//		dever� informar se os valores podem ser um tri�ngulo. Indique, caso
//		os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou
//		escaleno.
//		 Dicas:
//		 Tr�s lados formam um tri�ngulo quando a soma de quaisquer
//			dois lados for maior que o terceiro;
//		 Tri�ngulo Equil�tero: tr�s lados iguais;
//		 Tri�ngulo Is�sceles: quaisquer dois lados iguais;
//		 Tri�ngulo Escaleno: tr�s lados diferentes;
		
		Scanner scan = new Scanner(System.in);

		double a, b, c;

		System.out.println("Digite 3 lados de um tri�ngulo para informar se �: equil�tero, is�sceles ou escaleno");
		System.out.println("Digite o primeiro lado (A)");
		a = scan.nextDouble();

		System.out.println("Digite o segundo lado (B)");
		b = scan.nextDouble();

		System.out.println("Digite o terceiro lado (C)");
		c = scan.nextDouble();

		if (a == b && b == c) {
			System.out.println("Equil�tero");
		} else {
			if (a == b || a == c || b == c) {
				System.out.println("Is�sceles");
			} else {
				if (a != b && a != c && c != b) {
					System.out.println("Escaleno");
				}
			}
		}
	}
}
