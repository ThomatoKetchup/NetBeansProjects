 package calcul.imc;

import java.util.Scanner;

public class CalculIMC {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double taille;
        do{
            System.out.println("Veuillez entrer votre taille en mètres sous le format '[mètres],[centimètres]' : ");
            taille = sc.nextDouble();
        }while (taille <=0);
        
        double poids;
        do{
            System.out.println("Veuillez entrer votre poids en kilogrammes : ");
            poids = sc.nextDouble();
        }while(poids <=0);
        
        
       
        double imc = poids / (taille*taille);
        System.out.println("Votre IMC est de : "+((int)(imc*100))/100);
        if (imc <= 16.5) System.out.println("Vous êtes en dénutrition / anorexie.");
        else if (imc <= 18.5) System.out.println("Vous êtes en maigreur."); 
        else if (imc <= 25) System.out.println("Vous avez une corpulence normale.");
        else if (imc <= 30) System.out.println("Vous êtes en surpoids."); 
        else if (imc <= 35) System.out.println("Vous êtes en obésité modérée.");
        else if (imc <= 40) System.out.println("Vous êtes en obésité sévère.");
        else System.out.println("Vous êtes en obésité morbide / massive."); 




        
        
    }
    
}
