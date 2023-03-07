package n3exercici1;

public class NoticiaFutbol extends Noticia {

	//quina competició fa referència(String), a quin club(String) i a quin jugador(String).
	
	String competicio, club, jugador;

	public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
		
		setPreu(calcularPreuNoticia());
		setPuntuació(calcularPuntuacioNoticia());
		
	}

	public float calcularPreuNoticia() {
		/*
		 * Preu inicial: 300 € 
		 * Lliga de Campions: 100 € 
		 * Barça o Madrid: 100 € 
		 * Ferran Torres o Benzema: 50 €
		 */
		float preuFinal = 300;

		if (competicio.equalsIgnoreCase("Lliga de Campions")) {
			preuFinal += 100;
		}
		if (club.equalsIgnoreCase("barca") || club.equalsIgnoreCase("madrid")) {
			preuFinal += 100;
		}
		if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
			preuFinal += 50;
		}

		return preuFinal;
	}

	public int calcularPuntuacioNoticia() {
		/*
		 * Notícies de futbol: 5 Punts
		 * Lliga de Campions: 3 punts
		 * Lliga: 2 punts
		 * Barça o Madrid: 1 punt
		 * Ferran Torres o Benzema: 1 punt
		 */
		
		int puntuacioFinal=5;
		
		if (competicio.equalsIgnoreCase("Lliga de Campions")) {
			puntuacioFinal+=3;
		}else if (competicio.equalsIgnoreCase("Lliga")) {
			puntuacioFinal+=2;
		}
		
		if (club.equalsIgnoreCase("barca") || club.equalsIgnoreCase("madrid")) {
			puntuacioFinal+=1;
		}
		
		if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
			puntuacioFinal+=1;
		}

		return puntuacioFinal;


	}

	public String toString() {
		return super.toString()+"Noticia de Futbol [competicio=" + competicio + ", club=" + club + ", jugador=" + jugador + "]";
	}
	
	

}
