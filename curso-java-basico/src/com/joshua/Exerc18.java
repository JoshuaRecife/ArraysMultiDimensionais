package com.joshua;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
//		18. Fa�a um Programa que pe�a um n�mero inteiro e determine se ele �
//		par ou impar. Dica: utilize o operador m�dulo (resto da divis�o).
		
		Scanner scan = new Scanner(System.in);
		
		int num;
			
		System.out.println("Digite um n�mero inteiro para determinar se � par ou �mpar");
		num = scan.nextInt();
			
		if(num % 2 == 0){
			System.out.println("par");
			
		}else{
			System.out.println("�mpar");
			
		}
	}
}
