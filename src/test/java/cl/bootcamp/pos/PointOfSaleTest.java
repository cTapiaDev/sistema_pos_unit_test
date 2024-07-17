package cl.bootcamp.pos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointOfSaleTest {
    
    public final double RECARGO_CUOTAS = 0.03;
    public static PointOfSale pos;
    
    @BeforeEach
    public void setUp() {
        pos = new PointOfSale();
    }
    
    @Test
    public void testMontoFinal() {
        double montoFinal = 5000 + (5000 * pos.recargoPorCuotas(4));
        assertEquals(montoFinal, pos.calcularMontoFinal(5000, 4));
    }
    
    @Test
    public void testMontoPorCuota() {
        double montoPorCuota = 10000 / 4;
        assertEquals(montoPorCuota, pos.calcularMontoPorCuota(10000, 4));
    }
    
    @Test
    public void testRecargoPorCuotas() {
        double calculoPorCuotas = (4 - 1) * RECARGO_CUOTAS;
        assertEquals(calculoPorCuotas, pos.recargoPorCuotas(4));
    }
    
    @Test
    public void testRealizarPago() {
        Ticket ticket = pos.realizarPago(new TarjetaDeCredito(
                "Banco uno", 
                "12312412541234", 
                150000, 
                EntidadFinanciera.VISA,
                new Persona(
                      "1231241-2", 
                    "Juanito", 
                    "Perez", 
                    "+5692382382", 
                    "prueba@gmail.com"
                )),
                10000,
                4
        );
        
        assertTrue(ticket instanceof Ticket);
    }
    
    
}
