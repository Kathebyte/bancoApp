package bancoapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testGetNombre() {
        // Arrange
        Cliente cliente = new Cliente("Ana", 1000);

        // Act
        String resultado = cliente.getNombre();

        // Assert
        assertEquals("Ana", resultado, "El nombre del cliente no es el esperado");
    }

    @Test
    public void testGetSaldo() {
        // Arrange
        Cliente cliente = new Cliente("Carlos", 2000);

        // Act
        double resultado = cliente.getSaldo();

        // Assert
        assertEquals(2000, resultado, "El saldo inicial del cliente no es el esperado");
    }

    @Test
    public void testConsignar() {
        // Arrange
        Cliente cliente = new Cliente("Ana", 1000);

        // Act
        cliente.consignar(500);
        double resultado = cliente.getSaldo();

        // Assert
        assertEquals(1500, resultado, "El saldo después de consignar no es el correcto");
    }

    @Test
    public void testRetirar() {
        // Arrange
        Cliente cliente = new Cliente("Carlos", 2000);

        // Act
        cliente.retirar(300);
        double resultado = cliente.getSaldo();

        // Assert
        assertEquals(1700, resultado, "El saldo después de retirar no es el correcto");
    }

    @Test
    public void testRetiroFondosInsuficientes() {
    // Arrange
    Cliente cliente = new Cliente("Ana", 500);

    // Act & Assert
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        cliente.retirar(1000);
    });

    String expectedMessage = "Fondos insuficientes";
    String actualMessage = exception.getMessage();
    assertTrue(actualMessage.contains(expectedMessage));
}
}
