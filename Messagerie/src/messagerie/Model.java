package messagerie;

public class Model {

    public String translate(String text, String inLan, String outLan){
        switch(outLan){
        case "Francais":
            return "Bonjour";
        case "Anglais":
            return "Hello";
        default:
            return "Alo";

    }
    }
    
}
