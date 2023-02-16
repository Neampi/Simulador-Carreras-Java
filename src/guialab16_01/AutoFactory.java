/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab16_01;

/**
 *
 * @author PROFESOR
 */
public class AutoFactory {
    public Auto seleccionarAuto(int codigoAuto){
        switch(codigoAuto){
            case 1:
                return new Jaguar();
            case 2:
                return new Ferrari();
            case 3:
                return new Lamborghini();
            default:
                return null;
        }
    }
            
}
