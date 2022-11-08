/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_héritage;

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

        System.out.println(Excalibur);
    }
    
    
}
