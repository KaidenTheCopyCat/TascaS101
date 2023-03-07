package n3exercici1;

public class NoticiaTenis extends Noticia {

	
	//quina competició(String) parlen i de quins tenistes(String)
	
	String competicio, tenista;

	public NoticiaTenis(String titular, String competicio, String tenista) {
		super(titular);
		this.competicio = competicio;
		this.tenista = tenista;

		setPreu(calcularPreuNoticia());
		setPuntuació(calcularPuntuacioNoticia());
	}


	public float calcularPreuNoticia() {
		/*
		 * Notícies de tenis:
		 * Preu inicial: 150 € 
		 * Federer, Nadal o Djokovic: 100 €
		 */
		float preuFinal = 150;

		if (tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")) {
			preuFinal += 100;
		}
		return preuFinal;
	}

	public int calcularPuntuacioNoticia() {
		/*
		 * Notícies de Tenis: 4 punts
		 * Federer, Nadal o Djokovic: 3 punts
		 */
		int puntuacioFinal=4;

		if (tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")) {
			puntuacioFinal+=3;
		}
		return puntuacioFinal;
	}


	public String toString() {
		return super.toString()+"NoticiaTenis [competicio=" + competicio + ", tenistes=" + tenista + "]";
	}


	
}
