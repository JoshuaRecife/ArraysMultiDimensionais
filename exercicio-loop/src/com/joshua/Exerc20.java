package com.joshua;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
//		20. Faça um programa que peça para n pessoas a sua idade, ao final o
//			programa deverá verificar se a média de idade da turma varia entre 0 e
//			25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
//			ou idosa, conforme a média calculada.
		
		Scanner scan = new Scanner(System.in);
		
		int idade;
		int cont = 0;
		double soma = 0;
		String resp = null;
		double media;
		boolean verdade = true;
		
		do{
		
			System.out.println("Digite a idade");
			idade = scan.nextInt();
			soma += idade;
			cont += 1;
			
			System.out.println("Deseja adicionar outra idade? S ou N?");
			resp = scan.next();
			if(resp.equalsIgnoreCase("s")){
			
				verdade = false;
			}else{
				if(resp.equalsIgnoreCase("n")){
				
					verdade = true;	
				}
			}
		}while(!verdade);
		
		media = (soma/cont);
		
		if(media < 25){
			System.out.println("Essa turma é Joven");
			System.out.println("A média é de: "+media);
		}else{
			if((media > 26) & (media < 60)){
				System.out.println("Essa turma é Adulta");
				System.out.println("A média é de: "+media);
			}else{
				if(media > 60){
					System.out.println("Essa turma é Idosa");
					System.out.println("A média é de: "+media);
				}
			}
		}
	}
}
