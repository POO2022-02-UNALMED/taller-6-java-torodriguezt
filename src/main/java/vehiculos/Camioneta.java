package vehiculos;

public class Camioneta extends Vehiculo {
	public boolean volco;
	
	Camioneta(String placa, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
		super(placa, nombre, precio, peso, fabricante);
		this.volco = volco;
		velocidadMaxima = 90;
		traccion = "4X4";
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

}
