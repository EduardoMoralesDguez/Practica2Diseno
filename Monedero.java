package Practica2Diseno;

public class Monedero {

    public boolean esPosibleSuministrar(int cambio) {
        return true;
    }

    public int sumar(int totalActual, int cantidad) {
        if (cantidad > 0) {
            return totalActual + cantidad;
        }
        return totalActual;
    }

    public int restar(int totalActual, int cantidad) {
        if (cantidad <= totalActual) {
            return totalActual - cantidad;
        }
        return totalActual;
    }

    public int devolverCantidadIntroducida(int cantidadADevolver) {
        return 0;
    }
}