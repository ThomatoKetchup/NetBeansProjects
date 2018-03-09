/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiloutou;

/**
 *
 * @author nguye
 */
public class Vehicule extends Item {
    public String typePermis;
    public int nbPanne=0;
    
    public Vehicule(int stock, float prixUnitaire, String typePermis, int nbPanne){
        super(stock, prixUnitaire);
        this.typePermis = typePermis;
        
        
    }
    public void panne(){
        nbPanne++;
    }
    public void repare(){
        nbPanne--;
    }
    public String toString(){ //redéfinition car on a la même fonction que dans la classe mère 
        return((stock-nbPanne)+" "+prixUnitaire+" "+typePermis);
    }
    public boolean testerDispo(){
        return(stock-nbPanne>0);
    }
    
}
