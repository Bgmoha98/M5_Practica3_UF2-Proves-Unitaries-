/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_m5_daw;

/**
 *
 * @author Moha
 */
public class Practica3_M5_DAW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Imprime la cadena invertida
        System.out.print("Primer metodo, invertir cadena: ");
        System.out.println(MyUtils.inverteix(null));

        // Devuelve la edad, pero si la edad es > 150 devolvera -1 o si la fecha es erronea -2
        System.out.print("\nSegundo metodo, edades: ");
        System.out.println(MyUtils.edat(20, 2, -1850));

        // Devuelve el factorial de un numero, pero si el numero es negativo devolvera -1
        System.out.print("\nTercer metodo, factorial: ");
        System.out.println(MyUtils.factorial(10));
    }

}
