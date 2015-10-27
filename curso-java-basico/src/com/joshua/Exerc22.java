package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {

	//	22. Uma fruteira est� vendendo frutas com a seguinte tabela de pre�os:
	//		    
	//			    At� 5 Kg 	   Acima de 5 Kg
	//Morango:   R$ 2,50 por Kg    R$ 2,20 por Kg
	//Ma��: 	 R$ 1,80 por Kg    R$ 1,50 por Kg
	//
	//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
	//ultrapassar R$ 15,00, receber� ainda um desconto de 10% sobre este total. 
	//Escreva um algoritmo para ler a	quantidade (em Kg) de morangos e a 
	//quantidade (em Kg) de ma�as adquiridas e escreva o valor a ser pago pelo cliente.
	
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		double morango, maca, totalF, totalC, precoMo, precoMa;
		double desc = 0;

		System.out.println("Quantos Kilos de Morangos?");
		morango = scan.nextDouble();

		if (morango <= 5) {
			precoMo = 2.5;
		} else {
			precoMo = 2.2;
		}

		System.out.println("Quantos Kilos de Ma�a?");
		maca = scan.nextDouble();

		if (maca <= 5) {
			precoMa = 1.8;
		} else {
			precoMa = 1.5;
		}

		totalF = morango + maca;
		totalC = (morango * precoMo) + (maca * precoMa);

		if (totalF > 8 || totalC > 15) {
			desc = (totalC / 100) * 10;
			System.out.println("Quant. de Frutas: " + df.format(totalF) + "Kg.");
			System.out.println("Valor das Compras: R$ " + df.format(totalC));
			System.out.println("Valor � pagar com Desconto de 10%: R$ " + df.format(totalC - desc));
		} else {
			System.out.println("Quant. de Frutas: " + df.format(totalF) + "Kg.");
			System.out.println("Valor � pagar sem Descontos: R$ " + df.format(totalC - desc));
		}

	}

}
