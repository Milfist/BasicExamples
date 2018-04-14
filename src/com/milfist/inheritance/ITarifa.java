package com.milfist.inheritance;

public interface ITarifa {
	
	public static final int CTE_CUOTA_TARIFA_SIN_LIMITE = 39;
	public static final int CTE_CUOTA_TARIFA_INTERNET = 8;
	public static final int CTE_CUOTA_TARIFA_MINUTOS = 6;
	public static final int CTE_CUOTA_TARIFA_TOTAL = 13;
	
	public static final int CTE_PRECIO_MINUTO_TARIFA_SIN_LIMITE = 0;
	public static final int CTE_PRECIO_MINUTO_TARIFA_INTERNET = 1;
	public static final int CTE_PRECIO_MINUTO_TARIFA_MINUTOS = 1;
	public static final int CTE_PRECIO_MINUTO_TARIFA_TOTAL = 0;
	
	public static final double CTE_PRECIO_KB_TARIFA_SIN_LIMITE = 0.01;
	public static final double CTE_PRECIO_KB_TARIFA_INTERNET = 0.02;
	public static final double CTE_PRECIO_KB_TARIFA_MINUTOS = 0.03;
	public static final double CTE_PRECIO_KB_TARIFA_TOTAL = 0.01;
	
	public static final int CTE_MINUTOS_TARIFA_INTERNET = 0;
	public static final int CTE_MINUTOS_TARIFA_MINUTOS = 400;
	public static final int CTE_MINUTOS_TARIFA_TOTAL = 200;
	
	public static final int CTE_MEGAS_TARIFA_SIN_LIMITE = 20000;
	public static final int CTE_MEGAS_TARIFA_INTERNET = 2000;
	public static final int CTE_MEGAS_TARIFA_MINUTOS = 1000;
	public static final int CTE_MEGAS_TARIFA_TOTAL = 3000;

}
