/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.io.File;
import javax.swing.JTextArea;

/**
 *
 * @author unknown
 */
public class GuardarFiltro implements Filtro<String>{

private final JTextArea area;

    public GuardarFiltro(JTextArea area) { 
        this.area = area; 
    }

    @Override
    public String procesar(String archivoMp3) {
        File f = new File(archivoMp3);
        if (f.exists()) {
            area.append("Archivo guardado en: " + f.getAbsolutePath() + "\n");
            return f.getAbsolutePath();
        }
        area.append("No se encontró el archivo.\n");
        return null;
    }
    
}
