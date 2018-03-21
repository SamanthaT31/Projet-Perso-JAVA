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

    protected void choisiranime(){
       noms.add("One piece");
       noms.add("Dragon ball super");
       noms.add("Naruto");
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
           if (nom.equals("One piece")){
                setCreateur("Eiichiro Oda");
                setDescription("L'histoire de One Piece se déroule dans un monde fictif dominé par les océans," +
                               " où les pirates aspirent à une ère de liberté et d'aventure connue comme " +
                               "« l'âge d'or de la piraterie ». Cette époque fut inaugurée suite aux " +
                               "derniers mots prononcés par le roi des pirates, Gol D. Roger avant son exécution.\n" +
                               "Roger annonça au monde que ses habitants étaient libres de chercher toutes les " +
                               "richesses qu'il avait accumulées durant sa vie entière, le One Piece." +
                               "Les aventures d'un équipage pirate ayant pour capitaine Monkey D. Luffy feront de nombreuses rencontres");
            }
            else if (nom.equals("Naruto")){
                setCreateur("Masashi Kishimoto");
                setDescription("L'histoire commence pendant l'adolescence de Naruto, vers ses douze ans. " + 
                               "Orphelin cancre et grand farceur, il fait toutes les bêtises possibles pour se faire remarquer. " +
                               "Son rêve : devenir Hokage afin d'être reconnu par les habitants de son village. " +
                               "En effet, le démon renard à neuf queues scellé en lui a attisé la crainte et le mépris des autres villageois, " +
                               "qui, avec le temps, ne font plus de différence entre Kyûbi et Naruto. \nMalgré cela, Naruto s'entraîne dur afin " +
                               "de devenir genin, le premier niveau chez les ninjas. Après plusieurs essais, il arrive finalement " +
                               "à recevoir son bandeau frontal de Konoha et la promotion qui va avec. Il est alors inclus dans une " +
                               "équipe de trois apprentis ninjas, avec Sakura Haruno et le talentueux Sasuke Uchiwa.\n " +
                               "Peu après, ils rencontrent leur jōnin, celui qui s'occupera de leur formation : le mystérieux Kakashi Hatake.\n" +
                               "Au début craint et méprisé par ses pairs, il va peu à peu monter en puissance et gagner le respect " + 
                               "et l'affection des villageois grâce notamment aux combats dantesques qu'il remportera " +
                               "face aux ennemis les plus puissants de Konoha.");
            }
            else if(nom.equals("Dragon ball super")){
                setCreateur("Akira Toriyama");
                setDescription("Après le combat contre Boo, la Terre connait une période de paix. Cependant, le dieu de la destruction, " +
                               "Beerus, vient de se réveiller d'un sommeil de 39 ans avec l'intention d'affronter le Super Saiyan Divin, " +
                               "le guerrier légendaire dont parle une ancienne prophétie exprimée par le Poisson Oracle.");
       }
            else {
                System.out.println("Erreur");
            }
        choix = false;
        }
    }
    System.out.print("\n");
} 

}

