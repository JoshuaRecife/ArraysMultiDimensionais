package com.joshua;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
//		8. Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia
//		   dos n�meros.
		
		Scanner scan = new Scanner(System.in);
		
		double num, media;
		double soma =0;
		
		for(int i=1; i<=5;i++){
			System.out.println("Digite o "+i +"� n�mero aleat�rio.");
			num = scan.nextDouble();
			soma += num;
		}
		media = soma/5;
		System.out.println("A m�dia dos n�meros digitados �: "+media);
	}
}
