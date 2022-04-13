package eleve;

import java.util.Scanner;

public class Groupe {
	private String nom;
	private Eleve[] eleves;
	
	public Groupe(String nom, int nbEleves) {
		this.nom = nom;
		eleves = new Eleve[nbEleves];
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Eleve[] getEleves() {
		return eleves;
	}
	public void setEleves(Eleve[] eleves) {
		this.eleves = eleves;
	}
	
	public void ajouterEleve ( Eleve eleve) {
		boolean entre = false;
		int compteur = 0;
		while(compteur < eleves.length && entre == false ) {
			if(eleves[compteur].equals(null)) {
				eleves[compteur]= eleve;
				eleves[compteur].setGroupe(this);
				entre = true;
			}
			compteur++;
			
		}
	}
	
	
	public void retirerEleve ( Eleve eleve) {
		boolean supprime = false;
		int compteur = 0;
		while(compteur < eleves.length && supprime == false ) {
			if(eleves[compteur].equals(eleve)) {
				eleves[compteur]= null;
				eleves[compteur].setGroupe(this);
				supprime = true;
			}
			compteur++;
			
		}
	}
}
