import java.util.ArrayList;

public class GrafoMatriz {

    private ArrayList<String> vertices;
    private int[][] matriz;

    public GrafoMatriz(int tamaño) {
        vertices = new ArrayList<>();
        matriz = new int[tamaño][tamaño];
    }

    public void agregarVertice(String vertice) {
        vertices.add(vertice);
    }

    public void agregarArista(String v1, String v2) {
        int i = vertices.indexOf(v1);
        int j = vertices.indexOf(v2);

        if (i != -1 && j != -1) {
            matriz[i][j] = 1;
            matriz[j][i] = 1; 
        }
    }

    public void mostrarMatriz() {
        System.out.println("Matriz de Adyacencia:");

        System.out.print("  ");
        for (String v : vertices) {
            System.out.print(v + " ");
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(vertices.get(i) + " ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        GrafoMatriz grafo = new GrafoMatriz(4);

        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");

        grafo.agregarArista("A", "B");
        grafo.agregarArista("B", "C");
        grafo.agregarArista("C", "D");
        grafo.agregarArista("D", "A");

        grafo.mostrarMatriz();
    }
}
