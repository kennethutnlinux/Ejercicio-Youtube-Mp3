/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author unknown
 */
public class DescargadorFiltro implements Filtro<String>{
    
    private final JTextArea area;

    public DescargadorFiltro(JTextArea area) {
        this.area = area;
    }

    @Override
    public String procesar(String enlace) {
              try {
            area.append("Descargando video...\n");
            ProcessBuilder pb = new ProcessBuilder(
                "yt-dlp", "-f", "bestaudio", "-o", "video.%(ext)s", enlace);
            pb.inheritIO().start().waitFor();
            return "video.webm";
        } catch (IOException | InterruptedException e) {
            area.append("Error al descargar: " + e.getMessage() + "\n");
            return null;
        }
    }
    
}
