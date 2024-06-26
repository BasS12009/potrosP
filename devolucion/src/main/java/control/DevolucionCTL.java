/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dtos.ReporteDTO;
import dtos.TrasladoDTO;
import bo.ReporteBO;
import bo.TrasladoBO;
import exceptions.BisnessException;
import interfaces.IReporteBO;
import interfaces.ITrasladoBO;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Clase que controla las operaciones de devolución utilizando objetos de negocio.
 * 
 * @autor skevi
 */
public class DevolucionCTL {

    //variables de entorno para el envio de correo
    private static final String CORREO = "skevinjaredfigueroa@gmail.com";
    private static final String CONTRASEÑA = "fzml okes xwor nhjg";
    
    // Interfaces de negocio para traslados y reportes
    ITrasladoBO traslado;
    IReporteBO reporte;

    /**
     * Constructor que inicializa los objetos de negocio para traslados y reportes.
     */
    public DevolucionCTL() {
        this.traslado = new TrasladoBO();
        this.reporte = new ReporteBO();
    }

    /**
     * Método que verifica si un traslado con el número especificado existe.
     * 
     * @param numTraslado El número del traslado a verificar.
     * @return true si el traslado existe, false en caso contrario.
     * @throws BisnessException si ocurre un error en la capa de negocio.
     */
    public boolean existe(int numTraslado) throws BisnessException {
        return traslado.existe(numTraslado);
    }

    /**
     * Método que busca y retorna un traslado con el número especificado.
     * 
     * @param numTraslado El número del traslado a buscar.
     * @return El objeto TrasladoDTO correspondiente al número de traslado especificado.
     * @throws BisnessException si ocurre un error en la capa de negocio.
     */
    public TrasladoDTO buscar(int numTraslado) throws BisnessException {
        return traslado.buscar(numTraslado);
    }

    /**
     * Método que agrega un traslado original y uno devuelto, generando un reporte.
     * 
     * @param original El objeto TrasladoDTO del traslado original.
     * @param devolucion El objeto TrasladoDTO del traslado devuelto.
     * @throws BisnessException si ocurre un error en la capa de negocio.
     */
    public void agregar(TrasladoDTO original, TrasladoDTO devolucion) throws BisnessException {
        // Crear un reporte con los traslados original y devuelto
        ReporteDTO report = new ReporteDTO(original, devolucion);
        
        // Agregar el reporte a la capa de negocio de reportes
        reporte.agregar(report);
    }

    /**
     * Método que actualiza un traslado existente.
     * 
     * @param trasladoDTO El objeto TrasladoDTO con la información actualizada del traslado.
     * @throws BisnessException si ocurre un error en la capa de negocio.
     */
    public void actualizar(TrasladoDTO trasladoDTO) throws BisnessException {
        traslado.actualizar(trasladoDTO);
    }
    
    
       /**
     * Método que valida que los campos del objeto TrasladoDTO no estén vacíos o sean nulos.
     * 
     * @param traslado El objeto TrasladoDTO a validar.
     * @return true si todos los campos son válidos, false en caso contrario.
     * @throws BisnessException si algún campo es nulo o inválido.
     */
    public boolean validaCampos(TrasladoDTO traslado) throws BisnessException {
        if (traslado == null) {
            throw new BisnessException("El objeto TrasladoDTO no puede ser nulo.");
        }
        if (traslado.getNumTraslado() <= 0) {
            throw new BisnessException("El número de traslado debe ser mayor a cero.");
        }
        if (traslado.getDestino() == null || traslado.getDestino().isEmpty()) {
            throw new BisnessException("El destino no puede estar vacío o ser nulo.");
        }
        if (traslado.getPersonas() <= 0) {
            throw new BisnessException("El número de personas debe ser mayor a cero.");
        }
        if (traslado.getFechaHoraSalida() == null) {
            throw new BisnessException("La fecha y hora de salida no pueden ser nulas.");
        }
        if (traslado.getFechaHoraRegreso() == null) {
            throw new BisnessException("La fecha y hora de regreso no pueden ser nulas.");
        }
        if (traslado.getMotivo() == null || traslado.getMotivo().isEmpty()) {
            throw new BisnessException("El motivo no puede estar vacío o ser nulo.");
        }
        if (traslado.getCarroceria() == null || traslado.getCarroceria().isEmpty()) {
            throw new BisnessException("La carrocería no puede estar vacía o ser nula.");
        }
        if (traslado.getLlantas() == null || traslado.getLlantas().isEmpty()) {
            throw new BisnessException("Las llantas no pueden estar vacías o ser nulas.");
        }
        if (traslado.getCombustible() < 0) {
            throw new BisnessException("El combustible no puede ser negativo.");
        }
        if (traslado.getPlaca() == null || traslado.getPlaca().isEmpty()) {
            throw new BisnessException("La placa no puede estar vacía o ser nula.");
        }
        if (traslado.getCorreoEmpleado() == null || traslado.getCorreoEmpleado().isEmpty()) {
            throw new BisnessException("El correo del empleado no puede estar vacío o ser nulo.");
        }
        if (traslado.getCorreoChofer() == null || traslado.getCorreoChofer().isEmpty()) {
            throw new BisnessException("El correo del chofer no puede estar vacío o ser nulo.");
        }
        // Si todos los campos son válidos
        return true;
    }

    /**
     * Compara los campos de carrocería, llantas, combustible y la fecha de devolución
     * del parámetro "devolucion" con los del parámetro "original". Si los atributos
     * de ambos objetos coinciden y la fecha y hora de devolución del objeto "devolucion"
     * no supera la fecha y hora establecida en el objeto original, entonces retorna verdadero,
     * en caso contrario retorna falso.
     * 
     * @param original El objeto TrasladoDTO original.
     * @param devolucion El objeto TrasladoDTO de la devolución.
     * @return true si los campos coinciden y la fecha de devolución no supera la original, false en caso contrario.
     * @throws BisnessException si algún objeto TrasladoDTO es nulo.
     */
    public boolean compararCampos(TrasladoDTO original, TrasladoDTO devolucion) throws BisnessException {
        if (original == null || devolucion == null) {
            throw new BisnessException("Los objetos TrasladoDTO no pueden ser nulos.");
        }

        // Comparar los campos de carrocería, llantas y combustible
        if (!original.getCarroceria().equalsIgnoreCase(devolucion.getCarroceria())) {
            return false;
        }
        if (!original.getLlantas().equalsIgnoreCase(devolucion.getLlantas())) {
            return false;
        }
        if (original.getCombustible() != devolucion.getCombustible()) {
            return false;
        }

        // Comparar la fecha y hora de devolución
        if (devolucion.getFechaHoraRegreso().isAfter(original.getFechaHoraRegreso())) {
            return false;
        }

        // Si todas las condiciones se cumplen, retornar verdadero
        return true;
    }

    /**
     * Envía un correo al chofer y al empleado en caso de que alguno de los
     * campos no haya coincidido. El contenido del correo es un comparativo
     * entre el objeto "original" y el objeto "devolucion".
     * 
     * @param original El objeto TrasladoDTO original.
     * @param devolucion El objeto TrasladoDTO de la devolución.
     * @throws BisnessException si ocurre un error al enviar el correo.
     */
    public void enviarCorreo(TrasladoDTO original, TrasladoDTO devolucion) throws BisnessException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Estas credenciales están hardcodeadas para fines de demostración.
        // En producción, usa variables de entorno u otros métodos seguros para manejarlas.
        String username = CORREO; //aqui pones tu correo
        String password = CONTRASEÑA; //aqui pones tu contraseña

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress("")); //aqui pones el correo de destino
            message.setSubject("Comparación de Traslados");
            message.setText(contenido(original, devolucion));

            Transport.send(message);
            System.out.println("Correo enviado exitosamente.");
        } catch (MessagingException e) {
            throw new BisnessException("Error al enviar el correo", e);
        }
    }
    

    /**
     * Método que define el contenido del correo a enviar.
     * 
     * @param original El objeto TrasladoDTO original.
     * @param devolucion El objeto TrasladoDTO de la devolución.
     * @return El contenido del correo como una cadena de texto.
     */
    private String contenido(TrasladoDTO original, TrasladoDTO devolucion) {
        // Generar el contenido del correo comparando los campos de los dos traslados
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
