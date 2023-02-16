/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab16_01;

/**
 *
 * @author PROFESOR
 */
public class Ferrari extends Auto{
    public Ferrari(){
        this.setNombreTipoAuto("Ferrari");
        this.setMaxVelocidad(200);
        this.mostrarDatosFerrari();
    }

    private void mostrarDatosFerrari() {
        System.out.println("Tipo de vehículo: "+this.getNombreTipoAuto());
        System.out.println("Máxima velocidad del vehículo: "+this.getMaxVelocidad());
    }
            
}
