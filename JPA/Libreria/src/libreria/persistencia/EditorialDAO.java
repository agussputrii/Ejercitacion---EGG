/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author Agus
 */
public class EditorialDAO extends DAO{
    //crear
    public void crearEditorial(Object dataObject){
        try {
            em.getTransaction().begin();
            em.persist(dataObject);
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
    
    //actualizar
    public void actualizarEditorial(Editorial entity){
        try {
            em.getTransaction().begin();
            em.merge(entity);
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
    
    //borrar
    public void borrarEditorial(Editorial entity){
        try {
            em.getTransaction().begin();
            em.remove(entity);
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
    
    //Busca e imprime todas las editoriales
    public List<Editorial> mostrarEditorial(){
        try {
            return em.createQuery("SELECT a FROM Editorial a").getResultList();
        } catch (Exception e) {
            System.out.println("No se pudo traer la lista de editorales "+e);
        }
        return null;
    }
    
    //Busca y retorna la editorial requerida
    public List <Editorial> buscarEditorial(){
        List <Editorial> editorial = (List <Editorial>) em
                .createQuery("FROM Editorial WHERE alta = true").getResultList();
        System.out.println("El numero de Editoriales en la base de datos es: ["+editorial.size()+"]");
    return editorial;
    }
    
}
