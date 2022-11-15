/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;
import Armes.Arme;
import java.util.*;

/**
 *
 * @author guilh
 */
public class Personnage {
    String nom;
    int nivVie;
    
    public Personnage (String unNom, int unNivVie) {
    nom = unNom;
    nivVie = unNivVie;
    }
    
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = "Nom du personnage : "+nom+"\nNiveau de vie du personnage : "+nivVie;
    return chaine_a_retourner ;
    
    }
    
    ArrayList <Arme> tabArme = new ArrayList<Arme>();
    
}
