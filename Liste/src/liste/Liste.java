/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

/**
 *
 * @author nguye
 */
public class Liste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListeEntier l = new ListeEntier();
        l.ajouter(3);
        l.ajouter(2);
        l.ajouter(4);
        OrdonnerListe o = new OrdonnerListe();
    }
    
}
