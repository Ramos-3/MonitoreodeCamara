/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PROPIETARIO
 */
public class SistemaMonitoreoCamara {
    
     private final List<Camara> camaras;
    
    public SistemaMonitoreoCamara() {
        camaras = new ArrayList<>();
    }
    
    public void addCamera(Camara camara) {
        camaras.add(camara);
    }
    
    public void removeCamera(String cameraId) {
        camaras.removeIf(camera -> camera.getId().equals(cameraId));
    }
    
    public List<Camara> getCameras() {
        return camaras;
    }
    
    public byte[] viewCameraImage(String cameraId) {
        // Buscar la cámara por su ID
        for (Camara camara : camaras) {
            Object camaraId = null;
            if (camara.getId().equals(camaraId)) {
                return camara.captureImage();
            }
        }
        return null;
    }
}

