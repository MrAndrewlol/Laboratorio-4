

//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 
//Andre Yatmian Jo Mai 22199
//Esteban Meza 22252

import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * IModoReproduccion
 */
public class ModoReproduccion implements IModoReproduccion {
    ArrayList<ArrayList<ICancion>> arraylistcanciones;
    Scanner teclado = new Scanner(System.in);
    Duration duracion = Duration.ofSeconds(120);
    int posicion;
    int posicion2;
    ICancion cancion = new Cancion("Antonio", duracion , "Rock", "Antonio");
    ICancion cancion1 = new Cancion("DOJA", duracion, "pop", "Dua");
    ICancion cancion2 = new Cancion("CAT", duracion, "ESBN", "PEPE");
    


    
    
    

    



    /**
     * @return una lista con todas las playlists disponibles.
     */
    public ArrayList<ArrayList<ICancion>> obtenerPlaylists(){
        
        return arraylistcanciones;
        
    }

    /**
     * Selecciona una de las playlists guardadas.
     * 
     * @param posicion la posición de la playlist a seleccionar.
     */
    public void seleccionarPlaylist(int posicion){
        posicion2 = posicion;
        arraylistcanciones.get(posicion);
    }
    

    /**
     * Selecciona la siguiente cancion dentro de la lista de reproducción.
     */
    public void siguienteCancion(){
        arraylistcanciones.get(posicion2 +1);
        
    }
    

    /**
     * Selecciona la canción anterior dentro de la lista de reproducción.
     */
    public void cancionAnterior(){
        arraylistcanciones.get(posicion2 -1);
    }


    /**
     * @return la canción reproduciendose actualmente.
     */
    public ICancion obtenerCancion(){
        posicion = teclado.nextInt();
        cancion = arraylistcanciones.get(posicion2).get(posicion);
    
        return cancion;
        

    }

    public void agregarcancnion(){
        arraylistcanciones.get(posicion).add(cancion);
        arraylistcanciones.get(posicion).add(cancion1);
        arraylistcanciones.get(posicion).add(cancion2);
        arraylistcanciones.get(posicion).add(cancion1);
    
    
       
        
        
        

    }
   
    
}
