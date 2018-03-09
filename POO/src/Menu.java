import java.util.Scanner;


public class Menu {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        Personne p1= new Personne("Zar","Paul");
        p1.ajout("Zar", "Stef");
        p1.ajout("Palo","Sam");
        p1.ajout("Sarko","Nico");
        p1.ajout("Thomas","Nguyen");
        int x;
        do{
        System.out.println("(1)ajouter  (2)retirer   (3)liste (4)exit"); 
        
        
        x = sc.nextInt();
       
        switch(x){
            case 1: p1.saisirSuivant();break;
            case 2: 
                System.out.println("Indice à retirer:");
                int n=sc.nextInt();
                p1.retirer(n);
                break;
            case 3: p1.afficheListe();break;
            case 4:System.out.println("Exit");
            break;
            default:System.out.println("erreur");break;
        }
        }while(x!=4);
      
    }
}
