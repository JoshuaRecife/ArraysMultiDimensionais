package com.joshua;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
//		5. Altere o programa anterior permitindo ao usuário informar as
//		   populações e as taxas de crescimento iniciais. Valide a entrada e
//		   permita repetir a operação.
		Scanner scan = new Scanner(System.in);
				
		int popA = 0;
		int popB = 0;
		int cont = 0;
		double taxaA, taxaB;
		
		System.out.println("Digite a população 'A':");
		popA = scan.nextInt();
		
		System.out.println("Taxa de crescimento da população 'A' em %");
		taxaA = scan.nextDouble();
		
		System.out.println("Digite a população 'B':");
		popB = scan.nextInt();
		
		System.out.println("Taxa de crescimento da população 'B' em %");
		taxaB = scan.nextDouble();
		
		while(popA < popB){
			
			popA += (popA /100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}
		System.out.println("Anos para a população 'A' passar da população 'B': "+cont +" anos.");
		System.out.println("Quantidade da população 'A' após '"+cont+"' anos é de: "+popA);
		System.out.println("Quantidade da população 'B' após '"+cont+"' anos é de: "+popB);
	}
}
