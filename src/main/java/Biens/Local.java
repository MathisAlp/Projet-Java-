package Biens;

public abstract class Local{
    protected String ref;
    protected String localisation;
    protected float prix;
    protected int tauxLoc;
    private final int FORMAT=4;
    private static int nombreLocal;

    //private Chambre chambre;
    //private Appartement appart;
    
    private String generateRef()
    {
        String nombreZero = "";
        String nombreDeLocalString = String.valueOf(++nombreLocal);
        for(int i=1; i<=(FORMAT - nombreDeLocalString.length()); i++)
        {
            nombreZero += "0";
        }
        return nombreZero + nombreDeLocalString;
    }

    public String getRef() {
        return ref;
    }

    public String getLocalisation() {
        return localisation;
    }
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getTauxLoc() {
        return tauxLoc;
    }
    public void setTauxLoc(int tauxLoc) {
        this.tauxLoc = tauxLoc;
    }

    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Local(){
        ref=generateRef();   
    }

    public Local(String localisation, float prix, int tauxLoc) {
        ref=generateRef();
        this.setLocalisation(localisation);
        this.setPrix(prix);
        this.setPrix(prix);
        this.setTauxLoc(tauxLoc);
    }

    public String detail(){
        return "Référence: " + getRef()
        + "\n Localisation: " + getLocalisation()
        + "\n Prix: " +getPrix()
        + "\n Taux location: " +getTauxLoc();
    }
    
}