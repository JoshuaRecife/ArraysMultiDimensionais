package com.joshua;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
//      15. A s�rie de Fibonacci � formada pela seq��ncia 1,1,2,3,5,8,13,21,34,55,... 
//			Fa�a um programa capaz de gerar a s�rie	at� o n-�simo termo.
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		int n1 = 0, n2 = 1;
		
		System.out.println("Digite o n-�simo termo da sequ�ncia de Fibonacci");
		n = scan.nextInt();

//		System.out.print(n1+","); // se quiser acrescentar o zero no inicio

		for(int i = 1;i <= n ;i++ ){
			n1 = n1 + n2;
			n2 = n1 - n2;
			System.out.print(n1+",");
		}
	}
}
