package fr.paris.mvc2;

import fr.paris.mvc2.Controller;

public class App {

	public static void main(String[]args) {
		View view = new View();
		view.init();
		Model modele = new Model();
		Controller contr = new Controller(modele, view.getField(), view.getLabel());
		view.getButton().addActionListener(contr);
		
		//enregistrer que les trois labels ce sont des observeurs du modèle
		modele.addObserver(view.getLabel());
		modele.addObserver(view.getLabel2());
		modele.addObserver(view.getLabel3());
	}
}
