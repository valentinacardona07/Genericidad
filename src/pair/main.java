package pair;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> datosPersonales = new ArrayList<>();

        int edad = 0;
        while (true) {
            System.out.print("Ingrese su edad: ");
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                break;
            } else {
                System.out.println("La edad debe ser un número entero.");
                scanner.next();
            }
        }
        String nombre = "";
        while (true) {
            System.out.print("Ingrese su nombre: ");
            if (scanner.hasNext()) {
                nombre = scanner.next();
                break;
            } else {
                System.out.println("El nombre no puede estar vacío.");
            }
        }

        Pair<Integer, String> pair = new Pair<>(edad, nombre);

        String eps = "";
        while (true) {
            System.out.print("Ingrese su EPS: ");
            if (scanner.hasNext()) {
                eps = scanner.next();
                break;
            } else {
                System.out.println("Error: La EPS no puede estar vacía.");
            }
        }
        Date fechaNacimientoDate = null;
        while (true) {
            System.out.print("Ingrese su fecha de nacimiento (yyyy-MM-dd): ");
            String fechaNacimiento = scanner.next();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                fechaNacimientoDate = sdf.parse(fechaNacimiento);
                break;
            } catch (ParseException e) {
                System.out.println("Error: La fecha de nacimiento debe ser en formato yyyy-MM-dd.");
            }
        }

        Pair<String, Date> datosExtra = new Pair<>(eps, fechaNacimientoDate);

        datosPersonales.add(pair.toString());
        datosPersonales.add(datosExtra.toString());
        
        System.out.println(datosPersonales);

    }
}
