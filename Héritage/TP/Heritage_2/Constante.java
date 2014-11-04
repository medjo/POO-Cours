public class Constante extends ExpAbstraite {
    
    private double valeur;

    public double getValeur(){
        return valeur;
    }

    public Constante(double val){
        valeur = val;
    }
    
    public String toStringInfixe(){
        String s ;
        s = (new Double(valeur)).toString();
        return s;

    }

}
