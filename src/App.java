import ar.com.ada.oop.instantiation.Bill;
import ar.com.ada.oop.instantiation.Persona;
import ar.com.ada.oop.overloading.Arithmetic;

public class App {

    public static void main(String[] args) {
        Arithmetic calculator = new Arithmetic();
        calculator.sum(2, 2);

    }

    public double sum(double sumandoA, double sumandoB) {
        double resultado = sumandoA + sumandoB;

        return  resultado;


    }


    /*Persona ana = new Persona();
        ana.SetName("Ana");
        ana.setLastName("Castro");
        System.out.println(ana.getName() + ana.getLastName());

        Persona kelly = new Persona("Kelly");
        kelly.setLastName("Arango");
        System.out.println(kelly.getName() + kelly.getLastName());

        Persona samy = new Persona("Samantha", "Arango");
        System.out.println(samy.getName() + samy.getLastName());

    }*/
    Bill bill = new Bill(14568, "Juan", 5);

}

