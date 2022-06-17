/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Docente {

    /**
     * @param args the command line arguments
     */
    protected String nom;
    protected String apellidos;
    protected String id;
    protected int edad;

    public Docente() {

    }

    public void establecerNombres(String c) {
        nom = c;
    }

    public String obtenerNombres() {
        return nom;
    }

    public void establecerApellidos(String c) {
        apellidos = c;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public void establecerId(String c) {
        id = c;
    }

    public String obtenerId() {
        return id;
    }

    public void establecerEdad(int c) {
        edad = c;
    }

    public int obtenerEdad() {
        return edad;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre: %s\nApellido: %s\nIdentificacion: %s\nEdad: %d\n", obtenerNombres(),
                 obtenerApellidos(), obtenerId(), obtenerEdad());
        return reporte;
    }

}
