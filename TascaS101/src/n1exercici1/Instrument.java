package n1exercici1;

public abstract class Instrument {

	private String nom;
	private float preu;
	
	public Instrument(String nom, float preu) {
		this.nom = nom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public abstract void tocar();
	
	public String toString() {
		return "Instrument [nom=" + nom + ", preu=" + preu + "]";
	}

}
