package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class temporal extends Model {
    
	
	public long  code;
	
   double  precio;	
	String detalle;	
	int cantidad ;
	double total ;
	 double totalfinal ;
	 
	 
	 
	 
	public temporal(long code, double precio, String detalle, int cantidad,
			double total, double totalfinal) {
		super();
		this.code = code;
		this.precio = precio;
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.total = total;
		this.totalfinal = totalfinal;
	}
	 
	 
	 
	
	
	
	
	
	
	
	
	


	
	 
	 
	
	
	
}
