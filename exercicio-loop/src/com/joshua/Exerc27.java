package com.joshua;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
//		27. O Departamento Estadual de Meteorologia lhe contratou para
//			desenvolver um programa que leia um conjunto indeterminado de
//			temperaturas, e informe ao final a menor e a maior temperatura
//			informada, bem como a média das temperaturas.
		Scanner scan = new Scanner(System.in);

		double temp = 0, soma = 0;
		double media;
		int cont = 1;
		boolean sair = true;
		double maior = 0, menor = 0;

		do {
			for (int i = 0; i < cont; i++) {
				System.out.println("Digite a " + cont + "º temperatura. Para sair digite 888");
				temp = scan.nextDouble();
				
				if (temp == 888) {
					sair = true;
				} else {
					if(temp > maior){
						maior = temp;
					}else{
						if(maior > menor)
						menor = temp;
					}
					soma += temp;
					cont += 1;
					sair = false;
				}
			}
		
		} while (!sair);
		
		media = (soma)/(cont-1);
		
		System.out.println("A maior temperatura é: "+maior);
		System.out.println("A menor temperatura é: "+menor);
		System.out.println("A média das temperaturas é de: "+media);
	}
}
