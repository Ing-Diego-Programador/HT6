import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Reader inventario = new Reader();
		OurH4shM4p hashmap = new OurH4shM4p();
		Factory factory = new Factory();
		Reader reader;
		IOperaciones database, User;
		Scanner sc = new Scanner(System.in);
		boolean estado = true;
		String op = "";

		while (estado) {
			System.out.println("¿Que implementación deseas? \n 1. HashMap \n 2.TreeMap \n 3.LinkedMap \n Ingresa el número:");
			op = sc.nextLine();

			if (op.equals("1")) {
				System.out.println("\nMapa escogido: "+"HashMap"+"\n");
				estado=false;
			}else if (op.equals("2")) {
				System.out.println("\nMapa escogido: "+"TreeMap"+"\n");
				estado=false;
			}else if (op.equals("3")) {
				System.out.println("\nMapa escogido: "+"LinkedHashMap"+"\n");
				estado=false;
			}else {
				System.out.println("No ingreso una opcion valida.");
			}
		}

		//Factory
		factory.op(op);
		factory.op(op);

		int select = 0;	
		while (true) {

			System.out.println("1. Agregar un producto a la colección del usuario.");
			System.out.println("2. Mostrar la categoría del producto.");
			System.out.println("3. Mostrar los datos del producto.");
			System.out.println("4. Mostrar los datos del producto, ordenados por tipo.");
			System.out.println("5. Mostrar el producto y la categoría de todo el inventario.");
			System.out.println("6. Mostrar el producto y la categoría existentes, ordenadas por tipo.");
			op = sc.nextLine();
			
			switch (op) {
				case "1":
					hashmap.Agregar();
					break;

				case "2":
					hashmap.MostrarCategoria();
			
				default:
					break;
			}
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
