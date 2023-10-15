/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

/**
 *
 * @author PROPIETARIO
 */
public class ControlAlarma {
    
    public String alarmaactivada ( String cameraId) {
        // Implementa la lógica para activar una alarma en la cámara específica.
        // Puedes usar bibliotecas de notificaciones para enviar alertas a los usuarios o personal de seguridad.
        return "Alarma activada en la cámara " + cameraId;
    }
    
    public String alarmadesactivada(String cameraId) {
        // Implementa la lógica para desactivar una alarma en la cámara específica.
        return "Alarma desactivada en la cámara " + cameraId;
    }
    
}
