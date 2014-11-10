public class ExpBinairePuiss extends ExpBinaire {
    public ExpBinairePuiss(ExpAbstraite opG, ExpAbstraite opD) {
	super(opG, opD);
    }

    public String toStringInfixe() {
	return "(" + super.opGauche.toStringInfixe() + " ^ " + super.opDroite.toStringInfixe() + ")";
    }

    public double evaluer(Env env) {
	return Math.pow(super.opGauche.evaluer(env), super.opDroite.evaluer(env));
    }
}
