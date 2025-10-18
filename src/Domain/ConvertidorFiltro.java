/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;
import java.io.IOException;
import javax.swing.JTextArea;
/**
 *
 * @author 50662
 */
public class ConvertidorFiltro implements Filtro<String> {
    private final JTextArea area;
     public ConvertidorFiltro(JTextArea area) { this.area = area; }

    @Override
    public String procesar(String archivoVideo) {
        try {
            area.append("Convirtiendo a MP3...\n");
            ProcessBuilder pb = new ProcessBuilder(
                "ffmpeg", "-i", archivoVideo, "-q:a", "0", "audio.mp3");
            pb.inheritIO().start().waitFor();
            return "audio.mp3";
        } catch (IOException | InterruptedException e) {
            area.append("Error al convertir: " + e.getMessage() + "\n");
            return null;
        }
    }
}
    
      
