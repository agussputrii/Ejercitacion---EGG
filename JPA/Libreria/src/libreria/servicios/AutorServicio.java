/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    AutorDAO autordao = new AutorDAO();
    Scanner sc = new Scanner(System.in);

//verificamos autor
    public Autor crearAutor(Autor autorEntidad) throws Exception {
        if (autorEntidad.getNombre().isEmpty() || autorEntidad.getNombre() == null) {
            throw new Exception("El nombre esta vacio o es nulo");//verificamos nombre

        }
        autordao.crearAutor(autorEntidad);
        return autorEntidad;
    }

    //llamamos a los autores
    public void llamarListaAutores() {
        autordao.mostrarTodoAutor();
    }

    //retornamos autor solicitado en el main
    public Autor buscarAutor(int id) throws Exception {
        ArrayList<Autor> auArray = (ArrayList<Autor>) autordao.buscarAutor();
        Autor au;
        /*
* stream () convierte la lista en Stream. filter () aplica un predicado al
* Producto que procesa el Stream y lo considera válido si evalúa a
* cierto. En este caso, el predicado es el lambda p -> p.getId (). Es igual a (id)
* que simplemente verifica la igualdad. finAny () hace que la secuencia finalice
* procesando tan pronto como encuentra un elemento. orElse (): en caso de que el Opcional
* devuelto por findAny está vacío hace que devuelva lo que pasamos en el método
* parámetro
         */
        au = auArray.stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);
        if (au == null) {
            throw new Exception("Id no encontrado");
        }
        return au;
    }

    public void buscarAutorPorNombre() throws Exception {
        try {
            System.out.println("===BUSCAR AUTOR POR NOMBRE===\n");
            System.out.println("Escriba el nombre del autor a buscar\n");
            String nombre = sc.nextLine();
            if (nombre != "" || nombre != null) {
                List<Autor> auArray = autordao.BuscarAutorPorNombre(nombre);
                if (auArray == null) {
                    System.out.println("No se encontraron resultados");
                } else {
                    System.out.println("Resultados encontrados para el nombre: " + nombre);
                    auArray.forEach(aux -> System.out.println(aux));
                    System.out.println("-----FIN DE LOS RESULTADOS-----");
                }
            } else {
                throw new Exception("Nombre vacio, regrese al menu");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //actualizar autor seleccionado
    public Autor actualizarAutor(int id) throws Exception {
        try {
            if (!(id <= 0)) {
                Autor au = buscarAutor(id);
                System.out.println("----SECCION DE MODIFICACION----");
                System.out.println("Modifique el nombre del autor");
                System.out.println("Nombre actual: " + au.getNombre());
                String name = sc.nextLine();

                if (!name.isEmpty()) {
                    au.setNombre(name);
                    autordao.actualizarAutor(au);

                } else {
                    System.out.println("El nombre no se modifico o esta vacio");
                }
                return au;
            } else {
                throw new Exception("id vacio");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //borro el autor
    public Autor autorEliminado(int id) throws Exception {
        try {
            if (!(id <=0)) {
                Autor au = buscarAutor(id);
                autordao.borrarAutor(au);
                return au;
            }else{
                throw new Exception("El ID esta vacio");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    
}
