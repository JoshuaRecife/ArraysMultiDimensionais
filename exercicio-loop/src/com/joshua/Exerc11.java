package com.joshua;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
//		11. Altere o programa anterior para mostrar no final a soma dos números.
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		int soma = 0;
		
		System.out.println("Digite um número inteiro");
		num1 = scan.nextInt();
		
		System.out.println("Digite um número maior que o anterior");
		num2 = scan.nextInt();
		
		for(int i = (num1+1);i < num2;i++){
			System.out.println(" "+i);
			soma += i;
		}
		System.out.println("____+");
		System.out.println(" "+soma);
	}
}
