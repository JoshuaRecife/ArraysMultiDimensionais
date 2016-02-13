package com.joshua;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
//      15. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
//			Faça um programa capaz de gerar a série	até o n-ésimo termo.
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		int n1 = 0, n2 = 1;
		
		System.out.println("Digite o n-ésimo termo da sequência de Fibonacci");
		n = scan.nextInt();

//		System.out.print(n1+","); // se quiser acrescentar o zero no inicio

		for(int i = 1;i <= n ;i++ ){
			n1 = n1 + n2;
			n2 = n1 - n2;
			System.out.print(n1+",");
		}
	}
}
