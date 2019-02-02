public class Livre  extends Document{
    protected String nomAuteur;

    Livre(String titre, int nombreDePage, String nomAuteur) {
        super(titre, nombreDePage);
        this.nomAuteur= nomAuteur;
        this.empruntable=true;
    }

    @Override
    protected String getOrderNumber() {
        return "L"+this.numeroOrdre;
    }



    @Override
    protected double getBookValue() {
        return 0.2* this.nombreDePage;
    }


    @Override
    public String toString() {
        return getOrderNumber()+ " - "+ titre + " - par "+ nomAuteur + " - "+ nombreDePage+ " pages";
    }
}
