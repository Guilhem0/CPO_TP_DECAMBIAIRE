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
    int nbVoitures ;
    Voiture [] liste_voitures ;

    
    public Personne(String unPrenom, String unNom) {
    prenom = unPrenom;
    nom = unNom;
    nbVoitures=0;
    liste_voitures = new Voiture [3] ;
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    if (voiture_a_ajouter.propriétaire==null){
        for (int i=0; i<=3; i++){
            if (liste_voitures[i].propriétaire==null){
                liste_voitures[i].propriétaire=voiture_a_ajouter ;
                return true;
                break;
            }
        }            
    }




    
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = prenom + " " +nom ;
    return chaine_a_retourner ;
    }
    
    
}
