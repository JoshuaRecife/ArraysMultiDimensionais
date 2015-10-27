package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		//13 Faça um programa que pergunte quanto você ganha por hora 
//			 e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
//			 salário no referido mês, sabendo-se que são descontados 11%
		//   para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê;
		//a. salário bruto.
		//b. quanto pagou ao INSS;
		//c. quanto pagou ao sindicato.
		//d. o salário líquido.
		//e. calcule os descontos e o salário líquido,conforme a tabela abaixo:
		//  a. + Salário Bruto:R$
		//	b. - IR(11%):R$
		//	c. - INSS(8%):R$
		//	d. - Sindicato(5%):R$
		//	e. = Salário Liquido:R$
		
		Scanner scan = new Scanner(System.in);
		
		double salH, horaM, salB, ir, inss, sindC, salL;
		 
		System.out.println("Digite quanto você ganha por hora.");
		salH = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalha em um mês.");
		horaM = scan.nextDouble();
		
		salB = salH*horaM;
		ir = (0.11*salB);
		inss = (0.08*salB);
		sindC = (0.05*salB);
		salL = (salB-ir-inss-sindC);
		
		System.out.println("+ Salário Bruto:R$: "+salB);
		System.out.println("- IR(11%):R$ "+ir);
		System.out.println("- INSS(8%):R$ "+inss);
		System.out.println("- Sindicato(5%):R$ "+sindC);
		System.out.println("= Salário Liquido:R$ "+salL);
		
		
		

	}

}
