package superclase;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public abstract class Electrodomestico {
//	Crear una superclase llamada Electrodoméstico con los siguientes atributos:
//		precio, color, consumo energético (letras entre A y F) y peso.
    // Atributos

    protected Double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Integer peso;
    String nombre;

    //---------------------------------------------------------------
    //constructores
    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    //---------------------------------------------------------------
    //getters y setters

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(Character letra) {
        if (letra.equals(null)) {
            letra = 'F';
        }
        // Verifico que ingrese de A a F o de a-f 1 solo caracter
        boolean ver = letra.toString().matches("[a-fA-F]{1}");
        this.consumoEnergetico = (ver == true) ? letra : 'F';
    }

    private void comprobarColor(String color) {
        color = color.toUpperCase();
        boolean ver = color.matches("BLANCO|NEGRO|ROJO|AZUL|GRIS|");
        this.color = (ver == true) ? color : "BLANCO";
    }

    protected void crearElectrodomestico() {
        boolean ver = false, verPrecio = false, verPeso = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("----METODO DE CARGA DE ELETRODOMESTICO----");
            System.out.println("INGRESE TODO METICULOSAMENTE \nO SE REPETIRA TODO EL PROCESO");
            try {

                System.out.println("Ingrese el PRECIO del electródomestico");
                this.precio = sc.nextDouble();
                if (this.precio < 0) {
                    verPrecio = false;
                } else {
                    verPrecio = true;
                }
            } catch (Exception e) {
                System.out.println("PRECIO ERRONEO " + e);
                sc.nextLine();
                verPrecio = false;
            }
            try {
                System.out.println("Ingrese el PESO del electródomestico");
                this.peso = sc.nextInt();
                if (this.peso < 0) {
                    verPeso = false;
                } else {
                    verPeso = true;
                }
            } catch (Exception e) {
                System.out.println("PESO ERRONEO " + e);
                sc.nextLine();
                verPeso = false;
            }
            try {
                System.out.println("Ingresa la LETRA de su consumo electrónico");
                Character letra = sc.next().charAt(0);
                comprobarConsumoEnergetico(letra);
                ver = true;
            } catch (Exception e) {
                System.out.println("CARACTER ERRONEO " + e);
                sc.nextLine();
                ver = false;
            }
            sc.nextLine();
            try {
                System.out.println("Ingrese el COLOR del electródomestico");
                String color = sc.nextLine();
                comprobarColor(color);
                ver = true;
            } catch (Exception e) {
                System.out.println("COLOR ERRONEO " + e);
                sc.nextLine();
                ver = false;
            }
            if (ver == true && verPeso == true && verPrecio == true) {
                ver = true;
            } else {
                ver = false;
                System.out.println("ERROR EN EL LLENADO INICIE DE VUELTA REVISE BIEN LOS DATOS INGRESADOS");
            }
        } while (ver == false);
    }

    //	Método precioFinal(): según el consumo energético y su tamaño, aumentará
//	el valor del precio. Esta es la lista de precios
    protected double precioFinal() {
        // Aumento el precio final con respecto al consumo electrico
        double precioFinal = (this.consumoEnergetico.equals('A')) ? (this.precio + 1000)
                : (this.consumoEnergetico.equals('B')) ? (this.precio + 800)
                : (this.consumoEnergetico.equals('C')) ? (this.precio + 600)
                : (this.consumoEnergetico.equals('D')) ? (this.precio + 500)
                : (this.consumoEnergetico.equals('E')) ? (this.precio + 300)
                : (this.precio + 100);
        // Aumento el precio final con respecto al peso del electrodomestico
        this.precio = precioFinal;
        precioFinal = (this.peso >= 1 && this.peso <= 19) ? (this.precio + 100)
                : (this.peso >= 20 && this.peso <= 49) ? (this.precio + 500)
                        : (this.peso >= 50 && this.peso <= 79) ? (this.precio + 800)
                                : (this.peso >= 80) ? (this.precio + 1000) : this.precio;
        this.precio = precioFinal;
        return this.precio;
    }

    protected abstract void nombre();

}
