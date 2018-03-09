/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

/**
 *
 * @author Nguye
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionnaireCalculatrice  {
   
    public GestionnaireCalculatrice(){        
    }
    
    public float readFloat(){
        Scanner sc= new Scanner(System.in);
        float x;
        try{
            System.out.println("Entrer chiffre :");
             x = sc.nextFloat();
        }
        catch(InputMismatchException e){
            System.out.println("Erreur : entrez un float");
            x=readFloat();  
    }
        return x;
    }
    
    public String readString(){
        Scanner sc= new Scanner(System.in);

        System.out.println("Entrer le String:");
        return(sc.next());
    }
}
