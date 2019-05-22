/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testescuelita;

/**
 *
 * @author Eliezer
 */
public class Gaseosas extends Producto {

    public Gaseosas(String nombre, String tipo, double cantidad, double precio) {
        super(nombre, tipo, cantidad, precio);
    }

    @Override
    public String mostrarDetalle() {
        
        return ("Nombre: " + this.getNombre() + " /// " + this.getTipoUnidad() + ": " + this.getCapacidad() + " /// " + "Precio: " + "$" + (int) this.getPrecio());
    }
}
