/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectconvert;

/**
 *
 * @author Fujoshi Shouter
 */
public class ProjectConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String st, st2;
        float real, real2;
        int int1, int2;
        
        //String to Float
        st = "12";
        real = (float)(new Float(st).floatValue());
        System.out.println("String to Float " + real);
        
        //Float to String
        real2 = 10;
        st2 = new Float(real2).toString();
        System.out.println("Float to String " + st2);

    }
    
}
