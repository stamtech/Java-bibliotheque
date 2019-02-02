public class Main {

    public static void main(String[] args) {


        Bibliotheque alexandra = new Bibliotheque();
        alexandra.ajouterLivre("Apprendre le java", "Sofiane", 200);
        
        alexandra.ajouterLivre("Apprendre le C#", "Greg", 400);
        alexandra.ajouterVieuLivre("le cycle de la fondation", "isaac assimov", 400, 1950);

        System.out.println(alexandra.rechercher("V2"));

    }
}
