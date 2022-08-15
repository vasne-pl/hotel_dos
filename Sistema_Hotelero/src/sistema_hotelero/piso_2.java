package sistema_hotelero;

public class piso_2 extends Sistema_Hotelero{
      
    @Override
    public void tipo_de_habitacion(){
       System.out.println("     Habitacion sencilla");
   }
        
       @Override
    public void valor_de_noche(){
        System.out.println("El valor de una noche es $120.000");
    }
    
       @Override
    public void equipamento(){
        System.out.println("        Una cama, un baño, un abanico, una lampara de cama.");
    }
}
