/**
 * Diego Vásquez 211628
 * Cristian Guevara 22742
 * Hoja de trabajo 6 - Algoritmos y estructura de datos.
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    private ArrayList<String[]> contenido;

    public Reader(){
        contenido = new ArrayList<String[]>();
        cargarDatos();
    }


    public void cargarDatos(){
        String fileName = "ListadoProducto.txt";   
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\|"); // Se divide la línea por "|"
                // Se utiliza trim para quitar los espacios blancos
                words[0] = words[0].trim(); // La key donde representara el nombre de la categoria
                words[1] = words[1].trim(); // El value donde representara el nombre del producto
                contenido.add(words);
            }
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        }
    }

    public ArrayList<String[]> getContenido(){
        return contenido;
    }

    public int cantidadContenido(){
        return contenido.size();
    }

}

