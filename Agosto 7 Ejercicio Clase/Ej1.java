/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author shami
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglito []= {4, 5, 6, 9, 7};
        int suma= x(arreglito);
        int min = xy(arreglito);
        int max = xyy(arreglito);
        System.out.println("suma es igual: " + suma);
        System.out.println("min es igual: " + min);
        System.out.println("max es igual: " + max);
    }
    
    static int x (int [] arreglito){
        int suma= 0;
        for (int i = 0; i < arreglito.length; i++) {
            suma += arreglito [i];
        }
        return suma;
    }
    static int xy (int [] arreglito){
        int min = arreglito[0];
        for (int i = 0; i < arreglito.length; i++) {
            if(min>arreglito[i]){
                min= arreglito[i];
            }
        }
        return min;
    }
    static int xyy (int [] arreglito){
        int max = arreglito[0];
        for (int i = 0; i < arreglito.length; i++) {
            if(max<arreglito[i]){
                max=arreglito[i];
            }
        }
        return max;
    }
    
}
