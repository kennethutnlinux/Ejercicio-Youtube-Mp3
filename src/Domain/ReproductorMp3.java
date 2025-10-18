/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author 50662
 */
public class ReproductorMp3 {
    private final JTextArea area;

    public ReproductorMp3(JTextArea area) { this.area = area; }

    public void reproducir(String ruta) {
        try { Desktop.getDesktop().open(new File(ruta)); }
        catch (IOException e) { area.append("Error al reproducir: " + e.getMessage() + "\n"); }
    }
    
}
