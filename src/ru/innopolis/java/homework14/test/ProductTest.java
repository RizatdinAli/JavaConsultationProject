import org.junit.jupiter.api.Test;
import ru.innopolis.java.homework14.Product;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void testSetPrice_Negative() {
        Product product = new Product("Тестовый продукт", 50);

        assertThrows(IllegalArgumentException.class, () -> product.setPrice(-10));
    }

    @Test
    void testSetName_Empty() {
        Product product = new Product("Тестовый продукт", 50);

        assertThrows(IllegalArgumentException.class, () -> product.setName(""));
    }

    @Test
    void testEquals() {
        Product product1 = new Product("Тестовый продукт", 50);
        Product product2 = new Product("Тестовый продукт", 50);

        assertTrue(product1.equals(product2));
    }

    @Test
    void testHashCode() {
        Product product1 = new Product("Тестовый продукт", 50);
        Product product2 = new Product("Тестовый продукт", 50);

        assertEquals(product1.hashCode(), product2.hashCode());
    }
}