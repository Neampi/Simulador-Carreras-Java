/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab16_01;

/**
 *
 * @author PROFESOR
 */
public class Lamborghini extends Auto{
    public Lamborghini(){
        this.setNombreTipoAuto("Lamborghini");
        this.setMaxVelocidad(300);
        this.mostrarDatosLamborghini();
        //otro método específico de Lamborghini
    }

    private void mostrarDatosLamborghini() {
        System.out.println("Tipo de vehículo: "+this.getNombreTipoAuto());
        System.out.println("Máxima velocidad del vehículo: "+this.getMaxVelocidad());
    }
}
