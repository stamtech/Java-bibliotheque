public abstract class Document {

   protected String titre;
   protected int nombreDePage;
   protected boolean empruntable;
   protected int numeroOrdre;
   private static int numeroOrdreCounter;
   Document(String titre, int nombreDePage){
      this.titre=titre;
      this.nombreDePage= nombreDePage;
      this.numeroOrdre=numeroOrdreCounter;
      this.numeroOrdreCounter++;
   }

   protected boolean isEmpruntable(){
      return this.empruntable;
   }
   protected abstract String getOrderNumber();
   protected abstract double getBookValue();
}
