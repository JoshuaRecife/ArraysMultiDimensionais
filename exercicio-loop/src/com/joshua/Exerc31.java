package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc31 {

	public static void main(String[] args) {
//		31. Um funcionário de uma empresa recebe aumento salarial anualmente:
//			Sabe-se que:
//			. Esse funcionário foi contratado em 1995, com salário inicial de
//			R$ 1.000,00;
//			a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
//			b. A partir de 1997 (inclusive), os aumentos salariais sempre
//			correspondem ao dobro do percentual do ano anterior. Faça um
//			programa que determine o salário atual desse funcionário. Após
//			concluir isto, altere o programa permitindo que o usuário digite o
//			salário inicial do funcionário.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		double sal = 1000;
		double percen = 1.5;
		sal += (sal / 100) * percen;
		
		System.out.println("Salário Inicial de R$ 1000,00 em 1955");

		for (int i = 1996; i <= 2016; i++) {
			System.out.println("Salário de " + i + " = " + df.format(sal) +" - "+percen+"%");
			percen *= 2;
			sal += (sal / 100) * percen;
		}
		System.out.println("¨¨¨");
		
		sal = 0;
		percen = 1.5;
		
		System.out.println("Digite seu salário Inicial");
		sal = scan.nextDouble();
		
		
		System.out.println("¨¨¨");
		System.out.println("Novo Salário de 1995: R$ "+df.format(sal));
		
		sal += (sal / 100) * percen;

		for (int i = 1996; i <= 2016; i++) {
			System.out.println("Salário de " + i + " = " + df.format(sal)+" - "+percen+"%");
			percen *= 2;
			sal += (sal / 100) * percen;
		}
	}
}

