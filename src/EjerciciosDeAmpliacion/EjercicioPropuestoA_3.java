package EjerciciosDeAmpliacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioPropuestoA_3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //Pedir un nombre de archivo al usuario.
        System.out.print("Introduzca el nombre del archivo que desea leer: ");
        String nombreFichero = sc.nextLine();

        File fichero = new File(nombreFichero);

        //Comprobar si existe.
        if (!fichero.exists()) {
            System.out.println("No se ha encontrado el archivo");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            int contadorLineas = 0;

            while ((br.readLine()) != null) {
                contadorLineas++;
            }

            System.out.println("El archivo que ha leído contiene: " + contadorLineas + " líneas.");

        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
