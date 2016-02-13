package com.joshua;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
//		5. Altere o programa anterior permitindo ao usu�rio informar as
//		   popula��es e as taxas de crescimento iniciais. Valide a entrada e
//		   permita repetir a opera��o.
		Scanner scan = new Scanner(System.in);
				
		int popA = 0;
		int popB = 0;
		int cont = 0;
		double taxaA, taxaB;
		
		System.out.println("Digite a popula��o 'A':");
		popA = scan.nextInt();
		
		System.out.println("Taxa de crescimento da popula��o 'A' em %");
		taxaA = scan.nextDouble();
		
		System.out.println("Digite a popula��o 'B':");
		popB = scan.nextInt();
		
		System.out.println("Taxa de crescimento da popula��o 'B' em %");
		taxaB = scan.nextDouble();
		
		while(popA < popB){
			
			popA += (popA /100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}
		System.out.println("Anos para a popula��o 'A' passar da popula��o 'B': "+cont +" anos.");
		System.out.println("Quantidade da popula��o 'A' ap�s '"+cont+"' anos � de: "+popA);
		System.out.println("Quantidade da popula��o 'B' ap�s '"+cont+"' anos � de: "+popB);
	}
}
