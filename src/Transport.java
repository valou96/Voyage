public class Transport extends OptionVoyage {
    
    public boolean _trajetLong;

    public static int TARIF_LONG = 1500;
    public static int TARIF_BASE = 200;


    public Transport(boolean trajetLong, int TARIF_BASE, int TARIF_LONG){

        this._trajetLong = trajetLong;
        this.TARIF_BASE = TARIF_BASE;
        this.TARIF_LONG = TARIF_LONG;
        


    }





}
