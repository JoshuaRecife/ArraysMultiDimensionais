package com.joshua;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
//		12. Faça um programa para o cálculo de uma folha de pagamento, sabendo 
//		que os descontos são do Imposto de Renda, que depende do salário bruto 
//		conforme tabela abaixo) é 3% para o Sindicato e que o FGTS corresponde 
//		a 11% do Salário Bruto, mas não é descontado (é	a empresa que deposita). 
//		O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
//		O programa deverá pedir ao usuário o valor da sua hora e a quantidade 
//		de horas trabalhadas no mês.
		
//		Desconto do IR:
//			 Salário Bruto até 900 (inclusive) - isento
//			 Salário Bruto até 1500 (inclusive) - desconto de 5%
//			 Salário Bruto até 2500 (inclusive) - desconto de 10%
//			 Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
//			  as informações, dispostas conforme o exemplo abaixo. No
//			  exemplo o valor da hora é 5 e a quantidade de hora é 220.
		
//		Salário Bruto: (5 * 220) : R$ 1100,00
//		(-) IR (5%) : R$ 55,00
//		(-) INSS ( 10%) : R$ 110,00
//		FGTS (11%) : R$ 121,00
//		Total de descontos : R$ 165,00
//		Salário Liquido : R$ 935,00
		
		Scanner scan = new Scanner(System.in);
		
		double salBruto = 0;
		double horasT = 0;
		double qtdHorasMes = 0;
		double ir, inss, fgts, totalDesc,salLiquido;
		
		System.out.println("Digite o valor da sua hora de trabalho");
		horasT = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalha no mês");
		qtdHorasMes = scan.nextDouble();

		double percentualIR = 0;
		
		salBruto = horasT*qtdHorasMes;
		inss = (salBruto / 100 ) * 10;
		fgts = (salBruto /100)* 11;
		
		if(salBruto <= 900){
			System.out.println("Está isento de desconto");
		}else{
			if(salBruto > 900 && salBruto <= 1500){
				percentualIR = 5;
				ir = (salBruto / 100 ) * percentualIR;
				System.out.println("Salário Bruto: ("+horasT +" * " +qtdHorasMes+") : R$ "+salBruto);
				System.out.println("(-) IR ("+percentualIR+"%) : R$ "+ir);
				System.out.println("(-) INSS (10%) : R$ "+inss);
				System.out.println("FGTS (11%) : R$ "+fgts);
				totalDesc = ir + inss;
				System.out.println("Total de descontos : R$ "+totalDesc);
					salLiquido = salBruto - totalDesc;
					System.out.println("Salário Liquido : R$ "+salLiquido);
			}else{
				if(salBruto > 1500 && salBruto <= 2500){
					percentualIR = 10;
					ir = (salBruto / 100 ) * percentualIR;
					System.out.println("Salário Bruto: ("+horasT +" * " +qtdHorasMes+") : R$ "+salBruto);
					System.out.println("(-) IR ("+percentualIR+"%) : R$ "+ir);
					System.out.println("(-) INSS (10%) : R$ "+inss);
					System.out.println("FGTS (11%) : R$ "+fgts);
					totalDesc = ir + inss;
					System.out.println("Total de descontos : R$ "+totalDesc);
						salLiquido = salBruto - totalDesc;
						System.out.println("Salário Liquido : R$ "+salLiquido);
				}else{
					if(salBruto > 2500){
						percentualIR = 20;
						ir = (salBruto / 100 ) * percentualIR;
						System.out.println("Salário Bruto: ("+horasT +" * " +qtdHorasMes+") : R$ "+salBruto);
						System.out.println("(-) IR ("+percentualIR+"%) : R$ "+ir);
						System.out.println("(-) INSS (10%) : R$ "+inss);
						System.out.println("FGTS (11%) : R$ "+fgts);
						totalDesc = ir + inss;
						System.out.println("Total de descontos : R$ "+totalDesc);
							salLiquido = salBruto - totalDesc;
							System.out.println("Salário Liquido : R$ "+salLiquido);
					}
				}
			}
		}
	}
}
