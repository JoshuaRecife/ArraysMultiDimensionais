package com.joshua;

import java.util.Scanner;

public class Exerc33 {

	public static void main(String[] args) {
//		33. Faça um programa que mostre os n termos da Série a seguir:
//			o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
//			Imprima no final a soma da série.
		
		Scanner scan = new Scanner(System.in);
		int s1 = 0;
		int s2 = 0;
		
		System.out.print("o S = ");
		for(int i = 1, j = 1; i <= 5; i++, j+=2){
			
			System.out.print(i +"/"+j +" + ");
			s1 += i;
			s2 += j;
			
		}
		System.out.println("... + n/m.");
		System.out.println("Total: "+s1+"/"+s2);
	}
}
