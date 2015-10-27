package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		
//		21. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//		
//		- Álcool:
//		a. Até 20 litros, desconto de 3% por litro
//		b. Acima de 20 litros, desconto de 5% por litro
//		
//		- Gasolina:
//		c. Até 20 litros, desconto de 4% por litro
//		d. Acima de 20 litros, desconto de 6% por litro. 
//			
//		Escreva um algoritmo que leia:  
//		 O número de litros vendidos, o tipo de combustível (codificado da seguinte forma: 
//		 A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se 
//		 que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String combus;
		
		double alc = 1.9;		
		double gas = 2.50; 
		double litros, valor, desc, total;
		
		System.out.println("Qual combustível? Digite 'A' - álcool e 'G' - gasolina");
		combus = scan.next();
		
		System.out.println("Quantos litros?");
		litros = scan.nextDouble();
		
		if(combus.equalsIgnoreCase("a")){
			System.out.println("Tipo de combustível: Alcool");
			System.out.println("valor Combustível: R$ "+alc);
			if(litros <= 20){
				System.out.println("Litros: "+litros);
				valor = (litros * alc);
				System.out.println("Valor: R$ "+df.format(valor));
				desc = (valor / 100) * 3;
				System.out.println("Desconto de 3%: R$ "+df.format(desc));
				total = valor - desc;
				System.out.println("Total à pagar: R$ "+df.format(total));
				
			}else{
				if(litros > 20){
					System.out.println("Litros: "+litros);
					valor = (litros * alc);
					System.out.println("Valor: R$ "+df.format(valor));
					desc = (valor / 100) * 4;
					System.out.println("Desconto de 4%: R$ "+df.format(desc));
					total = valor - desc;
					System.out.println("Total à pagar: R$ "+df.format(total));
				}
			}
		}else{
			if(combus.equalsIgnoreCase("g")){
				System.out.println("Tipo de combustível: Gasolina");
				System.out.println("valor Combustível: R$ "+gas);
				if(litros <= 20){
					System.out.println("Litros: "+litros);
					valor = (litros * gas);
					System.out.println("Valor: R$ "+df.format(valor));
					desc = (valor / 100) * 4;
					System.out.println("Desconto de 4%: R$ "+df.format(desc));
					total = valor - desc;
					System.out.println("Total à pagar: R$ "+df.format(total));
					
				}else{
					if(litros > 20){
						System.out.println("Litros: "+litros);
						valor = (litros * gas);
						System.out.println("Valor: R$ "+df.format(valor));
						desc = (valor / 100) * 6;
						System.out.println("Desconto de 6%: R$ "+df.format(desc));
						total = valor - desc;
						System.out.println("Total à pagar: R$ "+df.format(total));
					}
				}
			}
		}
	}
}
