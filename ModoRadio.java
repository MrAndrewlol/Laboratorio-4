

//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 

import java.util.ArrayList;

/**
 * IModoRadio
 */
public class ModoRadio {
    public final float DELTA_EMISORA = 0.5f;
    public final int MAX_EMISORAS_GUARDADAS = 50;
    public boolean buleano;
    public float CambiarRadio = 0f;
    public ArrayList<Float> guardaemisoras;

    /**
     * Cambia la banda a AM.
     */
    void cambiarA_AM(){
        buleano = false;
        
        
    }

    /**
     * Cambia la banda a FM.
     */
    void cambiarA_FM(){
        buleano = true;
    }

    /**
     * Cambia de emisora a una superior por DELTA_EMISORA.
     */
    void subirEmisora(){
        CambiarRadio = CambiarRadio + DELTA_EMISORA;

    }

    /**
     * Cambia la emisora a una inferior por DELTA_EMISORA.
     */
    void bajarEmisora(){
        CambiarRadio = CambiarRadio - DELTA_EMISORA;
    }

    /**
     * 
     * @return La emisora que esta reproduciendo actualmente.
     */
    float obtenerEmisoraActual(){
        return CambiarRadio;
        
    }

    /**
     * 
     * @return Las emisoras guardadas.
     */
    ArrayList<Float> obtenerEmisorasGuardadas(){
        return guardaemisoras;
        
    }

    /**
     * Obtiene la posición de la emisora dentro de las emisoras guardadas por el
     * usuario. Devuelve -1 si la emisora no está guardada.
     * 
     * @param emisora que se quiere obtener su posición
     * @return La posición de la emisora dentro de las guardadas por el usuario.
     */
    int obtenerPosicionEmisora(float emisora){
        int veredict = -1;
        for (int i=0; guardaemisoras.size() >= i; i++){
            if (guardaemisoras.get(i)== emisora){
                veredict = i;
            }
            
        }
        return veredict;
    }

    /**
     * Guarda la emisora actual.
     */
    void guardarEmisoraActual(){
        //agregar parametro
        guardaemisoras.add(obtenerEmisoraActual());   
    }

    /**
     * Carga la emisora guardada en la posición solicitada.
     * 
     * @param posicion de la emisora a cargar.
     */
    void cargarEmisora(int posicion){
        guardaemisoras.get(posicion);
    }
}