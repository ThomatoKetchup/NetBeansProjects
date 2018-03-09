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
public class Item {
    public int stock;
    public float prixUnitaire;
    
    public Item(int stock, float prixUnitaire){
        this.stock = stock;
        this.prixUnitaire = prixUnitaire;
    }
    public boolean testerDispo(){
        return(stock>0);
    }
    public void reserver(){
        stock--;
    }
    public String toString(){
        return(stock+" "+prixUnitaire);
    }
}
