/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculdesprix;

/**
 *
 * @author nguye
 */
public class Article {
    private int reference;
    private static int nb=0;
    private String designation;
    private double prixHT;
    private double tauxTVA;
    
    /*Un constructeur par défaut est automatiquement créé par le compilateur. C'est un constructeur vide, qui ne fait rien de particulier.
On a cependant très souvent besoin de créer soi-même un constructeur qui remplace ce constructeur vide par défaut.*/
    
    Article(){
        this.reference=nb;
        nb++;
    }
    
    Article(int reference, String designation, double prixHT, double tauxTVA){
        this.designation=designation;
        this.prixHT=prixHT;
        this.tauxTVA = tauxTVA;
        if(reference > nb ){
            this.reference = reference;
            nb=reference+1;
        }
        else{
            this.reference = nb;
            nb++;
        }
    }
    
    public double calculerPrixTTC(){
        double prixTTC;
        prixTTC = this.prixHT +(prixHT*tauxTVA/100);
        return prixTTC;
    }
    
    public String afficheArticle(){
        return reference+" "+designation+" "+prixHT+" "+tauxTVA;
    }
    
    
    
}
