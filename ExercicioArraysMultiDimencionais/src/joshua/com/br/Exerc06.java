package joshua.com.br;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
//		6. Modifique o programa anterior de maneira a guardar os
//			compromissos de todo o ano, organizados por mês, dia e hora
//			(só 8 horas por dia).
		
		Scanner scan = new Scanner(System.in);
		String[][][] compromissos = new String[12][31][8];
		
		byte opcao;
		byte dia = 0;
		byte hora = 0;
		byte mes = 0;
		boolean sair = false;
		boolean diaValido;
		boolean horaValido;
		boolean mesValido;
		
		while(!sair){
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair.");
			opcao = scan.nextByte();
			
			if(opcao == 1){ // agendar compromisso
				
				mesValido = false;
				while(!mesValido){
					System.out.println("Entre com o mês.");
					mes = scan.nextByte();
				if(mes > 0 && mes <= 12){
						mesValido = true;
					}else{
						System.out.println("Mês inválido, digite novamente");
					}
				}
				
				diaValido = false;
				while(!diaValido){
					System.out.println("Entre com o dia do mês");
					dia = scan.nextByte();
					
					if(dia > 0 && dia <= 31){
						diaValido = true;
					}else{
						System.out.println("Dia inválido, digite novamente");
					}
				}
				
				horaValido = false;
				while(!horaValido){
					System.out.println("Entre com a hora do compromisso.");
					hora = scan.nextByte();
					
					if(hora > 8 && hora <= 16){
						horaValido = true;
					}else{
						System.out.println("Hora inválida, digite um horário entre 8 e 16 horas");
					}
				}
				mes--;
				dia--;
				System.out.println("Digite o compromisso");
				compromissos[mes][dia][hora] = scan.next();
				
			}else{
				if(opcao == 2){ //verificar compromisso
					
					mesValido = false;
					while(!mesValido){
						System.out.println("Entre com o mês.");
						mes = scan.nextByte();
						
						if(mes > 0 && mes <= 12){
							mesValido = true;
						}else{
							System.out.println("Mês inválido, digite novamente");
						}
					}
					
					diaValido = false;
					while(!diaValido){
						System.out.println("Entre com o dia do mês");
						dia = scan.nextByte();
						
						if(dia > 0 && dia <= 31){
							diaValido = true;
						}else{
							System.out.println("Dia inválido, digite novamente");
						}
					}
					
					horaValido = false;
					while(!horaValido){
						System.out.println("Entre com a hora do compromisso.");
						hora = scan.nextByte();
						
						if(hora >= 8 && hora <= 16){
							horaValido = true;
						}else{
							System.out.println("Hora inválida, digite um horário entre 8 e 16 horas");
						}
					}
					mes--;
					dia--;
					System.out.println("O compromisso agendado é: ");
					System.out.println(compromissos[mes][dia][hora]);
					
				}else{
					if(opcao == 0){
						sair = true;
					}else{
						System.out.println("Opção inválida.");
					}
				}
			}
		}
	}
}
  

