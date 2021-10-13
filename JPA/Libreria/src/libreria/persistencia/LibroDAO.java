package libreria.persistencia;

import java.util.List;
import javax.persistence.Query;
import libreria.entidades.Libro;

public class LibroDAO extends DAO {

    //crear libro
    public void crearLibro(Libro libro) {
        try {
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void actualizarLibro(Libro libro) {
        try {
            em.getTransaction().begin();
            em.merge(libro);
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

    public void borrarLibro(Libro libro) {
        try {
            em.getTransaction().begin();
            em.remove(libro);
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

    //buscar un libro por titulo
    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> libro = em.createQuery("FROM Libro WHERE titulo LIKE ?1 AND alta = true", Libro.class)
                .setParameter(1, titulo + "%").getResultList();
        return libro;
    }

    //mostrar lista de libros
    public List<Libro> mostrarTodoLibro() {
        try {
            return em.createQuery("SELECT a FROM Libro a").getResultList();
        } catch (Exception e) {
            System.out.println("No se pudo traer la lista de libros " + e);
        }
        return null;
    }

    //búsqueda y devolución del libro para insertar en el libro
    public List<Libro> buscarAutor() {
        List<Libro> libro = em.createQuery("FROM Libro WHERE alta = true").getResultList();
        System.out.println("El numero de libros en la base de datos es: [" + libro.size() + "]");
        return libro;
    }

    //busqueda y devolucion del libro por artista            
    public List<Libro> buscarPorNombreDeAutor(String nombreAut) {
        Query query = em.createQuery("SELECT b FROM Libro b INNER JOIN b.autor a "
                + "WHERE a.nombre LIKE ?1 AND b.alta = true AND a.alta = true").setParameter(1, nombreAut + "%");
        List<Libro> libro = query.getResultList();
        System.out.println("El numero de libros en la base de datos es: [" + libro.size() + "]");
        return libro;
    }

    //buscar por nombre de editorial
    public List<Libro> buscarPorNombreDeEditorial(String nombreEdit) {
        Query query = em.createQuery("SELECT b FROM Libro b INNER JOIN b.editorial p "
                + "WHERE p.nombre LIKE ?1 AND b.alta = true and p.alta = true").setParameter(1, nombreEdit + "%");
        List<Libro> libro = query.getResultList();
        System.out.println("El numero de libros en la base de datos es: [" + libro.size() + "]");
        return libro;
    }
}
