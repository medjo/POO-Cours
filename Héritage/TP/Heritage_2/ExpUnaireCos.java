public class ExpUnaireCos extends ExpUnaire {
    
    public ExpUnaireCos(ExpAbstraite x){
        this.operande = x;
    }

    public String toStringInfixe(){

        String s = new String();
        s += " cos ( " ;
        s += operande.toStringInfixe () ;
        s += " ) " ;
        return s;
    }

}
