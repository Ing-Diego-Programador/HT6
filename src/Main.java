/**
 * Diego Vásquez 211628
 * Cristian Guevara 22742
 * Hoja de trabajo 6 - Algoritmos y estructura de datos.
 */

 import java.util.Map;
 import java.util.HashMap;
 import java.time.Duration;
 import java.time.Instant;
 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Main {
	 public static void main(String[] args){
 
		 Reader inventario = new Reader();
		 OurH4shM4p hashmap = new OurH4shM4p();
		 Linked linked = new Linked();
		 Tree Tree = new Tree();
		 Factory factory = new Factory();
		 Scanner sc = new Scanner(System.in);
		 boolean estado = true;
		 String ops = "";
 
		 //Inicio selección de tipo de mapa.
		 while (estado) {
			 System.out.println("¿Que implementación deseas? \n 1. HashMap \n 2. TreeMap \n 3. LinkedMap \n Ingresa el número:");
			 ops = sc.nextLine();
 
			 if (ops.equals("1")) {
				 
				 System.out.println("\nMapa escogido: "+"HashMap"+"\n");
				 estado=false;
				 
			 }else if (ops.equals("2")) {
				 System.out.println("\nMapa escogido: "+"TreeMap"+"\n");
				 estado=false;
			 }else if (ops.equals("3")) {
				 System.out.println("\nMapa escogido: "+"LinkedHashMap"+"\n");
				 estado=false;
				 
			 }else {
				 System.out.println("\nNo ingreso una opcion valida.");
			 }
		 }
 
		 //Factory aquí se lee el reader del txt.
		 Instant inicio = Instant.now();	
		 factory.op(ops);
		 factory.op(ops);
 
		 
		 String select = "";	//Variable que guarda la eleccion del usuario.
		 
		 while (true) {
 
			 System.out.println("\n1. Agregar un producto a la colección del usuario.");
			 System.out.println("2. Mostrar la categoría del producto.");
			 System.out.println("3. Mostrar los datos del producto.");
			 System.out.println("4. Mostrar los datos del producto, ordenados por tipo.");
			 System.out.println("5. Mostrar el producto y la categoría de todo el inventario.");
			 System.out.println("6. Mostrar el producto y la categoría existentes, ordenadas por tipo.");
			 System.out.println("7. Salir\n");
			 select = sc.nextLine();
 
			 
			 switch (select) {
				 case "1":
				 if (ops.equals("1")) {
 
					 hashmap.Agregar();
				 } else if (ops.equals("2")) {
					 Tree.Agregar();
				 } else {
					 linked.Agregar();
				 }
					 break;
 
				 case "2":
				 if (ops.equals("1")) {
					 hashmap.MostrarCategoria();
				 } else if (ops.equals("2")) {
					 Tree.MostrarCategoria();
				 } else {
					 linked.MostrarCategoria();
				 }
					 break;
 
				 case "3":
				 if (ops.equals("1")) {
					 hashmap.MostrarDatosProducto();
				 } else if (ops.equals("2")) {
					 Tree.MostrarDatosProducto();
				 } else {
					 linked.MostrarDatosProducto();
				 }
					 break;
 
				 case "4":
				 if (ops.equals("1")) {
					 hashmap.MostrarDatosProductoOrdenado();
				 } else if (ops.equals("2")) {
					 Tree.MostrarDatosProductoOrdenado();
				 } else {
					 linked.MostrarDatosProductoOrdenado();
				 }
					 break;
 
				 case "5":
				 if (ops.equals("1")) {
					 hashmap.MostrarProductoCategoriaInventario();
				 } else if (ops.equals("2")) {
					 Tree.MostrarProductoCategoriaInventario();
				 } else {
					 linked.MostrarProductoCategoriaInventario();
				 }
					 break;
				 
				 case "6":
				 if (ops.equals("1")) {
					 hashmap.MostrarProductoCategoriaExistenteOrdenada();
				 } else if (ops.equals("2")) {
					 Tree.MostrarProductoCategoriaExistenteOrdenada();
				 } else {
					 linked.MostrarProductoCategoriaExistenteOrdenada();
				 }
					 break;	
 
				 case "7":
				 System.exit(0);
				 
 
					 break;	
 
				 default:
					 System.out.println("No ingreso una opción valida\n");
					 break;
			 }
			 Instant fin = Instant.now();
			 Duration duracion = Duration.between(inicio, fin);
			 long duracionMilisegundos = duracion.toMillis();
			 System.out.println("Tiempo de ejecuccion "+duracionMilisegundos);
		 }
		 
 
 
	 }
 }

/*
		Map<String, ArrayList<String>> db = new HashMap<String, ArrayList<String>>();

		// Ver contenido
		for(String[] contenido : inventario.getContenido()){
			System.out.println("Key: " + contenido[0] + " Value: " + contenido[1]);

			// Asignaremos el contenido en el map
			if(db.containsKey(contenido[0]) == true){
				System.out.println("Como la key ya existe entonces se va a agregar el nuevo producto");
				ArrayList<String> agarrarListado = db.get(contenido[0]);
				agarrarListado.add(contenido[1]);
			}
			else{
				System.out.println("Como no existe la key entonces se va a crear la key con su nuevo arrayList");
				ArrayList<String> listado = new ArrayList<String>();
				listado.add(contenido[1]);
				db.put(contenido[0], listado);
			}
		}

		// Asignar contenido al hash
		System.out.println("\n------------------------------");
		for (Map.Entry<String, ArrayList<String>> string : db.entrySet()) {
			System.out.println(string.getKey()); // Imprimir categoria
			for (String string2 : string.getValue()) {
				System.out.println("-> " + string2);
			}
		}

		 */
