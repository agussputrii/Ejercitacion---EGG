/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public Collection listaConProdCompleta() throws Exception {

        try {
            String sql = "SELECT nombre "
                    + "   FROM producto;";
            consultarBase(sql);

            Producto producto = null;

            List<Producto> productosN = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                productosN.add(producto);
            }

            return productosN;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        } finally {
            desconectarBase();
        }

    }

    public Collection listaConProdPrecio() throws Exception {

        try {
            String sql = "SELECT nombre,precio "
                    + "   FROM producto;";
            consultarBase(sql);

            Producto producto = null;

            List<Producto> productosN = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productosN.add(producto);
            }

            return productosN;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        } finally {
            desconectarBase();
        }

    }

    public Collection PrecioEntre102y202() throws Exception {

        try {
            String sql = "select nombre,precio "
                    + "FROM producto "
                    + "where precio between 102 and 202;";
            consultarBase(sql);

            Producto producto = null;

            List<Producto> productosN = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productosN.add(producto);
            }

            return productosN;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        } finally {
            desconectarBase();
        }

    }

    public Collection listaConPortatiles() throws Exception {

        try {
            String sql = "SELECT nombre "
                    + "FROM producto "
                    + "WHERE nombre LIKE '%Portatil%';";
            consultarBase(sql);

            Producto producto = null;

            List<Producto> productosN = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                productosN.add(producto);
            }

            return productosN;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        } finally {
            desconectarBase();
        }

    }

    public Collection ProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre,precio\n"
                    + "FROM producto\n"
                    + "ORDER BY precio\n"
                    + "LIMIT 1;";

            consultarBase(sql);

            Producto producto = null;

            List<Producto> productosN = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productosN.add(producto);
            }

            return productosN;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        } finally {
            desconectarBase();
        }
    }

    // Ingresar un producto a la base de datos.
    public Collection AnadirProducto() throws Exception {

        try {
            String sql = "INSERT INTO producto\n"
                    + "VALUES(12, 'MotherBoard Asus B450-M', 89.99, 3);";
            consultarBase(sql);

            Producto producto = null;

            List<Producto> productosN = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productosN.add(producto);
            }

            return productosN;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        } finally {
            desconectarBase();
        }

    }

    public void EditarProducto() throws Exception {

        try {
                String sql = "UPDATE tienda\n"
                        + "SET codigo = 1,"
                        + "nombre = TESTEOXD,"
                        +"precio = 69.69,"
                        +"codigo_fabricante =1 ;";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;

        }

    }
}
