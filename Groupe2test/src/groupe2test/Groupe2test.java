/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupe2test;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Groupe2test {
    static Scanner read = new Scanner(System.in);


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		System.out.println("cc");
		double taille = 1;
		double poids = 1;
		String restart;
		do {
			boolean error = true;
			while (error) {
				try {
                                        System.out.println("Entrer la taille en metre");
					taille = read.nextDouble();
					System.out.println("Entrer poids");
					poids = read.nextDouble();
					if (poids <= 0)
						System.out.println("Rentrer des valeurs positives");
					else {
						double imc = poids / (taille * taille);
						System.out.println("Votre imc est de :" + imc);
						error = false;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Erreur de saisie de la taille ou du poids : " + e.getMessage());
					read.nextLine();
				}

			}

			System.out.println("Voulez vous recommencer ? (oui/non)");
			restart = read.next();

		} while (restart.equals("oui"));
		System.out.println("Salut !");
	}
    
}
