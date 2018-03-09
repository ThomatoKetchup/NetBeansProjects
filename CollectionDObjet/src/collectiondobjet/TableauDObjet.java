/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondobjet;

/**
 *
 * @author nguye
 */
public class TableauDObjet {

    private Object tableau[];
    private int taille;
    private String type;
    
   public TableauDObjet(int n){
       this.taille=n;
       tableau=new Object[n];
    }
    public Object acceder(int i) {
        if (i > 0 && i < tableau.length) {
            return tableau[i];
        }
        return null;

    }

    public void saisie(int i, Object o) throws Exception {
        if (type == null) {
            type = o.getClass().getName();
        }
        if (type == o.getClass().getName()) {
            if (i > 0 && i < tableau.length) {
                tableau[i] = o;
            }
        } else {
            throw new Exception();
        }
    }

}
