import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap frutasCalorias = new HashMap();
        frutasCalorias.put("manzana", 95);
        frutasCalorias.put("durazno", 50);
        frutasCalorias.put("platano", 105);
        frutasCalorias.put("naranja", 45);
        frutasCalorias.put("durazno", 17); //actualizacion de dato


        System.out.println(frutasCalorias);
        System.out.println("Calorias platano: " + frutasCalorias.get("platano"));
    }
}
