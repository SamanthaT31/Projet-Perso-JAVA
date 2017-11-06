/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.main;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author SAMANTHA
 */
public class PooMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ce programme va vous montrer les caractéristiques d'un dessin animé américain et japonais.");
            
        Dessinanime unDessinAme = new Animationamericaine();
        System.out.println(unDessinAme.getNom());
        
        Dessinanime unDessinJap = new Animationjaponaise();
        System.out.println(unDessinJap.getNom());

    }
}
    
