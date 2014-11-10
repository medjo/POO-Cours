public abstract class ExpUnaire extends ExpAbstraite {
    protected ExpAbstraite operande;

    public ExpUnaire(ExpAbstraite op) {
	this.operande = op;
    }
}
