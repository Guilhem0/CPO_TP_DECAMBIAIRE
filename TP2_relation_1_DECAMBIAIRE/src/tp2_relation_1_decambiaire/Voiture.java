/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_decambiaire;

/**
 *
 * @author guilh
 */
public class Voiture {
    String modele;
    String marque;
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = modele + " " +marque ;
    return chaine_a_retourner ;
    }
}
