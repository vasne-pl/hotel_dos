package sistema_hotelero;
import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
            String Estado_1 = "Disponible", Estado_2 = "Reservado", Estado_3 = "OcupadA", Estado_4 = "Mantenimiento";
            Scanner entrada = new Scanner(System.in);
            int bandera = 0;
            int seleccion = 0;
            do {
                do {
                    System.out.println("¡Bienvenido!");
                    System.out.println("    1. piso 1");
                    System.out.println("    2. piso 2");
                    System.out.println("    3. piso 3");
                    System.out.println("    4. piso 4");
                    System.out.println("    5. piso 5");
                    System.out.print("Por favor ingrese el numero del piso donde desea su habitacion: ");
                    seleccion = entrada.nextInt();

                    if (seleccion >= 1 && seleccion <= 5) {
                        bandera = 1;
                    } else {
                        System.out.println("---------------------------------------------------");
                        System.out.println("Opcion no disponible,vuelva a intentarlo por favor.");
                        System.out.println("---------------------------------------------------");
                    }  
                } while (bandera == 0);

                if (seleccion == 1) {
                    System.out.println("Tenemos dos habitaciones");
                    System.out.println("    - Habitacion 101 = " + Estado_1);
                    Sistema_Hotelero mensajero = new piso_1();
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    System.out.println("    - Habitacion 102 = " + Estado_2);
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    bandera = 2;
                } else if (seleccion == 2) {
                    System.out.println("Tenemos dos habitaciones");
                    System.out.println("    - Habitacion 201 = " + Estado_1);
                    Sistema_Hotelero mensajero = new piso_2();
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    System.out.println("    - Habitacion 202 = " + Estado_3);
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    bandera = 2;
                } else if (seleccion == 3) {
                    System.out.println("Tenemos tres habitaciones");
                    System.out.println("    - Habitacion 301 = " + Estado_4);
                    Sistema_Hotelero mensajero = new piso_3();
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    System.out.println("    - Habitacion 302 = " + Estado_1);
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    System.out.println("    - Habitacion 303 = " + Estado_2);
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    bandera = 2;
                } else if (seleccion == 4) {
                    System.out.println("Tenemos tres habitaciones");
                    System.out.println("    - Habitacion 401 = " + Estado_4);
                    Sistema_Hotelero mensajero = new piso_4();
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    System.out.println("    - Habitacion 402 = " + Estado_1);
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    bandera = 2;
                } else if (seleccion == 5) {
                    System.out.println("Tenemos una habitacione");
                    System.out.println("    - Habitacion 501 = " + Estado_2);
                    Sistema_Hotelero mensajero = new piso_5();
                    mensajero.tipo_de_habitacion();
                    mensajero.valor_de_noche();
                    mensajero.equipamento();
                    bandera = 2;
                } else if (seleccion == 6){
                
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("¡Gracias por usar nuestros servico, que tenga un buen dia.!");
                    System.out.println("-----------------------------------------------------------");
                    bandera = 2;
                
                }
            } while (bandera != 2);
        }
    }

