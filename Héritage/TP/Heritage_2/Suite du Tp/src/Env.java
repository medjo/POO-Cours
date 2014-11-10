import java.util.HashMap;
import java.util.Map;

public class Env {
    private HashMap<String, Double> table;

    public Env() {
	this.table = new HashMap<String, Double>();
    }

    public void associer(String nom, double valeur) {
	this.table.put(nom, valeur);
    }

    public double obtenirValeur(String nom) {
	Double val = this.table.get(nom);
	if (val == null) {
	    throw new RuntimeException("La variable " + nom + " n'est pas affectée dans l'environnement courant !");
	}
	return val.doubleValue();
    }

    public String toString() {
	String s = "{ ";
	for (Map.Entry e: this.table.entrySet()) {
	    s += "<" + e.getKey() + " -> " + e.getValue() + "> ";
	}
	s += "}";
	return s;
    }
}
