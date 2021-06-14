package Biens;
import java.util.List;
import java.util.ArrayList;

public class Appartement extends Local {
    private int nbreLocal;

    //attribut navigationnel
    private List<Chambre> listChambre = new ArrayList<>();

    public Appartement(){

    }

    public Appartement(String localisation, float prix, int tauxLoc, int nbreLocal ){
        super(localisation, prix, tauxLoc);
        this.setNbreLocal(nbreLocal);
    }
    
    public Appartement(int nbreLocal){
        this.setNbreLocal(nbreLocal);
    }

    
    public int getNbreLocal() {
        return nbreLocal;
    }


    public void setNbreLocal(int nbreLocal) {
        this.nbreLocal = nbreLocal;
    }

    public void addChambre(Chambre chambre){
        listChambre.add(chambre);
    }

    @Override
    public String detail(){
        return super.detail()+ "Nombre local: "+this.nbreLocal;
    }

}
