package Questao3;

public class Questao3 {
	//Escreva em java um m�todo recursivo que receba um n�mero inteiro na
	//base decimal e realize a convers�o deste n�mero para base bin�ria.
	
	public static void main(String[] args) {
		decimalParaBinario(14);	
	}
     private static void decimalParaBinario(int n) {
    	 if (n > 0) {
    		 decimalParaBinario(n/2);
    		 System.out.print(n % 2);
    	 }
     }
}