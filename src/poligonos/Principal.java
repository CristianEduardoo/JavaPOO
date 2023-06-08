package poligonos;
import java.util.ArrayList;
import java.util.Scanner;

/* Hacer un programa para calcular el área de Polígonos (Triangulos y Rectangulos)
 * el programa debe ser capaz de almacenar en un arreglo, N triángulos y rectángulos 
 * y al final mostrar el área y los datos de cada uno. Para ello se tendra lo siguiente:
   
    - Una super clase llamada Poligono
    - Una sub clase llamada Rectángulo
    - Una sub clase llamada Triángulo   */



public class Principal {
	/****** CREAMOS UN ARREGLO DINAMICO DE LA CLASE POLIGONO, PORQUE VAMOS ALMACENAR TRIANGULOS Y RECTANGULOS *********/
	/*** "POLIMORFIRMO" ***/
	
	// Creamos un arrelgo dinamico/arrayList SIEMPRE fuera del main
	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();  // se llama poligono
	static Scanner entrada = new Scanner (System.in); //Creamos el metodo Scanner fuera de todo, para que lo puedan usar todos

	
	
	
	public static void main(String[] args) {
		
		llenarPoligono(); // Asi llamamos al metodo llenarPoligno(); creado fuera del  main con void
		
		mostrarResultados();
		
	}
	
	
	
	
	/******** CREAMOS METODOS STATICOS PARA NO LLENAR TANTO EL MAIN *********/
	
	public static void llenarPoligono() {
		String respuesta;
		int opcion;
		
		do {
			
			do {
				System.out.println("Digite la opción de poligono que desea");
				System.out.println("1. Triángulo");
				System.out.println("2. Rectángulo");
				System.out.print("Digite la opción: ");
				
				opcion=entrada.nextInt();
				
				
			}while(opcion<1 || opcion>2);
			
			switch (opcion) {
			
				case 1: 
						llenarTriangulo();   // llenamos un triangulo con el metodo public static void llenarTriangulo()
					
					break;
					
				case 2: 
						llenarRectangulo();// llena un Rectangulo
					
					break;
			}
			
			System.out.println("\n¿Desea introducir otro poligono? Si ó No\n");
			respuesta = entrada.next();  /* DUDA, PORQUE NO ES NEXTLINE??? */
			
		}while (respuesta.equalsIgnoreCase("si"));
	}
	
	
	
	public static void llenarTriangulo() {
		
		 double lado1, lado2, lado3;
		 
		 System.out.println("\nDigite el lado1 del triángulo: ");
		 lado1 = entrada.nextDouble();
		 
		 System.out.println("Digite el lado2 del triángulo: ");
		 lado2 = entrada.nextDouble();
		 
		 System.out.println("Digite el lado3 del triángulo: ");
		 lado3 = entrada.nextDouble();
		 
		//creamos nuestro objeto de la clase triángulo
		 Triangulo triangulo = new Triangulo (lado1, lado2, lado3);
		 
		 /**** IMPORTANTE ARRAYLIST, tiene un metodo Nombre del arralist y punto add***/ 
		 poligono.add(triangulo); 
		 // almacenamos dentro del arraylist poligono al Objeto triangulo
		// llamamos al arrayList para N triangulos, por el POLIMORFISMO podemos guardar dentro de la clase POLIGONO un objeto de la clase TRIANGULO, porque tambien es un poligono
			 
	}
	
	
	
	public static void llenarRectangulo() {
		
		double lado1, lado2;
		
		System.out.println("\nDigite el lado1 del Rectángulo: ");
		 lado1 = entrada.nextDouble();
		 
		 System.out.println("Digite el lado2 del Rectángulo: ");
		 lado2 = entrada.nextDouble();
		
		//creamos nuestro objeto de la clase Rectangulo
		 Rectangulo rectangulo = new Rectangulo (lado1, lado2);
		 
		 /**** IMPORTANTE ARRAYLIST ***/
		 poligono.add(rectangulo);
	}
	
	
	
	/*****  Con un bucle for each, para mostraResultados *******/
	
	public static void mostrarResultados () {  //recorremos la clase padre/Poligono
		
		for (Poligono i:poligono) {   //un objeto de tipo Poligono, nombre e:poligono = arraylist
	
			System.out.println(i.toString()); // Gracias al Polimorfismo, Java sabe si llama al toString de rectangulo ó triángulo
			System.out.println("Área: " + i.area());  // lo mismo por el Polimorfismo
			System.out.println(" ");
			
			/* Poligono = Objeto, de la clase Poligono
			 * i = el iterador
			 * poligono = arrayList */
		}
		
		
	}
	

}
