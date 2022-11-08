/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_héritage;

/**
 *
 * @author guilh
 */
public class Baton extends Arme {
    int age;
    
    public Baton(String unNom, int unNivAttaque, int unAge){
        super(unNom,unNivAttaque);
        if(unAge>0){
            age=unAge;
        }else{
            age=0;
        }
    }
}
