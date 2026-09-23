package biblioteca;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- CREANDO OBJETOS ---");

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 5, 2);

        Libro libro2 = new Libro();
        System.out.println("\nIngrese los datos para libro2:");
        
        System.out.print("Título: ");
        String titulo = teclado.nextLine();
        libro2.setTitulo(titulo);

        System.out.print("Autor: ");
        String autor = teclado.nextLine();
        libro2.setAutor(autor);

        System.out.print("Número de ejemplares: ");
        int ejemplares = teclado.nextInt();
        libro2.setNumeroEjemplares(ejemplares);

        System.out.print("Ejemplares prestados: ");
        int prestados = teclado.nextInt();
        libro2.setEjemplaresPrestados(prestados);

        LibroTextoUNIAC libroUNIAC = new LibroTextoUNIAC("Programacion en Java", "Juan Perez", 10, 2, "Programacion II", "Facultad de Ingenierias");

        Novela novela = new Novela("El misterio de la casa", "Pedro Gomez", 4, 1, "Policiaca");

        System.out.println("\n--- PRUEBA DE PRESTAMO Y DEVOLUCION ---");

        System.out.println("\nIntentando prestar libro 1...");
        if (libro1.prestamo()) {
            System.out.println("Préstamo realizado correctamente.");
        } else {
            System.out.println("No se pudo realizar el préstamo.");
        }
        System.out.println("Ejemplares prestados de libro 1: " + libro1.getEjemplaresPrestados());

        System.out.println("\nIntentando devolver libro 1...");
        if (libro1.devolucion()) {
            System.out.println("Devolución realizada correctamente.");
        } else {
            System.out.println("No se pudo realizar la devolución.");
        }
        System.out.println("Ejemplares prestados de libro 1: " + libro1.getEjemplaresPrestados());

        System.out.println("\n--- DATOS DE LOS LIBROS ESCOLARES Y NOVELAS ---");
        System.out.println(libroUNIAC.toString());
        System.out.println(novela.toString());

        teclado.close();
    }
}