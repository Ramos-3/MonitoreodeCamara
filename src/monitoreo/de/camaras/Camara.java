/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

/**
 *
 * @author PROPIETARIO
 */
public class Camara {
    
    private String id;
    private String location;
    
    public Camara(String id, String location) {
        this.id = id;
        this.location = location;
    }
    
    public String getId() {
        return id;
    }
    
    public String getLocation() {
        return location;
    }
    
    // Método para capturar una imagen
    public byte[] captureImage() {
        // Simulación de la captura de una imagen
        return "Imagen capturada desde la cámara ".getBytes();
    }
}

