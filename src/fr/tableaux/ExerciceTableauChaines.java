package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        // Exercice : déclaration et modification des tableaux

        // Déclaration du tableau
        String[] tabVilles = {"Lyon","Toulouse","Nantes","Brest","Avignon"} ;

        // Affichage des informations du tableau
        for (int i = 0; i < tabVilles.length; i++) {
            System.out.println("- Ville numéro : "+i+ "-" + tabVilles[i]);
        }
        System.out.println("- Longueur du tableau : "+tabVilles.length);

        // Modification du 3° élément tableau et test
        tabVilles[2] = "Reims";
        for (int i = 0; i < tabVilles.length; i++) {
            System.out.println("- Ville numéro : "+i+ "-" + tabVilles[i]);
        }

    }
}
