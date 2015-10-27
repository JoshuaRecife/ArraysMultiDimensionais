package com.joshua;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
//		11. As Organizações Tabajara resolveram dar um aumento de salário aos
//			seus colaboradores e lhe contraram para desenvolver o programa que
//			calculará os reajustes.
//		- Faça um programa que recebe o salário de um colaborador e o
//			reajuste segundo o seguinte critério, baseado no salário atual:
//		- Salários até R$ 280,00 (incluindo) : aumento de 20%
//		- Salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//		- Salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//		- Salários de R$ 1500,00 em diante : aumento de 5% Após o
//			aumento ser realizado, informe na tela:
//		- O salário antes do reajuste;
//		- O percentual de aumento aplicado;
//		- O valor do aumento;
//		- O novo salário, após o aumento.
		
		Scanner scan = new Scanner(System.in);
		double salario = 0;
		double vinte = 0.2;
		double quinze = 0.15;
		double dez = 0.1;
		double cinco = 0.05;
		
		System.out.println("Digite seu salário atual");
		salario = scan.nextDouble();
		
		if(salario <= 280){
			System.out.println("Salário atual: R$ "+salario);
			System.out.println("Percentual aplicado = 20%");
			System.out.println("Valor do aumento: R$ "+salario*vinte);
			System.out.println("Novo Salário: R$ "+((salario*vinte)+salario));
			
		}else{
			if(salario > 280 && salario <= 700){
				System.out.println("Salário atual: R$ "+salario);
				System.out.println("Percentual aplicado = 15%");
				System.out.println("Valor do aumento: R$ "+salario*quinze);
				System.out.println("Novo Salário: R$ "+((salario*quinze)+salario));
				
			}else{
				if(salario > 700 && salario <= 1500){
					System.out.println("Salário atual: R$ "+salario);
					System.out.println("Percentual aplicado = 10%");
					System.out.println("Valor do aumento: R$ "+salario*dez);
					System.out.println("Novo Salário: R$ "+((salario*dez)+salario));
					
				}else{
					if(salario > 1500){
						System.out.println("Salário atual: R$ "+salario);
						System.out.println("Percentual aplicado = 5%");
						System.out.println("Valor do aumento: R$ "+salario*cinco);
						System.out.println("Novo Salário: R$ "+((salario*cinco)+salario));
					}
				}
			}
		}
	}
}
