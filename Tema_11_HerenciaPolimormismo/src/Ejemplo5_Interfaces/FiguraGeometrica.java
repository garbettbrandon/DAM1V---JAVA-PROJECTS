package Ejemplo5_Interfaces;

public interface FiguraGeometrica {
	
	//m�todo para ver si una figura es m�s grande que otra
	public boolean isLargerThan(FiguraGeometrica fg);
	
	default public void metodoPorDefecto() {
		System.out.println("Se ejecuta el m�todo por defecto");
	}
	
	public static void metodoEstatico() {
		System.out.println("El m�todo est�tico se est� ejecutando");
	}
}
