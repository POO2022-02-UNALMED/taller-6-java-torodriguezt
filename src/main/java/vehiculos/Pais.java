package vehiculos;

import java.util.ArrayList;

public class Pais {
	public String nombre;
	public static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre){
		this.nombre = nombre;
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		int cantidad = 0;
		Pais maximo = null;
		
		for (int i = 0; i<paises.size(); i++ ) {
			int contador = 0;
			for(int j = 0; j<paises.size();j++) {
				if (paises.get(i) == paises.get(j)) {
					contador++;
				}
			}
			
			if (contador > cantidad) {
				cantidad = contador;
				maximo = paises.get(i);
			}
		}
		
		return maximo;
	
}
}
