package vehiculos;

public class Camion extends Vehiculo {
	public int ejes;
	
	Camion(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
		super(placa, 2, 80, nombre, precio, peso, "4X2",fabricante);
		this.ejes = ejes;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
