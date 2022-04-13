package eleve;

public class Eleve {

	private String nom;
	private String prenom;
	private Groupe groupe;
	private boolean coupable;
	
	public Eleve(String nom, String prenom,  boolean coupable) {
		this.nom = nom;
		this.prenom = prenom;
		this.coupable = coupable;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	public boolean isCoupable() {
		return coupable;
	}
	public void setCoupable(boolean coupable) {
		this.coupable = coupable;
	}
}
