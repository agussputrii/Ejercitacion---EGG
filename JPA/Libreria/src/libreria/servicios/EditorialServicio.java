/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author Agus
 */
public class EditorialServicio {
    EditorialDAO editorialDao = new EditorialDAO();
    Scanner sc = new Scanner (System.in);
    
    //Verifico editorial
    public Editorial crearEditorial(Editorial dataObjet) throws Exception {
            if (dataObjet.getNombre().isEmpty() || dataObjet.getNombre() ==null) {
                throw new Exception("Nombre vacio o nulo");
            }
            editorialDao.crearEditorial(dataObjet);
            return dataObjet;
    }
    
    //llama la lista de editorial
    public void llamarListaEditorial(){
        editorialDao.mostrarEditorial();
    }
    
    public Editorial buscarEditorial (int id) throws Exception{
        ArrayList<Editorial> editArray = (ArrayList<Editorial>) editorialDao.buscarEditorial();
        Editorial ed;
                /*
        * stream () convierte la lista en Stream. filter () aplica un predicado al
        * Producto que procesa el Stream y lo considera válido si evalúa a
        * cierto. En este caso, el predicado es el lambda p -> p.getId (). Es igual a (id)
        * que simplemente verifica la igualdad. finAny () hace que la secuencia finalice
        * procesando tan pronto como encuentra un elemento. orElse (): en caso de que el Opcional
        * devuelto por findAny está vacío hace que devuelva lo que pasamos en el método
        * parámetro
                 */        
        ed = editArray.stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);
        if (ed == null) {
            throw new Exception("ID no encontrado");
        }
        return ed;
    }
    
    //actualizar editorial
    public Editorial actualizarEditorial (int id) throws Exception {
        try {
            if (!(id<=0)) {
                Editorial edi = buscarEditorial(id);
                System.out.println("===SECCION DE MODIFICACION===\n");
                System.out.println("Modifique el nombre de la editorial\n");
                System.out.println("Nombre actual: " + edi.getNombre());
                String nombre = sc.nextLine();                
            
                if (!nombre.isEmpty()) {
                    edi.setNombre(nombre);
                    editorialDao.actualizarEditorial(edi);
                }else{
                    System.out.println("Nombre vacio, no modifiado");
                }
                return edi;
            }else{
                throw new Exception("ID vacio");
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }

    }
    
        public Editorial editorialEliminado(int id) throws Exception {
        try {
            if (!(id <=0)) {
                Editorial ed = buscarEditorial(id);
                editorialDao.borrarEditorial(ed);
                return ed;
            }else{
                throw new Exception("El ID esta vacio");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
    

}
