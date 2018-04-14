package com.milfist.inheritance;

import java.util.Date;

public class Congelados extends ProductoAlimentacion{
	
	private TipoCongelados tipo;
	private Integer aguante;
	
	public Congelados(Date fechaCaducidad, Double peso, String nombre, Double precio, Integer codigo, TipoCongelados tipo, Integer aguante) {
		super(fechaCaducidad, peso, nombre, precio, codigo);
		this.tipo = tipo;
		this.aguante = aguante;
	}
	
	public Congelados(Date fechaCaducidad, Double peso, String nombre, Double precio, Integer codigo) {
		super(fechaCaducidad, peso, nombre, precio, codigo);
	}
	
	public Congelados(Date fechaCaducidad, Double peso) {
		super(fechaCaducidad, peso);
	}
	
	@Override
	public void calcularPrecio() {
		if (tipo.equals(TipoCongelados.CARNE)) {
			
		} else if (tipo.equals(TipoCongelados.HELADOS)) {
			
		} else if (tipo.equals(TipoCongelados.PESCADO)) {
			
		} else if (tipo.equals(TipoCongelados.VERDURA)) {
			
		}
	}
	
	@Override
	public String tipoEmbase() {
		String embase = null;
		if (tipo.equals(TipoCongelados.CARNE)) {
			embase = "Bolsa";
		} else if (tipo.equals(TipoCongelados.HELADOS)) {
			embase = "Caja";
		} else if (tipo.equals(TipoCongelados.PESCADO)) {
			embase = "Bolsa";
		} else if (tipo.equals(TipoCongelados.VERDURA)) {
			embase = "Bolsa";
		}		
		return embase;
	}

	public TipoCongelados getTipo() {
		return tipo;
	}

	public void setTipo(TipoCongelados tipo) {
		this.tipo = tipo;
	}

	public Integer getAguante() {
		return aguante;
	}

	public void setAguante(Integer aguante) {
		this.aguante = aguante;
	}

}
