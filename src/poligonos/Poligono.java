package poligonos;

public abstract class Poligono { //Clase abstracta, por lo tanto NO podemos instanciar nada de la clase Poligono
	
	/****** DEFINO LAS VARIABLES/ATRIBUTOS ABSTRACTAS *******/
	
	protected int numeroLados;

		
	//CONSTRUCTOR	
		
	public Poligono(int numeroLados) {
		
		this.numeroLados = numeroLados;
		
	}

	//METODOS GETTER

	public int getNumeroLados() {   
		return numeroLados;
	}
	
	

	@Override // Estamos sobreescribiendo la clase Object de Java
	public String toString() {   //toString = mostrarDatos
		return "Numero de lados = " + numeroLados;
	}
	

	
	public abstract double area();  // Declaramos el metodo area como ABSTRACTO, automaticamente la clase tambien tiene que ser abstracta
	// Asi las clases hijas tendran que implementar/configurar el metodo  
	
		

}
