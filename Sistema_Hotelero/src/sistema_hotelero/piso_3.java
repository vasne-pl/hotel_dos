package sistema_hotelero;

public class piso_3 extends Sistema_Hotelero{
    
    @Override
    public void tipo_de_habitacion(){
       System.out.println("        Habitacion doble");
   }
        
    @Override
    public void valor_de_noche(){
        System.out.println("        El valor de una noche es $350.000");
    }
    
    @Override
    public void equipamento(){
        System.out.println("        Dos camas, un baño, un televisor, un abanico, dos lamparas de cama.");
    }
    
}
