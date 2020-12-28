package com.idat.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcliente;
	@Column (name="nombre",length=40)
	private String nombre;
	@Column (name="apellido",length=40)
	private String apellido;
	@Column (name="dni",length=8)
	private String dni;
	
	
	public Cliente() {
		super();
	}


	public Cliente(int idcliente, String nombre, String apellido, String dni) {
		super();
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}


	public int getIdcliente() {
		return idcliente;
	}


	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
