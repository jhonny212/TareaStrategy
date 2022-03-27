package Operadores;

import java.util.Scanner;

public abstract class Operacion {

    private double val1, val2;

    public abstract double ejecutar();

    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        this.setVal1(scanner.nextDouble());
        System.out.println("Ingrese el segundo valor");
        this.setVal2(scanner.nextDouble());
    }

    public double getVal1() {
        return val1;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public double getVal2() {
        return val2;
    }

    public void setVal2(double val2) {
        this.val2 = val2;
    }
}