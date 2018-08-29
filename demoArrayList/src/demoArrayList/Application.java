package demoArrayList;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		// Notre ArrayList listePersonne de type Personne va stocker des objets de type Personne.

		ArrayList<Personne> listePersonne = new ArrayList<Personne>();

		// Donc on crée une instance de la Classe Personne

		Personne p1 = new Personne();

		// Je donne des valeurs pour notre objet p1

		p1.setNom("Poulouin");
		p1.setPrenom("Pierre");
		p1.setAge(23);
		p1.setTelephone("Demande à Vanessa");
		p1.setEmail("Pierredunors@gmail.com");

	}

}
