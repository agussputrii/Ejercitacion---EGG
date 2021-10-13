package entidades;

public class Carta {
    
    //atributos
    private int numero;
    private String palo;
    
    //constantes de la carta
    public static final String []PALOS = {"ESPADA","ORO","COPA","BASTO"};
    public static final int LIMITE_CARTA_PALO=12;
    
        public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero= " + numero + ", palo= " + palo;
    }
    
        
    
    
}
