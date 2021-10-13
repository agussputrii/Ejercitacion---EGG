package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public class AutorDAO extends DAO {

    //crear autor
    public void crearAutor(Autor autor) {
        try {
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    //actualizar autor
    public void actualizarAutor(Autor autor) {
        try {
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    //borrar autor
    public void borrarAutor(Autor autor) {
        try {
            em.getTransaction().begin();
            em.remove(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
    
    //buscar autor por nombre
    public List<Autor>BuscarAutorPorNombre(String nombre){
        @SuppressWarnings("unchecked")
        List<Autor> autor = em
                .createQuery("SELECT nombre FROM Autor WHERE lower(nombre) LIKE lower(:name) AND alta = true")
                .setParameter("nombre",nombre + "%").getResultList();
        return autor;
    }
    
    
    //mostrar todos los autores
    public List<Autor> mostrarTodoAutor(){
        try {
            return em.createQuery("SELECT nombre FROM libreria.Autor").getResultList();
        } catch (Exception e) {
            System.out.println("No se pudo traer la lista de autores "+e);
        }
        return null;
    }
    //buscar por nombre del autor
    public List<Autor>buscarAutor(){
        @SuppressWarnings("unchecked")
        List<Autor> autor = (List<Autor>)em.createQuery("FROM Autor WHERE alta = true")
                                        .getResultList();
        System.out.println("El numero de autores en la base de datos es: ["+autor.size()+"]");
        return autor;
    }
    

}
