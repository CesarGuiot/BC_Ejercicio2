package paqprincipal;

import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;

public class Principal {
    public static void main(String[] args) {
        var numeroIf = 7;
        var numeroWhile = 0;
        var numeroFor = 0;
        var estacion = "INVIERNO";
        if (numeroIf > 0) {
            System.out.println("IF");
            System.out.println("Es positivo");
            System.out.println();
        } else if (numeroIf == 0) {
            System.out.println("IF");
            System.out.println("Es cero");
            System.out.println();
        } else System.out.println("Es negativo");

        System.out.println("WHILE");
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println();
        System.out.println("DO WHILE");
        numeroWhile = 3;
        do {
            System.out.println(numeroWhile);
            numeroWhile--;
        } while (numeroWhile > 3);

        System.out.println();
        System.out.println("FOR");
        if (numeroFor <= 3) {
            for (int i = 0; i <= 2; i++) {
                numeroFor++;
                System.out.println(numeroFor);
            }
        }

        System.out.println();
        System.out.println("SWITCH");
        switch (estacion) {
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estación");


        }
    }
}
