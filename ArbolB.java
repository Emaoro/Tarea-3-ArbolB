public class ArbolB {

    private NodoDelArbolB raiz;
    private int grado;

    public ArbolB(int grado) {
        this.grado = grado;
        raiz = new NodoDelArbolB(grado, true);
    }

    public boolean buscar(int clave) {
        return buscar(raiz, clave);
    }

    private boolean buscar(NodoDelArbolB nodo, int clave) {

        int i = 0;

        while (i < nodo.numClaves && clave > nodo.claves[i]) {
            i++;
        }

        if (i < nodo.numClaves && nodo.claves[i] == clave) {
            return true;
        }

        if (nodo.esHoja) {
            return false;
        }

        return buscar(nodo.hijos[i], clave);
    }

    public void insertar(int clave) {

        NodoDelArbolB r = raiz;

        if (r.numClaves == grado - 1) {

            NodoDelArbolB nueva = new NodoDelArbolB(grado, false);
            raiz = nueva;

            nueva.hijos[0] = r;

            dividir(nueva, 0, r);
            insertarNoLleno(nueva, clave);

        } else {
            insertarNoLleno(r, clave);
        }
    }

    private void insertarNoLleno(NodoDelArbolB nodo, int clave) {

        int i = nodo.numClaves - 1;

        if (nodo.esHoja) {

            while (i >= 0 && clave < nodo.claves[i]) {
                nodo.claves[i + 1] = nodo.claves[i];
                i--;
            }

            nodo.claves[i + 1] = clave;
            nodo.numClaves++;

        } else {

            while (i >= 0 && clave < nodo.claves[i]) {
                i--;
            }

            i++;

            if (nodo.hijos[i].numClaves == grado - 1) {
                dividir(nodo, i, nodo.hijos[i]);

                if (clave > nodo.claves[i]) {
                    i++;
                }
            }

            insertarNoLleno(nodo.hijos[i], clave);
        }
    }

    private void dividir(NodoDelArbolB padre, int i, NodoDelArbolB lleno) {

        NodoDelArbolB nuevo = new NodoDelArbolB(grado, lleno.esHoja);

        int medio = (grado - 1) / 2;

        // copiar claves al nuevo nodo
        int j = 0;
        for (int k = medio + 1; k < lleno.numClaves; k++) {
            nuevo.claves[j] = lleno.claves[k];
            j++;
            nuevo.numClaves++;
        }

        // copiar hijos si no es hoja
        if (!lleno.esHoja) {
            j = 0;
            for (int k = medio + 1; k <= lleno.numClaves; k++) {
                nuevo.hijos[j] = lleno.hijos[k];
                j++;
            }
        }

        lleno.numClaves = medio;

        // mover hijos del padre
        for (int k = padre.numClaves; k >= i + 1; k--) {
            padre.hijos[k + 1] = padre.hijos[k];
        }

        padre.hijos[i + 1] = nuevo;

        // mover claves del padre
        for (int k = padre.numClaves - 1; k >= i; k--) {
            padre.claves[k + 1] = padre.claves[k];
        }

        padre.claves[i] = lleno.claves[medio];
        padre.numClaves++;
    }

    public void eliminar(int clave) {
        eliminar(raiz, clave);
    }

    private void eliminar(NodoDelArbolB nodo, int clave) {

        int i = 0;

        while (i < nodo.numClaves && clave > nodo.claves[i]) {
            i++;
        }

        if (i < nodo.numClaves && nodo.claves[i] == clave) {

            if (nodo.esHoja) {

                for (int j = i; j < nodo.numClaves - 1; j++) {
                    nodo.claves[j] = nodo.claves[j + 1];
                }

                nodo.numClaves--;
                System.out.println("Clave eliminada");

            } else {
                System.out.println("Eliminar en nodo interno no implementado");
            }

        } else {

            if (nodo.esHoja) {
                System.out.println("No existe");
                return;
            }

            eliminar(nodo.hijos[i], clave);
        }
    }

    public void mostrar() {
        mostrar(raiz, 0);
    }

    private void mostrar(NodoDelArbolB nodo, int nivel) {

        System.out.print("Nivel " + nivel + ": ");
        nodo.mostrar();
        System.out.println();

        if (!nodo.esHoja) {
            for (int i = 0; i <= nodo.numClaves; i++) {
                if (nodo.hijos[i] != null) {
                    mostrar(nodo.hijos[i], nivel + 1);
                }
            }
        }
    }
}