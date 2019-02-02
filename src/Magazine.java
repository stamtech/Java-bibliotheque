public class Magazine extends Document {
    private int numero;

    Magazine(String titre, int numeroDePage, int numero) {
        super(titre, numeroDePage);
        this.empruntable=false;
        this.numero=numero;
    }

    @Override
    protected String getOrderNumber() {
        return "M"+this.numeroOrdre;
    }


    @Override
    protected double getBookValue() {
        return 0.1* this.nombreDePage;
    }

    @Override
    public String toString() {
        return getOrderNumber()+ " - "+ titre + " - "+ nombreDePage+ " pages - No ."+numero;
    }
}
