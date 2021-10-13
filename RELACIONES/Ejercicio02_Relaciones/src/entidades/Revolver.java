package entidades;

public class Revolver {

    private double pos_actual;
    private double pos_agua;

    public Revolver() {
    }

    public Revolver(double pos_actual, double pos_agua) {
        this.pos_actual = pos_actual;
        this.pos_agua = pos_agua;
    }

    public double getPos_actual() {
        return pos_actual;
    }

    public void setPos_actual(double pos_actual) {
        this.pos_actual = pos_actual;
    }

    public double getPos_agua() {
        return pos_agua;
    }

    public void setPos_agua(double pos_agua) {
        this.pos_agua = pos_agua;
    }

    //generamos numeros aleatorios entre 1 y 6
    public Revolver llenarRevolver() {
        double pos_actual = Math.floor(Math.random() * 6 + 1);
        double pos_agua = Math.floor(Math.random() * 6 + 1);

        return new Revolver(pos_actual, pos_agua);
    }

    //verificacion de posicion
    public boolean mojar() {
        if (this.pos_actual == this.pos_agua) {
            toString();
            return true;
        } else {

            return false;
        }
    }
    
    //rotacion del tambor
    public void siguienteChorro() {
        if (this.pos_actual != 6) {
            this.pos_actual++;
        } else {
            this.pos_actual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicion actual de la bala= [" + pos_actual + "]\nPosicion de la bala= [" + pos_agua + "]";
    }

}
