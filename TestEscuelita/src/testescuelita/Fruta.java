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
public class Fruta extends Producto{
	public Fruta(String nombre, String tipo, double capacidad, double precio) {
		super(nombre, tipo, capacidad, precio);
	}
            
	@Override
	public String mostrarDetalle() {
		 return("Nombre: "+this.getNombre()+" /// "+"Precio: "+"$"+(int)this.getPrecio()+" /// " +"Unidad de venta: "+this.getTipoUnidad());
           
	}
}
