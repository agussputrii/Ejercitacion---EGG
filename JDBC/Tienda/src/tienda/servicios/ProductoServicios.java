package tienda.servicios;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public final class ProductoServicios {

    private ProductoDAO dao;

    public ProductoServicios() {
        this.dao = new ProductoDAO();
    }

    public void MostrarNProd() throws Exception {
        try {
            ArrayList<Producto> l1 = (ArrayList<Producto>) dao.listaConProdCompleta();

            System.out.println("NOMBRE PRODUCTO");
            System.out.println("-.-.-.-.-.-.-.-.-");
            for (Producto producto : l1) {
                System.out.println(producto.getNombre());
            }
            System.out.println("-.-.-.-.-.-.-.-.-");

        } catch (Exception e) {
            throw e;
        }
    }

    public void MostrarNomPrecProd() throws Exception {
        try {
            ArrayList<Producto> l1 = (ArrayList<Producto>) dao.listaConProdPrecio();

            System.out.println("NOMBRE PRODUCTO y PRECIO");
            System.out.println("-.-.-.-.-.-.-.-.-");
            for (Producto producto : l1) {
                System.out.println(producto.getNombre() + "    | $ " + producto.getPrecio() + " |");

            }
            System.out.println("-.-.-.-.-.-.-.-.-");

        } catch (Exception e) {
            throw e;
        }
    }

    public void MostrarEntre102y202() throws Exception {
        try {
            ArrayList<Producto> l1 = (ArrayList<Producto>) dao.PrecioEntre102y202();

            System.out.println("NOMBRE PRODUCTO");
            System.out.println("-.-.-.-.-.-.-.-.-");
            for (Producto producto : l1) {
                System.out.println(producto.getNombre() + "    | $ " + producto.getPrecio() + " |");

            }
            System.out.println("-.-.-.-.-.-.-.-.-");

        } catch (Exception e) {
            throw e;
        }
    }

    public void MostrarPortatiles() throws Exception {
        try {
            ArrayList<Producto> l1 = (ArrayList<Producto>) dao.listaConPortatiles();

            System.out.println("NOMBRE PRODUCTO");
            System.out.println("-.-.-.-.-.-.-.-.-");
            for (Producto producto : l1) {
                System.out.println(producto.getNombre());
            }
            System.out.println("-.-.-.-.-.-.-.-.-");

        } catch (Exception e) {
            throw e;
        }
    }

    public void MostrarProdMasBarato() {
        try {
            ArrayList<Producto> l1 = (ArrayList<Producto>) dao.ProductoMasBarato();

            System.out.println("|          PRODUCTO MAS BARATO            |");
            System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");

            for (Producto producto : l1) {
                System.out.println(producto.getNombre() + "    | $ " + producto.getPrecio() + " |");
            }
            System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        } catch (Exception e) {
        }

    }

    public void editar() throws Exception {
        try {
            dao.AnadirProducto();
        } catch (Exception e) {
            throw e;
        }

    }

    public void MostrarTODO() throws Exception {
        try {
            ArrayList<Producto> l1 = (ArrayList<Producto>) dao.AnadirProducto();
            Object p1 = dao.AnadirProducto();
            l1.add((Producto) p1);
        } catch (Exception e) {
        }

        try {
            ArrayList<Producto> l1 = (ArrayList<Producto>) dao.listaConProdPrecio();

            System.out.println("NOMBRE PRODUCTO y PRECIO");
            System.out.println("-.-.-.-.-.-.-.-.-");
            for (Producto producto : l1) {
                System.out.println(producto.getCodigo() +  producto.getNombre() + "    | $ " + producto.getPrecio() + " |" + producto.getCodigoFabricante());

            }
            System.out.println("-.-.-.-.-.-.-.-.-");

        } catch (Exception e) {
            throw e;
        }
    }
    
        public void MostrarEdit() throws Exception {
        try {
            dao.EditarProducto();
            ArrayList<Producto> l1 = (ArrayList<Producto>) dao.listaConProdCompleta();

            System.out.println("NOMBRE PRODUCTO");
            System.out.println("-.-.-.-.-.-.-.-.-");
            for (Producto producto : l1) {
                System.out.println(producto.getNombre());
            }
            System.out.println("-.-.-.-.-.-.-.-.-");

        } catch (Exception e) {
            throw e;
        }
    }

}
