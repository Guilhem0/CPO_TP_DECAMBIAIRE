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
        Arme katana = new Arme("katana",25);
        katana.Stats();
        System.out.println(katana);
        
        Epée sword = new Epée("sword",10,10);
        System.out.println(sword);
    }
    
    
}
