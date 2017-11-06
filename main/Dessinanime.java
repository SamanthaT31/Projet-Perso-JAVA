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
    String nom;
    String createur;
    String description;
    int episodes;
    ArrayList noms = new ArrayList();
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

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

        public Dessinanime(){
            choisiranime();
            caracteristiqueAnime();
        }
        protected void choisiranime(){
           
        }
        protected void caracteristiqueAnime(){
            
        }
}
