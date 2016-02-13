package com.joshua;

import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {
//		25. O Sr. Manoel Joaquim expandiu seus neg�cios para al�m dos neg�cios de 1,99 
//		e agora possui uma loja de conveni�ncias. Fa�a um programa que implemente uma 
//		caixa registradora rudimentar. O programa dever� receber um n�mero desconhecido 
//		de valores referentes aos pre�os das mercadorias. Um valor zero deve ser informado 
//		pelo operador para indicar o final da compra. O programa deve ent�o mostrar o total 
//		da compra e perguntar o valor em dinheiro que o cliente forneceu, para ent�o calcular 
//		e mostrar o valor do troco. Ap�s esta opera��o, o programa dever� voltar ao ponto 
//		inicial, para registrar a pr�xima compra. A sa�da deve ser conforme o exemplo abaixo:
//		
//		o Lojas Tabajara
//		o Produto 1: R$ 2.20
//		o Produto 2: R$ 5.80
//		o Produto 3: R$ 0
//		o Total: R$ 8.00
//		o Dinheiro: R$ 20.00
//		o Troco: R$ 12.00
//		o ...
		
		Scanner scan = new Scanner(System.in);
		
		boolean sair = true;
		boolean fecharPrograma = false;
		
	do{
		double preco = 0; 
		double total = 0; 
		double pgto = 0; 
		double troco = 0;
		double prod = 0;
		int cont = 1;
			
		System.out.println("o Lojas Tabajara");
		
		do{
			System.out.print("o Produto "+cont+": R$ ");
			prod = scan.nextDouble();
			
			if(prod == 0 || prod < 0){
				sair = true;
			}else{
				total += prod;
				cont += 1; 
				sair = false;
			}
		
		}while(!sair);
		
		System.out.println("o Total: R$ "+total);
		System.out.print("o Dinheiro: R$ ");
		pgto = scan.nextDouble();
		System.out.println("o Troco: R$ "+(pgto-total));
		System.out.println("o ...");
		System.out.println(" ");
		cont = 1;
		
		if(prod < 0){
			System.out.println("...Fim do Programa...");
			fecharPrograma = true;
		}
			
	}while(!fecharPrograma);

	}
}
