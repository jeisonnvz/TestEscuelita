/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testescuelita;

/**
 *
 * @author Jeison Narvaez
 */
public class Higiene extends Producto{
	public Higiene(String nombre, String tipo, double cantidad, double precio) {
		super(nombre, tipo, cantidad, precio);
	}

	@Override
	public String mostrarDetalle() {	
		return("Nombre: "+this.getNombre()+" /// "+"Contenido: "+(int)this.getCapacidad()+"ml"+" /// " +"Precio: "+"$"+(int)this.getPrecio());
	}
}