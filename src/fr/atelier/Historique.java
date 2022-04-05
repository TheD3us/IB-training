package fr.atelier;

import java.util.Random;
import java.util.Scanner;

public class Historique {

	
	/*
		Scanner sc = new Scanner(System.in);
		String nom, prenom;
		int age;
		
		System.out.println("Bonjour, veuillez rentrer votre nom s'il vous plait :");
		
		nom = sc.nextLine();
		
		System.out.println("Puis votre prénom");
		
		prenom = sc.nextLine();
		
		System.out.println("Puis votre âge");
		
		age = sc.nextInt();
		
		System.out.println(String.format("Vous vous appelez %s %s et vous avez %d ans",prenom,nom,age));
		
		sc.close();
		
		
		============================================================================
		
				Scanner sc = new Scanner(System.in);
		
		System.out.println("Bonjour, Pouvez vous rentrer un nombre s'il vous plait ?");
		int a = sc.nextInt();
		
			int resultat = a * a;
			System.out.println(resultat);
			
		sc.close();
			
		===============================================================================
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bonjour, Pouvez vous rentrer un nombre s'il vous plait ?");
		int a = sc.nextInt();
		
		System.out.println("Puis un autre");
		int b = sc.nextInt();
		

		int resultat = a * b;
		System.out.println(resultat);
		
		resultat = a / b;
		System.out.println(resultat);
		
		resultat = a + b;
		System.out.println(resultat);
		
		resultat = a - b;
		System.out.println(resultat);
		
		resultat = a % b;
		System.out.println(resultat);
		
		resultat = (a + b)/2;
		System.out.println(resultat);
		
		sc.close();

		===========================================================================
		
				Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour, Pouvez vous choisir entre addition et soustraction s'il vous plait ?");
		String choix = sc.nextLine();

		if(choix.equalsIgnoreCase("addition") || choix.equalsIgnoreCase("soustraction")) {
		
		System.out.println("Pouvez vous rentrer un nombre s'il vous plait ?");
		int a = sc.nextInt();
		
		System.out.println("Puis un autre");
		int b = sc.nextInt();
		
		
			if(choix.equalsIgnoreCase("addition")) {
				System.out.println("Vous avez choisi l'addition : " + a + " + " + b + " = " + (a+b));
				
			}
			else {
				System.out.println("Vous avez choisi la soustraction : " + a + " - " + b + " = " + (a-b));
			}
		}
		else {
			System.out.println("Opération invalide");
		}
		
		sc.close();
		
		
		=================================================================================
		
				Scanner sc = new Scanner(System.in);
		System.out.println("Pouvez vous rentrer un nombre s'il vous plait ?");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a ; i++) {
			System.out.println(i*i);
			}
			
		==================================================================================
				Scanner sc = new Scanner(System.in);
		System.out.println("Pouvez vous rentrer un nombre s'il vous plait ?");
		int a = sc.nextInt();

		for(int i = 1; i * i <= a ; i++) {
			System.out.println(i*i);
		}
		
		=================================================================================
				Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez un nombre :");
		int[] tab = new int[] {1,5,7,4,9};
		int nombre = sc.nextInt();
		boolean verif = false;
		for(int i = 0; i < tab.length; i++) {
				if(tab[i] == nombre) {
					System.out.println("Le nombre est dans le tableau à la position " + i);
					verif = true;
				}
				else {
					
				}
			}
		if(verif == false) {
			System.out.println("Nombre introuvable");
		}
		
		==================================================================================
				int[] tab = new int[] {1,3,8,2,5};
		int[] tab2 = new int[tab.length];
		System.out.println(tab.length);
	for(int i = 0; i < tab.length; i++) {
			tab2[tab.length - i - 1 ] = tab[i];
		}
		
		for(int y = 0; y < tab.length; y++) {
		System.out.println(tab[y]);
		}
		
		for(int x = 0; x < tab2.length; x++) {
		System.out.println(tab2[x]);
		}
		
		==================================================================================
				int[] tab = new int[] {1,3,8,2,5};
		

	for(int i = 0; i < tab.length; i++) {
			tab[i] = tab[i] * 2;
			System.out.println(tab[i]);
		}
		
		=================================================================================
				int[] tab = new int[] {10,13,8,12,15};
		int total = 0;
		int minimum = 20;
		int maximum = 0;

	for(int i = 0; i < tab.length; i++) {
		System.out.println(tab[i]);
		total += tab[i];
		if(minimum > tab[i]) {
			minimum = tab[i];
		}else if(maximum < tab[i]) {
			maximum = tab[i];
		}
		else {
			
		}
		

		}
	    float moyenne = total / (tab.length ) ;
		System.out.println("La moyenne est de " + moyenne + " la note minimum est de " + minimum + " la note maximum est de " + maximum);
		
		=====================================================================================
		
			Scanner sc = new Scanner(System.in);
	System.out.println("Veuillez rentrer le nombre :");
	int n = sc.nextInt();
	int tab[] = new int[n];
	tab[0]= 1;
	
	if(n < 1) {
		System.out.println("Impossible");
		sc.close();
		return;
	}
		
	if(n > 1) {
		tab[1]=1;
	}
	
	
	for(int i = 2; i < n; i++) {
		tab[i] = tab[i-1] + tab[i-2];
	}
	for(int j = 0; j<n; j++) {
		System.out.println(tab[j]);
	}
	sc.close();
	
	=======================================================================================
	
	public static void main(String[] args) {
		int a = 50;
		int b = 6;
		System.out.println(additionner(a,b));
		System.out.println(soustraire(a,b));
		System.out.println(multiplier(a,b));
		System.out.println(diviser(a,b));
		
		}
	
	public static int additionner(int a, int b){
		int c = a + b;
		return c;
			
	}
	
	public static int soustraire(int a, int b) {
		int c = a - b;
		return c;
	}
	
	public static int multiplier(int a, int b) {
		int c = a * b;
		return c;
	}
	
	public static double diviser(int a, int b) {
		double c = a / b;
		return c;
	}
	
	===================================================================================
	public static void main(String[] args) {
		double a = 50;
		double b = 6;
		
		System.out.println(additionner(a,b));
		System.out.println(soustraire(a,b));
		System.out.println(multiplier(a,b));
		System.out.println(diviser(a,b));
		
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
	
	public static double diviser(double a, double b) {
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
		
		
		====================================================================================
		
			public static void main(String[] args) {
		String operation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un nombre :");
		double a = sc.nextInt();
		System.out.println("Puis un autre : ");
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
		}else if(operation.equalsIgnoreCase("Soustraction")) {
		System.out.println(soustraire(a,b));
		}else if(operation.equalsIgnoreCase("Multiplication")) {
		System.out.println(multiplier(a,b));
		}else if(operation.equalsIgnoreCase("Division")) {
		System.out.println(diviser(a,b));
		}else {
			System.out.println("Veuillez saisir une opération valide !");
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
	
	public static double diviser(double a, double b) {
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
	
	======================================================================================
	
		Random rand = new Random();
	int x = rand.nextInt(2);
	System.out.println(x);
		if(x == 0) {
		System.out.println("C'est pile !");
	}else {
		System.out.println("C'est face !");
	} 
	
	=====================================================================================
		public static void main(String[] args) {
	int x = (int) (Math.random() * 2);
	System.out.println(x);
		if(x == 0) {
		System.out.println("C'est pile !");
	}else {
		System.out.println("C'est face !");
	} 
	
	======================================================================================
		Scanner sc = new Scanner(System.in);
	int x = (int) (Math.random() * 100);
	System.out.println("Veuillez deviner le nombre");
	int reponse = -1;
	while(reponse != x) {
	reponse = sc.nextInt();
		if(reponse > x) {
		System.out.println("Trop grand");
	}else if(reponse < x){
		System.out.println("Trop petit");
	}else {
		System.out.println("C'est gagné");
	}
	
	}
	
	=========================================================================================
		Scanner sc = new Scanner(System.in);
	String tab[] = new String[] {"Pierre", "Papier", "Ciseaux"};
	int x = (int) (Math.random() * 3);
	System.out.println("Pierre, papier, ciseaux");
	System.out.println("1 -Pierre");
	System.out.println("2 -Papier");
	System.out.println("3- Ciseaux");
	int reponse = -1;
	reponse = sc.nextInt();
	if(reponse == (x +1) ) {
		System.out.println("La machine a joué " + tab[x]);
		System.out.println("Egalité");
	}else if(((x + 1) == 1 && reponse == 2)|| ((x + 1) == 3 && reponse == 1 ) || ((x + 1) == 2 && reponse == 3)) {
		System.out.println("La machine a joué " + tab[x]);
		System.out.println("Gagné");
	}else {
		System.out.println("La machine a joué " + tab[x]);
		System.out.println("Perdu");
	}
		
	*/
	
	
	

}
