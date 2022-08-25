public class Main {
    public static void main(String[] args) {
        // Primera Parte
        int restSuma = suma(5, 10, 15);
        System.out.println("El resultado de la suma es: " + restSuma);
        System.out.println("-----------");

        // Segunda Parte
        Coche objCoche = new Coche();
        objCoche.IncrementarPuertas();
        objCoche.IncrementarPuertas();
        objCoche.IncrementarPuertas();
        objCoche.IncrementarPuertas();
        System.out.println("El coche tiene " + objCoche.numPuertas + " puertas");
    }

    public static int suma(int xNumber, int yNumber, int zNumber) {
        return xNumber + yNumber + zNumber;
    }
}
class Coche {
    public int numPuertas = 0;

    public void IncrementarPuertas() {
        this.numPuertas ++;
    }
}
