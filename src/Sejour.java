public class Sejour extends OptionVoyage {

    private int _NbNuit;
    private double _PrixByNuit;

    public Sejour(String Nom, double PrixForfait, int NbNuit, double PrixByNuit){
        super(Nom, PrixForfait);
        this._NbNuit = NbNuit;
        this._PrixByNuit = PrixByNuit;
        

    }

    public double prixSejour(){
        double prixSejour;
        prixSejour = _NbNuit * _PrixByNuit + super.prix();
        return prixSejour;


    }


}
