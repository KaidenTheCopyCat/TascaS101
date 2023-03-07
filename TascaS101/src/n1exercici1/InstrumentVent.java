package n1exercici1;

public class InstrumentVent extends Instrument {

	public InstrumentVent(String nom, float preu) {
		super(nom, preu);	
	}

	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
	}

}
