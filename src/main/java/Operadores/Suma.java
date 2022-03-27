package Operadores;

public class Suma extends Operacion{
    @Override
    public double ejecutar() {
        return this.getVal1()+this.getVal2();
    }
}
