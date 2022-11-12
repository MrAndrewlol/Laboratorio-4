

//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ITelefono
 */
public class Telefono implements ITelefono{
    private String nombre;
    private String Numbero;
    private String dueno;
    public Contacto cation = new Contacto();
    ArrayList<IContacto> arraylistcontact;



    
    Scanner teclado = new Scanner(System.in);

    /**
     * @return El nombre del teléfono. EJ: Redmi Note 8
     */
    public String obtenerNombre(){
        System.out.println("Por favor ingresar el nombre del telefono");
        nombre = teclado.nextLine();
        
        return nombre;

    }

    /**
     * @return El número del teléfono.
     */
    public String obtenerNumero(){
        System.out.println("Por favor ingresar el numero del telefono");
        Numbero = teclado.nextLine();
        
        return Numbero;

    }

    /**
     * @return El dueño del teléfono.
     */
    public String obtenerDueño(){
        System.out.println("Por favor ingresar el dueño del telefono");
        Numbero = teclado.nextLine();
        
        return dueno;

    }


    //En construccion 
    /**
     * @return Los contactos del teléfono.
     */
    public ArrayList<IContacto> obtenerContactos(){
        //System.out.println("Por favor ingresar el nombre de la cancion");
        arraylistcontact.add( new Contacto("Jose", "54507850" ) );
        arraylistcontact.add( new Contacto("Jeiby", "54507850" ) );
        //poner parametros
        return arraylistcontact;
      
    }
}
