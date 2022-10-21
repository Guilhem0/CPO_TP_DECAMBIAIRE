/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_decambiaire;

/**
 *
 * @author guilh
 */
public class TP2_Bieres_DECAMBIAIRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        BouteilleBiere HK = new BouteilleBiere("HK",5.0 ,"Heineken") ;
        BouteilleBiere Maximator = new BouteilleBiere("Maximator",11.6 ,"Amsterdam") ;
        
        Maximator.Décapsuler();
        
        System.out.println(uneBiere);
        System.out.println(HK);
        System.out.println(Maximator);
    }
   
}
