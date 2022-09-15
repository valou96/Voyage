import java.util.ArrayList;

public class KitVoyage {

    private String _depart;
    private String _destination;
    private ArrayList<OptionVoyage> _options;

    private KitVoyage(String depart, String destination){

        this._options = new ArrayList<OptionVoyage>();
        this._depart = depart;
        this._destination = destination;

    }


    public double prix(){
        double result = 0;
        for ( OptionVoyage monOption : _options){
            monOption.prix();
            result = result + monOption.prix();
        }
        return result;
    }

    public String toString(){
        String result;
        result = "Voyage de " + this._depart + " à " + this._destination + " ,avec pour options : "+ "\n";
    
        for (OptionVoyage element : _options){
            result = result + " - " + element.getNom() + " -> " + element.prix() + " euros " + "\n" ;
        }

        result = result + "Prix total :" + prix() + " euros";
        return result;

    }
}
