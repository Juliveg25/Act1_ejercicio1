public class Fraccionario {
    private double numerador;
    private double denominador;

    public Fraccionario(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public void almacenarFraccionario(double numerador, double denominador){
        System.out.println("Fracción: " + this.numerador + "/" + this.denominador);
    }
}