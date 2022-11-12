
//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 
//Andre Yatmian Jo Mai 22199
//Esteban Meza 22252
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
            System.out.println("No se ha encontrado el telefono");
        }
        else{
            boleanus = true;
            System.out.println("Conectando... tomando datos");
        }
        
        
        return boleanus;

        
    }

    ITelefono obtenerTelefonoConectado(){
        Telefono telefono = new Telefono();
        return telefono;
        
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
