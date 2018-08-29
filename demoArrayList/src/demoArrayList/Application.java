package demoArrayList;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		// Notre ArrayList listePersonne de type Personne va stocker des objets de type Personne.

		ArrayList<Personne> listePersonne = new ArrayList<Personne>();

		// Donc on cr�e une instance de la Classe Personne

		Personne p1 = new Personne();

		// Je donne des valeurs pour notre objet p1

		p1.setNom("Poulouin");
		p1.setPrenom("Pierre");
		p1.setAge(23);
		p1.setTelephone("Demande � Vanessa");
		p1.setEmail("Pierredunors@gmail.com");
		
		// On ajoute � notre ArrayList listePersonne l'objet p1 avec la m�thode .add
		
		listePersonne.add(p1);
		
		// Deuxi�me instance de la Classe Personne
		
		Personne p2 = new Personne();
		
		// Je donne des valeurs pour notre objet p2
		
		p2.setNom("BORDES-NEUV�GLISE");
		p2.setPrenom("Constance");
		p2.setAge(20);
		p2.setTelephone("Demande � Vanessa aussi");
		p2.setEmail("blabla@gmail.com");
		
		listePersonne.add(p2);
		

	}

}
