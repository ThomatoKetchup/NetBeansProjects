/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nguye
 */
public class testPersonne {
    public static void main(String[] args){
        Personne p1= new Personne("Zar","Paul");
        Personne p2= new Personne("daz","ant");
        Personne p3= new Personne("ddaz","a");


        
        //System.out.println(p1.suivant.suivant);
        System.out.println(p1.nbSuivants());
        p1.afficheListe();
    }
    
}
