package com.joshua;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
//		16. Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma 
//			ax2 + bx + c. O programa dever� pedir os valores de a, b e c e fazer as 
//			consist�ncias, informando ao usu�rio nas seguintes situa��es:
//			a. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o �	do segundo grau 
//				e o programa n�o deve fazer pedir os demais	valores, sendo encerrado;
//			b. Se o delta calculado for negativo, a equa��o n�o possui raizes reais. 
//				Informe ao usu�rio e encerre o programa;
//			c. Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; 
//				informe-a ao usu�rio;
//			d. Se o delta for positivo, a equa��o possui duas raiz reais;
//				informe-as ao usu�rio;
		
		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		int x1 = 0;
		int x2 = 0;
		double delta = 0;

		System.out.println("Digite um n�mero para o calculo da raiz de uma equa��o do segundo grau");
		a = scan.nextInt();

		if (a == 0) {
			System.out.println("A Equa��o n�o � do Segundo Grau");
		} else {
			System.out.println("Digite o segundo n�mero");
			b = scan.nextInt();

			System.out.println("digite o Terceiro n�mero");
			c = scan.nextInt();

			delta = ((b * b) - (4 * a * c));
			x1 = (int) ((-b + Math.sqrt(delta)) / (2*a));
			x2 = (int) ((-b - Math.sqrt(delta)) / (2*a));

			if (delta < 0) {
				System.out.println("A equa��o n�o possui raizes reais.");
			} else {
				if (delta == 0) {
					System.out.println("A equa��o possui apenas uma raiz real.");
					if(x1 > 0){
						System.out.println(x1);
					}else{
						System.out.println(x2);
					}
				} else {
					if (delta > 0) {
						System.out.println("A equa��o possui duas raiz reais.");
						System.out.println("Os resultados s�o x' = " + x1 + " e x'' = " + x2);
					}
				}
			}
		}
	}
}
