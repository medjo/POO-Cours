public class Variable extends ExpAbstraite {
    private String nom;

    public Variable(String n) {
	this.nom = n;
    }

    public String toStringInfixe() {
	return new String(nom);
    }

    public double evaluer(Env env) {
	return env.obtenirValeur(nom);
    }
}
