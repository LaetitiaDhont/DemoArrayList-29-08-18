package demoArrayList;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		// Notre ArrayList listePersonne de type Personne va stocker des objets de type
		// Personne.

		ArrayList<Personne> listePersonne = new ArrayList<Personne>();

		// Donc on crée une instance de la Classe Personne

		Personne p1 = new Personne();

		// J'affecte des valeurs pour notre objet p1

		p1.setNom("Poulouin");
		p1.setPrenom("Pierre");
		p1.setAge(23);
		p1.setTelephone("Demande à Vanessa");
		p1.setEmail("Pierredunors@gmail.com");

		// On ajoute à notre ArrayList listePersonne l'objet p1 avec la méthode .add

		listePersonne.add(p1);

		// Deuxième instance de la Classe Personne

		Personne p2 = new Personne();

		// J'affecte des valeurs pour notre objet p2

		p2.setNom("BORDES-NEUVÉGLISE");
		p2.setPrenom("Constance");
		p2.setAge(20);
		p2.setTelephone("Demande à Vanessa aussi");
		p2.setEmail("blabla@gmail.com");

		// On ajoute à notre ArrayList listePersonne l'objet p2 avec la méthode .add

		listePersonne.add(p2);

		// .size c'est une méthode qui récupère la taille de l'ArrayList comme le
		// .length pour les arrays.

		for (int i = 0; i < listePersonne.size(); i++) {

			// On affiche chaque prénoms de chaques elements de l'ArrayList .get(i) pour
			// récupérer la ligne et pour récupérer un élément de cette ligne c'est .get(nomDeLElement)

			System.out.print(listePersonne.get(i).getPrenom());
			System.out.print(" ");
			System.out.print(listePersonne.get(i).getNom());
			System.out.print(" ");
			System.out.print(listePersonne.get(i).getAge());
			System.out.print(" ");
			System.out.print(listePersonne.get(i).getTelephone());
			System.out.print(" ");
			System.out.println(listePersonne.get(i).getEmail());

		}

	}

}
