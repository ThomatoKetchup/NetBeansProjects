/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondobjet;

/**
 *
 * @author nguye
 */
public class App {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
try{
        System.out.println("Taille tableau ? ");
        Gestionnaire g = new Gestionnaire();
        int taille = g.enterInt();
        
        TableauDObjet t=new TableauDObjet(taille);
        t.saisie(1,new Integer(4));
}
        catch(Exception     ){
                
                }
    
    }
    
}
