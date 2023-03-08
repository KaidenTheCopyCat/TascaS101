package n3exercici1;

import java.util.ArrayList;

public class Redactor {

	//el seu nom, el DNI i el sou
	
	private String nom;
	private final String DNI;
	private static float sou = 1500;
	private ArrayList<Noticia> noticies;
	
	
	public Redactor(String nom, String dNI) {
		this.nom = nom;
		DNI = dNI;
		noticies = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static float getSou() {
		return sou;
	}

	public static void setSou(float sou) {
		Redactor.sou = sou;
	}

	public String getDNI() {
		return DNI;
	}

	public ArrayList<Noticia> getNoticies() {
		return noticies;
	}

	public void setNoticies(ArrayList<Noticia> noticies) {
		this.noticies = noticies;
	}

	public String toString() {
		return "Redactor [nom=" + nom + ", DNI=" + DNI + ", noticies=" + noticies + "]";
	}

}
