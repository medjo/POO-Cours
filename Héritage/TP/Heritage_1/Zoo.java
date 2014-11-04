import java.util.LinkedList;

class Zoo {
	private String nom;
	private LinkedList<Animal> animaux;
	
	public Zoo(String nom) {
		this.nom = nom;
		animaux = new LinkedList<Animal>();
	}
	
	public int getNbAnimaux() {
		return animaux.size();
	}
	
	public void ajouteAnimal(Animal animal) {
		animaux.add(animal);
	}

	public void crier() {
		for (Animal a : animaux) {
			a.crier();
		}
	}
}

