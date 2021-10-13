/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.persistencia.LibroDAO;

import libreria.entidades.Autor;
import libreria.entidades.Libro;
import libreria.entidades.Editorial;

/**
 *
 * @author Agus
 */
public class LibroServicio {

    LibroDAO libroDao = new LibroDAO();
    Scanner sc = new Scanner(System.in);
    AutorServicio auS = new AutorServicio();
    EditorialServicio edS = new EditorialServicio();

    public Libro crearLibro(Libro libro) throws Exception {
        if (libro.getTitulo().isEmpty() || libro.getTitulo() == null) {
            throw new Exception("Titulo de libro vacio o null");
        }
        if (libro.getAnio() == 0 || libro.getAnio() < 0) {
            throw new Exception("Anio vacio o menor a 0");
        }
        if (libro.getEjemplares() <= 0) {
            throw new Exception("Ejemplares vacios");
        }
        if (libro.getEjemplaresPrestados() <= 0 || libro.getEjemplaresRestantes() <= 0) {
            throw new Exception("Ejemplares prestados o ya no quedan mas ejemplares");
        }
        libroDao.crearLibro(libro);
        return libro;
    }

    //mostrar libros
    public void mostrarLibros() {
        libroDao.mostrarTodoLibro();
    }

    //buscar libro
    public Libro buscarLibro(long id) throws Exception {
        try {
            if (!(id <= 0)) {
                ArrayList<Libro> libroArray = (ArrayList<Libro>) libroDao.buscarAutor();

                Libro book = libroArray.stream().filter(p -> p.getIsbn().equals(id)).findAny().orElse(null);
                if (book != null) {
                    if (book.getAutor().getAlta().equals(false)) {
                        book.setAutor(null);
                    }
                    if (book.getEditorial().getAlta().equals(false)) {
                        book.setEditorial(null);
                    }
                }
                return book;
            } else {
                throw new Exception("ID no encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //libro eliminado
    public Libro libroEliminado(long id) throws Exception {
        try {
            if (!(id <= 0)) {
                Libro libro = buscarLibro(id);
                libroDao.borrarLibro(libro);
                return libro;
            } else {
                throw new Exception("ID vacio");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //busqueda por titulo
    public void buscarPorTitulo() throws Exception {
        try {

            System.out.println("-----SECCION BUSCAR POR TITULO DE LIBRO-----");
            System.out.println("Ingrese el titulo que desea buscar:\n");
            String titulo = sc.nextLine();
            List<Libro> listaLibro = libroDao.buscarPorTitulo(titulo);

            if (!listaLibro.isEmpty()) {
                System.out.println("Libros encontrados");
                listaLibro.forEach(p -> System.out.println(p.toString()));
            } else {
                System.out.println("Los libros no se encontraron");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //buscar libro por nombre del autor
    public void buscarPorNombreDelAutor() throws Exception {
        try {
            System.out.println("-----SECCION BUSCAR LIBRO POR NOMBRE DEL AUTOR-----");
            System.out.println("Ingrese el NOMBRE DEL AUTOR que desea buscar sus LIBROS:\n");
            String nombreAut = sc.nextLine();
            List<Libro> listaLibro = libroDao.buscarPorNombreDeAutor(nombreAut);
            if (!listaLibro.isEmpty()) {
                System.out.println("Datos encontrados\n");
                listaLibro.forEach(System.out::println);
                System.out.println("\nFinalizacion con exito");
            } else {
                System.out.println("No se encontraron libros del autor");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
    
        public void buscarPorNombreDeEditorial() throws Exception {
        try {
            System.out.println("-----SECCION BUSCAR LIBRO POR NOMBRE DE EDITORIAL-----");
            System.out.println("Ingrese el NOMBRE DE EDITORIAL que desea buscar sus LIBROS:\n");
            String nombreEdi = sc.nextLine();
            List<Libro> listaEdi = libroDao.buscarPorNombreDeEditorial(nombreEdi);
            if (!listaEdi.isEmpty()) {
                System.out.println("Datos encontrados\n");
                listaEdi.forEach(System.out::println);
                System.out.println("\nFinalizacion con exito");
            } else {
                System.out.println("No se encontraron editoriales");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //buscamos por ISBN
    public void buscarPorISBN() throws Exception {
        try {
            System.out.println("-----SECCION BUSCAR LIBRO POR ISBN-----");
            System.out.println("Ingrese el NOMBRE DEL AUTOR que desea buscar sus LIBROS:\n");
            Libro isb = buscarLibro(sc.nextLong());
            sc.nextLine();
            if (isb != null) {
                System.out.println("Datos encontrados\n");
                System.out.println(isb.toString());
                System.out.println("\nFinalizacion con exito");
            } else {
                System.out.println("No se encontraron datos");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //actualizar libro
    public Libro actualizarLibro(long id) throws Exception {
        int eleccion = -1;
        Libro libro = buscarLibro(id);
        try {
            if (!(id <= 0)) {
                do {
                    System.out.println("-----SECCION MODIIFICACION DE LIBRO------");
                    System.out.println("Que te gustaria modificar?");
                    System.out.println("1- Modificar titulo\n2- Modificar Anio\n3- Modificar Ejemplares"
                            + "\n4- Modificar ejemplares prestados\n5- Modificar ejemplares restantes\n6- Modificar editorial"
                            + "\n7- Modificar autor\n0- Salir de la seccion de modificacion");
                    eleccion = sc.nextInt();
                    sc.nextLine();

                    switch (eleccion) {
                        case 1:
                            System.out.println("Inserte el nuevo titulo");
                            System.out.println("El titulo actual es: " + libro.getTitulo().toLowerCase());
                            libro.setTitulo(sc.nextLine());
                            break;

                        case 2:
                            System.out.println("Inserte el nuevo anio");
                            System.out.println("El anio actual es: " + libro.getAnio());
                            libro.setAnio(sc.nextInt());
                            sc.nextLine();
                            break;

                        case 3:
                            System.out.println("Inserte los nuevos ejemplares");
                            System.out.println("Los ejemplares actuales son: " + libro.getEjemplares());
                            libro.setEjemplares(sc.nextInt());
                            sc.nextLine();
                            break;

                        case 4:
                            System.out.println("Inserte los nuevos ejemplares prestados");
                            System.out.println("Los ejemplares prestados actuales son: " + libro.getEjemplaresPrestados());
                            libro.setEjemplaresPrestados(sc.nextInt());
                            sc.nextLine();
                            break;

                        case 5:
                            System.out.println("Inserte los nuevos modelos restantes");
                            System.out.println("Los modelos restantes actuales son: " + libro.getEjemplaresRestantes());
                            libro.setEjemplaresRestantes(sc.nextInt());
                            sc.nextLine();
                            break;

                        case 6:
                            if (libro.getEditorial() != null) {
                                System.out.println("Interte el nombre de la nueva editorial");
                                System.out.println("La editorial actual es: " + libro.getEditorial());
                                Editorial e = libro.getEditorial();
                                e.setNombre(sc.nextLine());
                                libro.setEditorial(e);
                            } else {
                                System.out.println("No hay editorial para este libro\nSi desea anadir una pulse 1, caso contrario pulse 0");
                                int va  = sc.nextInt();
                                sc.nextLine();
                                if (va  == 1) {
                                    System.out.println("Ingrese el nombre de la editorial a crear");
                                    String nombre = sc.nextLine();
                                    Editorial edi = new Editorial(nombre, true);
                                    libro.setEditorial(edS.crearEditorial(edi));
                                }
                            }
                            break;

                        case 7:
                            if (libro.getAutor() != null) {
                                System.out.println("Ingrese el nombre del autor");
                                System.out.println("El nombre del autor actual es: " + libro.getAutor());
                                Autor a = libro.getAutor();
                                a.setNombre(sc.nextLine());
                                libro.setAutor(a);
                            } else {
                                System.out.println("No existe autor para este libro, si desea anadir uno:"
                                        + "Escriba 1 para anadir, caso contrario escriba 0");
                                int va  = sc.nextInt();
                                sc.nextLine();
                                if (va  == 1) {
                                    System.out.println("Ingrese el nombre del autor a crear");
                                    String nombre = sc.nextLine();
                                    Autor a = new Autor(nombre, true);
                                    libro.setAutor(auS.crearAutor(a));
                                }
                            }
                            break;

                        case 0:
                            eleccion = 0;
                            break;

                        default:
                            System.out.println("Comando no encontrado o erroneo");
                            break;
                    }
                } while (eleccion != 0);
                this.libroDao.actualizarLibro(libro);
                System.out.println("LIBRO ACTUALIZADO CON EXITO");
                return libro;

            } else {
                throw new Exception("ID NO ENCONTRADO");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

}
