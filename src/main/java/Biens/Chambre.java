package Biens;
import java.util.List;
import java.util.ArrayList;

public class Chambre  extends Local {
    private int dimension;

    //attribut navigationnel1
    private Appartement appartement = new Appartement();
    
    public Appartement getAppartement() {
        return appartement;
    }

    public void setAppartement(Appartement appartement) {
        this.appartement = appartement;
        appartement.addChambre(this);
    }

    public Chambre(String localisation, float prix, int tauxLoc, int dimension ){
        super(localisation, prix, tauxLoc);
        this.setDimension(dimension);
    }

    public Chambre(int dimension){
        this.setDimension(dimension);
    }

    public Chambre(){
        
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public float cout(int prix){
        return getPrix();
    }

    @Override
    public String detail(){
        
        return super.detail()+"Dimension: "+getDimension();
    }
    
}
