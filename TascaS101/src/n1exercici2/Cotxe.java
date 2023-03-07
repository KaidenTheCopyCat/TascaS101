package n1exercici2;

public class Cotxe {

	private float potencia;
	private String marca, model;
	
	public Cotxe(float potencia, String marca, String model) {
		super();
		this.potencia = potencia;
		this.marca = marca;
		this.model = model;
	}

	public float getPotencia() {
		return potencia;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	static public void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	public String toString() {
		return "Cotxe [potencia=" + potencia + ", marca=" + marca + ", model=" + model + "]";
	}
	
	
	
}
