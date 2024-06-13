# (BFS - Breadth-First Search) 
 Recorrido en amplitud (BFS - Breadth-First Search) de un grafo en Java, seguiremos las instrucciones del documento proporcionado. El objetivo es realizar un BFS en un grafo homogéneo y convexo, asegurándonos de que cada nodo tenga al menos una ruta de acceso. El algoritmo BFS utiliza una cola para realizar el recorrido por niveles.
 ## Consideraciones de Seguridad
 Evitar Ciclos Infinito: Utilizamos un conjunto (visitados) para evitar visitar nodos repetidos, lo que previene ciclos infinitos.
  ## Requisitos de Rendimiento+
  Tiempo de Ejecución Óptimo: El algoritmo BFS tiene una complejidad de tiempo de O(V + E), donde V es el número de vértices y E el número de aristas. Este es el tiempo óptimo para explorar todos los nodos y aristas en un grafo.
  ## Ejemplos de Entradas y Salidas
  ### Ejemplos
  Un grafo representado por sus nodos y aristas, como se define en el main:
  -Nodos: 1, 2, 3, 4, 5
  -Aristas: (1-2), (1-4), (1-5), (2-1), (2-3), (2-5), (3-2), (3-5), (4-1), (5-1), (5-2), (5-3)
  ### Salida
  El recorrido en amplitud comenzando desde el nodo 1:
  Recorrido en amplitud: 1 2 4 5 3
