package vehiculos;

public class Automovil extends Vehiculo{
	public int puestos;
	
	Automovil(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
		super(placa, puertas, nombre, precio, peso, fabricante);
		this.puestos = puestos;
		puertas = 4;
		velocidadMaxima = 100;
		traccion = "FWD";
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
