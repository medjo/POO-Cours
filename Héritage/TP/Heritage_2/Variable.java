public class Variable extends ExpAbstraite {

    private String nom;

    public Variable(String val){
        nom = val;
    }
    
    public String toStringInfixe(){
        return nom;

    }

}
