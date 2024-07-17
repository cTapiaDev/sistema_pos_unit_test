package cl.bootcamp.pos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TarjetaDeCreditoTest {
    
    private final double SALDO = 20000;
    private final double MONTO = 10000;
    public static TarjetaDeCredito tarjeta;
    
    @BeforeEach
    public void setUp() {
        tarjeta = new TarjetaDeCredito();
    }
    
    @Test
    public void testTieneSaldoDisponible() {
        tarjeta.setSaldo(SALDO);
        assertTrue(tarjeta.tieneSaldoDisponible(MONTO));
    }
    
    @Test
    public void testDescontar() {
        tarjeta.setSaldo(SALDO);
        tarjeta.descontar(MONTO);
        
        assertEquals(
                SALDO - MONTO, 
                tarjeta.getSaldo(), 
                "El saldo no se ha descontado correctamente"
        );
    }
    
    @Test
    public void testNombreTitular() {
        tarjeta.setTitular(new Persona(
                "123123", 
                "Cristobal", 
                "Soto", 
                "123124151", 
                "cristobal@gmail.com"
            )
        );
        
        assertTrue(tarjeta.nombreTitular() instanceof String);
    }
    
    
}
