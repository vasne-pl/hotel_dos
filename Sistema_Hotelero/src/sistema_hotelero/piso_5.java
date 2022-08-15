package sistema_hotelero;

public class piso_5 extends Sistema_Hotelero{
    
    @Override
    public void tipo_de_habitacion(){
       System.out.println("        Habitacion suite presidencial");
   }
        
    @Override
    public void valor_de_noche(){
        System.out.println("        El valor de una noche es $2.000.000");
    }
    
    @Override
    public void equipamento(){
        System.out.println("        Una cama para dos, aire acondicionado, un televisor, un baño, un balcon, un mini bar, ventanas termo acusticas, sala de estar, un comedor, una caja fuerte, zona de ropero, un espejo, un jacuzzi.");
    }
    
}
