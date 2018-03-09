
public class TestFraction {
    
    public static void main(String[] args){
    Fraction f= new Fraction(2,3); //Un constructeur
    Fraction g = new Fraction(3,5);
    f.plus(g).afficher();
   // f.afficher();
    //g.afficher(g); //
    //f.afficher(f);
    //Fraction.afficher(g);
    
    
    Fraction h=f.plus(g).plus(f);
    h.reduire();
    h.afficher();
    
    }
    
    
}
