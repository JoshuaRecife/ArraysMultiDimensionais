package com.joshua;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
//		8. Faça um programa que leia 5 números e informe a soma e a média
//		   dos números.
		
		Scanner scan = new Scanner(System.in);
		
		double num, media;
		double soma =0;
		
		for(int i=1; i<=5;i++){
			System.out.println("Digite o "+i +"º número aleatório.");
			num = scan.nextDouble();
			soma += num;
		}
		media = soma/5;
		System.out.println("A média dos números digitados é: "+media);
	}
}
