public class OptionVoyage {
    
    private String _Nom;
    private Double _PrixForfait;
    private boolean _TarifReduit;

    private static  double COEF_TARIF_REDUIT = 0.8;
    
    
    public OptionVoyage(String Nom, Double PrixForfait){
        this._Nom = Nom;
        this._PrixForfait = PrixForfait;
        this._TarifReduit = false;
    }

    public OptionVoyage(String Nom, Double PrixForfait, boolean TarifReduit){
        this._Nom = Nom;
        this._PrixForfait = PrixForfait;
        this._TarifReduit = TarifReduit;
    }
    
    
    public String getNom() {
        return _Nom;
    }

    public double prix(){
        if (_TarifReduit == true){
            _PrixForfait = _PrixForfait * COEF_TARIF_REDUIT;
        }
        return _PrixForfait;
    }

    public String toString(){
        String result;
        result= _Nom +" -> "+ _PrixForfait +" euros";
        return result;

    }

}
