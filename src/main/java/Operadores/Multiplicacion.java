package Operadores;

public class Multiplicacion extends Operacion{
    @Override
    public double ejecutar() {
        return this.getVal1()*this.getVal2();
    }
}
