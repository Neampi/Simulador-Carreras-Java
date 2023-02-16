/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab16_01;

/**
 *
 * @author PROFESOR
 */
public class Neumaticos extends DecoradorAuto{
    private Auto auto;
    
    public Neumaticos(Auto auto){
        this.auto = auto;
    }
    
    @Override
    public int getMaxVelocidad() {
        return this.auto.getMaxVelocidad() + 100; //la velocidad original se aumenta en 100
    }
}
