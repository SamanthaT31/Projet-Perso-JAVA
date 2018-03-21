package poo.main;

import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMANTHA
 */
public class Dessinanime {
    protected String nom;
    protected String createur;
    protected String description;
    ArrayList <String> noms = new ArrayList();
    boolean choix = true;
    
    
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

    public Dessinanime() {
        
       choisiranime();
        
        Createur Creas = new Createur(nom);
        /*System.out.println(getCreateur());
        System.out.println(getDescription());*/
    }
   
    protected void choisiranime(){
       
    }

    protected void infoCreateur(){
        
    }
}
