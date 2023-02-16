/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab16_01;

/**
 *
 * @author PROFESOR
 */
public class Hilo extends Thread{
    private int velocidad;
    public Hilo(String nombre, int velocidad){
        super(nombre);
        this.velocidad = velocidad;
    }
    
    public void run(){ //método que se encarga de ejecutar de operaciones concurrentes
        for(int i=0; i<20; i++){
            System.out.println(i+" "+this.getName());
            try{
                sleep((long)this.velocidad); /***/
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("\nLlegó: "+this.getName()+"!!!");
    }
    
}
