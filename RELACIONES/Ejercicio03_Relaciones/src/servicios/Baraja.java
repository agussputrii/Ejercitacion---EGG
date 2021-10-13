package servicios;

import entidades.Carta;

public class Baraja {

    //atributos
    private Carta cartas[];
    private int posSiguienteCarta;

    //total de cartas
    public static final int TOTAL_CARTAS = 40;

    public Baraja() {
        this.cartas = new Carta[TOTAL_CARTAS];
        this.posSiguienteCarta = 0;
        crearBaraja();//creamos la baraja

    }

    public void crearBaraja() {
        String[] palos = Carta.PALOS;
        //Recorro los palos
        for (int i = 0; i < palos.length; i++) {
            //Recorro los numeros
            for (int j = 0; j < Carta.LIMITE_CARTA_PALO; j++) {
                //Las posiciones del 8 y del 9 son el 7 y el 8
                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        //para los casos de rey, reina y caballero
                        cartas[((i * (Carta.LIMITE_CARTA_PALO - 2)) + (j - 2))] = new Carta(j + 1, palos[i]);
                    } else {
                        //Para los casos de 1 a 7
                        cartas[((i * (Carta.LIMITE_CARTA_PALO - 2)) + j)] = new Carta(j + 1, palos[i]);
                    }
                }
            }
        }
    }

    /**
     *
     * metodo para generar numero aleatorio entre 2 valores
     *
     * @return numero aleatorio
     */
    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

    public void barajar() {

        int posAleatoria = 0;

        Carta c;
        //Recorro las cartas
        for (int i = 0; i < cartas.length; i++) {
            posAleatoria = generaNumeroEnteroAleatorio(0, TOTAL_CARTAS - 1);

            //intercambio en forma de rotacion
            c = cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria] = c;
        }
        //La posición vuelve al inicio
        this.posSiguienteCarta = 0;
    }
    
    
    /**
     * Devuelve la casta donde se encuentre "posSiguienteCarta"
     * @return carta del arreglo
     */
    public Carta siguienteCarta() {
        Carta c = null;
        if (posSiguienteCarta == TOTAL_CARTAS) {
            System.out.println("No hay mas cartas disponibles");
        } else {
            c = cartas[posSiguienteCarta++];

        }
        return c;
    }

    /**
     * Devuelve un numero de cartas. Controla si hay mas cartas de las que se piden 
     * @param numCartas
     * @return 
     */
    public Carta[] darCartas(int numCartas) {

        if (numCartas > TOTAL_CARTAS) {
            System.out.println("No se pueden dar mas de 40 cartas");
        } else if (cartasDisponibles() < numCartas) {
            System.out.println("No hay suficientes cartas que mostrar");
        } else {
            Carta[] cartasDar = new Carta[numCartas];

            //recorro el array que acabo de crear para rellenarlo
            for (int i = 0; i < cartasDar.length; i++) {
                cartasDar[i] = siguienteCarta();//uso el metodo anterior
            }
            //lo devuelvo
            return cartasDar;
        }
        return null;//en caso de error
    }

    public int cartasDisponibles() {
        return TOTAL_CARTAS - posSiguienteCarta;
    }

    public void cartasMonton() {

        if (cartasDisponibles() == TOTAL_CARTAS) {
            System.out.println("No se ha sacado ninguna carta");
        } else {
            //recorro desde la posicion 0 hasta posSiguienteCarta
            for (int i = 0; i < posSiguienteCarta; i++) {
                System.out.println(cartas[i].toString());
            }
        }
    }

    /**
     * Muestro las cartas que aun no han salido
     */
    public void mostrarCartas() {

        if (cartasDisponibles() == 0) {
            System.out.println("No hay cartas que mostrar");
        } else {
            for (int i = posSiguienteCarta; i < cartas.length; i++) {
                System.out.println(cartas[i].toString());
            }

        }

    }

}
