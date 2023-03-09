/**
 * Diego Vásquez 211628
 * Cristian Guevara 22742
 * Hoja de trabajo 6 - Algoritmos y estructura de datos.
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Linked implements IOperaciones {

    Scanner sc = new Scanner(System.in);
    public Map<String, ArrayList<String>> l1nked;
    ArrayList<String> Producto = new ArrayList<>();

    Linked(){
        l1nked = new LinkedHashMap<String, ArrayList<String>>();
    }

    @Override
    public void Agregar() {
        System.out.println("Ingresa la categoría del producto que deseas añadir.");
        String categoria = sc.nextLine();
        System.out.println("Ingresa el nombre del producto que deseas añadir.");
        String producto = sc.nextLine();

        if (l1nked.containsKey(categoria)) {
            System.out.println("La categoría ya está ingresada");
        }else {
            Producto.add(producto);
            l1nked.put(categoria, Producto);
        }
    }

    @Override
    public void MostrarCategoria() {
        System.out.print("Ingresa el nombre de la categoria: ");
        String product = sc.nextLine();

        System.out.println(l1nked.get(product));
    }

    @Override
    public void MostrarDatosProducto() {
        System.out.println("Ingresa el nombre de la categoria: ");
        String nombreP = sc.nextLine();
        int cant = 0;
        for (int i = 0; i < l1nked.size(); i++) {
            if (l1nked.containsValue(nombreP) || l1nked.containsKey(nombreP)) {
                cant += 1;
            }
        System.out.println("El producto " + nombreP + " cuenta con " + cant);
        }
    }

    @Override
    public void MostrarDatosProductoOrdenado() {
        for (int i = 0; i < l1nked.size(); i++) {
            System.out.println(l1nked.values());
        }
    }

    @Override
    public void MostrarProductoCategoriaInventario() {
        System.out.println(l1nked.values());
        System.out.println(l1nked.keySet());
    }

    @Override
    public void MostrarProductoCategoriaExistenteOrdenada() {
        for (int i = 0; i < l1nked.size(); i++) {
            System.out.println(l1nked.values());
            System.out.println(l1nked.keySet());
        }
    }

    @Override
    public ArrayList<String> get(String key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    
}
