package fr.atelier;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez un chiffre");
		int choix = sc.nextInt();
		
		int tabDepart[] = {0,1,0};
		int calcul = 0;
		int tab[] = new int[choix +2];
		int tab2[] = new int[choix +2];	

		for(int i = 0; i < 3; i++) {
			tab[i] = tabDepart[i];
		}
		System.out.println(" " + tab[1]);
		for(int i = 0; i < choix; i++) {
			

			for(int j = 0; j < i + 2 ; j++) {

				calcul = tab[j] + tab[j+1];
				tab2[j+1]= calcul;
				System.out.print(" " + calcul + " ");				
			}
			for(int j = 0; j < i + 3 ; j++) {
				tab[j]= tab2[j];
			}
			System.out.println("");
			
		}
		
		
	}
		
}