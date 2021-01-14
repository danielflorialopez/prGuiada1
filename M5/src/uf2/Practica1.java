package uf2;

import java.util.Scanner;
/**
 * Classe que calcula el factorial d'un número
 * @author alumne
 * @version 2020
 */
public class Practica1 {
	/**
	 * Calcula el factorial de n
	 * n! = n * (n-1) * (n-2) * (n-3) * ... * 1
	 * @param n és el número al que es calcularà el factorial
	 * @return n! és el resultat del factorial de n
	 */
	
	
	public static double factorial (double n) {
		if (n == 0) 
			return 1;
		else {
			double resultat = n * factorial (n - 1);
			return resultat;
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fact;
		fact = scan.nextInt();
		System.out.println((int)factorial(fact));	
		scan.close();
	}
}
