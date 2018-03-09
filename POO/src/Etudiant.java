/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class Etudiant extends Personne{
    public int annee;
    public String cursus="MIAGE";
    public String toString(){
        return(super.toString()+" "+annee+" "+" "+cursus); //(id nom prenom annee cursis)
        
    }
    
}
