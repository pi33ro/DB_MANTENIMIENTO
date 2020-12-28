package com.idat.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpro;
	@Column (name="nombrepro",length=40)
	private String nombrepro;
	@Column (name="precio",length=11)
	private int precio;
	@Column (name="cantidad",length=11)
	private int cantidad;
	
	public Producto() {
		super();
	}

	public Producto(int idpro, String nombrepro, int precio, int cantidad) {
		super();
		this.idpro = idpro;
		this.nombrepro = nombrepro;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getIdpro() {
		return idpro;
	}

	public void setIdpro(int idpro) {
		this.idpro = idpro;
	}

	public String getNombrepro() {
		return nombrepro;
	}

	public void setNombrepro(String nombrepro) {
		this.nombrepro = nombrepro;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
