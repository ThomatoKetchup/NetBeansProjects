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
public class Etudiant extends Personne {

    private int[] notes;
    private String resultat="NON ADMIS";
    
  public Etudiant(String nom,String prenom, int[] notes, String adrContact, String tel){
        super(nom, prenom, adrContact, tel);
  }
  
  private int getMoyenne(int[] notes){
    int x=0;
      for(int i=0;i<notes.length;i++){
          x+=x;
      }
      return x/notes.length;
      
  }
    public String getResultat(){
        if(getMoyenne(this.notes)>10)
            this.resultat="ADMIS";
        return resultat;
    }
  }
    
  

    
  