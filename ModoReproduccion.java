

//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 

import java.util.ArrayList;
import java.util.Scanner;


/**
 * IModoReproduccion
 */
public class ModoReproduccion implements IModoReproduccion {
    private ArrayList<ArrayList<ICancion>> arraylistcanciones;
    ModoReproduccion modoReproduccion = new ModoReproduccion();
    Scanner teclado = new Scanner(System.in);
    int posicion = teclado.nextInt();
    
    

    



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
        modoReproduccion.obtenerPlaylists().get(posicion);
    }
    

    /**
     * Selecciona la siguiente cancion dentro de la lista de reproducción.
     */
    public void siguienteCancion(){
        modoReproduccion.seleccionarPlaylist(posicion +1);
        
    }
    

    /**
     * Selecciona la canción anterior dentro de la lista de reproducción.
     */
    public void cancionAnterior(){
        modoReproduccion.seleccionarPlaylist(posicion -1);
    }


    /**
     * @return la canción reproduciendose actualmente.
     */
    public ICancion obtenerCancion(){
    
        modoReproduccion.seleccionarPlaylist(posicion-1);
        //poner mas cosas que se me olvido
        return null;
    }
}