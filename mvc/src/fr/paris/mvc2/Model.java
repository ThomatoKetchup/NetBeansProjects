package fr.paris.mvc2;

import java.util.Observable;

public class Model extends Observable {

	String valeur;

	public String getValeur() {		
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
		
		/*cela permet de notifier les observateurs, 
		quand on change la valeur, que l'objet a changé*/
		this.setChanged(); //le modèle dit qu'il a changé 
		this.notifyObservers(); //le modèle notifie les observeurs
	}
	
}
