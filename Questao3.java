package Questao3;

public class Questao3 {
	//Escreva em java um método recursivo que receba um número inteiro na
	//base decimal e realize a conversão deste número para base binária.
	
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