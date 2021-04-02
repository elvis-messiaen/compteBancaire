/**
 * 
 */
package fr.afpa.vue;

import java.util.Scanner;

/**
 * @author ${Elvis}
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * menu affichage
		 */
		int value;
		do {

			System.out.println("1-  Créer une agence");
			System.out.println("2-  Créer un client ");
			System.out.println("3-  Créer un compte bancaire) ");
			System.out.println("4-  Rechercher un compte (numéro de compte) ");
			System.out.println("5-  Rechercher un client (numéro de client) ");
			System.out.println("6-  Afficher la liste des comptes d'un client");
			System.out.println("7-  Imprimer les infos client (identifiant)");
			System.out.println("8-  Désactiver un client ");
			System.out.println("9-  Supprimer un compte");
			System.out.println("10- Quitter le programme");
			Scanner in = new Scanner(System.in);
			value = in.nextInt();
		} while (value < 0 || value > 10);
		switch (value) {
		case 1:
			System.out.println("test pour le case 1");
			break;
		case 2:
			System.out.println("test pour le case 2");
			break;
		case 3:
			System.out.println("test pour le case 3");
			break;
		case 4:
			System.out.println("test pour le case 4");
			break;
		case 5:
			System.out.println("test pour le case 5");
			break;
		case 6:
			System.out.println("test pour le case 6");
			break;
		case 7:
			System.out.println("test pour le case 7");
			break;
		case 8:
			System.out.println("test pour le case 8");
			break;
		case 9:
			System.out.println("test pour le case 9");
			break;
		case 10:
			System.exit(10);
			break;

		}

	}
}
