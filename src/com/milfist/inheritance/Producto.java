package com.milfist.inheritance;

public abstract class Producto {

	private String nombre;
	private Double precio;
	private Integer codigo;
	
	public Producto() {

	}
	
	public Producto(String nombre, Double precio, Integer codigo) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	public abstract void calcularPrecio();

	public abstract String tipoEmbase();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}
