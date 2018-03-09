import java.util.Scanner;

public class Personne {
    Scanner sc=new Scanner(System.in);
    public String nom;
    public String prenom;
    private int id;
    public Personne suivant;
    static int compteur =0; //static : l'attribut compteur est partagé par toutes les instances de la classe, s'il n'y avait pas static, l'attribut compteur reviendrait à 0 à la déclaration de chaque nouvelle instance
    
    
    public Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom= prenom;
        this.id=compteur;
        compteur++;
    }
    
    public String toString(){
        return(id+" "+nom+" "+prenom);
    }
    
    public void ajout (String nom, String prenom){
       if(this.suivant == null){
           this.suivant = new Personne(nom,prenom);
       }
        else{
           this.suivant.ajout(nom,prenom);
        }   
    }
    
    public int nbSuivants(){
        if(this.suivant == null)
            return 0;
        else{
            return suivant.nbSuivants()+1;
        }
    }
    
    public void afficheListe(){
       if(this.suivant==null){
            System.out.println(this);
            return;
       }
       else
            System.out.println(this);
       this.suivant.afficheListe();    
    }
    
    public void retirer(int n){
        if(suivant!=null){
            if(n == 0){
                this.suivant=suivant.suivant;
            }
            else{
                this.suivant.retirer(n-1);
            }
        }      
    }
    
    public void saisirSuivant(){
        System.out.println("Entrer le prenom:");
        prenom=sc.next();
        System.out.println("Entrer le nom:");
        nom=sc.next();
        ajout(nom,prenom);
    }
}
