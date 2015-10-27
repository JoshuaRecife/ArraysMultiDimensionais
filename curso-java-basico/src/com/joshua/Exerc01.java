package com.joshua;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
//		1. Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite qualquer número inteiro.");
		num1 = scan.nextInt();
		
		System.out.println("Digite qualquer número maior ou menor que o anterior.");
		num2 = scan.nextInt();
		
		if (num1 > num2){
			System.out.println("O primeiro número é maior: "+num1);
		}else{
			System.out.println("O segundo número é maior: "+num2);
		}

	}

}
