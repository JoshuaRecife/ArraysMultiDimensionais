package com.joshua;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
//		8. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe
//		qual produto voc� deve comprar, sabendo que a decis�o � sempre
//		pelo mais barato.
		
		Scanner scan = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Digite o pre�o do 1� produto:");
		num1 = scan.nextDouble();
		
		System.out.println("Digite o pre�o do 2� produto:");
		num2 = scan.nextDouble();
		
		System.out.println("Digite o pre�o do 3� produto:");
		num3 = scan.nextDouble();
		
		
		if(num1 < num2 && num1 < num3){
			System.out.println("Compre pelo pre�o de R$ "+num1 +" � o menor pre�o.");
		}else{
			if(num2 < num1 && num2 < num3){
				System.out.println("Compre pelo pre�o de R$ "+num2 +" � o menor pre�o.");
			}else{
				if(num3 < num1 && num3 < num2){
					System.out.println("Compre pelo pre�o de R$ "+num3 +" � o menor pre�o.");
				}
			}
		}

	}

}
