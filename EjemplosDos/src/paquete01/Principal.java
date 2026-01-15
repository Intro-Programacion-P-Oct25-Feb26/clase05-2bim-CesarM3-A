/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete02.DatoTrabajo;
import paquete06.Informe;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreE;
        String direccionE;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        nombreE = DatoTrabajo.obtenerNombreEmpresa();
        direccionE = DatoTrabajo.obtenerDireccionEmpresa();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        
        Informe.imprimir(nombre, apellidoRetornado, ciudad, nombreE, direccionE
                , misNotas, promedio);
        
    }
    
}
/*
Crea un codigo que permita dar un mensaje final, pero los datos que recibes para 
el mensaje final tienen que ser importados de otro paquete, se utiliza un paquete 
para notas y promdedio, otro ciudad y el ultimo para nombre y apellido. En estos 
vas a crear la clase y dentro de ella las funciones para que retornen los valores
de nombre, apellido, ciudad y promedio.
*/