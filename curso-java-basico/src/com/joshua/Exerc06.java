package com.joshua;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
//		6. Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
		
		Scanner scan = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero:");
		num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro n�mero:");
		num3 = scan.nextDouble();
		
		
		if(num1 > num2 && num1 > num3){
			System.out.println("o num1 � maior n�mero: "+num1);
		}else{
			if(num2 > num1 && num2 > num3){
				System.out.println("o num2 � maior n�mero: "+num2);
			}else{
				if(num3 > num2 && num3 > num1){
					System.out.println("o num3 � maior n�mero: "+num3);
				}
					
			}
		}

	}

}
