package com.milfist.inheritance;

public abstract class TarifaMovil implements ITarifa{
	
	private Long numero;
	private String nombreCompleto;
	private Integer megasContratados;
	private Integer minutosContratados;
	private Integer cuotaFija;
	private Integer precioMinuto;
	private Double precioMega;
	private Integer megasConsumidos;
	private Integer minutosConsumidos;
	
	public TarifaMovil(Long numero, String nombreCompleto, Integer megasContratados, Integer minutosContratados,
			Integer cuotaFija, Integer precioMinuto, Double precioMega) {
		super();
		this.numero = numero;
		this.nombreCompleto = nombreCompleto;
		this.megasContratados = megasContratados;
		this.minutosContratados = minutosContratados;
		this.cuotaFija = cuotaFija;
		this.precioMinuto = precioMinuto;
		this.precioMega = precioMega;
	}
	
	public abstract Double calcularCuotaFinal();
	public abstract Double calcPenalizacionMegas();
	public abstract Double calcPenalizacionMinutos();
		
	protected void consumirMegas(Integer megas) {
		setMegasConsumidos(megas);
	}
	
	protected void consumirMinutos(Integer minutos) {
		setMinutosConsumidos(minutos);
	}
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public Integer getMegasContratados() {
		return megasContratados;
	}
	public void setMegasContratados(Integer megasContratados) {
		this.megasContratados = megasContratados;
	}
	public Integer getMinutosContratados() {
		return minutosContratados;
	}
	public void setMinutosContratados(Integer minutosContratados) {
		this.minutosContratados = minutosContratados;
	}
	public Integer getCuotaFija() {
		return cuotaFija;
	}
	public void setCuotaFija(Integer cuotaFija) {
		this.cuotaFija = cuotaFija;
	}
	public Integer getPrecioMinuto() {
		return precioMinuto;
	}
	public void setPrecioMinuto(Integer precioMinuto) {
		this.precioMinuto = precioMinuto;
	}
	public Double getPrecioMega() {
		return precioMega;
	}
	public void setPrecioMega(Double precioMega) {
		this.precioMega = precioMega;
	}	
	public Integer getMegasConsumidos() {
		return megasConsumidos;
	}
	public void setMegasConsumidos(Integer megasConsumidos) {
		this.megasConsumidos = megasConsumidos;
	}
	public Integer getMinutosConsumidos() {
		return minutosConsumidos;
	}
	public void setMinutosConsumidos(Integer minutosConsumidos) {
		this.minutosConsumidos = minutosConsumidos;
	}
}
