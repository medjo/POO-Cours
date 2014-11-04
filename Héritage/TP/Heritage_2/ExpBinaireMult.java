public class ExpBinaireMult extends ExpBinaire {

    private String nom = " * ";

    public ExpBinaireMult(ExpAbstraite x, ExpAbstraite y){
        this.opGauche = x;
        this.opDroite = y;
    }
    
    public String toStringInfixe(){
        String s = new String();
        s += " ( " ;
        s += opGauche.toStringInfixe();
        s += nom;
        s += opDroite.toStringInfixe();
        s += " ) " ;
        return s;

    }


}
