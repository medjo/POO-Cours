public class ExpUnaireCos extends ExpUnaire {
    public ExpUnaireCos(ExpAbstraite op) {
	super(op);
    }

    public String toStringInfixe() {
	return "cos(" + super.operande.toStringInfixe() + ")";
    }

    public double evaluer(Env env) {
	return Math.cos(super.operande.evaluer(env));
    }
}
