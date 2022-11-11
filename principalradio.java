import java.util.Scanner;

//Universidad del Valle de Guatemala
//Andre Yatmian Jo Mai 22199

//Programa parecido a MAX solo que es mejor porque se llama Tienda latinoamreicana 
//Amazon 2.0: Por lo tanto hay una categoria con sus respectivos productos y además de eso se pide en linea. 

public class principalradio{
    public static void main(String[] args){
        int opcion;
        int opciont;
        boolean opcionbol = true;
        Scanner teclado = new Scanner(System.in);
        Radio radio = new Radio();
       


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
                                                break;
                                                
                                            }
                                        }


                                    }


                                }
                                case 3:{

                                }

                            }



                            break;




                            
                        }

                        case 2:{

                            break;
                            
                        }

                        case 3:{
                            

                            break;
                        }

                        case 4:{



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
