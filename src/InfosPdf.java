/**
 * Disponible dans le dossier  TP-C-line :
 * Import de IText 5  sous le nom iText-5.0.5.
 * Screen Ajout Bibliotheque IText.JPG pour aide à l'ajout de la bibliotheque IText.
 */

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class InfosPdf {

    /**
     * Le nom ou chemin ou le PDF sera crée.
     */
    public static final String PDF = "Informations.pdf";

    /**
     * Création du fichier : Informations.pdf
     *
     * @param args pas besoin d'arguments
     */
    public static void main(String[] args) throws DocumentException, IOException {
        new InfosPdf().creattionPdf(PDF);
    }

    /**
     * Création du document PDF.
     *
     * @param nomExtension le conteneur.
     * @throws DocumentException
     * @throws IOException
     */
    public void creattionPdf(String nomExtension)
            throws DocumentException, IOException {
        /**
         * Etape 1 : Instenciation du document PDF.
         */
        Document document = new Document();
        /**
         * Etape 2 : Ecriture de fichier PDF.
         */
        PdfWriter.getInstance(document, new FileOutputStream(nomExtension));
        /**
         * Etape 3 : Ouverture du document PDF pour pouvoir le remplir.
         */
        document.open();
        /**
         * Etaê 4 : Ajout des différents contenus.
         */
/**
 * Etape 4 : Ajout des différents contenus.
 */
        Personne personne = new Personne("Laraba", "Anis", 37, "masculin");
        Palmares palmares = new Palmares(1, 3);
        Pilote pilote = new Pilote(personne.getNom(), personne.getPrenom(), personne.getAge(), personne.getSexe(), 1, palmares, 10);
        Vehicule vehicule = new Vehicule(1, 100, pilote, "bmw", "pro");
        Voiture voiture = new Voiture(vehicule.getNumero(), vehicule.getPuissance(), pilote, vehicule.getMarque(), vehicule.getCategorie());
        Ecurie ecurie = new Ecurie("Mercedes", "Allemande", vehicule, pilote);


        document.add(new Paragraph("BIENVENUE SUR LA COURSE"));
        document.add(new Paragraph("Le nom du joueur 1 : " + personne.getNom()));
        document.add(new Paragraph("Le prenom du joueur 1 : " + personne.getPrenom()));
        document.add(new Paragraph("Votre âge : " + personne.getAge()));
        document.add(new Paragraph("Votre sexe : " + personne.getSexe()));
        document.add(new Paragraph("Vous avez la voiture numéro : " + vehicule.getNumero()));
        document.add(new Paragraph("Votre voiture est une : " + vehicule.getMarque()));
        document.add(new Paragraph("Votre voiture a une puissance de : " + vehicule.getPuissance()));
        document.add(new Paragraph("Votre voiture est de la catégorie : " + vehicule.getCategorie()));
        document.add(new Paragraph("Vous faites partie de l'écurie : " + ecurie.getNom() + " de nationalité " + ecurie.getNationalite()));
        /**
         * Etape 5 : Fermeture du documents PDF. (Sauvegarde).
         */
        document.close();
    }
}