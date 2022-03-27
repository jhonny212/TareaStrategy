package Operadores;

public class Resta extends Operacion{
    @Override
    public double ejecutar() {
        return this.getVal1()-this.getVal2();
    }
}
