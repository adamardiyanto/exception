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
public class Lingkaran extends Geometri{
    final double pi =3.14;

    @Override
    double volume(double sisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double luasPermukaan(double sisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double luas(double sisi3) {
        return (pi*sisi3*sisi3);
    }

    @Override
    double keliling(double sisi3) {
        return(pi*2*sisi3);
    }
    
}
