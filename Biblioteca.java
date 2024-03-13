import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nombre;
    String apellido;
    String telefono;
    String email;
    ArrayList<Libro> librosPendientes = new ArrayList<>();

    public Usuario(String nombre, String apellido, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
}

class Libro {
    String titulo;
    String autor;
    String isbn;
    boolean disponible = true;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
}

public class Biblioteca {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Libro> libros = new ArrayList<>();

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Acceder a un usuario");
            System.out.println("2. Ver libros disponibles");
            System.out.println("3. Ver libros pendientes de devolver");
            System.out.println("4. Pedir un libro");
            System.out.println("5. Devolver un libro");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    accederUsuario();
                    break;
                case 2:
                    verLibrosDisponibles();
                    break;
                case 3:
                    verLibrosPendientes();
                    break;
                case 4:
                    pedirLibro();
                    break;
                case 5:
                    devolverLibro();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }

    public void accederUsuario() {
        System.out.println("Accediendo a un usuario...");
    }

    public void verLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            if (libro.disponible) {
                System.out.println(libro.titulo + " - " + libro.autor);
            }
        }
    }

    public void verLibrosPendientes() {
        System.out.println("Mostrando libros pendientes de devolver...");
    }

    public void pedirLibro() {
        System.out.println("Pidiendo un libro...");
    }

    public void devolverLibro() {
        System.out.println("Devolviendo un libro...");
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.libros.add(new Libro("El código Da Vinci", "Dan Brown", "9780307474278"));
        biblioteca.libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "9788497592208"));
        biblioteca.libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "9788467032375"));

        biblioteca.menu();
    }
}
