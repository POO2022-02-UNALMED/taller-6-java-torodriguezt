package vehiculos;

public class Camion extends Vehiculo {
	public int ejes;
	
	Camion(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
		super(placa, puertas, nombre, precio, peso, fabricante);
		this.ejes = ejes;
		puertas = 2;
		velocidadMaxima = 80;
		traccion = "4X2";
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
