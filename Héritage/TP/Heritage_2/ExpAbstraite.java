public abstract class ExpAbstraite {
    
    abstract public String toStringInfixe();

    public String toString(){

        String s = "Je suis une expression et me voila en notation infixée : ";
        s += toStringInfixe();
        return s;

    }
}
