/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.primito;

/**
 *
 * @author shami
 */
public class Ej2Primito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglito []= {4, 5, 6, 9, 7};
    }
    
    public static boolean EsPrimo (int [] numer){
        for(int i = 2; i<numer.length; i++){
            if(numer.length%i == 0){
                return false;
            }
        }return true;
    }
    
}
