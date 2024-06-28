/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author caarl
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import dtos.PrestamoMaestrosDTO;
import exceptions.BisnessException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrestamoMaestrosCTL {
  
    
    public void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws BisnessException {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            document.add(new Paragraph("Fecha de Préstamo: " + prestamo.getFechaPrestamo()));
            document.add(new Paragraph("Departamento: " + prestamo.getDepartamento()));
            document.add(new Paragraph("Cantidad de Personas: " + prestamo.getCantidadPersonas()));
            document.add(new Paragraph("Motivo: " + prestamo.getMotivo()));
            document.add(new Paragraph("Plantel de Origen: " + prestamo.getPlantelOrigen()));
            document.add(new Paragraph("Plantel de Destino: " + prestamo.getPlantelDestino()));
            document.add(new Paragraph("Vehículo: " + prestamo.getVehiculo()));
            document.add(new Paragraph("Correo del Responsable: " + prestamo.getCorreoResponsable()));
            document.add(new Paragraph("Acompañantes: " + String.join(", ", prestamo.getAcompaniantes())));
            document.close();
        } catch (DocumentException | IOException e) {
            throw new BisnessException("Error al generar el PDF", e);
        }
    }
    
}