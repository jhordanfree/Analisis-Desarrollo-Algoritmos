public class Principal {
    public static void main(String[] args) {
        // Creación de los nodos del grafo
        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);
        Nodo n4 = new Nodo(4);
        Nodo n5 = new Nodo(5);

        // Establecimiento de las relaciones de adyacencia
        n1.agregarAdyacente(n2);
        n1.agregarAdyacente(n4);
        n1.agregarAdyacente(n5);

        n2.agregarAdyacente(n1);
        n2.agregarAdyacente(n3);
        n2.agregarAdyacente(n5);

        n3.agregarAdyacente(n2);
        n3.agregarAdyacente(n5);

        n4.agregarAdyacente(n1);

        n5.agregarAdyacente(n1);
        n5.agregarAdyacente(n2);
        n5.agregarAdyacente(n3);

        // Realizar BFS comenzando desde el nodo n1
        RecorridoEnAmplitud.bfs(n1);
    }
}
