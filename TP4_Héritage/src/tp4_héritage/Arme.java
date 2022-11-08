/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_héritage;

/**
 *
 * @author guilh
 */
public class Arme {
    String nom;
    int nivAttaque;
    
    
    public Arme (String unNom, int unNivAttaque) {
    nom = unNom;
    nivAttaque = unNivAttaque;
    }
    
    public void Stats() {
    System.out.println(nivAttaque) ;   
    }
    
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = "Nom de l'arme : "+nom+"\nNiveau d'attaque de l'arme : "+nivAttaque;
    return chaine_a_retourner ;
    }
    
}
