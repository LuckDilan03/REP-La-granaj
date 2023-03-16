
package lagranjadeadso;

import Clases.CLSAnimal;
import Clases.Granjero;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

public class LaGranjadeAdso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Granjero Granjero1 = new Granjero("Huesly", 1995);
        
        Granjero Granjero2 = new Granjero ("Esteban", 1999);
         LocalDate current_Date = LocalDate.now();
        int current_ano= current_Date.getYear();
        int ageGranjero1 = current_ano - Granjero1.getano();
         int ageGranjero2 = current_ano - Granjero2.getano();
         JOptionPane.showMessageDialog(null, "La edad de "+ Granjero1.getNombre()+" es "+ ageGranjero1 );
         JOptionPane.showMessageDialog(null, "La edad de "+ Granjero2.getNombre()+" es "+ ageGranjero2 );
         JOptionPane.showMessageDialog(null, current_Date.getYear() );

         if (ageGranjero1 < ageGranjero2) {
             JOptionPane.showMessageDialog(null, "El granjero "+ Granjero1.getNombre()+ " Es menor que "+ Granjero2.getNombre());
         }else
             if (ageGranjero2<ageGranjero1) {
                 JOptionPane.showMessageDialog(null,"El granjero "+ Granjero2.getNombre()+ " Es menor que el "+ Granjero1.getNombre());
             }
             else
               JOptionPane.showMessageDialog(null,"los granjeros tienen los mismos años");

    }
    
}
