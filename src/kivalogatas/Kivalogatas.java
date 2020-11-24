/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalogatas;

/**
 *
 * @author szark
 */
import java.util.Scanner;
public class Kivalogatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner be;
        be = new Scanner(System.in);
        
        System.out.println("\n\tKiválogatás tétele");
        System.out.println("\t\t2020.11.19\n");
        int db;
        
        System.out.print("Hány darab érdemjegyet szeretne? ");
            db = be.nextInt();
            
        int erdemjegyek[]= new int [db];       
        int masolat [] = new int [db];
        
        for (int i = 0; i < db; i++) {
            erdemjegyek[i]= (int)(Math.random()*4)+1;
        }
        System.out.print("Az érdemjegyek: ");
        for (int i = 0; i < db; i++) {
            System.out.print(erdemjegyek[i]+" ");
        }
        
        System.out.println("");
        
        int kettesekDb=0;
        for (int i = 0; i < db; i++) {
            if (erdemjegyek[i]==2) {
                masolat[kettesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Másolat tömb elemei: ");
        
            if (kettesekDb > 0){
                for (int i = 0; i < kettesekDb; i++) {
                    System.out.print(masolat[i]+" ");               
                }
            }
            else {
                System.out.print("Az érdemjegyek között nem szerepel 2-es.");
            }
        
        System.out.println("\nKettesek darabszáma: "+kettesekDb);
        
        
        
        be.close();
    }
    
}