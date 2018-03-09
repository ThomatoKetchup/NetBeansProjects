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
public class Noeud {
    private String data;
    private Noeud suivant;
    private Noeud precedent;
    
    
    public Noeud(String data, Noeud suivant){
        this.data = data;
        this.suivant = suivant;

    }
    public Noeud(String data, Noeud precendent, Noeud suivant){
        this.data = data;
        this.precedent = precedent;
        this.suivant = suivant;

    }
    
    public Noeud(String data) {
	this.data = data;
    }
    
    public String getData() {
	return data;
    }
    
    public void setData(String data) {
	this.data = data;
    }

    public Noeud getSuivant() {
	return suivant;
    }

    public Noeud getPrecedent() {
	return precedent;
    }

    public void setSuivant(Noeud suivant) {
	this.suivant = suivant;
    }

    public void setPrecedent(Noeud precedent) {
	this.precedent = precedent;
    }
    
    public void addEnFin(String s){
        if(this.suivant == null) this.suivant = new Noeud(s,this.suivant,null);
        else this.suivant.addEnFin(s);
    }
    
    public boolean containsAux(String s){
        if(this.data.equals(s)) return true;
        else if(this.suivant == null) return false;
        else return this.suivant.containsAux(s);
    }
    
    public void insertAux(int i, Noeud n){
        Noeud m = this;
        for(int j=1; j<i; j++){
            m = m.suivant;
        }
        n.suivant = m.suivant;
        n.precedent = m;
        n.suivant.precedent = n; 
        m.suivant = n;
    }
    
    public void removeAux(int i, algo.SimpleList l){
        if(i==0) l.setContenu(this.suivant);
        else{
            Noeud p = this;
            for(int j=1; j<i; j++){
                p = p.suivant;
            }
            p.suivant = p.suivant.suivant;    
        }
    }
    
    public void addAllAux(SimpleList l, Noeud n){
        if(this.suivant == null) this.suivant = n;
        else this.suivant.addAllAux(l,n);
    }
    
    public void afficherAux(){
        if(this.suivant == null) System.out.println(this.data);
        else{
            System.out.println(this.data);
            this.suivant.afficherAux();
        }   
    }
	
}