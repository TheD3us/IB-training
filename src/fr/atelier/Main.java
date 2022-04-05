package fr.atelier;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		    boolean continu = true;
			String operation;
			Scanner sc = new Scanner(System.in);
			double a = 0;
			System.out.println("Vous commencez à 0 ");
			while(continu == true) {
			

			System.out.println("Veuillez choisir un nombre : ");
			double b = sc.nextInt();
			System.out.println("Veuillez choisir l'opération : ");
			System.out.println("-Addition");
			System.out.println("-Soustraction");
			System.out.println("-Multiplication");
			System.out.println("-Division ");
			sc.nextLine();
			operation = sc.nextLine();
			if(operation.equalsIgnoreCase("Addition")) {
			System.out.println(additionner(a,b));
			a = additionner(a,b);
			}else if(operation.equalsIgnoreCase("Soustraction")) {
			System.out.println(soustraire(a,b));
			a = soustraire(a,b);
			}else if(operation.equalsIgnoreCase("Multiplication")) {
			System.out.println(multiplier(a,b));
			a = multiplier(a,b);
			}else if(operation.equalsIgnoreCase("Division")) {
			System.out.println(diviser(a,b));
			a = diviser(a,b);
			}else {
				System.out.println("Veuillez saisir une opération valide !");
			}
			System.out.println("Voulez vous continuer ? o / n");
			if(sc.nextLine().equals("n")) {
				continu = false;
			}
		}
			sc.close();
			
	}
		
		public static double additionner(double a, double b){
			double c = a;
			for(int i = 0; i < b; i++) {
				c++;
			}
			return c;
				
		}
		
		public static double soustraire(double a, double b) {
			double c = a;
			for(int i = 0; i < b; i++) {
				c--;
			}
			return c;
		}
		
		public static double multiplier(double a, double b) {
			double c = a;
			b--;
			for(int i = 0; i < a; i++) {
			for(int i1 = 0; i1 < b; i1++) {
				c++;
			}
			}
			return c;
		}
		
		public static int diviser(double a, double b) {
			double c = a ;
			a++;
			int compteur = 0;
			for(int i = (int) a; i > b; i++ ) {
				i--;
				compteur ++;
				for(int i1 = 0; i1 < b; i1++ ) {
					
					i--;
					c--;
				}
			}
			return compteur;
	}

}