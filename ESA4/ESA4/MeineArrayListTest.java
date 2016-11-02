/**
 * einfache Testklasse zum testen
 * die grundlegenden Funktionalität
 * der Klasse MeineArrayList
 *
 * @author Markus Richter
 * @version 1.0, 11/2016
 *
 */
public class MeineArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {



		//############### TESTOBJEKTE STRING ######################
		//MeineArrayList String
		MeineArrayList<String> testListe = new MeineArrayList<String>(10);

		System.out.println("######## Test fuer 3 String-Objekte Arraygroesse = 10 #########\n");

		testListe.printElements();

		//String Test-Objekte der Liste hinzufügen
		testListe.addObj("Objekt String 1");
		testListe.addObj("Objekt String 2");
		testListe.addObj("Objekt String 3");

		//String Testausgaben über MeineArrayList
		testListe.printObj();
		testListe.printElements();


		System.out.println("##############################################################\n");

		//############### TESTOBJEKTE TELEFONEINTRAG ######################

		//Objekt MeineArrayList erzeugen mit Objekten vom Typ TelefonEintrag
		MeineArrayList<TelefonEintrag> testListe2 = new MeineArrayList<TelefonEintrag>(1);

		System.out.println("####### Test fuer 3 TelefonEintrag-Objekte Arraygroesse = 1 #######\n");

		//TelefonEintrag Testobjekte erzeugen
		TelefonEintrag objNeuEintrag1 = new TelefonEintrag("Max" , "Mustermann", "123456");
		TelefonEintrag objNeuEintrag2 = new TelefonEintrag("Klaus" , "imHaus", "57454");
		TelefonEintrag objNeuEintrag3 = new TelefonEintrag("Peter" , "Lustig", "46548");

		testListe2.printElements();

		//TelefonEintrag Test-Objekte der Liste hinzufügen
		testListe2.addObj(objNeuEintrag1);
		testListe2.addObj(objNeuEintrag2);
		testListe2.addObj(objNeuEintrag3);

		//Testausgabe vor Loeschen
		testListe2.printObj();
		testListe2.printElements();

		System.out.println("Objekt aus MeineArrayList - testListe2 an Index 2 geloescht!");

		testListe2.removeObj(2);
		//Testausgabe nach Loeschen
		testListe2.printObj();
		testListe2.printElements();

		testListe2.removeAll();

		System.out.println("Alle Objekte wurden geloescht die Array wurde verkleinert.");

		testListe2.printObj();
		testListe2.printElements();

	}

}