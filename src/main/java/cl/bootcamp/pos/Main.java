package cl.bootcamp.pos;

public class Main {

    public static void main(String[] args) {
        
        PointOfSale pos = new PointOfSale();
        
        Persona titular1 = new Persona(
                "1231241-2", 
                "Juanito", 
                "Perez", 
                "+5692382382", 
                "prueba@gmail.com"
        );
        
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(
                "Banco uno", 
                "12312412541234", 
                150000, 
                EntidadFinanciera.VISA,
                titular1
        );
        
        System.out.println("Tarjeta antes del pago");
        System.out.println("---------------------");
        System.out.println(tarjeta1);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Generando el ticket...");
        System.out.println("---------------------");
        Ticket ticketDePago = pos.realizarPago(
                tarjeta1, 
                100000, 
                5
        );
        
        System.out.println(ticketDePago);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Tarjeta despues del pago");
        System.out.println("---------------------");
        System.out.println(tarjeta1);
        
    }
}
