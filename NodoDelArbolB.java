public class NodoDelArbolB {

    int[] claves;
    NodoDelArbolB[] hijos;
    int numClaves;
    boolean esHoja;

    public NodoDelArbolB(int grado, boolean esHoja) {
        this.claves = new int[grado - 1];
        this.hijos = new NodoDelArbolB[grado];
        this.esHoja = esHoja;
        this.numClaves = 0;
    }

    public void mostrar() {
        System.out.print("[ ");
        for (int i = 0; i < numClaves; i++) {
            System.out.print(claves[i] + " ");
        }
        System.out.print("]");
    }
}