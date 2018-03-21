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
public class Animationamericaine extends Dessinanime{
    
    public Animationamericaine() {
        
    }
    
    protected void choisiranime(){
       noms.add("Rick & Morty");
       noms.add("Les Simpson");
       noms.add("Bob l eponge");
       System.out.print("\n");
       System.out.println("Saisissez le nom parmi la première liste qui vous est présenté : ");
       for(int i=0; i<noms.size(); i++){
           System.out.println(noms.get(i));
       }
    while ( choix == true){
       Scanner Liste1 = new Scanner(System.in);
       nom = Liste1.nextLine();
       if(!"Bob l eponge".equals(nom)&&!"Rick & Morty".equals(nom)&&!"Les Simpson".equals(nom)){
           System.out.println("Veuillez ressaisir correctement le dessin animé.");
       } 
       else {
           setNom(nom);
            if (nom.equals("Bob l eponge")){
                setCreateur("Stephen Hillenburg");
                setDescription("Bob l'éponge est une petite éponge de mer naïve et maladroite mais positive " +
                               "employée en tant que cuisinier au Crabe Croustillant, un restaurant localisé " +
                               "dans une ville fictive, Bikini Bottom et sous la responsabilité du capitaine Krabs.");
            }
            else if (nom.equals("Rick & Morty")) {
                setCreateur("Justin Roiland");
                setDescription("Rick Sanchez est un scientifique âgé qui a récemment renoué avec sa famille. " +
                               "Il passe le plus clair de son temps à entraîner son petit-fils Morty dans" +
                               "des aventures extraordinaires et dangereuses, à travers l'espace\n" +
                               "les univers parallèles. Ajoutés à la vie de famille déjà instable de Morty, " +
                               "ces évènements ne lui amènent qu'un surplus de stress, à la maison et au collège.");
            }
            else if(nom.equals("Les Simpson")){
                setCreateur("Matt Groening");
                setDescription("Les Simpson sont une famille nucléaire composée du couple marié formé par " +
                               "Homer et Marge et de leurs trois enfants, Bart, Lisa et Maggie. " +
                               "Ils vivent au 742 Terrace Evergreen, dans la ville fictive de Springfield, aux États-Unis.");
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
    

