package com.joshua;

public class Exerc16 {

	public static void main(String[] args) {
//		16. A s�rie de Fibonacci � formada pela seq��ncia
//			0,1,1,2,3,5,8,13,21,34,55,... Fa�a um programa que gere a s�rie at�
//			que o valor seja maior que 500.
		
		int n1 = 0, n2 = 1;
		
		System.out.print(n1+",");

		do{
			  n1 = n1 + n2;
			  n2 = n1 - n2;
			
			  System.out.print(n1+",");
		}while(n1 <= 500);
	}
}
