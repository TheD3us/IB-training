package fr.atelier;

import java.util.Scanner;

public class BlackJack {
	// Déclaration des variables
	public static void blackJack() {
		Scanner sc = new Scanner(System.in);
		int cartes[] = new int[52];
		int tirees[] = new int[52];
		int croupier[] = new int[10];
		int compteurTirees = 0;
		int compteurCroupier = 0;
		int joueur[] = new int[10];
		int compteurJoueur = 0;
		boolean decision = true;
		int scoreCroupier = 0;
		int scoreJoueur = 0;
		boolean croupierAPerdu = false;
		boolean joueurAPerdu = false;
		boolean partieFinie = false;
		boolean estUnAs = false;
		
		// Initialisation de la partie
		// On effectue un tirage de 2 cartes entre le croupier et le joueur
		// A chaque tirage on vérifie si il y'a un as
		
		System.out.println("Bienvenue au casino, vous êtes à la table de BlackJack");
		creationCartes(cartes);
		for(int i = 0; i < 2; i++) {
		tirage(cartes,tirees,compteurTirees,croupier,compteurCroupier);
		estUnAs = verifAs(estUnAs, compteurTirees, cartes, tirees);
		if(estUnAs == true) {
			croupier[compteurCroupier] = choixCroupier(croupier);
		}
		compteurTirees++;
		compteurCroupier++;
		tirage(cartes,tirees,compteurTirees,joueur,compteurJoueur);
		estUnAs = verifAs(estUnAs, compteurTirees, cartes, tirees);
		if(estUnAs == true) {
			joueur[compteurJoueur] = choixAs();
		}
		compteurTirees++;
		compteurJoueur++;
		}
		// On effectue un affichage de la situation et on vérifie si un des deux a perdu 
		
		System.out.println("Le croupier a tiré : " + croupier[0] + " et une carte face cachée");
		System.out.println("Vous avez tiré : " + joueur[0] + " et " + joueur[1]); 
		scoreCroupier = croupier[0] + croupier[1];
		croupierAPerdu = aPerdu(scoreCroupier);
		scoreJoueur = joueur[0] + joueur[1];
		System.out.println("Vous avez au total " + scoreJoueur);
		joueurAPerdu = aPerdu(scoreJoueur);
		partieFinie = verifApresTirage(partieFinie,croupierAPerdu,joueurAPerdu);
		
		// On demande au joueur si il veux repiocher
		
		System.out.println("Désirez vous une carte supplémentaire ? true/false");
		
		decision = sc.nextBoolean();
		while(decision == true && joueurAPerdu == false && partieFinie == false) {
			tirage(cartes,tirees,compteurTirees,joueur,compteurJoueur);
			estUnAs = verifAs(estUnAs, compteurTirees, cartes, tirees);
			if(estUnAs == true) {
				joueur[compteurJoueur] = choixAs();
			}
			scoreJoueur += joueur[compteurJoueur];
			System.out.println("Vous avez au total " + scoreJoueur + " points");
			compteurTirees++;
			compteurJoueur++;

			joueurAPerdu = aPerdu(scoreJoueur);
			partieFinie = verifApresTirage(partieFinie,croupierAPerdu,joueurAPerdu);
			if(joueurAPerdu == false) {
			System.out.println("Désirez vous une carte supplémentaire ? true/false");
			decision = sc.nextBoolean();
				}
			}
		
		// Le croupier vérifie son score et pioche au besoin
		
		while(scoreCroupier < 17 && croupierAPerdu == false && partieFinie == false) {
			tirage(cartes,tirees,compteurTirees,croupier,compteurCroupier);
			if(estUnAs == true) {
				croupier[compteurCroupier] = choixCroupier(croupier);
			}
			estUnAs = verifAs(estUnAs, compteurTirees, cartes, tirees);
			scoreCroupier += croupier[compteurCroupier];
			compteurTirees++;
			compteurCroupier++;
			croupierAPerdu = aPerdu(scoreCroupier);
			partieFinie = verifApresTirage(partieFinie,croupierAPerdu,joueurAPerdu);
			}
		System.out.println("Vous avez " + scoreJoueur + " et le croupier a " + scoreCroupier);
		partieFinie = verifFinDePartie(partieFinie,croupierAPerdu,joueurAPerdu,scoreJoueur,scoreCroupier);

		sc.close();
	}
	
	public static void creationCartes(int[] cartes) {
		int compteur = -1;
		for (int i = 2; i <= 14; i++) {
			
			for(int j = 0; j < 4; j++) {
				compteur++;
				if(i >= 11 && i <= 13) {
					cartes[compteur]= 10;

				}
				else {
				cartes[compteur]= i; 

				}
			}
		}
		System.out.println("");
	}
	
	public static void tirage(int[] cartes,int[] tirees, int compteurTirees, int[]individu, int compteur) {
		
		int a =(int) (Math.random()* 52);
		for(int i = 0; i < tirees.length; i++) {
			if(a == tirees[i]) {
				a =(int) (Math.random()* 52);
				i = 0;
			}
			
		}
		int resultat = cartes[a];
		tirees[compteurTirees] = a;
		individu[compteur] = resultat;


	}
	
	public static boolean aPerdu(int score) {
		boolean perdu = false;
		if(score > 21)
		{
			perdu = true;
		}
		return perdu;
		
	}
	public static boolean verifApresTirage(boolean verif, boolean croupierAPerdu, boolean joueurAPerdu) {
		if(croupierAPerdu == true) {

			verif = true;
		}else if(joueurAPerdu == true) {

			verif = true;
		}else {
			System.out.println("La partie continue");
			verif = false;
		}
		return verif;
	}
	
	public static boolean verifFinDePartie(boolean verif, boolean croupierAPerdu, boolean joueurAPerdu, int scoreJoueur, int scoreCroupier) {
		if(croupierAPerdu == true || scoreJoueur > scoreCroupier && joueurAPerdu == false) {
			System.out.println("Vous avez gagné la cagnotte !!");
			verif = true;
		}else if(joueurAPerdu == true || scoreJoueur < scoreCroupier) {
			System.out.println("Vous avez été plumé !! Cot cot codeeeec !!!");
			verif = true;}
			else if( scoreJoueur == scoreCroupier) {
				System.out.println("Egalite personne ne gagne");
				verif = true;
			}else {
			System.out.println("La partie continue");
			verif = false;
		}
		return verif;
	}
	
	public static boolean verifAs(boolean estUnAs, int compteurTirees, int[] cartes, int[] tirees) {
		int a = tirees[compteurTirees];
		int carteTiree = cartes[a];
		if(carteTiree == 14) {
			estUnAs = true;
		}else {
			estUnAs = false;
		}
		return estUnAs;
	}
	
	public static int choixAs() {
		int choix = 0;
		boolean correct = false;
		Scanner sc = new Scanner(System.in);
			System.out.println("Vous avez un as, voulez vous 1 points ou 11 points ?");
			choix = sc.nextInt();
			while( correct == false) {
				if(choix == 1 || choix == 11) {
					System.out.println("Vous avez choisi " + choix );
					correct = true;
				}else {
					System.out.println("Choisissez une valeur valide");
					choix = sc.nextInt();
				}
			}	
		

		return choix;
	}
	
	public static int choixCroupier(int[] croupier) {
		int choix = 0;
		int total = 0;
		for(int i = 0 ; i < croupier.length ; i++) {
			total += croupier[i];
		}
		if(total + 11 < 21) {
			choix = 11;
		}else {
			choix = 1;
		}
		return choix;
	}
}


