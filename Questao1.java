package Questao1;
import java.util.Scanner;

	// O m�todo a seguir, executa o c�lculo do MDC (m�ximo divisor comum) 
	//de dois inteiros positivos m e n. 
			//Escreva um m�todo recursivo equivalente.
	public class Questao1  {
		public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.print ("Introduza um inteiro positivo: ");
	int m = teclado.nextInt();
	System.out.print("Introduza outro inteiro positivo: ");
	int n = teclado.nextInt();
	int k = 0;
	if(m < n)
	k = m;
	else
	k = n;
	while(m % k != 0 || n % k != 0)
	--k;
	System.out.println("O mdc entre " + m + " e " + n + " � " + k + ".");
	}
		
	}
	
	