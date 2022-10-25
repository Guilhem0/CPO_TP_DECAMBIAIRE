/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_decambiaire;

/**
 *
 * @author guilh
 */
public class Personne {
    String prenom;
    String nom;
    
    public Personne(String unPrenom, String unNom) {
    prenom = unPrenom;
    nom = unNom;
    }
    
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = prenom + " " +nom ;
    return chaine_a_retourner ;
    }
}
