/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mariacgarciacorreas.circulo_exam.endes;

/**
 *
 * @author María Carolina García Correas
 */

public class Circulo {

    /**
     * 
     * @return 
     */
    public static int getNumCirculos() {
        return numCirculos;
    }

    /**
     * 
     * @param aNumCirculos 
     */
    public static void setNumCirculos(int aNumCirculos) {
        numCirculos = aNumCirculos;
    }

    /**
     * Variables privadas de la clase
     */
    private double radio;
    private String color;
    private static int numCirculos;
    
    /**
     * 
     * @return 
     */
    public double calculoArea(){
        if (this.radio<0)
            throw new IllegalArgumentException("Radio negativo");
        return (Math.pow(radio, 2)*Math.PI);
    }
    
    /**
     * 
     * @return
     * @throws Exception 
     */
    public double calculoPerimetro()throws Exception{
        if (this.radio<0)
            throw new Exception ("Radio negativo");
        else if(radio>=100)
            throw new Exception ("Radio muy grande");
        else 
            return (2*Math.PI*this.radio);
    }
    
    /**
     * 
     * @return
     * @throws Exception 
     */
    public boolean colorAceptable() throws Exception {
        if(color.length()>20){
            return false;
        }
        else{
            if(color.length()<=0){
                throw new Exception ("Color no existente");
            }
            return true;
        }       
    }

    /**
     * 
     * @param radio
     * @param color 
     */
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    /**
     * 
     * @return 
     */
    public double getRadio() {
        return radio;
    }

    /**
     * 
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * 
     * @return 
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
