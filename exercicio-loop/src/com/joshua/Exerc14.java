package com.joshua;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
//		14. Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a
//		    quantidade de n�meros pares e a quantidade de n�meros impares.
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int par = 0, impa = 0;
		
		for(int i = 1;i <= 10;i++){
			System.out.println("Digite o "+i+"� n�mero.");
			num = scan.nextInt();
			
			if(num % 2 == 0){
				par += 1;
			}else{
				impa += 1;
			}
		}
		System.out.println("Quantidade de n�meros pares: "+par);
		System.out.println("Quantidade de n�meros �mpares: "+impa);
	}
}

