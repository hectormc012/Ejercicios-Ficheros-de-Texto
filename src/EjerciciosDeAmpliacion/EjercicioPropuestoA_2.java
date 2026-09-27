package EjerciciosDeAmpliacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioPropuestoA_2 {

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

        //Leer el archivo que el usuario desee
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            int contador = 0;

            //Mostrar archivo y contar líneas
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contador++;

                if (contador % 24 == 0){
                    System.out.println("Pulse Intro para seguir viendo el archivo");
                    sc.nextLine();
                }
            }


        }catch (IOException e) {
            System.out.println("Error");
        }

    }
}
