package p11_5;

import java.util.GregorianCalendar;

public abstract class Congelado extends Producto {
	//Atributos
	private int temperaturaMantenimiento;

	public Congelado(GregorianCalendar fechaCaducidad, String numeroLote, GregorianCalendar fechaEnvasado,
			String paisOrigen, int temperaturaMantenimiento) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
		this.setTemperaturaMantenimiento(temperaturaMantenimiento);
	}
	
	public Congelado() {}
	
	//Getters&Setters
	public int getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}
	
	//M�todos
	@Override
	public String toString() {
		return "Congelado [temperaturaMantenimiento=" + temperaturaMantenimiento + super.toString()+"] ";
	}
	
	public abstract void descripcion();
}
