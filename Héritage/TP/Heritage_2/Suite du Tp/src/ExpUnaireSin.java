public class ExpUnaireSin extends ExpUnaire {
    public ExpUnaireSin(ExpAbstraite op) {
	super(op);
    }

    public String toStringInfixe() {
	return "sin(" + super.operande.toStringInfixe() + ")";
    }

    public double evaluer(Env env) {
	return Math.sin(super.operande.evaluer(env));
    }
}

