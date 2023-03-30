/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pruebajunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author froste
 */
public class PedidoTest {

    @Test
    public void testCantidad() {
        Producto p1 = new Producto("Coco", 400);
        Producto p2 = new Producto("Canela", 200);
        Pedido p = new Pedido();
        assertEquals(0,p.cantidad());
        p.agregar(p1);
        assertEquals(1,p.cantidad());
        p.agregar (p2);
        assertEquals(2,p.cantidad());
}
}
