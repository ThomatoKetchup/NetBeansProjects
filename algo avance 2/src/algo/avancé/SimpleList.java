/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo.avancé;

/**
 *
 * @author Nguye
 */
import java.util.Iterator;


public class SimpleList implements Iterable<String> {
    private static Noeud first;
    private Noeud contenu;
    private static Noeud last;
    
    public SimpleList(){ //crée une liste vide
        this.contenu = null;
    }
    
    public Noeud getContenu() {
	return contenu;
    }
    
    public void setContenu(Noeud contenu) {
	this.contenu = contenu;
    }
   
    public void addEnTete(String s){    //ajoute au début
        this.contenu = new Noeud(s,contenu);
        this.contenu.setPrecedent(null);
        first = this.contenu;
        /*Noeud n = new Noeud(s,null,contenu);
        this.contenu.setPrecedent(n);
        this.contenu = n;*/
        //this.contenu.getSuivant().setPrecedent(this.contenu);
    }
    
    public void add(String s){  //ajoute à la fin
        this.contenu.addEnFin(s);
    }
    
    public boolean contains(String s){
        return this.contenu.containsAux(s);
    }
    
    public void insert(int i, String s){
        if(i==0) addEnTete(s);
        else {
            Noeud n = new Noeud(s);
            this.contenu.insertAux(i, n);
        }
    }
    
    public void remove(int i){
        this.contenu.removeAux(i, this);
    }
    
    public void addAll(SimpleList l) { // ajoute tous les éléments de la liste l à la fin de this
        Noeud n = l.getContenu();
        this.contenu.addAllAux(l,n);
    }
    
    public void afficher(){
        this.contenu.afficherAux();
    }
    
    public Iterator<String> iterator(){ // retourne un itérateur qui énumère les String contenus dans la liste
        return new SimpleListIterator(this);
    }   
    
}

	
	
	
	
	
	
	

