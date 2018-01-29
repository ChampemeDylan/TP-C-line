package com.itextpdf.jumpstart;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfClassement {

    // Determination du chemin pour enregistrer le pdf
    private static final String DEST = "result/classement.pdf";

    public static void main(String[] args) throws IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new PdfClassement().createPdf(DEST);
    }

    public void createPdf(String destination) throws IOException {

        // Creation du pdfWriter
        FileOutputStream fos = new FileOutputStream(DEST);
        PdfWriter writer = new PdfWriter(fos);

        // Creation du document pdr
        PdfDocument pdf = new PdfDocument(writer);

        // Initialisation du document
        Document document = new Document(pdf);

        // Ajout du text dans le pdf
        document.add(new Paragraph("Classement fin de course"));

        // Fermeture du document
        document.close();
    }
}
