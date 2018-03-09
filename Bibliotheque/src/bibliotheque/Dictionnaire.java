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
public class Dictionnaire extends Document {
    private String langue;
    private int nbTome;
    
    public Dictionnaire(String titre,String langue,int nbTome){
        super(titre);
        this.langue = langue;
        this.nbTome= nbTome;
    }
    
    public String getLangue(){
        return langue;
    }
    
    public int getNbTome(){
        return nbTome;
    }
    
    public String toString(){
        return super.toString()+" "+langue+" "+nbTome;
    }
    
}
