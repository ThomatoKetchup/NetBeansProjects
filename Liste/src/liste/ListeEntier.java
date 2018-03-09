/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

/**
 *
 */

/**
 *
 * @author nguye
 */
public class ListeEntier {
    private int taille;
    private  int[] tableau;
    public ListeEntier(){
        tableau = new int[1];
        taille=0;
    }
    
    
    public void ajouter(int i){
        if(taille >= tableau.length){
            int[] tableau2=new int[taille*2];
            for(int j = 0;j<taille;j++){
                tableau2[j]=tableau[j];
            }
            tableau = tableau2;
        }
        tableau[taille]=i;
        taille++;
    }
    
    public boolean plusGrandQue(int i, int j){
        if((i>=0)&&(j>=0)&&(i<taille)&(j<taille))
            return (tableau[i]>tableau[j]);
        else return false;
    }
    
    public boolean egal(int i, int j){
        if((i>=0)&&(j>=0)&&(i<taille)&(j<taille))
            return (tableau[i]==tableau[j]);
        else return false;
    }
    
    public int tailleListe(){
        return(taille);
    }
    
    
    
}