public class Constante extends ExpAbstraite {
    private double valeur;

    public Constante(double val) {
	this.valeur = val;
    }

    public String toStringInfixe() {
	return "" + this.valeur;
    }

    public double evaluer(Env env) {
	return this.valeur;
    }
}
