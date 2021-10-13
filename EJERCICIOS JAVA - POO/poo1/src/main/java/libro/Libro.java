package libro;

import java.util.Scanner;
//Crear una clase llamada Libro

public class Libro {

    //que contenga los siguientes atributos: ISBN, Título,
    //Autor, Número de páginas
    public int isbn;
    public String titulo;
    public String autor;
    public int numpag;

    //constructor vacío.
    public Libro() {

    }

    //constructor lleno
    public Libro(int isbn, String titulo, String autor, int numpag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
        this.isbn = isbn;
    }

    //Crear un método para cargar un libro pidiendo los
    //datos al usuario
    public void cargarLibro() {
        Scanner read = new Scanner(System.in);
        //pido titulo
        System.out.println("Ingresa el TITULO del libro");
        titulo = read.nextLine();

        //pido autor
        System.out.println("Ingresa el AUTOR del libro");
        autor = read.nextLine();

        //pido numero de paginas
        System.out.println("Ingresa el NUMERO DE PAGINAS del libro");
        numpag = read.nextInt();

        //pido ISBN
        System.out.println("Ingresa el ISBN del libro");
        isbn = read.nextInt();
    }

    //informar mediante otro método el número de ISBN, el título,
    //el autor del libro y el numero de páginas
    public void MostrarDatos() {
        System.out.println("Titulo [" + titulo + "]");
        System.out.println("Autor [" + autor + "]");
        System.out.println("Numero de paginas [" + numpag + "]");
        System.out.println("Numero ISBN [" + isbn + "]");
    }
}
