
package Clases;


public class CLSAnimal {
    private String Nombre;
    private char Genero;
    private int Edad;
    private String Color;
    private int Numero_patas;
    private boolean vertebrado;

    public CLSAnimal(String Nombre, char Genero, int Edad, String Color, int Numero_patas, boolean vertebrado) {
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Color = Color;
        this.Numero_patas = Numero_patas;
        this.vertebrado = vertebrado;
    }
    
   public CLSAnimal(){
       }
   
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
    this.Nombre= Nombre;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getNumero_patas() {
        return Numero_patas;
    }

    public void setNumero_patas(int Numero_patas) {
        this.Numero_patas = Numero_patas;
    }

    public boolean isVertebrado() {
        return vertebrado;
    }

    public void setVertebrado(boolean vertebrado) {
        this.vertebrado = vertebrado;
    }
    
    
    
    
    
    
          
}
