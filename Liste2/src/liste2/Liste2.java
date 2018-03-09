/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste2;

/**
 *
 * @author nguye
 */
public class Liste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListeString l = new ListeString();
        l.ajouter("abc");
        l.ajouter("aab");
        l.ajoute("ze");
        l.ajouter("rtf");
        l.ajouter("aaa");
        int []t = OrdonnerListe.tri(l);
    }
    
}
