package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    // Test 1
    @Test
    void getName_whenProductCreated_shouldReturnCorrectName() {
        // Arrange
        Product currentProduct = new Product("Laptop", 1200, 1);
        // Act
        String actualName = currentProduct.getName();
        // Assert
        assertThat(actualName).isEqualTo("Laptop");
    }

    // Test 2
    @Test
    void getPrice_whenProductCreated_shouldReturnCorrectPrice() {
        // Arrange
        Product currentProduct = new Product("Laptop", 1200, 1);
        // Act
        double actualPrice = currentProduct.getPrice();
        // Assert
        assertThat(actualPrice).isCloseTo(1200, within(0.01));
    }

    // Test 3
    @Test
    void getPriceWithTax_whenProductCreated_shouldReturnCorrectPriceWithTax() {
        // Arrange
        Product currentProduct = new Product("Laptop", 1200, 1);
        // Act
        double actualPriceWithTax = currentProduct.getPriceWithTax();
        // Assert
        assertThat(actualPriceWithTax).isCloseTo(1260, within(0.01));
    }

    // Test 4
    @Test
    void constructor_whenNameIsNull_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product(null,1200, 1)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void constructor_whenNameIsBlank_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product("",1200, 1)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void constructor_whenNameIsWhiteSpace_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product(" ",1200, 1)
        ).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("required");
    }

    // Test 5
    @Test
    void constructor_whenPriceIsZero_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product("Laptop", 0, 1)
        ).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("greater than 0");
    }

    @Test
    void constructor_whenPriceIsNegative_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product("Laptop", -5, 1)
        ).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("greater than 0");
    }

    // Guided Checkpoint: Explain why testing zero matters in addition to testing a negative price.
    // A: because it's an edge case (no products should be free). Our validation excludes zeros, not just negative numbers.

    // Run the Tests
    // Temporarily change one expected result, run the test, and explain the failure. Restore the correct expectation and rerun all tests.
    // A: I temporarily changed the description for .hasMessageContaining from "greater than 0" to "greater than 1". The failure means that the test works.

    // Bonus Challenge Unit Tests
    @Test
    void constructor_whenQuantityIsZero_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product("Laptop", 1200, 0)
        ).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("greater than 0");
    }

    @Test
    void constructor_whenQuantityIsNegative_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product("Laptop", 1200, -5)
        ).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("greater than 0");
    }

    // Need to check if I need to test for incorrect data type
//    @Test
//    void constructor_whenQuantityIsNotAnInteger_shouldThrowException() {
//        assertThatThrownBy(() ->
//                new Product("Laptop", 1200, 1.5)
//        ).isInstanceOf(IllegalArgumentException.class);
//    }

    @Test
    void getInventoryValue_whenProductCreated_shouldReturnCorrectInventoryValue() {
        // Arrange
        Product currentProduct = new Product("Laptop", 1200, 2);
        // Act
        Double actualInventoryValue = currentProduct.getInventoryValue();
        // Assert
        assertThat(actualInventoryValue).isCloseTo(2400, within(0.01));
    }
}