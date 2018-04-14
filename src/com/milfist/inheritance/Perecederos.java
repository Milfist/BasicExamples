package com.milfist.inheritance;

import java.util.Date;

public class Perecederos extends ProductoAlimentacion {

	private Double precioKilogramo;
	private TipoPerecedero tipo;
	
	public Perecederos(Date fechaCaducidad, Double peso, String nombre, 
					   Double precio, Integer codigo, Double precioKilogramo,
					   TipoPerecedero tipo) {
		super(fechaCaducidad, precio, nombre, precio, codigo);
		this.precioKilogramo = precioKilogramo;
		this.tipo = tipo;
	}

	public Perecederos(Date fechaCaducidad, Double peso, String nombre, Double precio, Integer codigo) {
		super(fechaCaducidad, peso, nombre, precio, codigo);
		// TODO Auto-generated constructor stub
	}

	public Perecederos(Date fechaCaducidad, Double peso) {
		super(fechaCaducidad, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularPrecio() {
		this.setPrecio(this.getPeso() * this.getPrecioKilogramo());
	}
	
	@Override
	public String tipoEmbase() {
		String embase = null;
		if (tipo.equals(TipoPerecedero.CARNICERIA)) {
			embase = "Blister";
		} else if (tipo.equals(TipoPerecedero.FRUTERIA)) {
			embase = "Cesta";
		} else if (tipo.equals(TipoPerecedero.PESCADERIA)) {
			embase = "Paquete";
		} else if (tipo.equals(TipoPerecedero.CHARCUTERIA)) {
			embase = "Bandeja";
		}		
		return embase;
	}

	public Double getPrecioKilogramo() {
		return precioKilogramo;
	}

	public void setPrecioKilogramo(Double precioKilogramo) {
		this.precioKilogramo = precioKilogramo;
	}

	public TipoPerecedero getTipo() {
		return tipo;
	}

	public void setTipo(TipoPerecedero tipo) {
		this.tipo = tipo;
	}

}
