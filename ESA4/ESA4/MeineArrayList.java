/**
 * einfache Klasse zum Verwalten beliebiger
 * Objekte in Arrays
 *
 *
 * @author Markus Richter
 * @version 1.0, 11/2016
 * 
 */
public class MeineArrayList<o> {

	public Object[] objArray;
	int intIndexCount = 0;


    /**
     * Konstruktor Standard
     *
     * @param
     * 		intCapacity Anfangskapazität
     */
    public MeineArrayList(int intCapacity) {
    	objArray = new Object[intCapacity];
    }



    /**
     * Fügt ein beliebiges Objekt an die Array objArray
     * an der Indexposition intIndexCount.
     *
     * Ruft die Methode expandArray() auf Falls
     * die Größe der Array nicht aussreicht um diese
     * zu erweitern.
     *
     * @param
     * 		objObject Object das an die Array angehaengt wird
     *
     */
    public  void addObj (Object objObject) {
    	if (objArray.length-1 < intIndexCount) {
    		objArray = expandArray();
    	}
    	objArray[intIndexCount] = objObject;
    	intIndexCount++;
    }



    /**
     * Gibt eine um 10 Felder erweiterte Kopie
     * der ursprünglichen objArray zurueck.
     *
     * @Return
     * 		tempObjArray  erweiterte Kopie
     *
     */
    private  Object[]  expandArray() {
    	Object[] tempObjArray = new Object[intIndexCount + 10];
    	System.arraycopy(objArray, 0, tempObjArray, 0, objArray.length);
    	return tempObjArray;
    }



    /**
     * Loescht ein Objekt aus einer Array objArray an
     * der, an die Methode übergebene Indexposition
     *
     * @param
     * 		intPos Indexposition an der geloescht werden soll
     */
    public void removeObj(int intPos) {
    	//Index wird nach links verschoben
     	System.arraycopy(objArray,intPos+1,objArray,intPos,objArray.length-1-intPos);
     	//letztes Objekt "null" setzen das es nicht doppelt vorkommt
    	objArray[intIndexCount-1] = null;
    	//Index Counter um eins zurücksetzen
    	intIndexCount = intIndexCount - 1;
    }


    /**
     * Loescht alle Objekte aus einer Array objArray .
     * Und verkleinert diese auf 0.
     *
     */
    public void removeAll() {
    	Object[] tempArray = new Object[0];
    	System.arraycopy(objArray, 0, tempArray, 0, 0);
    	objArray = tempArray;
    	intIndexCount = 0;
    }


    /**
     * Konsolenausgabe Objekte ueber toString().
     * Die Objekte auf die zugegriffen wird sollten
     * optimalerweise in ihren eigenen Klassen eine
     * angepasste ueberschriebene toString()-Methode besitzen
     *
     */
    public void printObj () {
    	for (int i=0; i < intIndexCount; i++ ) {
    		System.out.println(objArray[i].toString());
    	}
    }

    /**
     * Konsolenausgabe Anzahl tatsächlicher Objekte.
     * Konsolenausgabe aktuelle Arraygroesse.
     *
     */
    public void printElements () {
    	System.out.println("Anzahl der Objekte: " + intIndexCount + ", Groesse Array: " + objArray.length + "\n");
    }
}