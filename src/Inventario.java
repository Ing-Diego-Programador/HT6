import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Inventario {

    ArrayList producto = new ArrayList(); 
    ArrayList MuebleDeTerraza = new ArrayList(); 
    ArrayList SillonesDeMasaje = new ArrayList();
    ArrayList Bebidas = new ArrayList();
    ArrayList Condimentos = new ArrayList();  
    ArrayList Frutas = new ArrayList();
    ArrayList Carnes = new ArrayList();
    ArrayList Lacteos = new ArrayList();

    public void Cargar() {
        //Lector de Txt
        String fileName = "C:/Users/50242/OneDrive - Universidad del Valle de Guatemala/Cursos/Cuarto Semestre/Algoritmos Y estructura de datos/HT6/HT6/ListadoProducto.txt";   
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\|	"); // Se divide la línea por "|"
                for (String word : words) {
                    producto.add(word);
                }
            }
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        }

        //Carga de indices.
        MuebleDeTerraza.add("Mueble de terraza ");
        SillonesDeMasaje.add("Sillones de masaje ");
        Bebidas.add("Bebidas ");
        Condimentos.add("Condimentos ");
        Frutas.add("Frutas ");
        Carnes.add("Carnes ");
        Lacteos.add("Lacteos ");

        //Carga de valores.
        for (int i = 0; i < producto.size() ; i++) {

            if (producto.get(i).equals("Mueble de terraza ")) {
                MuebleDeTerraza.add(producto.get(i+1));
            }

            if (producto.get(i).equals("Sillones de masaje ")) {
                SillonesDeMasaje.add(producto.get(i+1));
            }

            if (producto.get(i).equals("Bebidas ")) {
                Bebidas.add(producto.get(i+1));
            }

            if (producto.get(i).equals("Condimentos ")) {
                Condimentos.add(producto.get(i+1));
            }
            
            if (producto.get(i).equals("Frutas ")) {
                Frutas.add(producto.get(i+1));
            }

            if (producto.get(i).equals("Carnes ")) {
                Carnes.add(producto.get(i+1));
            }

            if (producto.get(i).equals("Lacteos ")) {
                Lacteos.add(producto.get(i+1));
            }



        }
    }
}

