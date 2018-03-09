/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class Ecran {
    private char tab_ecran[][];
    private int i=0;
    private int j=0;
    
    Ecran(int i, int j){
        this.i=i;
        this.j=j;
        tab_ecran = new char[this.i][this.j];
    }
    
    public void ecrire(int i, int j, char c){
        this.tab_ecran[i-1][j-1]=c;
    }
    
    public void afficher(){
        for(int ligne=0;ligne<this.i;ligne++){
            for(int colonne=0;colonne<this.j;colonne++){
                System.out.print("|"+tab_ecran[ligne][colonne]);
            }
            System.out.println();
        }
    }
    
    
    
}
