package entregas.figueroaMarco.reto004;

public class Fraccion {

    private int numerador;
    private int denominador;
        
    public Fraccion(int numerador, int denominador){
        assert denominador != 0 : "El denominador no puede ser 0";

        int mcd = mcd(numerador, denominador);
        this.numerador = Math.abs(numerador) / mcd;
        this.denominador = denominador / mcd;
    }

    public Fraccion (){
        this(0);
    }

    public Fraccion(int numerador){
        this(numerador, 1);
    }

    public int denominador(){
        return denominador;
    }

    public int numerador(){
        return numerador;
    }

    public String toString(){
        return numerador + "/" + denominador;
    }

    public Fraccion sumar(Fraccion fraccion){
        
    }

    private int mcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
