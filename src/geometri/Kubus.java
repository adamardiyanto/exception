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
public class Kubus extends Geometri {

    @Override
    double volume(double sisi2) {
        return(sisi2*sisi2*sisi2);
    }

    @Override
    double luasPermukaan(double sisi2) {
        return (6*sisi2*sisi2);
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
