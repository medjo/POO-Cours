public class ExpBinaireMult extends ExpBinaire {
    public ExpBinaireMult(ExpAbstraite opG, ExpAbstraite opD) {
	super(opG, opD);
    }

    public String toStringInfixe() {
	return "(" + super.opGauche.toStringInfixe() + " × " + super.opDroite.toStringInfixe() + ")";
    }

    public double evaluer(Env env) {
	return super.opGauche.evaluer(env) * super.opDroite.evaluer(env);
    }
}
