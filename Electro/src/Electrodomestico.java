
public class Electrodomestico {

	//Constantes
	
	//Color por defecto
	protected final static String color_def = "blanco";
	
	//Consumo por defecto
	protected final static char consumoEnergetico_def = 'F';
	
	//Precio por defecto
	protected final static double precioBase_def = 100;
	
	//Peso por defecto
	protected final static double pesoBase_def = 5;
	
	
	//Variables
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Metodos
	
	//Comprobar que la letra es correcta
	void comprobarConsumoEnergetico (consumoEnergetico) {
		switch (consumoEnergetico) {
		case 1: consumoEnergetico = 'A';
				break;
		case 2: consumoEnergetico = 'B';
				break;
		case 3: consumoEnergetico = 'C';
				break;
		case 4: consumoEnergetico = 'D';
				break;
		case 5: consumoEnergetico = 'E';
				break;
		case 6: consumoEnergetico = 'F';
				break;
				return consumoEnergetico;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
