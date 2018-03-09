/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

/**
 *
 * @author nguye
 */
public class Livre extends Document {
    private String auteur;
    private int nbPages;
    
    public Livre(String titre,String auteur, int nbPages){
        super(titre); //pour faire appel au constructeur de document / déclenche le constructeur de la classe mère.
        this.auteur = auteur;
        this.nbPages=nbPages;
    }
    
    public String getAuteur(){
        return auteur;
    }
    
    public int getNbPage(){
        return nbPages;
    }
    
    public String toString(){ //redefinition, on fait appel à la méthode to string de Livre et noncelle de document.
        return super.toString() +" "+auteur+" "+nbPages; //super.toString fait appl au to String de Document
    }
}
