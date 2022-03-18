package Questao4;
import java.util.Scanner;
public class Questao4 {

        
                // Soma dos Algarismos
                
                public static int somaAlgarismosB(int num, int somaMomentanea) {
                        if (num<1)
                                return somaMomentanea;
                        somaMomentanea+=(num % 10);
                        return somaAlgarismosB(num/10, somaMomentanea);
                }
                public static void main(String[] args) {
                        System.out.println("Digiete um numero: ");
                        
                        int num = new Scanner(System.in).nextInt();
                        int soma = somaAlgarismosB(num, 0);
                        
                   System.out.println("O valor da soma dos algarismos é: " + soma);
                   
                        
                }
                

        }