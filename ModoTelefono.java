

//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 

import java.util.ArrayList;

/**
 * IModoTelefono
 */
public class ModoTelefono {

    public ArrayList<IContacto> Arraylistcontacto; 

    /**
     * Intenta conectarse al teléfono dado.
     */
    boolean conectarTelefono(ITelefono telefono){
        boolean boleanus = false;
        if (telefono == null){
            boleanus = false;
            System.out.println("Se ha encontrado el telefono");
        }
        else{
            boleanus = true;
        }
        
        
        return boleanus;

        
    }

    /**
     * Se desconecta del teléfono dado.
     */
    void desconectarTelefono(){
        System.out.println("Se ha desconectado el telefono");

    }

    /**
     * 
     * @return los contactos dados por el teléfono.
     */
    ArrayList<IContacto> obtenerContactos(){
        return Arraylistcontacto;
        
    }
}