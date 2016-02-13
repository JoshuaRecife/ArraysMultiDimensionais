package com.joshua;

public class Exerc04 {

	public static void main(String[] args) {
//		 4. Supondo que a população de um país A seja da ordem de 80000
//			habitantes com uma taxa anual de crescimento de 3% e que a
//			população de B seja 200000 habitantes com uma taxa de crescimento
//			de 1.5%. Faça um programa que calcule e escreva o número de anos
//			necessários para que a população do país A ultrapasse ou iguale a
//			população do país B, mantidas as taxas de crescimento.
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while(popA < popB){
			
			popA += (popA /100) * 3;
			popB += (popB / 100) * 1.5;
			cont++;
		}
		System.out.println("Anos para a população 'A' passar da população 'B': "+cont +" anos.");
		System.out.println("Quantidade da população 'A' após '"+cont+"' anos é de: "+popA);
		System.out.println("Quantidade da população 'B' após '"+cont+"' anos é de: "+popB);
	}
} 
