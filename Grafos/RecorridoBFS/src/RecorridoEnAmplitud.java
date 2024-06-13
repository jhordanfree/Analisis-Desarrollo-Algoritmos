import java.util.*;

public class RecorridoEnAmplitud {
    // Método para realizar BFS
    public static void bfs(Nodo nodoInicial) {
        Set<Nodo> visitados = new HashSet<>();
        Queue<Nodo> cola = new LinkedList<>();
        List<Nodo> resultado = new ArrayList<>();

        cola.add(nodoInicial);
        visitados.add(nodoInicial);

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            resultado.add(actual);

            for (Nodo adyacente : actual.adyacentes) {
                if (!visitados.contains(adyacente)) {
                    cola.add(adyacente);
                    visitados.add(adyacente);
                }
            }
        }

        // Mostrar el resultado del recorrido
        System.out.print("Recorrido en amplitud: ");
        for (Nodo nodo : resultado) {
            System.out.print(nodo.dato + " ");
        }
    }
}
