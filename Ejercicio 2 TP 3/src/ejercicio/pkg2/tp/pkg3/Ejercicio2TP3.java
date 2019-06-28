/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.tp.pkg3;

/**
 *
 * @author Emanuel
 */
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ejercicio2TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Circulo[] circulo = new Circulo[10];

        DecimalFormat form = new DecimalFormat("#.##");
        form.setRoundingMode(RoundingMode.HALF_UP);

        for (int x = 0; x < 10; x++) {
            circulo[x] = new Circulo();
            System.out.print("ingrese el radio del circulo " + (x + 1) + ": ");
            circulo[x].setRadio(entrada.nextInt());
        }
        double min = circulo[0].getPerimetro(), max = circulo[0].getPerimetro(), cirmin = 0, cirmax = 0;

        //busca el menor y mayor perimetro
        for (int x = 0; x < 10; x++) {
            if (min >= circulo[x].getPerimetro()) {
                min = circulo[x].getPerimetro();
                cirmin = circulo[x].getRadio();
            }
            if (max <= circulo[x].getPerimetro()) {
                max = circulo[x].getPerimetro();
                cirmax = circulo[x].getRadio();
            }
        }
        System.out.println("");
        System.out.println("El circulo con menor Perimetro es: " + cirmin + " de perimetro: " + form.format(min));
        System.out.println("El circulo con mayor Perimetro es: " + cirmax + " de perimetro " + form.format(max));

        //busca la menor y mayor area
        min = circulo[0].getArea();
        max = circulo[0].getArea();
        for (int x = 0; x < 10; x++) {
            if (min >= circulo[x].getArea()) {
                min = circulo[x].getArea();
                cirmin = circulo[x].getRadio();
            } 
            if (max < circulo[x].getArea()){
                max = circulo[x].getArea();
                cirmax = circulo[x].getRadio();
            }
        }
        System.out.println("");
        System.out.println("El circulo con menor Area es: " + cirmin + " de Area: " + form.format(min));
        System.out.println("El circulo con mayor Area es: " + cirmax + " de Area " + form.format(max));

        //busca el promedio de area y perimetro
        double pa = 0, pp = 0;
        for (int x = 0; x < 10; x++) {
            pa = pa + circulo[x].getArea();
            pp = pp + circulo[x].getPerimetro();
        }
        System.out.println("");
        System.out.println("El promedio del Area es: " + form.format(pa / 10));
        System.out.println("El promedio del Perimetro es: " + form.format(pp / 10));
    }

}
