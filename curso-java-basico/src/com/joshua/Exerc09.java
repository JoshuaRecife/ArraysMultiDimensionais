package com.joshua;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
//		9. Faça um Programa que leia três números e mostre-os em ordem
//		   decrescente.

		Scanner scan = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Digite o primeiro número:");
		num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número:");
		num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro número:");
		num3 = scan.nextDouble();
		
		if (num1 < num2 && num1 < num3 & num2 < num3) {
			// menor = num1
			// maior = num3
			// num3 < num2 < num1
			System.out.println("" + num3 + " - " + "" + num2 + " - " + "" + num1);
		} else {
			if (num1 < num2 && num1 < num3 && num3 < num2) {
				// menor = num1
				// maior = num2
				// num1 < num3 < num2
				System.out.println("" + num2 + " - " + "" + num3 + " - " + "" + num1);
			} else {
				if (num2 < num1 && num1 < num3 && num1 < num3) {
					// menor = num2
					// maior = num3
					// num2 < num1 < num3
					System.out.println("" + num3 + " - " + "" + num1 + " - " + "" + num2);
				} else {
					if (num2 < num1 && num2 < num3 && num3 < num1) {
						// menor = num2
						// maior = num1
						// num2 < num3 < num1
						System.out.println("" + num1 + " - " + "" + num3 + " - " + "" + num2);
					} else {
						if (num3 < num1 && num3 < num2 && num1 < num2) {
							//1     2        1     3        2      3
							// num3 = menor
							// num2 = maior
							// num3 < num1 < num2
							System.out.println("" + num2 + " - " + "" + num1 + " - " + "" + num3);
						} else {
							if (num3 < num1 && num3 < num2 && num2 < num1) {
								//1      3       1      2       2      3
								// num3 = menor
								// num1 = maior
								// num3 < num2 < num1
								System.out.println("" + num1 + " - " + "" + num2 + " - " + "" + num3);
							}
						}
					}
				}
			}
		}
	}
}
