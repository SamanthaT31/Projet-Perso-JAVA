package poo.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMANTHA

 */
public class Createur extends Dessinanime{
    String nom;
    int age;

    public Createur(String nom) {
        this.nom = nom ;
        InfoCreateur();
        
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    protected void InfoCreateur(){
        if (nom.equals("Stephen Hillenburg")){
            setAge(40);
            System.out.println("Il a "+ getAge()+ "ans.");
            }
            else if (nom.equals("Rick & Morty")){
                
                
            }
            else if (nom.equals("Les Simpson")){
                
                
            }
            else if (nom.equals("Eiichiro Oda")){
                
                
            }
            else if (nom.equals("Masashi Kishimoto")){

                
            }
            else if(nom.equals("Akira Toriyama")){
                
            }
            else {
                System.out.println("Erreur");
            }
    }
}
