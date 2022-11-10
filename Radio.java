import java.util.Scanner;

public class Radio {
    
    private int CambiarVolumen; 
    private int CambiarRadio;

    Scanner teclado = new Scanner(System.in);

    Boolean EncenderApagar()
    {
        System.out.println("¿Desea Encender?");
        Boolean EncenderApagar = teclado.nextBoolean();

        if (EncenderApagar = true )
        {
            System.out.println("Radio encendido");
        }else{
            System.out.println("Radio apagado");
        }
    
        return EncenderApagar;

    }

    int CambiarVolumen()
    {
        System.out.println("Ingrese Volumen deseado entre 0 y 100");
        int Volumen = teclado.nextInt();

        if (Volumen > 100)
        {
            System.out.println("Valor ingresado no valido");
        }else{
            System.out.println("Volumen estableciod a:" +Volumen);
        }

        return CambiarVolumen;
    }

    int CambiarRadio()
    {
        System.out.println("Ingrese Radio deseada");
        int Radio = teclado.nextInt();

        System.out.println("Radio establecida a:" +Radio);

        return CambiarRadio;
    }

    
    
}
