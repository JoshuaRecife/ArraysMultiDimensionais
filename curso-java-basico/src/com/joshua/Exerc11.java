package com.joshua;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
//		11. As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos
//			seus colaboradores e lhe contraram para desenvolver o programa que
//			calcular� os reajustes.
//		- Fa�a um programa que recebe o sal�rio de um colaborador e o
//			reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
//		- Sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
//		- Sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
//		- Sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//		- Sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o
//			aumento ser realizado, informe na tela:
//		- O sal�rio antes do reajuste;
//		- O percentual de aumento aplicado;
//		- O valor do aumento;
//		- O novo sal�rio, ap�s o aumento.
		
		Scanner scan = new Scanner(System.in);
		double salario = 0;
		double vinte = 0.2;
		double quinze = 0.15;
		double dez = 0.1;
		double cinco = 0.05;
		
		System.out.println("Digite seu sal�rio atual");
		salario = scan.nextDouble();
		
		if(salario <= 280){
			System.out.println("Sal�rio atual: R$ "+salario);
			System.out.println("Percentual aplicado = 20%");
			System.out.println("Valor do aumento: R$ "+salario*vinte);
			System.out.println("Novo Sal�rio: R$ "+((salario*vinte)+salario));
			
		}else{
			if(salario > 280 && salario <= 700){
				System.out.println("Sal�rio atual: R$ "+salario);
				System.out.println("Percentual aplicado = 15%");
				System.out.println("Valor do aumento: R$ "+salario*quinze);
				System.out.println("Novo Sal�rio: R$ "+((salario*quinze)+salario));
				
			}else{
				if(salario > 700 && salario <= 1500){
					System.out.println("Sal�rio atual: R$ "+salario);
					System.out.println("Percentual aplicado = 10%");
					System.out.println("Valor do aumento: R$ "+salario*dez);
					System.out.println("Novo Sal�rio: R$ "+((salario*dez)+salario));
					
				}else{
					if(salario > 1500){
						System.out.println("Sal�rio atual: R$ "+salario);
						System.out.println("Percentual aplicado = 5%");
						System.out.println("Valor do aumento: R$ "+salario*cinco);
						System.out.println("Novo Sal�rio: R$ "+((salario*cinco)+salario));
					}
				}
			}
		}
	}
}
