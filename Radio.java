

//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 



//Universidad del Valle de Guatemala

//Interfaces del laboratorio 4 

/**
 * IRadio
 */
// public interface Radio extends IModoRadio, IModoReproduccion, IModoTelefono, IModoProductividad {
//     public final int DELTA_VOLUMEN = 1;

import java.util.ArrayList;
import java.util.Scanner;

    public class Radio implements IRadio{

            
        
        
        
        private int CambiarVolumen = 0;
    
        Scanner teclado = new Scanner(System.in);
    
        Boolean EncenderApagar()
        {
            System.out.println("¿Desea Encender?");
            int opcion = teclado.nextInt();
            Boolean EncenderApagar = false; 

          
                try{
                    switch(opcion){
                        case 1:{
                            System.out.println("Radio encendido");
                         EncenderApagar = true;
                         break;
        
                        }
                        case 2:{
                            System.out.println("Radio apagado");
                            EncenderApagar = true;
                            break;
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("No hay opcion valida");

                }
                return EncenderApagar;
            }


                


            
    
            
    
        public void aumentarVolumen()
        {
            if (CambiarVolumen == 100){
                System.out.println("Se ha alcanzado el limite del volumen ");
            }
            else{
                System.out.println("Aumentar el volumen de " + CambiarVolumen + " a " + (CambiarVolumen + 1) );
                CambiarVolumen = CambiarVolumen +1;
            }
            
    
           
        }

        public void disminuirVolumen(){
            
            if (CambiarVolumen == 0){
                System.out.println("Se ha alcanzado el limite del volumen ");
            }
            else{
                System.out.println("Disminuyendo el volumen de " + CambiarVolumen  + " a " + (CambiarVolumen-1)  );
                CambiarVolumen = CambiarVolumen -1;
            }

    
           
        }
    
        public void cambiarModo(ModosRadio nuevoModo)
        {
            
        }

        public ModosRadio obtenerModo(){
            
            
            return null;
            
        }



        @Override
        public void cambiarA_AM() {
            // TODO Auto-generated method stub
            
        }



        @Override
        public void cambiarA_FM() {
            // TODO Auto-generated method stub
            
        }



        @Override
        public void subirEmisora() {
            // TODO Auto-generated method stub
            
        }



        @Override
        public void bajarEmisora() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public float obtenerEmisoraActual() {
            // TODO Auto-generated method stub
            return 0;
        }


        @Override
        public ArrayList<Float> obtenerEmisorasGuardadas() {
            // TODO Auto-generated method stub
            return null;
        }


        @Override
        public int obtenerPosicionEmisora(float emisora) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public void guardarEmisoraActual() {
            // TODO Auto-generated method stub
            
        }


        @Override
        public void cargarEmisora(int posicion) {
            // TODO Auto-generated method stub
            
        }


        @Override
        public ArrayList<ArrayList<ICancion>> obtenerPlaylists() {
            // TODO Auto-generated method stub
            return null;
        }




        @Override
        public void seleccionarPlaylist(int posicion) {
            // TODO Auto-generated method stub
            
        }



        @Override
        public void siguienteCancion() {
            // TODO Auto-generated method stub
            
        }




        @Override
        public void cancionAnterior() {
            // TODO Auto-generated method stub
            
        }


        @Override
        public ICancion obtenerCancion() {
            // TODO Auto-generated method stub
            return null;
        }



        @Override
        public boolean conectarTelefono(ITelefono telefono) {
            // TODO Auto-generated method stub
            return false;
        }


        @Override
        public void desconectarTelefono() {
            // TODO Auto-generated method stub
            
        }



        @Override
        public ArrayList<IContacto> obtenerContactos() {
            // TODO Auto-generated method stub
            return null;
        }



        @Override
        public void encender() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void apagar() {
            // TODO Auto-generated method stub
            
        }



        @Override
        public Bandas obtenerBanda() {
            // TODO Auto-generated method stub
            return null;
        }


        @Override
        public ITelefono obtenerTelefonoConectado() {
            // TODO Auto-generated method stub
            return null;
        }



        @Override
        public boolean estaEncendida() {
            // TODO Auto-generated method stub
            return false;
        }


        @Override
        public int obtenerVolumen() {
            // TODO Auto-generated method stub
            return 0;
        }



}
