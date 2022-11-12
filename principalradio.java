import java.util.Scanner;

//Universidad del Valle de Guatemala
//Andre Yatmian Jo Mai 22199
//Esteban Meza 22252

//Programa parecido a MAX solo que es mejor porque se llama Tienda latinoamreicana 
//Amazon 2.0: Por lo tanto hay una categoria con sus respectivos productos y además de eso se pide en linea. 

public class principalradio{
    public static void main(String[] args){
        int opcion;
        int opciont;
        int posicion;
        String stringopcion;
        float opcionfloat;
        boolean opcionbol = true;
        Scanner teclado = new Scanner(System.in);
        Radio radio = new Radio();
        ModoReproduccion modoReproduccion = new ModoReproduccion();
        ModoTelefono modoTelefono = new ModoTelefono();
        Productividad productividad = new Productividad();
        Telefono telefono = new Telefono();
       


        System.out.println("1. Encender Radio");
        System.out.println("2. Apagar Radio");
        
        boolean estado = radio.EncenderApagar();

        while ( estado == true ){
            System.out.println("1. Subir Volumen");
            System.out.println("2. Bajar Volumen");
            System.out.println("3. Cambiar modo");
            System.out.println("4. Apagar Radio");
            System.out.println("Que opcion desea realizar");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("1. Subir Volumen");
                    radio.aumentarVolumen();
                    break;

                }
                case 2:{
                    System.out.println("3. Bajar Volumen");
                    radio.disminuirVolumen();
                    break;

                }

                case 3:{
                    System.out.println("3. Cambiar modo\n");

                    System.out.println("1. Radio");
                    System.out.println("2. Reproducción");
                    System.out.println("3. Telefono");
                    System.out.println("4. Productividad");
                    System.out.println("Que opcion desea realizar");
                    opciont = teclado.nextInt();
                    switch(opciont){
                        case 1:{ //radio
                            ModoRadio modoradio = new ModoRadio();
                            System.out.println("\n1. Cambiar modo AM o FM");
                            System.out.println("2. Cambiar Emisoras");
                            System.out.println("3. Guardar emisora");
                            System.out.println("4. Guardar emisora");
                            System.out.println("Que opcion desea realizar?");
                            opciont = teclado.nextInt();

                            switch(opciont){
                                case 1:{
                                    modoradio.obtenerBanda();
                                    System.out.println("Existe FM y AM que banda desea cambiar\n");
                                    System.out.println("1.AM");
                                    System.out.println("2.FM");
                                    opciont = teclado.nextInt();
                                    switch(opciont){
                                        case 1:{
                                            modoradio.cambiarA_AM();
                                            System.out.println("Se ha cambiado AM");
                                            break;
                                            

                                        }

                                        case 2:{
                                            modoradio.cambiarA_FM();
                                            System.out.println("Se ha cambiado FM");
                                            break;


                                        }
                                        default:{
                                            System.out.println("No se ha cambiado las emisoras");
                                            break;
                                        }

                                    }
                                    break;

                                }
                                case 2:{
                                    System.out.println("Se esta cambiando las emisoras");
                                    while(opcionbol == true){
                                        System.out.println("1.Subir");
                                        System.out.println("2.Bajar");
                                        System.out.println("3.salir");
                                        System.out.println("Que opcion desea realizar?");
                                        opciont = teclado.nextInt();
                                        teclado.nextLine();

                                        switch(opciont){
                                            case 1:{
                                                System.out.println("Subiendo Frecuencia");
                                                modoradio.subirEmisora();
                                                System.out.println(modoradio.obtenerEmisoraActual());
                                                break;

                                            }
                                            case 2:{
                                                System.out.println("Bajando frecuencia");
                                                modoradio.bajarEmisora();
                                                System.out.println(modoradio.obtenerEmisoraActual());
                                                break;
                                            }
                                            case 3:{
                                                System.out.println("Se ha salido de cambio de emisoras");
                                                opcionbol = false;
                                                break;
                                                
                                            }
                                        }


                                    }


                                }
                                case 3:{
                                    System.out.println("Guardando emisora: ");
                                    modoradio.obtenerEmisoraActual();
                                    modoradio.obtenerEmisorasGuardadas().add( modoradio.obtenerEmisoraActual());
                                    break;

                                }
                                case 4:{
                                    System.out.println("Que emisora desea cargar de sus emisoras guardadas? ");
                                    opcionfloat = teclado.nextFloat();
                                    teclado.nextLine();
                                    modoradio.cargarEmisora( modoradio.obtenerPosicionEmisora(opcionfloat));
                                    break;

                                }

                            }



                            break;




                            
                        }

                        case 2:{//Reproduccion

                            System.out.println("1.Seleccionar lista de reproduccion");
                            System.out.println("2.Cambiar cancion");
                            System.out.println("3.Escuchar cancion");
                            System.out.println("4.Salir");
                            System.out.println("Que opcion desea realizar");
                            opcion = teclado.nextInt();
                            switch(opcion){
                                case 1:{
                                    System.out.println("Hay " + modoReproduccion.obtenerPlaylists().size() + " playlists");
                                    System.out.println("Que numero de playlist desea usar?");
                                    
                                    posicion = teclado.nextInt();
                                    modoReproduccion.seleccionarPlaylist(posicion);
                                    System.out.println("Se esta reproduciendo actualmente.");


                                    break;
                                }

                                case 2:{
                                    System.out.println("1.Siguiente cancion");
                                    System.out.println("2.Cancion anterior");
                                    System.out.println("3.Salir");
                                    opcion = teclado.nextInt();
                                    switch(opcion){
                                        case 1:{
                                            System.out.println("Se reproduce la siguiente cancion");
                                            modoReproduccion.siguienteCancion();


                                        }

                                        case 2:{
                                            System.out.println("Se reproduce la cancion anterior");
                                            modoReproduccion.cancionAnterior();

                                        }
                                        default:{
                                            System.out.println("Se ha salido");
                                            break;
                                        }
                                    }

                                    
                                    break;
                                }
                                
                                case 3:{
                                    System.out.println("Reproduciendo");
                                    System.out.println(modoReproduccion.obtenerCancion().obtenerNombre() + modoReproduccion.obtenerCancion().obtenerAutor());                                   
                                    System.out.println(modoReproduccion.obtenerCancion().obtenerDuracion()) ;  
                                    break;
                                }
                                
                                case 4:{
                                    System.out.println("Saliendo...");
                                    
                                    break;
                                }
                                default:{
                                    System.out.println("No se ingreso una opcion valida regresando");
                                }
                            }
                            
                            
                            

                            break;
                            
                        }

                        case 3:{//Telefono
                            System.out.println("1.Conectar telefono");
                            System.out.println("2.Mostrar contactos");
                            System.out.println("3.Llamar contactos");
                            System.out.println("4.Finalizar llamada");
                            System.out.println("5.Llamada en espera");
                            System.out.println("6.Salir");
                            opcion = teclado.nextInt();
                            switch(opcion){

                                case 1:{
                                    System.out.println("Conectando telefono...");
                                    modoTelefono.conectarTelefono(telefono);
                                    telefono.obtenerNombre();
                                    telefono.obtenerDueño();
                                    telefono.obtenerNumero();

                                    break;
                                    
                                    
                                }
                                case 2:{
                                    System.out.println("Mostrando contactos..");
                                    for (int i = 0; i <= telefono.obtenerContactos().size(); i++){

                                        System.out.println((i+1)+". "+ telefono.obtenerContactos().get(i).obtenerNombre());
                                        System.out.println(telefono.obtenerContactos().get(i).obtenerNumero());
                                        System.out.println("\n");
                                        
                                    }

                                    break;

                                    
                                }
                                case 3:{

                                    for (int i = 0; i <= telefono.obtenerContactos().size(); i++){

                                        System.out.println((i+1)+". "+ telefono.obtenerContactos().get(i).obtenerNombre());
                                        System.out.println(telefono.obtenerContactos().get(i).obtenerNumero());
                                        System.out.println("\n");
                                        
                                    }

                                    System.out.println("Que numero desea llamar?");
                                    stringopcion = teclado.nextLine();
                                    System.out.println("Llamando a " + stringopcion);

                                    


                                    break; 
                                }
                                case 4:{
                                    System.out.println("Finalizando la llamada...");
                                    break; 
                                    
                                }
                                case 5:{
                                    System.out.println("LLamada en espera....");
                                    break; 

                                    
                                }
                                case 6:{
                                    modoTelefono.desconectarTelefono();
                                    System.out.println("Saliendo...");
                                    break; 
                                }
                            }

                            
                            

                            break;
                        }

                        case 4:{//Productividad


                            System.out.println("El pronostico del dia de hoy es..." + productividad.obtenerPronóstico());





                            break;
                            
                        }

                        default:{
                            System.out.println("No se ha ingresado una opcion valida");

                            break;
                        }

                    }



                    
                    break;

                    

                }
                case 4:{
                    System.out.println("Se ha apagado la radio");
                    estado = false;
                    break;

                }
                default:{
                    System.out.println("Se ha apagado la radio porque no hay opcion valida");
                    estado = false;
                    break;
                }
            }

            

            
            

            
        } 

    }
}
