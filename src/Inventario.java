import java.util.ArrayList;

public class Inventario {
    
    ArrayList MuebleDeTerraza = new ArrayList(); 
    ArrayList SillonesDeMasaje = new ArrayList();
    ArrayList Bebidas = new ArrayList();
    ArrayList Condimentos = new ArrayList();  
    
    public void Cargar() {

        MuebleDeTerraza.add("Mesas de jardín");
        MuebleDeTerraza.add("Sillas de jardín");
        MuebleDeTerraza.add("Conjuntos mesas y sillas de jardín");
        MuebleDeTerraza.add("Mesas de Ping Pong exteriores");
        SillonesDeMasaje.add("Cojines y colchonetas de masaje");
        SillonesDeMasaje.add("Sillones relax y sofás de masajes");
        SillonesDeMasaje.add("Sillones de masajes avanzados");
        SillonesDeMasaje.add("Sofás camas");
        Bebidas.add("Cerveza tibetana Barley");
        Bebidas.add("Té frios");
        Bebidas.add("Coca cola 1 litro");
        Bebidas.add("Coca cola 2 litros");
        Condimentos.add("Sirope de regaliz");
        Condimentos.add("Especies Cajun del chef");
        Condimentos.add("Mezcla Gumbo del chef");
        
    }
}
