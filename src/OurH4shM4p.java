import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class OurH4shM4p implements IOperaciones{

    Scanner sc = new Scanner(System.in);
    public Map<String, ArrayList<String>> hash;
    ArrayList<String> Producto = new ArrayList<>();
		
    public OurH4shM4p(){
        hash = new HashMap<String, ArrayList<String>>();
    }

    @Override
    public ArrayList<String> get(String key) {
        return hash.get(key);
    }

    @Override
    public void Agregar() {
        System.out.println("Ingresa la categoría del producto que deseas añadir.");
        String categoria = sc.nextLine();
        System.out.println("Ingresa el nombre del producto que deseas añadir.");
        String producto = sc.nextLine();

        if (hash.containsKey(categoria)) {
            System.out.println("La categoría ya está ingresada");
        }else {
            Producto.add(producto);
            hash.put(categoria, Producto);
        }
    }

    @Override
    public void MostrarCategoria() {
        System.out.println("Ingresa el nombre del producto: ");
        String nombreP = sc.nextLine();

        if (hash.containsKey(nombreP)) {
            System.out.println(hash);
        }


    }

    @Override
    public void MostrarDatosProducto() {
        
    }

    @Override
    public void MostrarDatosProductoOrdenado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'MostrarDatosProductoOrdenado'");
    }

    @Override
    public void MostrarProductoCategoriaInventario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'MostrarProductoCategoriaInventario'");
    }

    @Override
    public void MostrarProductoCategoriaExistenteOrdenada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'MostrarProductoCategoriaExistenteOrdenada'");
    }




    
}
