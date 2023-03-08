package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Redactor> redaccio = new ArrayList<>();
	
	public static void main(String[] args) {

		menu();
		
	}
	
	static byte obtenByte(String mensaje) {
		Scanner input = new Scanner(System.in);		
		System.out.println(mensaje);
		return input.nextByte();
	}
	
	static String obtenString(String mensaje) {
		Scanner input = new Scanner(System.in);		
		System.out.println(mensaje);
		return input.nextLine();
	}
	
	static void menu() {
		
		byte opcio;
		
		do {			
			mostraMenu();
			opcio=obtenByte("Dame una opcion: ");
			
			switch (opcio) {
				case 1: // Introduir redactor.
					introduirRedactor();
					break;
				case 2://Eliminar redactor.
					eliminarRedactor(obtenString("DNI del redactor a eliminar: "));
					break;
				case 3: //Introduir notícia a un redactor.
					introduirNoticiaRedactor(obtenString("DNI del redactor al que introduir la noticia: "));
					break;
				case 4: //Eliminar notícia (ha de demanar redactor i titular de la notícia).
					eliminaNoticia(obtenString("DNI del redactor de la noticia: "), obtenString("Tirular de la noticia: "));
					break;
				case 5: //Mostrar totes les notícies per redactor.
					mostraNoticies(obtenString("DNI del redactor: "));
					break;
				case 6: //Calcular puntuació de la notícia.
					calculaPuntuacioNoticia(obtenString("DNI del redactor: "),obtenString("Titular de la noticia: "));
					break;
				case 7: // Calcular preu-notícia.
					calculaPreuNoticia(obtenString("DNI del redactor: "),obtenString("Titular de la noticia: "));
					break;
				case 0:	
					System.out.println("Gracies per usar el programa.");
					break;
	
				default:
					System.out.println("Opcio no valida.");
					break;
			}
			
		}while(opcio!=0);
		
	}

	static void mostraMenu() {
		
		System.out.println("Quina operacio vols fer?");
		System.out.println(" 1.- Introduir redactor.\n "
				+ "2.- Eliminar redactor.\n "
				+ "3.- Introduir notícia a un redactor.\n "
				+ "4.- Eliminar notícia\n "
				+ "5.- Mostrar totes les notícies per redactor.\n "
				+ "6.- Calcular puntuació de la notícia.\n "
				+ "7.- Calcular preu-notícia.\n "
				+ "0.- Sortir del programa");
	
	}
	
	
// 1.- Introduir redactor.
	
	static void introduirRedactor() {
		String nom, dni;		
		
		nom=obtenString("Introdueix nom del redactor: ");
		dni=obtenString("Introdueix DNI del redactor: ");
		
		Redactor redactor = new Redactor(nom, dni);
		redaccio.add(redactor);
		
	}
// 2.- Eliminar redactor.
	
	static void eliminarRedactor(String dni) {
		int index;		
		
		index=buscaRedactor(dni);
		
		if (index!=-1) {
			redaccio.remove(index);
			System.out.println("Redactor eliminat.");
		}else {
			System.out.println("No s'ha trovat el redactor a l'aplicacio");
		}
		
	}
	
	
// 3.- Introduir notícia a un redactor.
	
	
	static void introduirNoticiaRedactor(String dni) {
		int index;		
		
		index=buscaRedactor(dni);
		
		if (index!=-1) {
			byte opcio;

			mostraMenuTipusNoticia();
			opcio = obtenByte("Dame una opcion: ");			
			
			switch (opcio) {
			case 1:
				NoticiaFutbol noticia1 = new NoticiaFutbol(obtenString("Dame el titular:"), obtenString("Dame la competicion: "), 
						obtenString("Dame el club: "), obtenString("Dame el jugador: "));
				redaccio.get(index).getNoticies().add(noticia1);
				break;
			case 2:
				NoticiaBasquet noticia2 = new NoticiaBasquet(obtenString("Dame el titular:"), obtenString("Dame la competicion: "), 
						obtenString("Dame el club: "));
				redaccio.get(index).getNoticies().add(noticia2);
				break;
			case 3:
				NoticiaTenis noticia3 = new NoticiaTenis(obtenString("Dame el titular:"), obtenString("Dame la competicion: "), 
						obtenString("Dame el Tenista: "));
				redaccio.get(index).getNoticies().add(noticia3);
				break;
			case 4:
				NoticiaF1 noticia4 = new NoticiaF1(obtenString("Dame el titular:"), obtenString("Dame la escuderia: "));
				redaccio.get(index).getNoticies().add(noticia4);
				break;
			case 5:
				NoticiaMotociclisme noticia5 = new NoticiaMotociclisme(obtenString("Dame el titular:"), obtenString("Dame el equipo: "));
				redaccio.get(index).getNoticies().add(noticia5);
				break;
			case 0:
				System.out.println("Introducio Cancelada.");
				break;
			default:
				System.out.println("Opcio no valida.");
				break;
			}
			
			System.out.println("Noticia introducida");
			
		}else {
			System.out.println("No se ha encontrado el redactor para introduirle una noticia");
		}
	
	}

	
// 4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).
	
	static void eliminaNoticia(String dni, String titular) {
		int index;
		
		index=buscaRedactor(dni);
		
		if (index!=-1) {
			int indexNoticia = buscaNoticia(index,titular);
			
			if (indexNoticia!=-1) {
				redaccio.get(index).getNoticies().remove(indexNoticia);
				System.out.println("Redactor eliminat.");				
			}else  {
				System.out.println("No s'ha trovat la noticia");
			}
			
		}else {
			System.out.println("No s'ha trovat el redactor a l'aplicacio");
		}
		
	}
// 5.- Mostrar totes les notícies per redactor.
	
	static void mostraNoticies (String dni) {
		int index;		
		
		index=buscaRedactor(dni);
		
		if (index!=-1) {
			System.out.println(redaccio.get(index).getNoticies());
		}else {
			System.out.println("No s'ha trovat el redactor a l'aplicacio");
		}
	}
	
// 6.- Calcular puntuació de la notícia.
	
	static void calculaPreuNoticia (String dni, String titular) {
		int index;
		
		index=buscaRedactor(dni);
		
		if (index!=-1) {
			int indexNoticia = buscaNoticia(index,titular);
			
			if (indexNoticia!=-1) {
				System.out.println("El preu de la noticia es: "+ redaccio.get(index).getNoticies().get(indexNoticia).calcularPreuNoticia());
				
			}else  {
				System.out.println("No s'ha trovat la noticia");
			}
			
		}else {
			System.out.println("No s'ha trovat el redactor a l'aplicacio");
		}
		
	}
// 7.- Calcular preu-notícia.
	
	static void calculaPuntuacioNoticia (String dni, String titular) {
		int index;
		
		index=buscaRedactor(dni);
		
		if (index!=-1) {
			int indexNoticia = buscaNoticia(index,titular);
			
			if (indexNoticia!=-1) {
				System.out.println("La puntuacio de la noticia es: "+ redaccio.get(index).getNoticies().get(indexNoticia).calcularPuntuacioNoticia());
				
			}else  {
				System.out.println("No s'ha trovat la noticia");
			}
			
		}else {
			System.out.println("No s'ha trovat el redactor a l'aplicacio");
		}
		
	}


	
	static void mostraMenuTipusNoticia() {
	
		System.out.println("Que tipo de noticia: ");
		System.out.println(" 1.- Futbol \n "
				+ "2.- Basquet \n "
				+ "3.- Tenis \n "
				+ "4.- F1 \n "
				+ "5.- Motociclisme \n "
				+ "0.- Cancelar Modificacion");
	
	}
	
	
	static int buscaRedactor(String dni) {
		int index=-1;
		int i=0;
		
		while (index==-1 && i<redaccio.size()) {
			
			if (redaccio.get(i).getDNI().equals(dni)) {
				index=i;
			}			
			i++;
		}
		return index;
	}
	
	static int buscaNoticia (int index, String titular) {
		int indexNoticia=-1;
		int i = 0;
		
		while (indexNoticia==-1 && i<redaccio.get(index).getNoticies().size()) {
			
			if (redaccio.get(index).getNoticies().get(i).getTitular().equalsIgnoreCase(titular)) {
				indexNoticia=i;
			}			
			i++;
		}
				
		
		return indexNoticia;
	}
	

}
