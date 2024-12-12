/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramado2;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Hotel {

    // Objetos, setters, Getters y constructores
    private int numHabitacion;
    private String tipo;
    private int precio;
    private String estado;

    public Hotel(int numHabitacion, String tipo, int precio, String estado) {
        this.numHabitacion = numHabitacion;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Hotel{" + "Habitación # " + numHabitacion + ", Tipo: " + tipo + ", Precio: " + precio + ", Estado: " + estado + '}';
    }


}
