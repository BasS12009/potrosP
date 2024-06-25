/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guardar;

/**
 *
 * @author caarl
 */


public class GuardarDatosFrame {

    public static class SaveDatosFrame {
        private static String departamentoProfesor;
        private static String motivo;
        private static String plantelDestino;
        private static String plantelOrigen;
        private static String vehiculo;
        private static String fechaPrestamo;
        private static String acompaniante1;
        private static String acompaniante2;
        private static String acompaniante3;
        private static String acompaniante4;
        private static String correoResponsable;

        public static String getDepartamentoProfesor() {
            return departamentoProfesor;
        }

        public static void setDepartamentoProfesor(String departamentoProfesor) {
            SaveDatosFrame.departamentoProfesor = departamentoProfesor;
        }

        public static String getMotivo() {
            return motivo;
        }

        public static void setMotivo(String motivo) {
            SaveDatosFrame.motivo = motivo;
        }

        public static String getPlantelDestino() {
            return plantelDestino;
        }

        public static void setPlantelDestino(String plantelDestino) {
            SaveDatosFrame.plantelDestino = plantelDestino;
        }

        public static String getPlantelOrigen() {
            return plantelOrigen;
        }

        public static void setPlantelOrigen(String plantelOrigen) {
            SaveDatosFrame.plantelOrigen = plantelOrigen;
        }

        public static String getVehiculo() {
            return vehiculo;
        }

        public static void setVehiculo(String vehiculo) {
            SaveDatosFrame.vehiculo = vehiculo;
        }


        public static String getFechaPrestamo() {
            return fechaPrestamo;
        }

        public static void setFechaPrestamo(String fechaPrestamo) {
            SaveDatosFrame.fechaPrestamo = fechaPrestamo;
        }

        public static String getAcompaniante1() {
            return acompaniante1;
        }

        public static void setAcompaniante1(String acompaniante1) {
            SaveDatosFrame.acompaniante1 = acompaniante1;
        }

        public static String getAcompaniante2() {
            return acompaniante2;
        }

        public static void setAcompaniante2(String acompaniante2) {
            SaveDatosFrame.acompaniante2 = acompaniante2;
        }

        public static String getAcompaniante3() {
            return acompaniante3;
        }

        public static void setAcompaniante3(String acompaniante3) {
            SaveDatosFrame.acompaniante3 = acompaniante3;
        }

        public static String getAcompaniante4() {
            return acompaniante4;
        }

        public static void setAcompaniante4(String acompaniante4) {
            SaveDatosFrame.acompaniante4 = acompaniante4;
        }

        public static String getCorreoResponsable() {
            return correoResponsable;
        }

        public static void setCorreoResponsable(String correoResponsable) {
            SaveDatosFrame.correoResponsable = correoResponsable;
        }

        // Método para guardar todos los datos a la vez
        public static void guardarDatos(String departamentoProfesor, String motivo, String plantelDestino, String plantelOrigen, String vehiculo, String vehiculos, String fechaPrestamo, String acompaniante1, String acompaniante2, String acompaniante3, String acompaniante4, String correoResponsable) {
            SaveDatosFrame.departamentoProfesor = departamentoProfesor;
            SaveDatosFrame.motivo = motivo;
            SaveDatosFrame.plantelDestino = plantelDestino;
            SaveDatosFrame.plantelOrigen = plantelOrigen;
            SaveDatosFrame.vehiculo = vehiculo;
            SaveDatosFrame.fechaPrestamo = fechaPrestamo;
            SaveDatosFrame.acompaniante1 = acompaniante1;
            SaveDatosFrame.acompaniante2 = acompaniante2;
            SaveDatosFrame.acompaniante3 = acompaniante3;
            SaveDatosFrame.acompaniante4 = acompaniante4;
            SaveDatosFrame.correoResponsable = correoResponsable;
        }

        // Método para obtener todos los datos como un String
        public static String obtenerDatosComoString() {
            return "Departamento del Profesor: " + departamentoProfesor +
                   "\nMotivo: " + motivo +
                   "\nPlantel Destino: " + plantelDestino +
                   "\nPlantel Origen: " + plantelOrigen +
                   "\nVehículo: " + vehiculo +
                   "\nFecha de Préstamo: " + fechaPrestamo +
                   "\nAcompañante 1: " + acompaniante1 +
                   "\nAcompañante 2: " + acompaniante2 +
                   "\nAcompañante 3: " + acompaniante3 +
                   "\nAcompañante 4: " + acompaniante4 +
                   "\nCorreo Responsable: " + correoResponsable;
        }
    }
}