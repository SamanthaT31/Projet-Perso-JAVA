package poo.main;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMANTHA
 */
public class Animationjaponaise extends Dessinanime{

    public Animationjaponaise() {
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    protected void choisiranime(){
       noms.add("One piece");
       noms.add("Naruto");
       noms.add("Dragon ball super");
       System.out.print("\n");
       System.out.println("Saisissez le nom parmi la deuxième liste qui vous est présenté : ");
       for(int i=0; i<noms.size(); i++){
           System.out.println(noms.get(i));
       }
    while( choix == true){
       Scanner Liste2 = new Scanner(System.in);
       nom = Liste2.nextLine();
       if(!"One piece".equals(nom)||"Naruto".equals(nom)||"Dragon ball super".equals(nom)){
           System.out.println("Veuillez ressaisir correctement le dessin animé.");
           
       } else {
           setNom(nom);
           choix = false;
        }
    }
    System.out.print("\n");
}
    protected void caracteristiqueAnime(){
        
    }
        }
    

