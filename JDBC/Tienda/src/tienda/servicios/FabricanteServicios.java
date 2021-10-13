/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Agus
 */
public final class FabricanteServicios {

    private FabricanteDAO dao = new FabricanteDAO();

    public FabricanteServicios() {
        this.dao = new FabricanteDAO();
    }
    
    public void MostrarFabricantes() throws Exception {
        try {
           dao.AnadirFabricante();
           ArrayList<Fabricante> f1 = (ArrayList<Fabricante>) dao.listaConFABRICCompleta();
            System.out.println("NOMBRE DEL FABRICANTE");
            System.out.println("-.-.-.-.-.-.-.-.-");
            for (Fabricante fabricante : f1) {
                System.out.println(fabricante.getCodigo()+ "    |  " + fabricante.getNombre()+ " |");

            }
            System.out.println("-.-.-.-.-.-.-.-.-");

        } catch (Exception e) {
            throw e;
        }
    }
}
