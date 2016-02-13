package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc32 {

	public static void main(String[] args) {
//		O card�pio de uma lanchonete � o seguinte:
//			o Especifica��o C�digo Pre�o
//			o Cachorro Quente 100 R$ 1,20
//			o Bauru Simples 101 R$ 1,30
//			o Bauru com ovo 102 R$ 1,50
//			o Hamb�rguer 103 R$ 1,20
//			o Cheeseburguer 104 R$ 1,30
//			o Refrigerante 105 R$ 1,00
		
//		Fa�a um programa que leia o c�digo dos itens pedidos e as
//			quantidades desejadas. Calcule e mostre o valor a ser pago por
//			item (pre�o * quantidade) e o total geral do pedido. Considere
//			que o cliente deve informar quando o pedido deve ser
//			encerrado.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		boolean sair = true;
		int cod = 0;
		int qtd;
		double totalPagar = 0;
		
		
		String output = "";
		
		System.out.println("Escolha seu pedido pelo c�digo");
		System.out.println("# Especifica��o C�digo Pre�o");
		System.out.println("# Cachorro Quente 100 R$ 1,20");
		System.out.println("# Bauru Simples 101 R$ 1,30");
		System.out.println("# Bauru com ovo 102 R$ 1,50");
		System.out.println("# Hamb�rguer 103 R$ 1,20");
		System.out.println("# Cheeseburguer 104 R$ 1,30");
		System.out.println("# Refrigerante 105 R$ 1,00");
		System.out.println("");
		
		do {
			System.out.println("Digite o c�digo. Para sair digite 0 (zero)");
			cod = scan.nextInt();

			System.out.println("Digite a quantidade. Para sair digite 0 (zero)");
			qtd = scan.nextInt();

			
			
			if (cod == 0 && qtd == 0) {
				sair = true;
				output += "Total a pagar: R$ " + df.format(totalPagar);
				
			} else {
				sair = false;
				if (cod == 100) {
					output += "Cachorro Quente - R$ 1,20 * Qtd: " + qtd + "\n";
					output += "Valor: R$ " + (df.format(qtd * 1.20)) + "\n";
					totalPagar += (qtd * 1.20);
				} else {
					if (cod == 101) {
						output += "Bauru Simples - R$ 1,30 * Qtd: " + qtd + "\n";
						output += "Valor: R$ " + (df.format(qtd * 1.30)) + "\n";
						totalPagar += (qtd * 1.30);
					} else {
						if (cod == 102) {
							output += "Bauru com ovo - R$ 1,50 * Qtd: " + qtd + "\n";
							output += "Valor: R$ " + (df.format(qtd * 1.30)) + "\n";
							totalPagar += (qtd * 1.30);
						} else {
							if (cod == 103) {
								output += "Hamb�rguer - R$ 1,20 * Qtd: " + qtd + "\n";
								output += "Valor: R$ " + (df.format(qtd * 1.20)) + "\n";
								totalPagar += (qtd * 1.20);
							} else {
								if (cod == 104) {
									output += "Cheeseburguer - R$ 1,30 * Qtd: " + qtd + "\n";
									output += "Valor: R$ " + (df.format(qtd * 1.30)) + "\n";
									totalPagar += (qtd * 1.30);
								} else {
									if (cod == 105) {
										output += "Refrigerante - R$ 1,00 * Qtd: " + qtd + "\n";
										output += "Valor: R$ " + (df.format(qtd * 1.00)) + "\n";
										totalPagar += (qtd * 1.00);
									}
								}
							}
						}
					}
				}
			}
		} while (!sair);

		System.out.println(output);
	}
}
