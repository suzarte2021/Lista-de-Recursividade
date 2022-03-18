package Questao2;
import java.util.Scanner;

public class Questao2 {
 //Desenvolva um programa em java que calcule o fatorial de um número x
// Recebe um número inteiro n >= 0 e devolve o fatorial de n */
	
	public static void main(String[] args) {
    
    Scanner imput = new Scanner(System.in);
    
    int n, fat=1;
    System.out.println("Qual numero deseja calcular o Fatorial");
    n = imput.nextInt();
    
    if (n >= 0) {
    	for(int i = 1; i <= n; i++) {
    		fat = fat * i;
    	}
    	System.out.println("Fatorial é:" +fat);
    }else {
    	System.out.println("Informe numero a partir de Zero");
    	
    	
    }
	}
	
}