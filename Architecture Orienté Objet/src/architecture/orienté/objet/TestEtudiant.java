/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.orienté.objet;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class TestEtudiant {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        int[]notes = new int[4];
        Etudiant e1=  new Etudiant("Thomas","NGUYEN",notes);
        
        
        
        
        x = sc.nextInt();
       
        switch(x){
            case 1: p1.saisirSuivant();break;
            case 2: 
                System.out.println("Indice à retirer:");
                int n=sc.nextInt();
                p1.retirer(n);
                break;
            case 3: p1.afficheListe();break;
            case 4:System.out.println("Exit");
            break;
            default:System.out.println("erreur");break;
        }
        }while(x!=4);
      
    }
}
