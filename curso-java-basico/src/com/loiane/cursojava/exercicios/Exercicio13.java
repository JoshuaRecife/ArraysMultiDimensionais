package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		//13 Fa�a um programa que pergunte quanto voc� ganha por hora 
//			 e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
//			 sal�rio no referido m�s, sabendo-se que s�o descontados 11%
		//   para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�;
		//a. sal�rio bruto.
		//b. quanto pagou ao INSS;
		//c. quanto pagou ao sindicato.
		//d. o sal�rio l�quido.
		//e. calcule os descontos e o sal�rio l�quido,conforme a tabela abaixo:
		//  a. + Sal�rio Bruto:R$
		//	b. - IR(11%):R$
		//	c. - INSS(8%):R$
		//	d. - Sindicato(5%):R$
		//	e. = Sal�rio Liquido:R$
		
		Scanner scan = new Scanner(System.in);
		
		double salH, horaM, salB, ir, inss, sindC, salL;
		 
		System.out.println("Digite quanto voc� ganha por hora.");
		salH = scan.nextDouble();
		
		System.out.println("Digite quantas horas voc� trabalha em um m�s.");
		horaM = scan.nextDouble();
		
		salB = salH*horaM;
		ir = (0.11*salB);
		inss = (0.08*salB);
		sindC = (0.05*salB);
		salL = (salB-ir-inss-sindC);
		
		System.out.println("+ Sal�rio Bruto:R$: "+salB);
		System.out.println("- IR(11%):R$ "+ir);
		System.out.println("- INSS(8%):R$ "+inss);
		System.out.println("- Sindicato(5%):R$ "+sindC);
		System.out.println("= Sal�rio Liquido:R$ "+salL);
		
		
		

	}

}
