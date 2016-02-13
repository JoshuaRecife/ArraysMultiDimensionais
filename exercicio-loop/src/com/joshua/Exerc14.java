package com.joshua;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
//		14. Faça um programa que peça 10 números inteiros, calcule e mostre a
//		    quantidade de números pares e a quantidade de números impares.
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int par = 0, impa = 0;
		
		for(int i = 1;i <= 10;i++){
			System.out.println("Digite o "+i+"º número.");
			num = scan.nextInt();
			
			if(num % 2 == 0){
				par += 1;
			}else{
				impa += 1;
			}
		}
		System.out.println("Quantidade de números pares: "+par);
		System.out.println("Quantidade de números ímpares: "+impa);
	}
}

