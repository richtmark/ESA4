import java.util.ArrayList;
import java.io.IOException;

/**
 * Klasse stellt verschiedene Methoden
 * zur Verwaltung der Objekte der Klasse
 * TelefonEintrag
 *
 * @author Markus Richter
 * @version 1.0, 11/2016
 * 
 */

public class TelefonListe {


	//ANLEGEN
    /**
     * Statische Methode erstellt ein Objekt vom Typ TelefonEintrag
     * mit 3 param strVorname, strNachname, strTelNr
     * und  fügt dieses Objekt an eine an die Methode übergebene ArrayList.
     *
     * @param
     * 		ArrayList<TelefonEintrag> - an die Methode übergebene Liste
     * @param
     * 		String strVorname - Vorname
     * @param
     * 		String strNachname - Nachname
     * @param
     * 		String strtelNr - Telefonnummer
     * @throws
     * 		IOException strTelNr nicht auschließlich aus Ziffern
     *
     */
	private static void eintragAnlegen(ArrayList<TelefonEintrag> arrListEintrag, String strVorname, String strNachname, String strTelNr) throws IOException {
		//Regulärer Ausdruck prüft ob die TelNNummer aus Zahlen besteht
		if 	(strTelNr.matches("[0-9]*") == false) {
			throw new IOException("Es ist ein Fehler aufgetreten. Eine Telefonummer besteht nur aus Ziffern!");
		}
		TelefonEintrag objNeuEintrag = new TelefonEintrag(strVorname, strNachname, strTelNr);
		arrListEintrag.add(objNeuEintrag);
	}

	// ERSETZEN
    /**
     * Überladene statische Methode erstellt ein Objekt vom Typ TelefonEintrag
     * mit 3 param strVorname, strNachname, strTelNr
     * und ERSETZT ein Objekt aus der ArrayList an der übergebenen Position
     *
     * @param
     * 		int intIndex - Position des Objektes das ERSETZT wird
     * @param
     * 		ArrayList<TelefonEintrag> - an die Methode übergebene Liste
     * @param
     * 		String strVorname - Vorname
     * @param
     * 		String strNachname - Nachname
     * @param
     * 		String strTelNr - Telefonnummer
 	 * @throws
     * 		IOException wenn strTelNr nicht auschließlich aus Ziffern
     */
	private static void eintragAnlegen(int intIndex, ArrayList<TelefonEintrag> arrListEintrag, String strVorname, String strNachname, String strTelNr) throws IOException {
		//Regulärer Ausdruck prüft ob die TelNNummer aus Zahlen besteht
		if 	(strTelNr.matches("[0-9]*") == false) {
			throw new IOException("Es ist ein Fehler aufgetreten. Eine Telefonummer besteht nur aus Ziffern!");
		}
		TelefonEintrag objNeuEintrag = new TelefonEintrag(strVorname, strNachname, strTelNr);
		//Hier wird das Objekt entsprechend dem übergebenen INDEX ersetzt
		arrListEintrag.set(intIndex, objNeuEintrag);
	}



    //LOESCHEN
    /**
     * Methode zum loeschen eines Objektes TelefonEintrag
     * an der Index-Position einer übergebenen ArrayList
     *
     * @param intIndex
     * 			Position an der aus der ArrayList geloescht werden soll
     *
     * @param arrListEintrag
     *            ArrayList die besarbeitet werden soll
     */
    private static void loescheObjekt(int intIndex, ArrayList<TelefonEintrag> arrListEintrag) {
    	arrListEintrag.remove(intIndex);
    }


    //SUCHEN
    /**
     * Methode zum durchsuchen eines Objektes TelefonEintrag
     *
     * @param strSuche
     * 			String  nach dem gesucht werden soll
     *
     * @param arrListEintrag
     *            ArrayList die durchsucht werden soll
     */
    private static void sucheObjekt(String strSuche, ArrayList<TelefonEintrag> arrListEintrag) {
    	boolean boolFound = false;
    	int intIndexCount = 0;

        for (TelefonEintrag inhalt : arrListEintrag) {
        	if (strSuche.equals(inhalt.getVorname())) {
        		System.out.println("Vorname gefunden!");
        		System.out.println("Bei Index: " +  intIndexCount + " " + (inhalt.toString()));
        		boolFound = true;
        	}

        	if (strSuche.equals(inhalt.getNachname())) {
        		System.out.println("Nachname gefunden!");
        		System.out.println("Bei Index: " +  intIndexCount + " " + (inhalt.toString()));
        		boolFound = true;
        	}

        	if (strSuche.equals(inhalt.getTelNr())) {
        		System.out.println("Telefonnummer gefunden!");
        		System.out.println("Bei Index: " +  intIndexCount + " " + (inhalt.toString()));
        		boolFound = true;
    		}
        	intIndexCount++;
        }

        if (boolFound == false) {
        	System.out.println("Keine Eintraege gefunden!");
        }
    }



	//AUSGEBEN
    /**
     * Methode zum Ausgeben des Inhalts der ArrayList auf der Konsole.
     *
     * @param arrListEintrag
     *            ArrayList die ausgegeben werden soll
     */
    private static void ausgebenArrayList(ArrayList<TelefonEintrag> arrListEintrag) {
        // Gesamtanzahl der Elemente ausgeben
        System.out.println("In der ArrayList sind " + arrListEintrag.size() + " Objekte.");
        // Schleife ueber alle Elemente der ArrayList
        for (TelefonEintrag inhalt : arrListEintrag) {
            System.out.println(inhalt.toString());
        }
    }



    /**
     * Test Methode main
     *
     * @param args
     *           Ubergabeparameter - ungenutzt
     */
	//########################### MainTest #######################################
	public static void main (String[] args) throws IOException {
		//Arraylist erzeugen
		ArrayList<TelefonEintrag> arrListEintrag = new ArrayList<TelefonEintrag>(5);

		//ANLEGEN von 5 Testeinträgen mit Ausgabe
		eintragAnlegen(arrListEintrag, "Hans", "Wurst", "12345");
		eintragAnlegen(arrListEintrag, "Peter", "Penner", "54321");
		eintragAnlegen(arrListEintrag, "Rosa", "Linde", "4444444");
		eintragAnlegen(arrListEintrag, "Markus", "Richter", "0305457");
		eintragAnlegen(arrListEintrag, "Max", "Mustermann", "12345");
		ausgebenArrayList(arrListEintrag);
		System.out.println();

		//ERSETZEN von Objekt Index 1 (2 Objekt) mit Ausgabe
		eintragAnlegen(1, arrListEintrag, "Ernst", "Ersatz", "1100011");
		System.out.println("Das Objekt bei Index 1 wurde ersetzt.\n");
		ausgebenArrayList(arrListEintrag);
		System.out.println();

		//LOESCHEN von Objekt Index 1 (2 Objekt) mit Ausgabe
		loescheObjekt(1, arrListEintrag);
		System.out.println("Das Objekt bei Index 1 wurde geloescht.\n");
		ausgebenArrayList(arrListEintrag);
		System.out.println();

		//SUCHEN nach String "Markus" mit Ausgabe
		System.out.println("Es wird nach dem String \"Markus\" gesucht.");
		sucheObjekt("Markus", arrListEintrag);

	}
} // CLASS END