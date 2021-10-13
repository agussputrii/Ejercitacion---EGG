package entidades;

import entidades.Cadena;
import java.util.Scanner;

public class Servicios {

    public Cadena CrearCadena() {
        
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa una frase: ");
        String frase = sc.nextLine();

        int longitudfrase = frase.length();

        return new Cadena(frase, longitudfrase);
    }

//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
    public void mostrarVocales(Cadena chano) {
        //obtenemos la cadena del objeto
        String frase = chano.getFrase();

        //asigno letras para un contador
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        // con charAt obtenemos el caracter actual del recorrido
        // y dentro del switch evualamos coincidencias con las vocales e incrementa el
        // contador correspondiente

        for (int j = 0; j < frase.length(); j++) {
            switch (frase.charAt(j)) {
                case 'a':
                    a++;
                    break;

                case 'e':
                    e++;
                    break;

                case 'i':
                    i++;
                    break;

                case 'o':
                    o++;
                    break;

                case 'u':
                    u++;
                    break;

                default:
                    break;

            }
        }
        System.out.println();
        System.out.println("La frase tiene: [" + a + "] vocales [A]");
        System.out.println("La frase tiene: [" + e + "] vocales [E]");
        System.out.println("La frase tiene: [" + i + "] vocales [I]");
        System.out.println("La frase tiene: [" + o + "] vocales [O]");
        System.out.println("La frase tiene: [" + u + "] vocales [U]");

    }

    //Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
    //por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac"
    /**
     * Deberá invertir la frase ingresada y mostrar la frase invertida por
     * pantalla.
     */
    public String invertirFrase(Cadena chano) {
        String cadenaInvertida = "";

        // Recorremos la frase desde el fin hasta el inicio de la cadena
        //  y almacenamos caracter por caracter a la cadena invertida
        for (int i = chano.getFrase().length() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + chano.getFrase().charAt(i);
        }
        return cadenaInvertida;
    }

    public void vecesRepetido(Cadena chano, char letra) {
        int contador = 0;

        //Recorremos la frase para buscar la letra
        for (int i = 0; i < chano.getFrase().length(); i++) {
            //validamos los caracteres que coinciden
            if (chano.getFrase().charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces.");
    }

    /*
	 * Deberá comparar la longitud de la frase que compone la clase 
	 * con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud(Cadena c, String nuevaFrase) {
        // comparamos las longitudes
        if (c.getLongitudfrase() == nuevaFrase.length()) {
            System.out.println("Las dos frases tienen la misma longitud.");
        } else {
            System.out.println("La longitud de las frases es distinta.");
        }
    }
    
    /*
	 * Deberá unir la frase contenida en la clase
	 * Cadena con una nueva frase ingresada por el usuario y mostrar la frase
	 * resultante.
	 */
	public void unirFrases(Cadena c, String nuevaFrase) {
		String fraseConcatenada = c.getFrase().concat(nuevaFrase); // unimos las frases
		System.out.println("\nLa frase resultante es: [" + fraseConcatenada + "].");
	}

	/*
	 * Deberá reemplazar todas las letras “a” que
	 * se encuentren en la frase, por algún otro carácter seleccionado por el
	 * usuario y mostrar la frase resultante.
	 */
	public void reemplazar(Cadena c, String nuevaLetra) {
		String nuevaFrase = c.getFrase().replace("a", nuevaLetra); // reemplazamos el cracter a por el nuevo
		System.out.println("La frase resultante con caracteres reemplazados es: [" + nuevaFrase + "].");
	}

	/*
	 * Método contiene(String letra), deberá comprobar si la frase contiene una
	 * letra que ingresa el usuario y devuelve verdadero si la contiene y falso si
	 * no.
	 */
	public boolean contiene(Cadena c, String caracter) {
		boolean resultado = false;
		char aux_letra;
		int contador = 0;
		
		// Recorremos la frase para comparar caracter por caracter
		for (int i = 0; i < c.getFrase().length(); i++) {
			// almacenamos el caracter de la frase
			aux_letra = c.getFrase().charAt(i); 
			
			// Validamos si los cracteres son iguales
			resultado = caracter.contains(String.valueOf(aux_letra));
			
			// si resultado es true aumentamos contador
			if (resultado) {
				contador++;
			}
		}
		
		/*
		 *  si el contador es distinto a cero resultado sera true.
		 *  Utilizamos el [ operador ternario ?: ] 
		 */
		return resultado = (contador != 0) ? true : false;
	}
    
}
