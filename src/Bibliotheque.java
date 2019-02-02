import java.util.ArrayList;

public class Bibliotheque {

    ArrayList<Document> documents;

    Bibliotheque(){
        documents= new ArrayList<>();
    }
    public void ajouterLivre(String titre, String auteur, int nombrePages){

        documents.add(new Livre(titre,nombrePages, auteur));
        
    }

    public void ajouterVieuLivre(String titre, String auteur, int nombrePages, int annee)
    {
        documents.add(new VieuxLivre(titre,nombrePages,auteur, annee));
    }

    public void ajouterMagazine(String titre, int numeroPages, int numero){

        documents.add(new Magazine(titre, numeroPages, numero));
    }

    public Document rechercher(String OrderNumber){
        for (Document document :  documents){
            if(document.getOrderNumber().equals(OrderNumber)){
                return document;
            }
        }
        return null;
    }

    public void  Affiche(){
        for (Document document :  documents){
           System.out.println(document);
        }
    }

}
