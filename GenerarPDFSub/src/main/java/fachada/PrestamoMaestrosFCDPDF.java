/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

/**
 *
 * @author caarl
 */
import DTO.PrestamoMaestrosDTO;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import excepcion.FachadaExceptionPDF;
import interfaz.IPrestamoMaestrosFCDPDF;

import java.io.FileOutputStream;
import java.io.IOException;

public class PrestamoMaestrosFCDPDF implements IPrestamoMaestrosFCDPDF {
    @Override
    public void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws FachadaExceptionPDF {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            document.add(new Paragraph("ID: " + prestamo.getId()));
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
            throw new FachadaExceptionPDF("Error al generar el PDF", e);
        }
    }
}