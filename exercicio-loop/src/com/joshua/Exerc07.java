package com.joshua;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
//		7. Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = 0;
		for(int i=1; i<=5;i++){
			System.out.println("Digite o "+i +"� n�mero aleat�rio");
			num = scan.nextInt();
			
			if(maior < num){
				maior = num;
			}
		}
		
		System.out.println("O maior n�mero �: "+maior);
	}
}
