import java.util.*;

public class Sommet {
    private String label;
    private Set<Sommet> successeurs;//Set : graphe simple

    public String getLabel() {
        return label;
    }

    public Set<Sommet> getSuccesseurs() {
        return successeurs;
    }

    public Sommet( String etiquette) {
        label = new String (etiquette);
        successeurs = new HashSet<Sommet>;
    }

    public void addSuccesseur(Sommet s) {
        successeurs.add(s);
    }

    public Iterator<Sommet> iterSuccesseurs() {
        return this.successeurs.iterator();
    }
    
    @Override
    public boolean equals(Object o) {
        if ( o instanceof Sommet ) {
            return ((Sommet)o).label.equals(this.label);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.etiquette.hashCode();
    }
}
