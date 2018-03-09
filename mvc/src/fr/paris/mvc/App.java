package fr.paris.mvc;

public class App {

	public static void main(String[]args) {
		View view = new View();
		view.init();
		
		Model modele = new Model();
		
		Controller contr = new Controller(modele, view.getField(), view.getLabel());
		view.getButton().addActionListener(contr);
		
	}
}
