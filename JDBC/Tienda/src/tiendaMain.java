
import tienda.entidades.Fabricante;
import tienda.servicios.FabricanteServicios;
import tienda.servicios.ProductoServicios;

public class tiendaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoServicios p = new ProductoServicios();
        FabricanteServicios f = new FabricanteServicios();
        try {
            // A
            //p.MostrarNProd();
            
            // B
            //p.MostrarNomPrecProd();
            
            // C
            //p.MostrarEntre102y202();
            
            // D
            //p.MostrarPortatiles();
            
            // E
            //p.MostrarProdMasBarato();
            
            // F
            //p.MostrarTODO();
            
            //G
            
            //f.MostrarFabricantes();
            
            p.MostrarEdit();
            
        } catch (Exception e) {
            System.out.println("todo mal pibe");
        }

    }

}
