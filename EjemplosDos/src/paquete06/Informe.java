/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author ASUS
 */
public class Informe {

    public static void imprimir(String n, String a, String c, String nE, String dE,
            double [] notas, double promedio) {
        String notas1 = "";
        for (int f = 0; f < 4; f++) {
            notas1 = String.format("%s\n%.2f\n", notas1, notas[f]);
        }
        System.out.printf("Los datos ingresados son:\n"
                    + "Nombre: %s\n"
                    + "Apellido: %s\n"
                    + "Ciudad: %s\n"
                    + "Nombre empresa: %s\n"
                    + "Dirección empresa: %s\n"
                    + "Notas: \n%s\n"
                    + "Promedio: %.2f\n",
                    n,
                    a,
                    c,
                    nE, dE, notas1, promedio);
    }
}
