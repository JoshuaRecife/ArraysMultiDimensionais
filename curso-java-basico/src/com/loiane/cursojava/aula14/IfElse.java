package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int idade;
		
//		System.out.println("Entre com sua idade");
//		idade = scan.nextInt();
//		
//		if (idade >=18){
//			System.out.println("� maior de idade.");
//		}else{
//			System.out.println("N�o � maior de idade.");
//		}
		
		//barato <=10
		// 10 < valor < 15 - pedir desconto
		//15 <= valor 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.println("Entre com o pre�o do item");
		double valor = scan.nextDouble();
		
		if (valor <=10){
			System.out.println("Est� barato, pode comprar.");
		}else{
			if (valor >10 && valor <15){
				System.out.println("Pe�a Desconto.");
			}else{
				if (valor >=15 && valor <17){
					System.out.println("Pesquise mais.");
				}else{
					System.out.println("Muito caro!!!");
					}
				}
		}

	}

}
