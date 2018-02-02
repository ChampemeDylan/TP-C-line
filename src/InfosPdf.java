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
     * @param    args   pas besoin d'arguments
     */
    public static void main(String[] args)throws DocumentException, IOException {
        new InfosPdf().creattionPdf(PDF);
    }

    /**
     * Création du document PDF.
     * @param nomExtension le conteneur.
     * @throws    DocumentException
     * @throws    IOException
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
        document.add(new Paragraph("Contenu 1"));
        document.add(new Paragraph("Contenu 2!"));
        document.add(new Paragraph("Contenu 3!"));
        document.add(new Paragraph("Contenu 4!"));
        /**
         * Etape 5 : Fermeture du documents PDF. (Sauvegarde).
         */
        document.close();
    }
}