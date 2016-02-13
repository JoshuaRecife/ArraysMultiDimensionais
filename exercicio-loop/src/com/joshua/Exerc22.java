package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
//		22. Faça um programa que calcule o valor total investido por um
//			colecionador em sua coleção de CDs e o valor médio gasto em cada
//			um deles. O usuário deverá informar a quantidade de CDs e o valor
//			para em cada um.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double valor, media = 0;
		double soma = 0;
		int cd; 

		System.out.println("Digite a quantidade de CDs que você tem");
		cd = scan.nextInt();
			
			for(int i=1; i<=cd; i++ ){
				System.out.println("Digite o valor de cada CD. Preço do "+i+"° CD.");
				valor = scan.nextDouble();
				soma += valor; 
			
			}
		
			media = (soma/cd);
			
			System.out.println("A média dos CDs comprados é de: R$ "+df.format(media));
	}
}
