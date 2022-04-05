package fr.atelier;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int difficulte = 0 ;
		int tour = 0;
		while(difficulte < 1 || difficulte > 3) {
			
		System.out.println("choisissez la difficulté :");
		System.out.println("1-Facile");
		System.out.println("2-Normal");
		System.out.println("3-Difficile");
		difficulte = sc.nextInt();
		}
		if(difficulte == 1) {
			tour = 7;
		}else if(difficulte == 2) {
			tour = 5;
		}else if(difficulte == 3) {
			tour = 3;
		}else {
			System.out.println("Choisissez une valeur possible");
		}
		
	int x = (int) (Math.random() * 100);
	System.out.println("Veuillez deviner le nombre");
	int reponse = -1;
	for(int i = 0 ; i < tour ; i++) {
	
	reponse = sc.nextInt();
		if(reponse > x) {
		System.out.println("Trop grand");
	}else if(reponse < x){
		System.out.println("Trop petit");
	}else {
		System.out.println("C'est gagné");
		i = tour;
	
	}
	}
	}

}