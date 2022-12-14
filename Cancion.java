

//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 

//Andre Yatmian Jo Mai 22199
//Esteban Meza 22252

import java.time.Duration;
import java.util.Scanner;

/**
 * Cancion
 */
public class Cancion implements ICancion  {
    String nombre;
    Duration Duracion;
    String genero;
    String autor;
    Scanner teclado = new Scanner(System.in);

    

    




    public Cancion(String nombre, Duration Duracion, String genero, String autor) {
        this.nombre = nombre;
        this.Duracion = Duracion;
        this.genero = genero;
        this.autor = autor;
    }
    


  

    /**
     * @return El nombre de la canción.
     */
    public String obtenerNombre(){

        System.out.println("Por favor ingresar el nombre de la cancion");
        nombre = teclado.nextLine();
        
        return nombre;
    }

    /**
     * 
     * @return La duración de la canción.
     */
    public Duration obtenerDuracion(){
        int duracion = 0;
        System.out.println("Por favor ingresar la duracion de la cancion");
        duracion = teclado.nextInt();
        Duration.ofSeconds(duracion);
        return Duracion;
    }

    /**
     * 
     * @return El género al que pertenece la canción.
     */
    public String obtenerGenero(){
        System.out.println("Por favor ingresar el genero de la cancion");
        genero = teclado.nextLine();
        return genero;

    }

    /**
     * 
     * @return El autor de la canción.
     */
    public String obtenerAutor(){
        System.out.println("Por favor ingresar el autor de la cancion");
        genero = teclado.nextLine();
        return autor;
    }

}
