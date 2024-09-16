public class Main {
    public static void main(String[] args) {
        //GRAFO COM MATRIZ DE ADJACENCIAS SÃO MELHORES PARA GRANDES QUANTIDADES DE ELEMENTOS, SAO MAIS PESADOS JÁ QUE
        //SAO UMA MATRIZ DE v^v

        Grafo grafo = new Grafo(5);

        grafo.addVertice(new Vertices('A'));
        grafo.addVertice(new Vertices('B'));
        grafo.addVertice(new Vertices('C'));
        grafo.addVertice(new Vertices('D'));
        grafo.addVertice(new Vertices('E'));

        grafo.addAresta(0, 1);
        grafo.addAresta(0, 3);
        grafo.addAresta(1, 2);
        grafo.addAresta(2, 4);

        grafo.printGrafo();
    }
}