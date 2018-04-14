package com.milfist.inheritance;

import java.util.Date;

public abstract class ProductoAlimentacion extends Producto {

	private Date fechaCaducidad;
	private Double peso;
	
	public ProductoAlimentacion(Date fechaCaducidad, Double peso) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.peso = peso;
	}
	
	public ProductoAlimentacion(Date fechaCaducidad, Double peso, String nombre, Double precio, Integer codigo) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.peso = peso;
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	public abstract void calcularPrecio();

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
}
