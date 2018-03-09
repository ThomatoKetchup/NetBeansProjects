/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class TestPile {
    public static void main(String[] args){
        Pile p1 = new Pile(3);
        System.out.println(p1.estVide()); //true
        p1.empiler(2);
        p1.empiler(18);
        System.out.println(p1.estVide()); //false
        System.out.println(p1.estPleine()); //false
        p1.empiler(372);
                p1.afficher();

        System.out.println(p1.estPleine()); //true
        System.out.println(p1.depiler());//372
        System.out.println(p1.depiler());//28
        System.out.println(p1.depiler());//2

        

        
    }
    
}
