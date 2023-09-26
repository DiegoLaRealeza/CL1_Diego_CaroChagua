package org.cibertec.edu.pe.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	private int Id;
	private String Nombres;
	private String Apellidos;
	private String correo;
	private String fechNacimiento;
	private String dni;
	private int categoria;
	
	//metodos conctructores
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nombres, String apellidos, String correo, String fechNacimiento, String dni,
			int categoria) {
		super();
		Id = id;
		Nombres = nombres;
		Apellidos = apellidos;
		this.correo = correo;
		this.fechNacimiento = fechNacimiento;
		this.dni = dni;
		this.categoria = categoria;
	}


	
	
	
	

}
