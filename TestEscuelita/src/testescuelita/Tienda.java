/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testescuelita;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Eliezer
 */
public class Tienda {
	private List<Producto> listaDeProductos;
	public Tienda() {
		this.listaDeProductos=new LinkedList<>();
	}
	public void agregarProducto(Producto p){
		this.listaDeProductos.add(p);
	}
	
	
	public void cargarListaDeProductos() {
		Producto p1=new Gaseosas("Coca-Cola Zero", "Litros", 1.5, 20);
		Producto p2=new Gaseosas("Coca-Cola", "Litros", 1.5, 18);
		Producto p3=new Higiene("Shampoo Sedal", "Contenido", 500, 19);
		Producto p4=new Fruta("Frutilla", "kilo", 1, 64);
		
		this.agregarProducto(p1);
		this.agregarProducto(p2);
		this.agregarProducto(p3);
		this.agregarProducto(p4);
	}
	public void mostrarProductos() {
		for ( Producto producto : listaDeProductos) {
                System.out.println( producto.mostrarDetalle());
		}
		System.out.println("=============================");
	}
	public void productoMasCaro() {
		Producto caro;
		caro=this.listaDeProductos.get(0);
		for (Producto producto : listaDeProductos) {
			
			if (producto.compareTo(caro)>0) {
				caro=producto;
			}
		}
		
		System.out.println("Producto más caro: "+caro.getNombre()); 
	}
	public void productoMasBarato() {
		Producto barato;
		barato=this.listaDeProductos.get(0);
		for (Producto producto : listaDeProductos) {
			
			if (producto.compareTo(barato)<0) {
				barato=producto;
			}
		}
		System.out.println("Producto más barato: "+barato.getNombre());

	}
}