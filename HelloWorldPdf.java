package es.iessoterohernandez.daw.endes;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorldPdf {
    public static void main(String[] args) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();
            document.add(new Paragraph("Hola Mundo"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
