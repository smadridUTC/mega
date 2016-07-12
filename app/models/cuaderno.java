package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class cuaderno extends Model {

	
	public long  code;
	String tipo ;
	



	double precio;
	String marca;
	int n_hojas;
	String  detalle;	
    String imagen;

    
 
	
    
    public long getCode() {
		return code;
	}





	public void setCode(long code) {
		this.code = code;
	}


	



	public String getTipo() {
		return tipo;
	}





	public void setTipo(String tipo) {
		this.tipo = tipo;
	}





	public double getPrecio() {
		return precio;
	}





	public void setPrecio(double precio) {
		this.precio = precio;
	}





	public String getMarca() {
		return marca;
	}





	public void setMarca(String marca) {
		this.marca = marca;
	}





	public int getN_hojas() {
		return n_hojas;
	}





	public void setN_hojas(int n_hojas) {
		this.n_hojas = n_hojas;
	}





	public String getDetalle() {
		return detalle;
	}





	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}





	public String getImagen() {
		return imagen;
	}





	public void setImagen(String imagen) {
		this.imagen = imagen;
	}





	public String toString()  {
        return "Marca Cuaderno: (" + marca + ")";
   
	}

    
}
