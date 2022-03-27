import Operadores.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.realizarOperacion();
    }

    public static class Calculadora{
        private Operacion operacion;
        public void realizarOperacion() {
            boolean fin = false;
            while (!fin){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Seleccione una opcion:\n"
                        + "1. Suma\n"
                        + "2. Resta\n"
                        + "3. Multiplicar\n"
                        + "4. Salir\n");
                int op = scanner.nextInt();
                switch (op) {
                    case 1:
                        this.setOperacion(new Suma());
                        break;
                    case 2:
                        this.setOperacion(new Resta());
                        break;
                    case 3:
                        this.setOperacion(new Multiplicacion());
                        break;
                    case 4:
                        fin=true;
                    break;
                }
                this.operacion.pedirDatos();
                System.out.println("El resultado de la operacion es de " +operacion.ejecutar());
            }
        }
        public void setOperacion(Operacion operacion) {
            this.operacion = operacion;
        }
    }

}
