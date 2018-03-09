package bibliotheque;

public class Bibliotheque {
    public static void main(String[] args) {
        Document d = new Document("Petit chaprouge");
        //System.out.println(d.getTitre());
        //System.out.println(d.getNDoc());
        Document d1 = new Document("Blanche neige");
        
        
        //System.out.println(d1.getTitre());
        //System.out.println(d1.getNDoc());
        //System.out.println(d1);
        //ListeDeDocuments l = new ListeDeDocuments();
        //l.ajouter(d);
        //l.ajouter(d1);
        //System.out.println(l);
        
        System.out.println(Document.accesDocument(0));
        
        Livre l1 = new Livre("L'assomoir","Zola",421);
        Dictionnaire d2 = new Dictionnaire("Larousse","Français",22);
        System.out.println(Document.accesDocument(2));
        System.out.println(Document.accesDocument(3));
        
        System.out.println(d2.toString());
    }
    
}
