import java.util.ArrayList;
import java.util.HashMap;

public class Store {

    Inventario in = new Inventario();

    public void name() {

        var miHashMap = new HashMap<String, ArrayList<Producto>>();
        miHashMap.put(in.MuebleDeTerraza.get(0), [new Producto(in.MuebleDeTerraza.get(1), 10)]);

    }
    


}
