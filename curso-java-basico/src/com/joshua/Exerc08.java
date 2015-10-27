package com.joshua;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
//		8. Faça um programa que pergunte o preço de três produtos e informe
//		qual produto você deve comprar, sabendo que a decisão é sempre
//		pelo mais barato.
		
		Scanner scan = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Digite o preço do 1º produto:");
		num1 = scan.nextDouble();
		
		System.out.println("Digite o preço do 2º produto:");
		num2 = scan.nextDouble();
		
		System.out.println("Digite o preço do 3º produto:");
		num3 = scan.nextDouble();
		
		
		if(num1 < num2 && num1 < num3){
			System.out.println("Compre pelo preço de R$ "+num1 +" é o menor preço.");
		}else{
			if(num2 < num1 && num2 < num3){
				System.out.println("Compre pelo preço de R$ "+num2 +" é o menor preço.");
			}else{
				if(num3 < num1 && num3 < num2){
					System.out.println("Compre pelo preço de R$ "+num3 +" é o menor preço.");
				}
			}
		}

	}

}
