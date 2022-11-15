/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_héritage;

import Armes.Epée;
import Armes.Baton;
import Armes.*;
import Personnage.*;



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
        
        //Excalibur.setNivAttaque(-5);
        //Durandal.setFinesse(150);
        //Chêne.setNivAttaque(200);
        //Charme.setAge(-10);
        
        Magicien Gandalf = new Magicien("Gandalf",65,true);
        Magicien Garcimore = new Magicien("Garcimore",44,false);       
        Guerrier Conan = new Guerrier("Conan",78,false);
        Guerrier Lannister = new Guerrier("Lannister",45,true);
        
               
        ArrayList <Arme> listeArme = new ArrayList<Arme>();
        listeArme.add(Excalibur);
        listeArme.add(Durandal);
        listeArme.add(Chêne);
        listeArme.add(Charme);        
        for (int i=0;i<listeArme.size();i++){
            System.out.println(listeArme.get(i));
        }
        
        ArrayList <Personnage> listePersonnage = new ArrayList<Personnage>();
        listePersonnage.add(Gandalf);
        Gandalf.setConfirme(true);
        
        listePersonnage.add(Garcimore);
        Garcimore.setConfirme(false);
        
        listePersonnage.add(Conan);
        Conan.setCheval(false);
        
        listePersonnage.add(Lannister);
        Lannister.setCheval(true);
        
        for (int i=0;i<listePersonnage.size();i++){
            System.out.println(listePersonnage.get(i));
        }
        
        Magicien Axel = new Magicien("Axel Badou",50,false);       
        Guerrier Clement= new Guerrier("Clement Chuzel",1,false);
        
        Baton Marabout = new Baton("Marabout",5,1);  
        Baton Trotinette = new Baton("Trotinette",2,3); 
        Baton Poutre = new Baton("Poutre",10,19);
        Epée BrasDroit = new Epée("BrasDroit",1,100);
        Epée BrasGauche = new Epée("BrasGauche",1,100);
        Epée katana = new Epée("katana",15,50);
        
        Axel.setArmeEnMain("Trotinette");
        Clement.setArmeEnMain("BrasDroit");
        
        
        
    }
    
    
    
}
