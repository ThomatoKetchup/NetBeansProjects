import java.util.Scanner;
package architecture.orienté.objet.Etudiant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author nguye
 */
public class ArchitectureOrientéObjet {
        static Scanner sc = new Scanner(System.in);


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Etudiant e1= new Etudiant("Thomas","NGUYEN");
        int n =4;
        int []notes=; 
        for(int i =0;i<n;i++){
            System.out.println("Notes"+i);
            notes[i]=sc.nextInt();
        }



        
        //System.out.println(p1.suivant.suivant);
        System.out.println(p1.nbSuivants());
        p1.afficheListe();    }
    
}
