package com.joshua;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
//		7. Faça um programa que leia 5 números e informe o maior número.
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = 0;
		for(int i=1; i<=5;i++){
			System.out.println("Digite o "+i +"° número aleatório");
			num = scan.nextInt();
			
			if(maior < num){
				maior = num;
			}
		}
		
		System.out.println("O maior número é: "+maior);
	}
}
