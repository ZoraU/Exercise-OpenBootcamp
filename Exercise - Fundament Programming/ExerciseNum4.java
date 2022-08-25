import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        // Inciso No.1
        System.out.print("Digita un número: ");
        int numeroIF = lec.nextInt();
        if (numeroIF < 0) {
            System.out.println("El número " + numeroIF + " es negativo");
        }
        else if (numeroIF > 0) {
            System.out.println("El número " + numeroIF + " es positivo");
        }
        else {
            System.out.println("El número " + numeroIF +" es neutro");
        }

        // Inciso No.2
        System.out.println("--------");
        int numeroWhile = 1;
        while (numeroWhile <= 3)
        {
            System.out.print(numeroWhile + " ");
            numeroWhile ++;
        }

        // Inciso No.3
        System.out.println();
        int justDoWhile = 3;
        do {
            justDoWhile ++;
            System.out.print(justDoWhile);
        } while (justDoWhile <= 3);

        // Inciso No.4
        System.out.println();
        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++) {
            System.out.print(numeroFor + " ");
        }

        // Inciso No.5
        System.out.println();
        String estacion = "Verano";
        switch (estacion) {
            case "Primavera" :
                System.out.println("Estás en Primavera");
                break;
            case  "Verano" :
                System.out.println("Estás en Verano");
                break;
            case "Otoño" :
                System.out.println("Estás en Otoño");
                break;
            case "Invierno" :
                System.out.println("Estás en Invierno");
                break;
            default:
                System.out.println("El valor dado no representa una estación del año");
        }
    }
}