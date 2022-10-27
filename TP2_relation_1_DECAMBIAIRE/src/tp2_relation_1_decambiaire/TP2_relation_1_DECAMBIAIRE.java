/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_decambiaire;

/**
 *
 * @author guilh
 */
public class TP2_relation_1_DECAMBIAIRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles :\n"+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures =+1 ;
        uneClio.propriétaire = bob ;
        
        bob.liste_voitures[1] = une2008 ;
        bob.nbVoitures =+1 ;
        une2008.propriétaire = bob ;
        
        //reno.liste_voitures[0] = uneAutreClio ;
        //reno.nbVoitures =+1 ;                        Je passe le code en commentaire pour la question 10
        //uneAutreClio.propriétaire = reno ;
        
        reno.liste_voitures[0] = uneMicra ;
        reno.nbVoitures =+1 ;
        uneMicra.propriétaire = reno ;
       

        System.out.println(bob.ajouter_voiture(une2008)); //on ajoute la 2008 a Bob et ça ne fonctionne pas, il l'a déjà
        System.out.println(reno.ajouter_voiture(uneAutreClio)); //l'ajout fonctionne

        System.out.println("uneClio est possédée par " +uneClio.propriétaire ) ;
        System.out.println("uneAutreClio est possédée par " +uneAutreClio.propriétaire ) ;
        
        System.out.println("la Micra est possédée par " +uneMicra.propriétaire ) ;
        System.out.println("la 2008 est possédée par " +une2008.propriétaire ) ;

    }
    
}
