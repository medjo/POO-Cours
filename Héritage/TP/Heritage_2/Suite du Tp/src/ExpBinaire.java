public abstract class ExpBinaire extends ExpAbstraite {
    protected ExpAbstraite opGauche;
    protected ExpAbstraite opDroite;

    public ExpBinaire(ExpAbstraite opG, ExpAbstraite opD) {
	this.opGauche = opG;
	this.opDroite = opD;
    }
}
