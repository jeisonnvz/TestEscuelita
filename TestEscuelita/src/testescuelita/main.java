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
public class TestEscuelita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda s=new Tienda();
		s.cargarListaDeProductos();
		
		s.mostrarProductos();
		
		s.productoMasCaro();
		s.productoMasBarato();

	}

}
   
