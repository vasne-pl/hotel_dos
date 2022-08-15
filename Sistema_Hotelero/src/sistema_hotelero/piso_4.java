package sistema_hotelero;

public class piso_4 extends Sistema_Hotelero{
    
    @Override
    public void tipo_de_habitacion(){
       System.out.println("        Habitacion suite clase media");
   }
        
    @Override
    public void valor_de_noche(){
        System.out.println("        El valor de una noche es $700.000");
    }
    
    @Override
    public void equipamento(){
        System.out.println("        Una cama para dos personas, aire acondicionado, un televisor, un baño, una nevera, un balcon.");
    }
    
}
