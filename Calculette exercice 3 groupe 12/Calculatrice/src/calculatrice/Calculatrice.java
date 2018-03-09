/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.util.Scanner;

/**
 *
 * @author Nguye
 */
public class Calculatrice {
    static Scanner sc= new Scanner(System.in);
    private static int chiffre1;
    private static int chiffre2;
    private String op; 
    private static int resultat;
    
    public Calculatrice(){
        this.chiffre1=0;
        this.chiffre2=0;
        this.op="null";
    }
    
    public void lireDonnees(){
        System.out.println("Entrer chiffre 1 :");
        chiffre1 =sc.nextInt();
        System.out.println("Entrer l'opération :");
        op = sc.next();
        System.out.println("Entrer chiffre 2:");
        chiffre2 = sc.nextInt();
        lancerCalcul();
    }
    
    public static int getChiffre1(){
        return chiffre1;
    }
    
    public static int getChiffre2(){
        return chiffre2;
    }
    
    public static int getResultat(){
        return resultat;
    }
    
    private void lancerCalcul(){
        switch(op){
            case "+":
                resultat = Addition.calculer();
                break;
            case "-":
                resultat = Soustraction.calculer();
                break;
            default:
                System.out.println("Erreur");
 
                
        }
        
                
    }
    
    
    
    
}