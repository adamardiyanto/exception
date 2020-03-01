/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

/**
 *
 * @author ADAM ARDI
 */
public class Bola extends Geometri {
final double pi=3.14;
    @Override
    double volume(double sisi4) {
        double jari=sisi4*sisi4*sisi4;
        return (pi*4*jari/3);     
        
    }

    @Override
    double luasPermukaan(double sisi4) {
        return(pi*4*sisi4*sisi4);
    }

    @Override
    double luas(double sisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double keliling(double sisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
