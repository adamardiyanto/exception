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
public class Persegi extends Geometri {

    @Override
double luas (double sisi){
    
    return (sisi*sisi);
}   
    @Override
double keliling (double sisi){
    return (4*sisi);
}

    @Override
    double volume(double sisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double luasPermukaan(double sisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}


