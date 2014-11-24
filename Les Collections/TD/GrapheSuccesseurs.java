import java.util.*;
public class GrapheSuccesseurs implements Graphe {
    
    private  Set<Sommet> listeSommets;

    public Set<Sommet> getListeSommets() {
        return listeSommets;
    }



	public void ajouteSommet(String label) {
        Sommet newSommet = new Sommet( label);
        listeSommets.add(newSommet);

    }
	public void ajouteArc(String labelDepart, String labelArrivee) {
        
    }
}
