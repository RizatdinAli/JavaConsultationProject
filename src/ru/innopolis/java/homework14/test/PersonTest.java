import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.innopolis.java.homework14.Person;
import ru.innopolis.java.homework14.Product;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Тестовое имя", 100);
    }

    @Test
    void testAddProduct_Positive() {
        Product testProduct = new Product("Тестовый продукт", 50);
        person.addProduct(testProduct);

        List<Product> expectedBag = new ArrayList<>();
        expectedBag.add(testProduct);

        assertEquals(expectedBag, person.getBag());
    }

    @Test
    void testAddProduct_Negative() {
        Product expensiveProduct = new Product("Дорогой продукт", 150);
        person.addProduct(expensiveProduct);

        assertTrue(person.getBag().isEmpty());
    }

    @Test
    void testSpendMoney() {
        person.setMoney(50);

        assertEquals(50, person.getMoney());
    }

    @Test
    void testAddNegativeMoney() {
        assertThrows(IllegalArgumentException.class, () -> person.addMoney(-10));
    }
    @Disabled
    @Test
    public void testIgnoredMethod() {
        // Тест, который будет проигнорирован
    }


}

