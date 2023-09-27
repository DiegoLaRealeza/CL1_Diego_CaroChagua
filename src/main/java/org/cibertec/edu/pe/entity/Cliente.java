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

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFechNacimiento() {
		return fechNacimiento;
	}

	public void setFechNacimiento(String fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	


	
	
	
	

}
