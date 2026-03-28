import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Grado del árbol: ");
        int grado = sc.nextInt();

        ArbolB arbol = new ArbolB(grado);

        int op;

        do {
            System.out.println("\n1. Insertar");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Mostrar");
            System.out.println("5. Salir");

            System.out.print("Opción: ");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.print("Número: ");
                    arbol.insertar(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Buscar: ");
                    System.out.println(arbol.buscar(sc.nextInt()) ? "Sí existe" : "No existe");
                    break;

                case 3:
                    System.out.print("Eliminar: ");
                    arbol.eliminar(sc.nextInt());
                    break;

                case 4:
                    arbol.mostrar();
                    break;
            }

        } while (op != 5);
    }
}