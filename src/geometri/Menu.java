/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADAM ARDI
 */
public class Menu {
    public static void main(String[] args) {
       
        System.out.println("Pilihan = ");
        System.out.println("1. persegi ");
        System.out.println("2. kubus ");
        System.out.println("3. lingkaran ");
        System.out.println("4. bola ");
        Scanner a = new Scanner(System.in);
        System.out.println("masukan pilihan = ");
        int pilihan = a.nextInt();
        switch(pilihan){
            case 1 :
                try{
                 Scanner angka = new Scanner(System.in);
                 System.out.println("panjang sisi = ");
                 double sisi = angka.nextInt();
                Geometri persegi = new Persegi();
                double hasil1 = persegi.luas(sisi);
                double hasil2 = persegi.keliling(sisi);
                System.out.println("Luas = "+hasil1);
                System.out.println("Keiling = "+hasil2);
                }catch(InputMismatchException e){System.out.println("Harus Angka!!!");} 
                
                break;
            case 2 :
                try{
                Scanner angka2 = new Scanner(System.in);
                 System.out.println("jari 2 = ");
                 double sisi2 = angka2.nextInt();
                 Kubus kubus= new Kubus();
                 double hasil3= kubus.volume(sisi2);
                 double hasil4= kubus.luasPermukaan(sisi2);
                System.out.println("volume = "+hasil3);
                System.out.println("luas Permukaan = "+hasil4);
                }catch(InputMismatchException e){System.out.println("Harus Angka!!!");}
                break;

            case 3 :
                try{
                Scanner angka3 = new Scanner(System.in);
                 System.out.println("panjang sisi = ");
                 double sisi3 = angka3.nextInt();
                Lingkaran lingkaran= new Lingkaran();
                double hasil5 = lingkaran.luas(sisi3);
                double hasil6 = lingkaran.keliling(sisi3);
                System.out.println("Luas = "+hasil5);
                System.out.println("Keiling = "+hasil5);
                }catch(InputMismatchException e){System.out.println("Harus Angka!!!");}
                break;
                
            case 4 :try{
                 Scanner angka4 = new Scanner(System.in);
                 System.out.println("jari 2 = ");
                 double sisi4 = angka4.nextInt();
                 Bola bola= new Bola();
                 double hasil7= bola.volume(sisi4);
                 double hasil8= bola.luasPermukaan(sisi4);
                System.out.println("volume = "+hasil7);
                System.out.println("luas Permukaan = "+hasil8);
                }catch(InputMismatchException e){System.out.println("Harus Angka!!!");}
                break;
                
            
    }
        
}
}
    

