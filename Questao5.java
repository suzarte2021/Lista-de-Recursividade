package recursividade;

public class recursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int disco = 3;
   hanoi(disco, 'A', 'B', 'C');
  // int numerador = 1;
   //int denominador = 0;
   //int resultado = 1;
	}
  public static void hanoi (int discos, char hasteA, char hasteB, char hasteC) {
	  if (discos > 0) {
		  hanoi(discos-1, hasteA, hasteB, hasteC);
		  System.out.printf("Mover de %s para %s/n", hasteA, hasteC);
		  hanoi(discos-1, hasteB, hasteA, hasteC);
		  
		  
	  }
  }
	  
	  
  }

