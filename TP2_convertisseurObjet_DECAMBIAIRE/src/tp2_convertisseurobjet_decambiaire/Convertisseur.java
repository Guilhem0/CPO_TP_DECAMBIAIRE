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
        tCelcius=tCelcius+275.13;
        return tCelcius;
    }
    public static double KelvinVersCelcius(double tKelvin) {
        tKelvin=tKelvin-275.13;
        return tKelvin;
    }
    public static double FarenheitVersCelcius(double tFarenheit) {
        tFarenheit=(tFarenheit-32)/1.8;
        return tFarenheit;
    }
    public static double CelciusVersFarenheit(double tCelsius) {
        tCelsius=(tCelsius*1.8)+32;
        return tCelsius;
    }
    public static double KelvinVersFarenheit(double tKelvin) {
        tKelvin=(tKelvin-32)/1.8+275.13;
        return tKelvin;
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
        tFarenheit=(tFarenheit-275.13)*1.8+32;
        return tFarenheit;
    }

}
