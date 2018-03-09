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
public class GestionnaireCalculatrice {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Calculatrice c1 = new Calculatrice();
        c1.lireDonnees();
        System.out.println(c1.getResultat());
        

        
    }
    
}
