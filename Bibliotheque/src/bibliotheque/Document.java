/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

/**
 *
 * @author nguye
 */
public class Document {
    private String titre;
    static int nDoc=0;
    private int numero;
    
//    private static ListeDeDocuments l = new ListeDeDocuments(); //question3  ajoute d'un nouveau document : le mettre dans la liste.
    //A chaque fois qu'on a joute un document ça met a jour la liste de documents.  l stocke tous les documents que l'on ajoute. 
    public static Document accesDocument(int i){
        return l.getDocument(i);
    }
    
    public Document(String titre){
        this.titre=titre;
        numero=nDoc;
        nDoc++;
        l.ajouter(this);
    }
    
    public Document(String titre, int numero){
        this.titre=titre;
        if(numero>=nDoc){
            this.numero=numero;
            nDoc=numero+1;
        }
        else{
            this.numero=nDoc;
            nDoc++;
        }
    }
    
    public String getTitre(){
        return(this.titre);
    }
    
    public int getNDoc(){
        return(this.numero);
    }
    
    public String toString(){
        return getNDoc()+" "+getTitre();
    }
    
}
