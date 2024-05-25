import static org.junit.jupiter.api.Assertions.*;

import mk.finki.ukim.Item;
import mk.finki.ukim.SILab2;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class SILab2Test {

    @Test
    void testEveryBranch() {
        // Test case 1
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(null, 100);
        });
        assertTrue(thrown.getMessage().contains("allItems list can't be null!"));

        // Test case 2
        assertTrue(SILab2.checkCart(Arrays.asList(new Item(null, "123", 100, 0)), 100));

        // Test case 3
        thrown = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(Arrays.asList(new Item("item1", null, 100, 0)), 100);
        });
        assertTrue(thrown.getMessage().contains("No barcode!"));

        // Test case 4
        thrown = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(Arrays.asList(new Item("item1", "12a3", 100, 0)), 100);
        });
        assertTrue(thrown.getMessage().contains("Invalid character in item barcode!"));

        // Test case 5
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "123", 100, 0.1f)), 10));

        // Test case 6
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "0123", 350, 0.1f)), 30));
    }

    @Test
    void testMultipleCondition() {
        // True, True, True
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "0123", 350, 0.1f)), 31));

        // True, True, False
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "1123", 350, 0.1f)), 35));

        // True, False, True
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "0123", 350, 0)), 350));

        // True, False, False
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "1123", 350, 0)), 350));

        // False, True, True
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "0123", 200, 0.1f)), 20));

        // False, True, False
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "1123", 200, 0.1f)), 20));

        // False, False, True
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "0123", 200, 0)), 200));

        // False, False, False
        assertTrue(SILab2.checkCart(Arrays.asList(new Item("item1", "1123", 200, 0)), 200));
    }
}
