/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_héritage;

import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class TP4_Héritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Epée Excalibur = new Epée("Excalibur",7,5);
        Epée Durandal = new Epée("Durandal",4,7);
        
        Baton Chêne = new Baton("Chêne",4,5);
        Baton Charme = new Baton("Charme",5,6);

        ArrayList <Arme> listeArme = new ArrayList<Arme>();
        listeArme.add(Excalibur);
        listeArme.add(Durandal);
        listeArme.add(Chêne);
        listeArme.add(Charme);
        
        for (int i=0;i<listeArme.size();i++){
            System.out.println(listeArme.get(i));
        }
    }
    
    
}
