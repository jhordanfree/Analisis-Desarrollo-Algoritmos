import java.util.ArrayList;
import java.util.List;

public class Nodo {
    int dato;
    List<Nodo> adyacentes;

    public Nodo(int dato) {
        this.dato = dato;
        this.adyacentes = new ArrayList<>();
    }

    // Método para agregar un nodo adyacente
    public void agregarAdyacente(Nodo nodo) {
        adyacentes.add(nodo);
    }
}
