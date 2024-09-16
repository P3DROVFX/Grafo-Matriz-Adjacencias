import java.util.ArrayList;

public class Grafo {
    ArrayList<Vertices> indices;
    int[][] matriz;

    public Grafo(int tamanho) {
        indices = new ArrayList<>();
        matriz = new int[tamanho][tamanho];
    }

    public void addVertice(Vertices vertice) {
        indices.add((vertice));
    }

    public void addAresta(int fonte, int destino) {
        matriz[fonte][destino] = 1;
    }

    public boolean checkAresta(int fonte, int destino) {
        if(matriz[fonte][destino] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void printGrafo() {
        System.out.print("  ");
        for (Vertices vertices : indices) {
            System.out.print(vertices.dado + " ");
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(indices.get(i).dado + " ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
