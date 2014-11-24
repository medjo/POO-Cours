public class Canard{
    private String nom;
    private int poids;

    public Canard(String s, int p) {
        this.nom = s;
        this.poids =  p;
    }

    public String toString() {
        return nom;
    }

    public boolean equals(Object o) {
        if ( o instanceof Canard ) {
            return ((Canard) o).nom.equals(this.nom);
        }
        return false;
    }

    @Override //Pour dire à java de vérifier que la méthode est bien une redéfinition d'un méthode présente dans une classe supérieur
    public int hashCode() {
        return this.nom.hashCode();
    }
}
