
/**
 * Klasse mit der man Namen und die Telefonnummer einer Person
 * erfassen kann.
 *
 * @author Markus Richter
 * @version 1.0, 11/2016
 * s
 */

public class TelefonEintrag {
    // Instanzvariablen
    private String strNachname, strVorname, strTeleNr;

    // Klassenvariable counter Objektanzahl
    // int intCountObj;


    //##################### Konstruktorcode ##########################

    /**
     * Konstruktor Standard
     */
    public TelefonEintrag() {
    	this.strVorname = "Vorname";
    	this.strNachname = "Nachname";
    	this.strTeleNr = "123456";
    }


    /**
     * Konstruktor 1 param
     */
    public TelefonEintrag(String strVorname) {
    	this.strVorname = strVorname;
    }

    /**
     * Konstruktor 2 param
     */
    public TelefonEintrag(String strVorname, String strNachname) {
    	this.strVorname = strVorname;
    	this.strNachname = strNachname;
    }

    /**
     * Konstruktor 3 param
     */
    public TelefonEintrag(String strVorname, String strNachname, String strTeleNr) {
    	this.strVorname = strVorname;
    	this.strNachname = strNachname;
    	this.strTeleNr = strTeleNr;
    }


    //############################### Get - Methoden #############################

    /**
     * Get-Methode Nachnamen
     *
     * @return String Nachname
     */
    public String getNachname() {
        return strNachname;
    }


    /**
     * Get-Methode Vorname
     *
     * @return String Vorname
     */
    public String getVorname() {
        return strVorname;
    }


    /**
     * Get-Methode Telefonnummer
     *
     * @return String Telefonnummer
     */
    public String getTelNr() {
        return strTeleNr;
    }

  //############################### Set - Methoden #############################
    /**
     * Set-Methode Nachnamen
     *
     * @param strNachname
     * 		Nachname Eintrag
     */
    public void  setNachname(String strNachname) {
    	this.strNachname = strNachname;
    }


    /**
     * Set-Methode Vorname
     *
     * @param strVorname
     * 		Vorname Eintrag
     */
    public void setVorname(String strVorname) {
    	this.strVorname = strVorname;
    }


    /**
     * Set-Methode Telefonnummer
     *
     * @param strTelNr
     * 		Telefonnummer Eintrag
     */
    public void  setTelNr(String strTeleNr) {
       	this.strTeleNr = strTeleNr;
    }




    //############################### SONSTIGES ###########################


    /**
     * Gibt ein TelefonEintrag-Objekt als Zeichenkette zurueck.
     *
     * @return TelefonEintrag-Objekt als String dargestellt
     */
    @Override
    public String toString() {
        // Benutzung von StringBuilder fuer bessere Effizienz
        // da String-Objekte unveraenderbar sind.
        StringBuilder sb = new StringBuilder();
        sb.append("Vorname: " + strVorname + " Nachname: " + strNachname + " TelNr: " + strTeleNr);
        return sb.toString();
    }








}