package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		
//		21. Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
//		
//		- �lcool:
//		a. At� 20 litros, desconto de 3% por litro
//		b. Acima de 20 litros, desconto de 5% por litro
//		
//		- Gasolina:
//		c. At� 20 litros, desconto de 4% por litro
//		d. Acima de 20 litros, desconto de 6% por litro. 
//			
//		Escreva um algoritmo que leia:  
//		 O n�mero de litros vendidos, o tipo de combust�vel (codificado da seguinte forma: 
//		 A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se 
//		 que o pre�o do litro da gasolina � R$ 2,50 o pre�o do litro do �lcool � R$ 1,90.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String combus;
		
		double alc = 1.9;		
		double gas = 2.50; 
		double litros, valor, desc, total;
		
		System.out.println("Qual combust�vel? Digite 'A' - �lcool e 'G' - gasolina");
		combus = scan.next();
		
		System.out.println("Quantos litros?");
		litros = scan.nextDouble();
		
		if(combus.equalsIgnoreCase("a")){
			System.out.println("Tipo de combust�vel: Alcool");
			System.out.println("valor Combust�vel: R$ "+alc);
			if(litros <= 20){
				System.out.println("Litros: "+litros);
				valor = (litros * alc);
				System.out.println("Valor: R$ "+df.format(valor));
				desc = (valor / 100) * 3;
				System.out.println("Desconto de 3%: R$ "+df.format(desc));
				total = valor - desc;
				System.out.println("Total � pagar: R$ "+df.format(total));
				
			}else{
				if(litros > 20){
					System.out.println("Litros: "+litros);
					valor = (litros * alc);
					System.out.println("Valor: R$ "+df.format(valor));
					desc = (valor / 100) * 4;
					System.out.println("Desconto de 4%: R$ "+df.format(desc));
					total = valor - desc;
					System.out.println("Total � pagar: R$ "+df.format(total));
				}
			}
		}else{
			if(combus.equalsIgnoreCase("g")){
				System.out.println("Tipo de combust�vel: Gasolina");
				System.out.println("valor Combust�vel: R$ "+gas);
				if(litros <= 20){
					System.out.println("Litros: "+litros);
					valor = (litros * gas);
					System.out.println("Valor: R$ "+df.format(valor));
					desc = (valor / 100) * 4;
					System.out.println("Desconto de 4%: R$ "+df.format(desc));
					total = valor - desc;
					System.out.println("Total � pagar: R$ "+df.format(total));
					
				}else{
					if(litros > 20){
						System.out.println("Litros: "+litros);
						valor = (litros * gas);
						System.out.println("Valor: R$ "+df.format(valor));
						desc = (valor / 100) * 6;
						System.out.println("Desconto de 6%: R$ "+df.format(desc));
						total = valor - desc;
						System.out.println("Total � pagar: R$ "+df.format(total));
					}
				}
			}
		}
	}
}
