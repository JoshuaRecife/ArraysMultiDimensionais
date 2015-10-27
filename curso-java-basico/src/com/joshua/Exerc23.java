package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {
//		23. O Hipermercado Tabajara est� com uma promo��o de carnes que � imperd�vel. 
//		Confira:
//	
//	                At� 5 Kg 			Acima de 5 Kg
//	- File Duplo    R$ 4,90 por Kg     R$ 5,80 por Kg
//	- Alcatra       R$ 5,90 por Kg     R$ 6,80 por Kg
//	- Picanha       R$ 6,90 por Kg     R$ 7,80 por Kg
//	
//	Para atender a todos os clientes, cada cliente poder� levar apenas um dos 
//	tipos de carne da promo��o, por�m n�o h� limites para a quantidade de carne por cliente. 
//	Se compra for feita no cart�o Tabajara o cliente receber� ainda um desconto
//	de 5% sobre o total a compra. Escreva um programa que pe�a o tipo e a quantidade de carne 
//	comprada pelo usu�rio e gere um cupom fiscal, contendo as informa��es da compra:
//	tipo e quantidade de carne, 
//	pre�o total, 
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
		
		System.out.println("Pagamento com o Cart�o Tabajara: 'S'Sim ou 'N'N�o?");
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
		
		System.out.println("Pre�o total: R$"+df.format(precoTotal));
		
		if(pag.equalsIgnoreCase("S")){
			desc = (precoTotal * 0.05);
			System.out.println("Tipo de Pagamento: 'Cart�o Tabajara'");
			}else{
				System.out.println("Tipo de Pagamento: Outro...");
			}
		
		System.out.println("Valor do Desconto: R$"+df.format(desc));
		aPagar = (precoTotal - desc);
		
		System.out.println("Valor a Pagar: R$"+df.format(aPagar));
		
	}
}
