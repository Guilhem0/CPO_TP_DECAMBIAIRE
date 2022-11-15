/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;


/**
 *
 * @author guilh
 */
public class Baton extends Arme {
    int age;
    
    public Baton (String n, int unNivAttaque, int unAge){
        super(n,unNivAttaque);
        if(unAge>0 && unAge<100){
            age=unAge;
        }
        if(unAge>100){
            age=100;
        }
        if(unAge<0){
            age=0;
        }
        if(unNivAttaque>0 && unNivAttaque<100){
            nivAttaque=unNivAttaque;
        }
        if(unNivAttaque>100){
            nivAttaque=100;
        }
        if(unNivAttaque<0){
            nivAttaque=0;
        }
    }

    public int getAge() {
        return age;
    }
    public String getNom() {
        return nom;
    }
    public int getNivAttaque() {
        return nivAttaque;
    }

    public void setAge(int age) {
        if(age>0 && age<100){
            this.age=age;
        }
        if(age>100){
            this.age=100;
        }
        if(age<0){
            this.age=0;
        }
    }
    public void setNivAttaque(int nivAttaque) {
                if(nivAttaque>0 && nivAttaque<100){
            this.nivAttaque=nivAttaque;
        }
        if(nivAttaque>100){
            this.nivAttaque=100;
        }
        if(nivAttaque<0){
            this.nivAttaque=0;
        }
    }
        public void setNom(String nom) {
            this.nom = nom;
        }   
    
    @Override  //on cree un toString specialise pour les epees
    public String toString() {
        return "Baton{Nom = "+nom+ ", Niveau = "+nivAttaque+", age = " + age + '}';
    }
}
