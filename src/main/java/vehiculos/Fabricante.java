package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	public String nombre;
	public Pais pais;
	public ArrayList<String> fabricas = new ArrayList<String>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricas.add(this.nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public String fabricaMayorVentas() {
		int cantidad = 0;
		String maximo = null;
		
		for (int i = 0; i<fabricas.size(); i++ ) {
			int contador = 0;
			for(int j = 0; j<fabricas.size();j++) {
				if (fabricas.get(i) == fabricas.get(j)) {
					contador++;
				}
			}
			
			if (contador > cantidad) {
				cantidad = contador;
				maximo = fabricas.get(i);
			}
		}
		
		return maximo;
	}
}
