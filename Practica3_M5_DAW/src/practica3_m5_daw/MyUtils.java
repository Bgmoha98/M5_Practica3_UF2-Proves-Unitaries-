/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_m5_daw;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Moha
 */
public class MyUtils {

    public static String inverteix(String cadena) {
        // declaro variable resultado vacia para ir almacenando luego de caracter
        //en carater en orden inverso.
        String resultado = "";

        //Si la cadena es null, devolvera null.
        if (cadena == null) {
            resultado = null;
        } else {
            // Recorro la longitud de la cadena en orden inverso y voy
            // guardando de caracter en caracter en la variable resultado
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    /**
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     */
    public static int edat(int day, int month, int year) {
        // Importo LocalDate y creo objeto fechaNacimiento donde le paso
        // el año, mes y dia.
        LocalDate fechaNacimiento = LocalDate.of(year, month, day);

        // Creo objeto fechaActual ya que LocalDate.now() me da la fecha exacta de hoy.
        LocalDate fechaActual = LocalDate.now();

        // En la variable edad almaceno la edad ya que le paso fecha nacimiento
        // fecha actual y me indica los edad(años)
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
        // Si la fecha que le pasamos es superior a la actual o si el año es
        // menor que 0, retornara -2
        if (fechaNacimiento.isAfter(fechaActual) || year < 0) {
            // Fecha de nacimiento en el futuro
            return -2;
        }
        // Si la edad es superior a 150, devolvera -1
        if (edad > 150) {
            // Edad mayor que 150 años
            return -1;
        }

        // si no se cumplen las anteriores condiciones, devolvera la edad
        return edad;

    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {
        double resultado = 0;
        if (numero == 0) {
            return 1;
        } else {
            if (numero < 0) {
                return -1;
            } else {
                resultado = numero * factorial(numero - 1);
            }

        }
        return resultado;
    }

}
