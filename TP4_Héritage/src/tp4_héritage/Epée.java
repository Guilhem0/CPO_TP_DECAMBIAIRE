/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_héritage;

/**
 *
 * @author guilh
 */
public class Epée extends Arme {
    int finesse;
    
    public Epée(String n, int unNivAttaque, int uneFinesse){
        super(n,unNivAttaque);
        if(uneFinesse>0){
            finesse=uneFinesse;
        }else{
            finesse=0;
        }
    }
}
