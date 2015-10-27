package com.joshua;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
//		12. Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo 
//		que os descontos s�o do Imposto de Renda, que depende do sal�rio bruto 
//		conforme tabela abaixo) � 3% para o Sindicato e que o FGTS corresponde 
//		a 11% do Sal�rio Bruto, mas n�o � descontado (�	a empresa que deposita). 
//		O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. 
//		O programa dever� pedir ao usu�rio o valor da sua hora e a quantidade 
//		de horas trabalhadas no m�s.
		
//		Desconto do IR:
//			 Sal�rio Bruto at� 900 (inclusive) - isento
//			 Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
//			 Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
//			 Sal�rio Bruto acima de 2500 - desconto de 20% Imprima na tela
//			  as informa��es, dispostas conforme o exemplo abaixo. No
//			  exemplo o valor da hora � 5 e a quantidade de hora � 220.
		
//		Sal�rio Bruto: (5 * 220) : R$ 1100,00
//		(-) IR (5%) : R$ 55,00
//		(-) INSS ( 10%) : R$ 110,00
//		FGTS (11%) : R$ 121,00
//		Total de descontos : R$ 165,00
//		Sal�rio Liquido : R$ 935,00
		
		Scanner scan = new Scanner(System.in);
		
		double salBruto = 0;
		double horasT = 0;
		double qtdHorasMes = 0;
		double ir, inss, fgts, totalDesc,salLiquido;
		
		System.out.println("Digite o valor da sua hora de trabalho");
		horasT = scan.nextDouble();
		
		System.out.println("Digite quantas horas voc� trabalha no m�s");
		qtdHorasMes = scan.nextDouble();

		double percentualIR = 0;
		
		salBruto = horasT*qtdHorasMes;
		inss = (salBruto / 100 ) * 10;
		fgts = (salBruto /100)* 11;
		
		if(salBruto <= 900){
			System.out.println("Est� isento de desconto");
		}else{
			if(salBruto > 900 && salBruto <= 1500){
				percentualIR = 5;
				ir = (salBruto / 100 ) * percentualIR;
				System.out.println("Sal�rio Bruto: ("+horasT +" * " +qtdHorasMes+") : R$ "+salBruto);
				System.out.println("(-) IR ("+percentualIR+"%) : R$ "+ir);
				System.out.println("(-) INSS (10%) : R$ "+inss);
				System.out.println("FGTS (11%) : R$ "+fgts);
				totalDesc = ir + inss;
				System.out.println("Total de descontos : R$ "+totalDesc);
					salLiquido = salBruto - totalDesc;
					System.out.println("Sal�rio Liquido : R$ "+salLiquido);
			}else{
				if(salBruto > 1500 && salBruto <= 2500){
					percentualIR = 10;
					ir = (salBruto / 100 ) * percentualIR;
					System.out.println("Sal�rio Bruto: ("+horasT +" * " +qtdHorasMes+") : R$ "+salBruto);
					System.out.println("(-) IR ("+percentualIR+"%) : R$ "+ir);
					System.out.println("(-) INSS (10%) : R$ "+inss);
					System.out.println("FGTS (11%) : R$ "+fgts);
					totalDesc = ir + inss;
					System.out.println("Total de descontos : R$ "+totalDesc);
						salLiquido = salBruto - totalDesc;
						System.out.println("Sal�rio Liquido : R$ "+salLiquido);
				}else{
					if(salBruto > 2500){
						percentualIR = 20;
						ir = (salBruto / 100 ) * percentualIR;
						System.out.println("Sal�rio Bruto: ("+horasT +" * " +qtdHorasMes+") : R$ "+salBruto);
						System.out.println("(-) IR ("+percentualIR+"%) : R$ "+ir);
						System.out.println("(-) INSS (10%) : R$ "+inss);
						System.out.println("FGTS (11%) : R$ "+fgts);
						totalDesc = ir + inss;
						System.out.println("Total de descontos : R$ "+totalDesc);
							salLiquido = salBruto - totalDesc;
							System.out.println("Sal�rio Liquido : R$ "+salLiquido);
					}
				}
			}
		}
	}
}
