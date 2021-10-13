
import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;


public class Naturaleza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("Ema","Carne","Bulldog Frances",4);
        Animal gato = new Gato("Squeezy","Pescado","Callejero xd",7);
        Animal caballo = new Caballo("Bojack HorseMan","Pasto","De barrio xd",100);
        
        System.out.println("PERRO\n"+perro.getNombre()+" se alimenta de "+perro.Alimentarse());
        System.out.println("GATO\n"+gato.getNombre()+" se alimenta de "+gato.Alimentarse());
        System.out.println("CABALLO\n"+caballo.getNombre()+" se alimenta de "+caballo.Alimentarse());
    }
    
}
