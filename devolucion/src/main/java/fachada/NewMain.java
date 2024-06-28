/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fachada;

import dtos.TrasladoDTO;
import exceptions.BisnessException;
import java.time.LocalDateTime;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author skevi
 */
public class NewMain {

    private static final String CORREO = "skevinjaredfigueroa@gmail.com";
    private static final String CONTRASEÑA = "fzml okes xwor nhjg";
    
    public static void main(String[] args) throws BisnessException {
        TrasladoDTO original = new TrasladoDTO(
            1, 
            "Ciudad de México", 
            4, 
            LocalDateTime.of(2024, 7, 1, 9, 30), 
            LocalDateTime.of(2024, 7, 1, 17, 30), 
            "Reunión de negocios", 
            "SUV", 
            "Todo terreno", 
            50, 
            "ABC123", 
            "empleado1@empresa.com", 
            "chofer1@empresa.com", 
            true
        );

        TrasladoDTO devolucion = new TrasladoDTO(
            2, 
            "Guadalajara", 
            2, 
            LocalDateTime.of(2024, 7, 2, 8, 0), 
            LocalDateTime.of(2024, 7, 2, 20, 0), 
            "Visita a cliente", 
            "Sedán", 
            "Radiales", 
            60, 
            "DEF456", 
            "empleado2@empresa.com", 
            "chofer2@empresa.com", 
            true
        );

        enviarCorreo(original, devolucion);
    }

    public static void enviarCorreo(TrasladoDTO original, TrasladoDTO devolucion) throws BisnessException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Estas credenciales están hardcodeadas para fines de demostración.
        // En producción, usa variables de entorno u otros métodos seguros para manejarlas.
        String username = CORREO;
        String password = CONTRASEÑA;

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress("caarlosbernal13@gmail.com"));
            message.setSubject("Comparación de Traslados");
            message.setText(contenido(original, devolucion));

            Transport.send(message);
            System.out.println("Correo enviado exitosamente.");
        } catch (MessagingException e) {
            throw new BisnessException("Error al enviar el correo", e);
        }
    }

    private static String contenido(TrasladoDTO original, TrasladoDTO devolucion) {
        StringBuilder contenido = new StringBuilder();
        contenido.append("Comparación de Traslados:\n\n");

        contenido.append("Carrocería Original: ").append(original.getCarroceria()).append("\n");
        contenido.append("Carrocería Devolución: ").append(devolucion.getCarroceria()).append("\n\n");

        contenido.append("Llantas Original: ").append(original.getLlantas()).append("\n");
        contenido.append("Llantas Devolución: ").append(devolucion.getLlantas()).append("\n\n");

        contenido.append("Combustible Original: ").append(original.getCombustible()).append("\n");
        contenido.append("Combustible Devolución: ").append(devolucion.getCombustible()).append("\n\n");

        contenido.append("Fecha y Hora de Salida Original: ").append(original.getFechaHoraSalida()).append("\n");
        contenido.append("Fecha y Hora de Regreso Original: ").append(original.getFechaHoraRegreso()).append("\n");
        contenido.append("Fecha y Hora de Regreso Devolución: ").append(devolucion.getFechaHoraRegreso()).append("\n\n");

        return contenido.toString();
    }
}
    

