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
public class KILOUTOU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float prixUnitaire =(float)0.0;
        Vehicule v=new Vehicule(2,prixUnitaire,"c",2);
        System.out.println(v);
        v.stock=0;
        System.out.println(v);
        //v.prixUnitaire=(float)0.0;
        //v.nbPanne=0;
        System.out.println(v.testerDispo());
        //v.typePermis="c";
        //System.out.println(v.toString());
        //System.out.println(v); //2 0.0 c
        //v.panne();
        //v.panne();
        //System.out.println(v); //0 0.0 c
        
        /*Outil o=new Outil();
        o.stock=1;
        o.prixUnitaire=(float)1.0;
        o.puissanceKW=200;
        o.reserver();
        System.out.println(o);
        */
    }
    
}
