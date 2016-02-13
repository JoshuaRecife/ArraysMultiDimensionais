package com.joshua;

import java.util.Scanner;

public class Exerc34 {

	public static void main(String[] args) {
//		34. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
//				calcule o valor de H com N termos.
		
		Scanner scan = new Scanner(System.in);
		
		int h=0;
		int n=0;
		int calc = 0;
		
		System.out.println("Digite o valor INTEIRO de H");
		h = scan.nextInt();
		
		System.out.println("Digite o valor INTEIRO de N");
		n = scan.nextInt();
		
		System.out.print("Sendo H = "+h +" + ");
		for(int i = 2; i <= n; i++){
			System.out.print(+h+"/"+i);
			
			if(i < n){
				System.out.print(" + ");
			}
			calc += h;
		}
		System.out.println("");
		System.out.print("O valor de H é: "+(calc+h));
	}
}
