/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;

/**
 *
 * @author sebascardonac11
 */
public class Calculos {

    private LinkedList<Double> x;
    private LinkedList<Double> LnX;
    private double avgLnX = 0;

    private double varianza;
    private double desviacion;

    public Calculos(LinkedList<Double> x) {
        this.x = x;
        this.calculosI();
    }

    private void calculosI() {
  
        for (Double dataI2 : this.x) {
            Double lnX=Math.log(dataI2);
            this.avgLnX += lnX;
        }
        this.avgLnX = this.avgLnX / this.x.size();
    

        for (Double dataI1 : this.x) {
            Double lnX=Math.log(dataI1);
            this.varianza += Math.pow((lnX - this.avgLnX ), 2);
        }
        this.desviacion = Math.sqrt((this.varianza)/(this.x.size()-1));

    }
    public double getVS() {
        double vs = (this.avgLnX) - (2 * (this.desviacion));
        return Math.pow(Math.E, vs);
    }

    public double getS() {
        double vs = this.avgLnX - this.desviacion;
        return Math.pow(Math.E, vs);
    }
    public double getM() {
        double vs = this.avgLnX;
        return Math.pow(Math.E, vs);
    }

    public double getL() {
        double vs = this.avgLnX + this.desviacion;
        return Math.pow(Math.E, vs);
    }
    public double getVL() {
        double vs = this.avgLnX + (2*this.desviacion);
        return Math.pow(Math.E, vs);
    }
   
}
