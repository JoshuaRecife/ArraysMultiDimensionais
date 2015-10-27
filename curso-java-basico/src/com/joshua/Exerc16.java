package com.joshua;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
//		16. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma 
//			ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as 
//			consistências, informando ao usuário nas seguintes situações:
//			a. Se o usuário informar o valor de A igual a zero, a equação não é	do segundo grau 
//				e o programa não deve fazer pedir os demais	valores, sendo encerrado;
//			b. Se o delta calculado for negativo, a equação não possui raizes reais. 
//				Informe ao usuário e encerre o programa;
//			c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; 
//				informe-a ao usuário;
//			d. Se o delta for positivo, a equação possui duas raiz reais;
//				informe-as ao usuário;
		
		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		int x1 = 0;
		int x2 = 0;
		double delta = 0;

		System.out.println("Digite um número para o calculo da raiz de uma equação do segundo grau");
		a = scan.nextInt();

		if (a == 0) {
			System.out.println("A Equação não é do Segundo Grau");
		} else {
			System.out.println("Digite o segundo número");
			b = scan.nextInt();

			System.out.println("digite o Terceiro número");
			c = scan.nextInt();

			delta = ((b * b) - (4 * a * c));
			x1 = (int) ((-b + Math.sqrt(delta)) / (2*a));
			x2 = (int) ((-b - Math.sqrt(delta)) / (2*a));

			if (delta < 0) {
				System.out.println("A equação não possui raizes reais.");
			} else {
				if (delta == 0) {
					System.out.println("A equação possui apenas uma raiz real.");
					if(x1 > 0){
						System.out.println(x1);
					}else{
						System.out.println(x2);
					}
				} else {
					if (delta > 0) {
						System.out.println("A equação possui duas raiz reais.");
						System.out.println("Os resultados são x' = " + x1 + " e x'' = " + x2);
					}
				}
			}
		}
	}
}
