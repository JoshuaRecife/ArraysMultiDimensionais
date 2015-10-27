package com.joshua;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
//		6. Faça um Programa que leia três números e mostre o maior deles.
		
		Scanner scan = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.println("Digite o primeiro número:");
		num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número:");
		num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro número:");
		num3 = scan.nextDouble();
		
		
		if(num1 > num2 && num1 > num3){
			System.out.println("o num1 é maior número: "+num1);
		}else{
			if(num2 > num1 && num2 > num3){
				System.out.println("o num2 é maior número: "+num2);
			}else{
				if(num3 > num2 && num3 > num1){
					System.out.println("o num3 é maior número: "+num3);
				}
					
			}
		}

	}

}
