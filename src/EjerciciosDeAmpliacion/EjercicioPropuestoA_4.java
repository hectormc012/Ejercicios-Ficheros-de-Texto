package EjerciciosDeAmpliacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioPropuestoA_4 {
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

        try {
            int contadorLineas = 0;

            BufferedReader br = new BufferedReader(new FileReader(fichero));
                //Mostrar archivo y contar líneas
                while ((br.readLine() != null)) {
                    contadorLineas++;
                }

            System.out.println("El archivo que ha leído contiene: " + contadorLineas + " líneas.");


            //Array con el tamaño de las líneas.
            String[] lineas = new String[contadorLineas];

            BufferedReader br2 = new BufferedReader(new FileReader(fichero));
                String linea;
                int contLineaFichero = 0;

                while ((linea = br2.readLine()) != null) {
                    lineas[contLineaFichero] = linea;
                    contLineaFichero++;
                }


            //Orden Inverso
            for (int i = lineas.length - 1; i >= 0; i--) {
                System.out.println(lineas[i]);
            }

        }catch (IOException e) {
            System.out.println("Error");
        }
    }
}

