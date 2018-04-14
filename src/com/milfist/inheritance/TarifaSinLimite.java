package com.milfist.inheritance;

public class TarifaSinLimite extends TarifaMovil {

	public TarifaSinLimite(Long numero, String nombreCompleto) {
		super(numero, nombreCompleto, 
				CTE_MEGAS_TARIFA_SIN_LIMITE, null, 
				CTE_PRECIO_MINUTO_TARIFA_SIN_LIMITE, 
				CTE_CUOTA_TARIFA_SIN_LIMITE, 
				CTE_PRECIO_KB_TARIFA_SIN_LIMITE);
	}

	@Override
	public Double calcularCuotaFinal() {
		this.getCuotaFija();
		
		if (getMegasConsumidos() > CTE_MEGAS_TARIFA_SIN_LIMITE) {
			Integer megasCobrar = (getMegasConsumidos() - CTE_MEGAS_TARIFA_SIN_LIMITE) * CTE_PRECIO_KB_TARIFA_SIN_LIMITE;
			
			
		}
		
		
		return null;
	}

	@Override
	public Double calcPenalizacionMegas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calcPenalizacionMinutos() {
		// TODO Auto-generated method stub
		return null;
	}

}
