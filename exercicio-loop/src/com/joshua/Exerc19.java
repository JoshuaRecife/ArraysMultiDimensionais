package com.joshua;

import java.util.Scanner;

public class Exerc19 {
	
	public static void main(String[] args) {
	
//		19. Fa�a um programa que calcule e mostre a m�dia aritm�tica de N
//		    notas.
		
		Scanner scan = new Scanner(System.in);
		int num1;
		double nota;
		double soma = 0;
		double media = 0;
		
		System.out.println("Digite a quantidade de notas que ser�o digitadas");
		num1 = scan.nextInt();
		
		
		for(int i=1; i<=num1; i++){
			System.out.println("Digite a nota "+i+"�");
			nota = scan.nextDouble();	
			soma += nota;
		}
		media = soma/num1;
		System.out.println("A media das notas �: "+media);
	}
}
