package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tienda.entidades.Fabricante;
import tienda.servicios.FabricanteServicios;

public final class FabricanteDAO extends DAO {

    public void AnadirFabricante() throws Exception {

        try {
            String sql = "INSERT INTO fabricante\n"
                         + "VALUES(10, 'HyperX');";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;

        }

    }

    public Collection listaConFABRICCompleta() throws Exception {

        try {
            String sql = "SELECT * "
                    + "   FROM fabricante;";
            consultarBase(sql);

            Fabricante fabricante = null;

            List<Fabricante> fabricantes = new ArrayList();

            while (resultado.next()) {
                fabricante = new Fabricante();

                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));

                fabricantes.add(fabricante);
            }

            return fabricantes;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        } finally {
            desconectarBase();
        }

    }
    

}
