public class VieuxLivre extends Livre {
    private  int annee;
    VieuxLivre(String titre, int numeroDePage, String nomAuteur, int annee) {
        super(titre, numeroDePage, nomAuteur);
        this.empruntable=false;
        this.annee = annee;
    }


    @Override
    protected String getOrderNumber() {
        return "V"+this.numeroOrdre;
    }

    @Override
    protected double getBookValue() {
        return 0.4* this.nombreDePage;
    }



    @Override
    public String toString() {
        return getOrderNumber()+ " - "+ titre + " - par "+ nomAuteur + " - "+ nombreDePage+ " pages - "+annee;
    }
}
