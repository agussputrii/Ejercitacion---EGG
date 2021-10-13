/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

/**
 *
 * @author Agus
 */
public class MenLibreria {

    static AutorServicio aus = new AutorServicio();
    static EditorialServicio eds = new EditorialServicio();
    static LibroServicio libroserv = new LibroServicio();

    public static void menLib() {
        boolean ver = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---TODOS LOS AUTORES---");
            aus.llamarListaAutores();
            System.out.println("---TODAS LAS EDITORIALES---");
            eds.llamarListaEditorial();
            System.out.println("---TODOS LOS LIBROS---");
            libroserv.mostrarLibros();
            System.out.println("1- Crear y llamar autor\n2- Crear y llamar editorial\n3- Crear un libro y llamarlo"
                    + "\n4- CRUD Autor\n5- CRUD Editorial\n6- CRUD Libro\n7- Buscar autor por nombre\n8- Buscar libro por ISBN"
                    + "\n9- Buscar libro por titulo\n10- Buscar libro por nombre de autor"
                    + "\n11- Buscar libro por nombre de editorial\n0- SALIR");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    try {
                    //crear el autor
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del autor");
                    String nombre = sc.nextLine();
                    Autor autor = new Autor(nombre, true);
                    aus.crearAutor(autor);
                    System.out.println("---Autor creado---");
                    //aus.llamarListaAutores();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
                break;

                case 2:
                    try {
                    sc.nextLine();
                    //crear editorial
                    System.out.println("Ingrese el nombre de la editorial");
                    String nombre = sc.nextLine();
                    Editorial ediEntity = new Editorial(nombre, true);
                    eds.crearEditorial(ediEntity);
                    System.out.println("---Editorial Creada---");
                    //eds.llamarListaEditorial();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
                break;

                case 3:
                    try {
                    sc.nextLine();
                    Libro libro = null;
                    System.out.println("---CREAR NUEVO LIBRO---");
                    System.out.println("Ingrese el titulo del libro:");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese el anio del libro:");
                    Integer anio = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese los ejemplares del libro:");
                    Integer ejemplares = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese los ejemplares prestados del libro:");
                    Integer ejemplaresPrestados = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese los ejemplares restantes del libro:");
                    Integer ejemplaresRestantes = sc.nextInt();
                    sc.nextLine();
                    Boolean alta = true;
                    System.out.println("Ingrese la EDITORIAL del libro:");
                    System.out.println("---LISTA DE LAS EDITORIALES---");
                    eds.llamarListaEditorial();
                    System.out.println("Ingrese la id de la editorial para insertar el libro:");
                    Integer idEditorial = sc.nextInt();
                    sc.nextLine();
                    Editorial editorial = eds.buscarEditorial(idEditorial);
                    System.out.println("Ingrese el AUTOR del libro:");
                    System.out.println("---LISTA DE AUTORES---");
                    aus.llamarListaAutores();
                    System.out.println("Seleccione la id del AUTOR para insertar el libro:");
                    Integer idAutor = sc.nextInt();
                    sc.nextLine();
                    Autor autor = aus.buscarAutor(idAutor);
                    libro = new Libro(titulo, anio, ejemplares, ejemplaresPrestados,
                            ejemplaresRestantes, alta, autor, editorial);
                    libroserv.crearLibro(libro);

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                break;

                case 4:
                    try {
                        crudAutor();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                break;
                
                case 5:
                    try {
                    crudEditorial();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                    
                case 6:
                    try {
                    crudLibro();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                    
                case 7:
                    try {
                        aus.buscarAutorPorNombre();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                    
                case 8:
                    try {
                    libroserv.buscarPorISBN();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                    
                case 9:
                    try {
                    libroserv.buscarPorTitulo();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                    
                case 10:
                    try {
                    libroserv.buscarPorNombreDelAutor();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                    
                case 11:
                    try {
                    libroserv.buscarPorNombreDeEditorial();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                    
                case 0:
                    ver = true;
                    break;
                    
                default:
                    System.out.println("Numero incorrecto");
                    ver = false;
                    break;
     
            }
        } while (ver != true);

    }

    
    //CRUD AUTOR
    private static void crudAutor() throws Exception {
        Scanner sc = new Scanner(System.in);
        int value = -1;
        int id = -1;

        try {
            do {
                System.out.println("--AUTOR CRUD--");
                System.out.println("Seleccione\n1 para ACTUALIZAR\n2 para ELIMINAR\n0 para SALIR del autor CRUD");
                value = sc.nextInt();
                switch (value) {
                    case 1:
                        aus.llamarListaAutores();
                        System.out.println("Seleccione el ID AUTOR para actualizar los datos");
                        id = sc.nextInt();
                        sc.nextLine();
                        aus.actualizarAutor(id);
                        break;

                    case 2:
                        aus.llamarListaAutores();
                        System.out.println("Seleccione el ID AUTOR para eliminacion suave de los datos");
                        id = sc.nextInt();
                        sc.nextLine();
                        aus.autorEliminado(id);
                        break;

                    case 0:
                        value = 0;
                        break;

                    default:
                        System.out.println("Comando no encontrado");
                        break;
                }
            } while (value != 0);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //CRUD EDITORIAL
    private static void crudEditorial() throws Exception {
        Scanner sc = new Scanner(System.in);
        int value = -1;
        int id = -1;
                try {
            do {
                System.out.println("--EDITORIAL CRUD--");
                System.out.println("Seleccione\n1 para ACTUALIZAR\n2 para ELIMINAR\n0 para SALIR del editorial CRUD");
                value = sc.nextInt();
                switch (value) {
                    case 1:
                        eds.llamarListaEditorial();
                        System.out.println("Seleccione el ID EDITORIAL para actualizar los datos");
                        id = sc.nextInt();
                        sc.nextLine();
                        eds.actualizarEditorial(id);
                        break;

                    case 2:
                        eds.llamarListaEditorial();
                        System.out.println("Seleccione el ID EDITORIAL para eliminacion suave de los datos");
                        id = sc.nextInt();
                        sc.nextLine();
                        eds.editorialEliminado(id);
                        break;

                    case 0:
                        value = 0;
                        break;

                    default:
                        System.out.println("Comando no encontrado");
                        break;
                }
            } while (value != 0);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
        
    }
    
    
        //CRUD LIBRO
    private static void crudLibro() throws Exception {
        Scanner sc = new Scanner(System.in);
        int value = -1;//valor para do while
        int id = -1;//valor isbn
                try {//imprime el error
            do {//salir del crud
                System.out.println("--LIBRO CRUD--");
                System.out.println("Seleccione\n1 para ACTUALIZAR\n2 para ELIMINAR\n0 para SALIR del libro CRUD");
                value = sc.nextInt();
                switch (value) {
                    case 1://actualizar
                        libroserv.mostrarLibros();
                        System.out.println("Seleccione el ISBN del LIBRO para actualizar los datos");
                        id = sc.nextInt();
                        sc.nextLine();
                        libroserv.actualizarLibro(id);
                        break;

                    case 2://borrar
                        libroserv.mostrarLibros();
                        System.out.println("Seleccione el ISBN del LIBRO para eliminar");
                        id = sc.nextInt();
                        sc.nextLine();
                        libroserv.libroEliminado(id);
                        break;

                    case 0://salir
                        value = 0;
                        break;

                    default:
                        System.out.println("Comando no encontrado");
                        break;
                }
            } while (value != 0);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
        
    }

}
