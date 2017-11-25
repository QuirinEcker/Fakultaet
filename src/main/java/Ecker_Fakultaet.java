/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1xHITM
 * ----------------------------------------------------------
 * Übungsnr.:   04
 * Übungstitel: GrownUpCalculator
 * Autoren:     Vorname Nachname
 * Version:     1.0
 * Datum:
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * ...
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * ...
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Ecker_Fakultaet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int fakultaet;
        int multiplyer = 0;

        System.out.print("Eingabe der Zalhl: ");
        input = scanner.nextInt();

        fakultaet = input;

        System.out.print(input + "! = " + input);

        for (int i = input; i > 1; i--){
            multiplyer = (i-1);
            fakultaet = fakultaet * multiplyer;
            System.out.print(" * " + multiplyer);

        }

        System.out.println(" = " + fakultaet);
    }
}
