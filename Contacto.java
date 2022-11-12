
//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 
//Andre Yatmian Jo Mai 22199
//Esteban Meza 22252

/**
 * IContacto
 */
public class Contacto implements IContacto{

    private String nombre;
    private String numero;

    public Contacto(){
        nombre = "";
        numero = "";

    }


    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    

    /**
     * @return El nombre del contacto.
     */
    public String obtenerNombre(){
        return this.nombre;

        
    }

    /**
     * @return El número de teléfono del contacto.
     */
    public String obtenerNumero(){
        return numero;
    }
}
