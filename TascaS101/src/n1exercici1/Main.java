package n1exercici1;

public class Main {

	public static void main(String[] args) {

		InstrumentVent flauta = new InstrumentVent("Flauta", 15.99f);
		
		flauta.tocar(); // crida el metode directament desde la instancia de la classe
		
		InstrumentCorda violi = new InstrumentCorda("Violi", 356.87f);
		
		ferSonarInstrument(violi); // crida el metode a traves d'un metode static
		
	}
	
	static void ferSonarInstrument (Instrument instrument) {
		instrument.tocar();
	}

}
