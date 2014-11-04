public class ExpUnaireSin extends ExpUnaire {

   public ExpUnaireSin(ExpAbstraite x){
        this.operande = x;
    }

    public String toStringInfixe(){

        String s = new String();
        s += " sin ( " ;
        s += operande.toStringInfixe () ;
        s += " ) " ;
        return s;
    }


}
