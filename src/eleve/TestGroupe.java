package eleve;

public class TestGroupe {

	public static void main(String[] args) {
		Groupe grp1 = new Groupe("Groupe 1", 15);
 		Eleve el1 = new Eleve("Mondeu", "France", grp1, false );
 		Eleve el2 = new Eleve("Hui", "Chan", grp1, false );
 		Eleve el3 = new Eleve("Juste", "Alexandre", grp1, false );
 		
 		grp1.ajouterEleve(el1);
 		grp1.ajouterEleve(el2);
 		grp1.ajouterEleve(el3);
 		
 		for(Groupe current : grp1) {
 			
 		}
	}

}
