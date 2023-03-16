
package Clases;

import java.util.Date;


public class Granjero {
    String Nombre;
    int ano;
    
    
    public Granjero (String Nombre, int ano){
        this.Nombre = Nombre;
        this.ano = ano;
        
        
        
        
    }
       
    public String getNombre() {
        return Nombre;
    }
     public void setNombre (String Nombre) {
         this.Nombre = Nombre;
         
     }
     public int getano (){
    return ano;
    
}
    public void setano (int ano){
        this.ano = ano;
    } 
}
