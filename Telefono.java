

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
    
    Telefono telefono = new Telefono();
    Scanner teclado = new Scanner(System.in);

    /**
     * @return El nombre del teléfono. EJ: Redmi Note 8
     */
    public String obtenerNombre(){
        System.out.println("Por favor ingresar el nombre de la cancion");
        nombre = teclado.nextLine();
        
        return nombre;

    }

    /**
     * @return El número del teléfono.
     */
    String obtenerNumero();

    /**
     * @return El dueño del teléfono.
     */
    String obtenerDueño();

    /**
     * @return Los contactos del teléfono.
     */
    ArrayList<IContacto> obtenerContactos();
}