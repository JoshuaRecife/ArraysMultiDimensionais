package com.joshua;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
//		1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite qualquer n�mero inteiro.");
		num1 = scan.nextInt();
		
		System.out.println("Digite qualquer n�mero maior ou menor que o anterior.");
		num2 = scan.nextInt();
		
		if (num1 > num2){
			System.out.println("O primeiro n�mero � maior: "+num1);
		}else{
			System.out.println("O segundo n�mero � maior: "+num2);
		}

	}

}
