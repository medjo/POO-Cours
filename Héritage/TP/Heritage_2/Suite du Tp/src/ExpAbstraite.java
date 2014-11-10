public abstract class ExpAbstraite {
    public abstract String toStringInfixe();

    public abstract double evaluer(Env env);

    public String toString() {
	return "Je suis une expression et me voilà en notation infixée : " + this.toStringInfixe();
    }
}
