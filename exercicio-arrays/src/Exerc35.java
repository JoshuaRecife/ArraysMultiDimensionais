
public class Exerc35 {

	public static void main(String[] args) {
//		35. Criar um vetor A com 11 elementos, indexados de 0 at� 10. Sendo que
//			cada elemento do vetor A � formado pela pot�ncia de base 2 elevado
//			ao expoente igual a posi��o do respectivo elemento, ou seja:
//			A[i] = 2i. Sugest�o int A[11];

		double[] vetorA = new double[11];
		
		for(int i = 0; i< vetorA.length; i++){

			vetorA[i] = Math.pow(2, i);
		}
		
		System.out.print("VetorA: ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i]+" ");
		}
	}
}
