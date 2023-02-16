/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab16_01;

/**
 *
 * @author PROFESOR
 */
public class Jaguar extends Auto{
    public Jaguar(){
        this.setNombreTipoAuto("Jaguar");
        this.setMaxVelocidad(250);
        this.mostrarDatosJaguar();
    }

    private void mostrarDatosJaguar() {
        System.out.println("Tipo de vehículo: "+this.getNombreTipoAuto());
        System.out.println("Máxima velocidad del vehículo: "+this.getMaxVelocidad());
    }
}
