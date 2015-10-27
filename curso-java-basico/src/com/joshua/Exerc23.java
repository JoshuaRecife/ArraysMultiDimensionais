package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {
//		23. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. 
//		Confira:
//	
//	                Até 5 Kg 			Acima de 5 Kg
//	- File Duplo    R$ 4,90 por Kg     R$ 5,80 por Kg
//	- Alcatra       R$ 5,90 por Kg     R$ 6,80 por Kg
//	- Picanha       R$ 6,90 por Kg     R$ 7,80 por Kg
//	
//	Para atender a todos os clientes, cada cliente poderá levar apenas um dos 
//	tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. 
//	Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto
//	de 5% sobre o total a compra. Escreva um programa que peça o tipo e a quantidade de carne 
//	comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra:
//	tipo e quantidade de carne, 
//	preço total, 
//	tipo de pagamento, 
//	valor do desconto e valor a pagar.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String carne, pag;
		double qtd, precoTotal, aPagar, preco = 0;
		double desc = 0;
		
		
		System.out.println("Digite o tipo de carne para a compra");
		carne = scan.nextLine();
		
		System.out.println("Quantidade de Carne em Kilos:");
		qtd = scan.nextDouble();
		
		System.out.println("Pagamento com o Cartão Tabajara: 'S'Sim ou 'N'Não?");
		pag = scan.next();
	
		
		if(carne.equalsIgnoreCase("File Duplo") && qtd <= 5){
			preco = 4.9;
		}else{
			if(carne.equalsIgnoreCase("Alcatra")  && qtd <= 5){
				preco = 5.9;
			}else{
				if(carne.equalsIgnoreCase("Picanha")  && qtd <= 5){
					preco = 6.9;
				}else{
					if(carne.equalsIgnoreCase("File Duplo")  && qtd > 5){
						preco = 5.8;
					}else{
						if(carne.equalsIgnoreCase("Alcatra")  && qtd > 5){
							preco = 6.8;
						}else{
							if(carne.equalsIgnoreCase("Picanha")  && qtd > 5){
								preco = 7.8;
							}
						}
					}
				}
			}
		}
		
		System.out.println("Tipo da Carne: "+carne);
		System.out.println("Quantidade da Carne: "+qtd+"Kg");
		precoTotal = qtd * preco;
		
		System.out.println("Preço total: R$"+df.format(precoTotal));
		
		if(pag.equalsIgnoreCase("S")){
			desc = (precoTotal * 0.05);
			System.out.println("Tipo de Pagamento: 'Cartão Tabajara'");
			}else{
				System.out.println("Tipo de Pagamento: Outro...");
			}
		
		System.out.println("Valor do Desconto: R$"+df.format(desc));
		aPagar = (precoTotal - desc);
		
		System.out.println("Valor a Pagar: R$"+df.format(aPagar));
		
	}
}
