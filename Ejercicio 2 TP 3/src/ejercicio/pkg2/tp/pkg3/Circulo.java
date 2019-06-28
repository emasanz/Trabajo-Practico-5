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
public class Circulo {

    private double radio;

    public Circulo() {
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
           return this.radio * Math.PI * 2;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

}
