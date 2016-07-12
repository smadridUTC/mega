package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Usuario extends Model {
	
	

	public long  code;
	public String username;
	public String apellido;
	public String cedula;
	public String email;
	public String password;
	
	
	public Usuario(long code ,String username, String apellido, String cedula, String email,	String password) {
		super();
		this.code = code;
		this.username = username;
		this.apellido = apellido;
		this.cedula = cedula;
		this.email = email;
		this.password = password;
	}
	
	
}
