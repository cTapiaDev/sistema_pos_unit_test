package cl.bootcamp.pos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    
    public static Persona persona;
    
    @BeforeEach
    public void setUp() {
        persona = new Persona();
    }
    
    @Test
    public void testNombreCompleto() {
        assertTrue(persona.nombreCompleto() instanceof String);
    }
}
