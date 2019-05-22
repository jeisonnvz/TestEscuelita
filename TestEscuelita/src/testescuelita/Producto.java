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
public abstract class Producto implements Comparable<Producto>{
	private String nombre;
	private String tipoUnidad;
	private double capacidad;
	private double precio;
	
	public Producto() {
		this.nombre=null;
		this.tipoUnidad=null;
		this.capacidad=0;
		this.precio=0;
	}
	
	public Producto(String nombre, String tipo, double capacidad, double precio) {
		this.nombre=nombre;
		this.tipoUnidad=tipo;
		this.capacidad=capacidad;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}


	public String getTipoUnidad() {
		return tipoUnidad;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public int compareTo(Producto o) {
		return this.getPrecio()>o.getPrecio()?1:this.getPrecio()<o.getPrecio()?-1:0;	
	}

    
	public abstract String mostrarDetalle();
}
