/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author unknown
 */
public class Tuberia {
    private final Filtro<String>[] filtros;

    @SafeVarargs
    public Tuberia(Filtro<String>... filtros) { 
        this.filtros = filtros; 
    }

    public String ejecutar(String entrada) {
        String datos = entrada;
        for (Filtro<String> f : filtros) datos = f.procesar(datos);
        return datos;
    }
}
