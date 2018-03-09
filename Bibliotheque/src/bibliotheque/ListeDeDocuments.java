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
public class ListeDeDocuments {
    private Document[] tableau; //demandez à qqn de m'expliquer
    
    public ListeDeDocuments(){
        tableau=new Document[1]; //taille 1 au début. On peut pas faire private Document[] tableau = new Docuemnt[1] ???
    }
    
    public Document getDocument(int i){
        if(i< tableau.length){
            return tableau[i];   
        }
        else{
            return null;
        }
    }
    public void ajouter(Document d){
        if(d.getNDoc()>=tableau.length){ //si il y a un pb
            Document[] t= new Document[tableau.length*2];  //si on avait juste fait t.Length *2, ça nous assure pas que l'index rentre dans le tab
            for(int i =0;i<tableau.length;i++){
                t[i]=tableau[i]; //recopie l'ancien tableau ds le nouveau
            }
            tableau = t; //l'ancien tableau devient le nouveau tableau 
        }
        tableau[d.getNDoc()]=d; // on insère le document courant dans le tableau à la bonne case. 
    }
    
    public String toString(){
        String s ="";
        for(int i =0;i<tableau.length;i++){
            if(tableau[i] != null){
                s=s+tableau[i].toString()+"\n"; //on fait appel au toString de Document
            }
        }
        return s;
    }
    
    /*public String tousLesAuteurs(){
    String resultat=" ";
    for(int i =0;i<tableau.length;i++){
        if ((tableau[i] != null) && (tableau[i] instance Livre)){
        //si la case est non nulle et que elle est l'instance d'un livre
            resultat + = ((Livre)tableau[i]).getAuteur()+"\n";
// on le cast en livre pcq pour le compilateur, il est de type document,
        }
    }
    return resultat;
}*/
    
    public String tousLesAteurs(){
        String resultat=" ";
        for(int i=0;i<tableauDocument.length;i++){
            if((tableauDocument[i]!=null)&&(tableauDocument[i]instanceof Livre)){
                resultat+=((Livre)tableauDocument[i]).getAuteur()+"\n";
            }
        }
        return(resultat);
    }
    
}
    

