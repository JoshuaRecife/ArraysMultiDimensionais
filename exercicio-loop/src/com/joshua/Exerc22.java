package com.joshua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
//		22. Fa�a um programa que calcule o valor total investido por um
//			colecionador em sua cole��o de CDs e o valor m�dio gasto em cada
//			um deles. O usu�rio dever� informar a quantidade de CDs e o valor
//			para em cada um.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double valor, media = 0;
		double soma = 0;
		int cd; 

		System.out.println("Digite a quantidade de CDs que voc� tem");
		cd = scan.nextInt();
			
			for(int i=1; i<=cd; i++ ){
				System.out.println("Digite o valor de cada CD. Pre�o do "+i+"� CD.");
				valor = scan.nextDouble();
				soma += valor; 
			
			}
		
			media = (soma/cd);
			
			System.out.println("A m�dia dos CDs comprados � de: R$ "+df.format(media));
	}
}
