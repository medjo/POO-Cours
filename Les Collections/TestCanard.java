import java.util.*;

public class TestCanard {

    public static void main (String[] args) {
        Set<Canard> ensemble = new HashSet<Canard>();
        ensemble.add(new Canard("Enchainé", 4));
        ensemble.add(new Canard("WC", 3));
        ensemble.add(new Canard("Herbert", 3));
        ensemble.add(new Canard("Herbert", 4));
/*
        for (int i = 0 ; i < ensemble.size() ; i++) {
            System.out.println(ensemble.get(i));//NE JAMAIS FAIRE ÇA car Thêta(n²)
        }*/

        Iterator<Canard> iter = ensemble.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
/*
        for (Canard c : ensemble) {
            System.out.println(c);
        }// Utilise un itérateur pour parcourir la ensemble
*/
    } 
}
