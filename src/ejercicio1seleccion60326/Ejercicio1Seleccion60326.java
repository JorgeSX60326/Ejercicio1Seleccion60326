/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion60326;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class Ejercicio1Seleccion60326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int primernum =0 ;
        int segundonum = 0;
        int tercernum = 0;
        //Declaramos objeto scanner
        Scanner datos = new Scanner(System.in);
        //Solicitamos los datos
        System.out.println(" Inserte un numero entero: ");
        primernum = datos.nextInt();
       
        System.out.println(" Inserte otro numero entero: ");
        segundonum = datos.nextInt();
        
        System.out.println(" Inserte un tercer numero entero: ");
        tercernum = datos.nextInt();
        
        //Hacemos la estructura if else
        if (primernum > segundonum){
            if (primernum > tercernum){
                System.out.println(" El mayor numero escrito es: " + primernum);
            }
            else{
                System.out.println(" El mayor numero escrito es de: " + tercernum);
            }
        }else
            if (segundonum > tercernum){
                System.out.println(" El mayor numero escrito es de: " + segundonum);
            }
            else{
                System.out.println(" El mayor numero escrito es de: " + tercernum);
            }
        
    }
    
}
