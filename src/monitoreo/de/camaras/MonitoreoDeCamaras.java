/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monitoreo.de.camaras;

import java.util.List;

/**
 *
 * @author PROPIETARIO
 */
public class MonitoreoDeCamaras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         SistemaMonitoreoCamara Sistemamonitoreo = new SistemaMonitoreoCamara();
        
        // Agregar cámaras al sistema
        Sistemamonitoreo.addCamera(new Camara("cam001", "Entrada Principal"));
        Sistemamonitoreo.addCamera(new Camara("cam002", "Pasillo Interior"));
        
        // Acceder a la lista de cámaras
        List<Camara> cameras = Sistemamonitoreo.getCameras();
        
        for (Camara camera : cameras) {
            System.out.println("Cámara ID: " + camera.getId());
            System.out.println("Ubicación: " + camera.getLocation());
        }
        
        // Ver una imagen de una cámara específica
        String cameraIdToView = "cam001";
        byte[] image = Sistemamonitoreo.viewCameraImage(cameraIdToView);
        if (image != null) {
            System.out.println("Vista previa de la cámara " + cameraIdToView);
            System.out.println(new String(image));
        } else {
            System.out.println("Cámara no encontrada");
        }
    }
}
    
    

