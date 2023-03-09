/**
 * Diego Vásquez 211628
 * Cristian Guevara 22742
 * Hoja de trabajo 6 - Algoritmos y estructura de datos.
 */

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class OurH4shM4p implements IOperaciones{

    Scanner sc = new Scanner(System.in);
    public Map<String, ArrayList<String>> hash;
    ArrayList<String> Producto = new ArrayList<>();
    ArrayList<String> temp = new ArrayList<>();
		
    public OurH4shM4p(){
        hash = new HashMap<String, ArrayList<String>>();
    }

    @Override
    public ArrayList<String> get(String key) {
        return hash.get(key);
    }

    @Override
    public void Agregar() {
        System.out.println("Ingresa la categoría del producto que deseas añadir.\n");
        String categoria = sc.nextLine();
        System.out.println("Ingresa el nombre del producto que deseas añadir.\n");
        String producto = sc.nextLine();

        if (hash.containsKey(categoria)) {
            System.out.println("La categoría ya está ingresada\n");
        }else {
            Producto.add(producto);
            hash.put(categoria, Producto);
        }
    }

    @Override
    public void MostrarCategoria() {

        System.out.print("Ingresa el nombre del producto: ");
        String product = sc.nextLine();
        System.out.println(hash.get(product));

    }

    @Override
    public void MostrarDatosProducto() {
        System.out.println("Ingresa el nombre de la categoria: ");
        String nombreP = sc.nextLine();
        int cant = 0;
        for (int i = 0; i < hash.size(); i++) {
            if (hash.containsValue(nombreP) || hash.containsKey(nombreP)) {
                cant += 1;
            }
        System.out.println("El producto " + nombreP + " cuenta con " + cant);
        }

    }

    @Override
    public void MostrarDatosProductoOrdenado() {
        for (int i = 0; i < hash.size(); i++) {
            System.out.println(hash.values());
        }
        
    }

    @Override
    public void MostrarProductoCategoriaInventario() {
        System.out.println(hash.values());
        System.out.println(hash.keySet());
    }

    @Override
    public void MostrarProductoCategoriaExistenteOrdenada() {
        for (int i = 0; i < hash.size(); i++) {
            System.out.println(hash.values());
            System.out.println(hash.keySet());
        }
    }




    
}
