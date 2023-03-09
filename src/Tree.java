/**
 * Diego Vásquez 211628
 * Cristian Guevara 22742
 * Hoja de trabajo 6 - Algoritmos y estructura de datos.
 */

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Tree implements IOperaciones{

    Scanner sc = new Scanner(System.in);
    public Map<String, ArrayList<String>> Tree;
    ArrayList<String> Producto = new ArrayList<>();

    public Tree(){
        Tree = new TreeMap<String, ArrayList<String>>();
    }

    @Override
    public void Agregar() {
        System.out.println("Ingresa la categoría del producto que deseas añadir.");
        String categoria = sc.nextLine();
        System.out.println("Ingresa el nombre del producto que deseas añadir.");
        String producto = sc.nextLine();

        if (Tree.containsKey(categoria)) {
            System.out.println("La categoría ya está ingresada");
        }else {
            Producto.add(producto);
            Tree.put(categoria, Producto);
        }
    }

    @Override
    public void MostrarCategoria() {
        System.out.print("Ingresa el nombre de la categoria: ");
        String product = sc.nextLine();

        System.out.println(Tree.get(product));
    }

    @Override
    public void MostrarDatosProducto() {
        System.out.println("Ingresa el nombre de la categoria: ");
        String nombreP = sc.nextLine();
        int cant = 0;
        for (int i = 0; i < Tree.size(); i++) {
            if (Tree.containsValue(nombreP) || Tree.containsKey(nombreP)) {
                cant += 1;
            }
        System.out.println("El producto " + nombreP + " cuenta con " + cant);
        }
    }

    @Override
    public void MostrarDatosProductoOrdenado() {
        for (int i = 0; i < Tree.size(); i++) {
            System.out.println(Tree.values());
        }
    }

    @Override
    public void MostrarProductoCategoriaInventario() {
        System.out.println(Tree.values());
        System.out.println(Tree.keySet());
    }

    @Override
    public void MostrarProductoCategoriaExistenteOrdenada() {
        for (int i = 0; i < Tree.size(); i++) {
            System.out.println(Tree.values());
            System.out.println(Tree.keySet());
        }
    }

    
    @Override
    public ArrayList<String> get(String key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    
}
