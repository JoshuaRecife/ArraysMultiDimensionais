package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc31 {

	public static void main(String[] args) {
//		31. Um funcion�rio de uma empresa recebe aumento salarial anualmente:
//			Sabe-se que:
//			. Esse funcion�rio foi contratado em 1995, com sal�rio inicial de
//			R$ 1.000,00;
//			a. Em 1996 recebeu aumento de 1,5% sobre seu sal�rio inicial;
//			b. A partir de 1997 (inclusive), os aumentos salariais sempre
//			correspondem ao dobro do percentual do ano anterior. Fa�a um
//			programa que determine o sal�rio atual desse funcion�rio. Ap�s
//			concluir isto, altere o programa permitindo que o usu�rio digite o
//			sal�rio inicial do funcion�rio.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		double sal = 1000;
		double percen = 1.5;
		sal += (sal / 100) * percen;
		
		System.out.println("Sal�rio Inicial de R$ 1000,00 em 1955");

		for (int i = 1996; i <= 2016; i++) {
			System.out.println("Sal�rio de " + i + " = " + df.format(sal) +" - "+percen+"%");
			percen *= 2;
			sal += (sal / 100) * percen;
		}
		System.out.println("���");
		
		sal = 0;
		percen = 1.5;
		
		System.out.println("Digite seu sal�rio Inicial");
		sal = scan.nextDouble();
		
		
		System.out.println("���");
		System.out.println("Novo Sal�rio de 1995: R$ "+df.format(sal));
		
		sal += (sal / 100) * percen;

		for (int i = 1996; i <= 2016; i++) {
			System.out.println("Sal�rio de " + i + " = " + df.format(sal)+" - "+percen+"%");
			percen *= 2;
			sal += (sal / 100) * percen;
		}
	}
}

