/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author educacionit
 */
public class Main {

    public static void main(String[] args){
        try {
            Pila<String> p=new Pila <>(30);
            p. empujar ("A");
            p. empujar ("B");
            p. empujar ("C");
            try {
                System.out.println(p.sacar());
            } catch (PilaVaciaException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            p.mostrar ();
            try {
                String e = p.sacar();
            } catch (PilaVaciaException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Pila <Integer> pi= new Pila <> (30);
            pi.empujar(30);
        } catch (PilaLlenaException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
