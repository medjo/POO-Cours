public class ExpUnaireExp extends ExpUnaire {
    public ExpUnaireExp(ExpAbstraite op) {
	super(op);
    }

    public String toStringInfixe() {
	return "exp(" + super.operande.toStringInfixe() + ")";
    }

    public double evaluer(Env env) {
	return Math.exp(super.operande.evaluer(env));
    }
}
