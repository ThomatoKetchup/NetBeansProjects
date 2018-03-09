public class Pile {
    private int[] tab_pile;
    private static int tab_size = 0; //static : la variable est paratgée par tous les objets.
    private static int haut_pile =0;
    Pile(int tab_size){
        this.tab_size = tab_size;
        this.tab_pile=new int[tab_size]; //this permet de dire qu'on parle bien du tab_size initialiser en haut et non celui en argument. 
    }
    
    Pile(int tab_size, Pile p){
        this.tab_pile=new int [tab_size];
        this.tab_size=tab_size;
}
    
    public void empiler(int valeur){
        tab_pile[haut_pile]=valeur;
        haut_pile ++; 
    }
    
    public int depiler(){
        return tab_pile[--haut_pile];
    }
    
    public void afficher(){
        for (int i =0; i<tab_size;i++)
            System.out.println(tab_pile[i]);
    }
    
    public boolean estVide(){
        return (haut_pile == 0);
    }
    
    public boolean estPleine(){
        return (this.haut_pile == this.tab_size);
    }
}
