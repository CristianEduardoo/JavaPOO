package poligonos;

public class Rectangulo extends Poligono {
	
	/****** DEFINO LAS PROPIAS VARIABLES/ATRIBUTOS *******/
	
	private double lado1, lado2;
	
	//CONSTRUCTOR
	
	public Rectangulo (double lado1, double lado2) { //numeroLados por la clase padre
		
		super (2); //escribimos 2 porque ya sabemos el numero de lado y no lo necesitamos en el constructor 
		
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	
	//METODOS
	
	public double getLado1 (){  //GETTER
		
		return lado1; 
	}
	
	
	public double getLado2 (){  //GETTER
		
		return lado2;
		
	}
	
	
	//SOBRE ESCRIBIMOS EL METODO toString de la clase padre/Poligono
	
	@Override
	public String toString() {
		
		return "Rectangulo: \n" + super.toString() + "\nLado1 = " + lado1 + ", lado2 = " + lado2;
		//con super.toString  llamamos a toString de la clase padre
	}
	
	@Override
	public double area() { //Si o si tenemos que implementarlo/definirmo porque es abstracto en la clase padre
	
		return lado1*lado2;
	}
	
	
	
}
