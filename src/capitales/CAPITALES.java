/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitales;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Miguel Laget Robles
 */
public class CAPITALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        HashMap<String,String> diccCapitales = new HashMap<String,String>();
        String pais;
        String capital;
        Scanner teclado = new Scanner(System.in);
        
        diccCapitales.put("España", "Madrid");
        diccCapitales.put("Portugal", "Lisboa");
        diccCapitales.put("Francia", "Paris");
        
        System.out.print("Escribe el nombre de un pais y te diré su capital: ");
        pais = teclado.nextLine();
        
        do
        {
            
            
            if (diccCapitales.containsKey(pais))
            {
                System.out.println("La capital de " + pais + " es "+diccCapitales.get(pais));
            }else
            {
                System.out.println("No conozco la capital de Alemania ¿Cual es la capital de Alemania?");
                capital = teclado.nextLine();
                diccCapitales.put(pais, capital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
            
          System.out.print("Escribe el nombre de un pais y te diré su capital: ");
            pais = teclado.nextLine();  
        }while(!pais.equals("salir"));
        
        
        
    }
    
}
