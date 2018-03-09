/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class Fraction {
    private int numerateur;
    private int denominateur;
    Fraction(int num,int denom){
        this.numerateur=num; //l'arguementque j'ai passé en numereteur est passé dans num
        this.denominateur=denom;
    }
    
    public Fraction plus(Fraction g){
        Fraction solution = new Fraction(g.numerateur*this.denominateur+this.numerateur*g.denominateur,g.denominateur*this.denominateur);
        return(solution);
    }
    
   
    
    public void afficher(){
        System.out.println(this.numerateur+"/"+this.denominateur);
    }
    
    public static void afficher(Fraction f){ //quand on a static on peut mettre le nom de la classe audébut/si on l'enlèvre on droit mettre f. ou g.
        System.out.println(f.numerateur+"/"+f.denominateur);
    }
    
    int pgcd (int a, int b){
        int tmp;
        while(b!=0){
            tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }    
    
    public void reduire(){
        int i= pgcd(this.numerateur,this.denominateur);
        this.numerateur /=i;
        this.denominateur/=i;
    }
    
}





