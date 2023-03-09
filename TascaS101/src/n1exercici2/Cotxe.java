package n1exercici2;

public class Cotxe {

	private final float potencia;
	private static String model;
	private static final String marca = "Ford";
	
	public Cotxe(float potencia, String model) {
		this.potencia = potencia;
		this.model = model; // canviara el model de tots els objectes cotxes creats al ultim objecte creat
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
