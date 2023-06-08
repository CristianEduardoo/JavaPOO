package poligonos;

public class Triangulo extends Poligono{
	
	
	//Sus propios atributos
	private double lado1, lado2, lado3;

	
	//Constructor
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3); // Ya lo definimos porque son 3 lados y no le damos un parametro
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	
	//Metodos

	public double getLado1() {
		return lado1;
	}


	public double getLado2() {
		return lado2;
	}


	public double getLado3() {
		return lado3;
	}

	
	//SOBRE ESCRIBIMOS EL METODO toString
	
	@Override
	public String toString() {
		return "Triangulo:  \n" + super.toString() + "\nLado1= " + lado1 + ", lado2= " + lado2 + ", lado3= " + lado3;
		// llamamos a toString de la clase padre
	}
	
	@Override
	public double area() { //Si o si tenemos que implementarlo/definir porque es abstracto en la clase padre
		//Formula del ÁREA de cualquier triangulo: Forumula de Heron
		double p = (lado1+lado2+lado3)/2;
		
		return Math.sqrt((p * (p-lado1) * (p-lado2) * (p-lado3)));
		// la raiz cuadrada de la ecuación
	}
	
	
}
