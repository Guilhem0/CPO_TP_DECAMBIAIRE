/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_decambiaire;

/**
 *
 * @author guilh
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
    nbConversions = 0 ;
    }
    
    public static double CelciusVersKelvin (double tCelcius) {
        tCelcius=tCelcius+273.15;
        //Convertisseur.nbConversions=nbConversions+1;
        return tCelcius;
    }
    public static double KelvinVersCelcius(double tKelvin) {
        tKelvin=tKelvin-273.15;
        return tKelvin;
    }
    public static double FarenheitVersCelcius(double tFarenheit) {
        tFarenheit=(tFarenheit-32)/1.8;
        return tFarenheit;
    }
    public static double CelciusVersFarenheit(double tCelcius) {
        tCelcius=(tCelcius*1.8)+32;
        return tCelcius;
    }
    public static double KelvinVersFarenheit(double tKelvin) {
        tKelvin=(tKelvin-273.15)*(9/5)+32;
        return tKelvin;
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
        tFarenheit=(tFarenheit-32)*(5/9)+273.15;
        return tFarenheit;
    }
    
    @Override
    public String toString () {
    return "nb de conversions "+ nbConversions;
    }

}
