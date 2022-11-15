/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author guilh
 */
public class Guerrier extends Personnage {
    boolean cheval;
    
       public Guerrier (String n, int unNivVie, boolean cheval){
            super(n,unNivVie);
            if(unNivVie<0){
            nivVie=0;
            }else{
                nivVie=unNivVie;
            }
        }

    public boolean isCheval() {
        return cheval;
    }
    public String getNom() {
        return nom;
    }
    public int getNivVie() {
        return nivVie;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNivVie(int nivVie) {
        if(nivVie<0){
            this.nivVie=0;
        }else{
            this.nivVie=nivVie;
        }
    }
      
    @Override  //on cree un toString specialise pour les epees
    public String toString() {
        return "Guerrier{Nom = "+nom+ ", Niveau de vie = "+nivVie+", à cheval ? = " + cheval + '}';
    }
       
}
