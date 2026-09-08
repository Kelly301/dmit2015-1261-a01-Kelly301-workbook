package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getName_whenProductCreated_shouldReturnCorrectName() {
        // Arrange
        Product currentProduct = new Product("Laptop", 1200);
        // Act
        String actualName = currentProduct.getName();
        // Assert
        assertThat(actualName).isEqualTo("Laptop");
    }

    @Test
    void getPrice_whenProductCreated_shouldReturnCorrectPrice() {
        // Arrange
        Product currentProduct = new Product("Laptop", 1200);
        // Act
        double actualPrice = currentProduct.getPrice();
        // Assert
        assertThat(actualPrice).isCloseTo(1200, within(0.01));
    }

    @Test
    void getPriceWithTax_whenProductCreated_shouldReturnCorrectPriceWithTax() {
        // Arrange
        Product currentProduct = new Product("Laptop", 1200);
        // Act
        double actualPriceWithTax = currentProduct.getPriceWithTax();
        // Assert
        assertThat(actualPriceWithTax).isCloseTo(1260, within(0.01));
    }

    @Test
    void constructor_whenNameIsNull_shouldThrowException() {
        // Arrange

        // Act

        // Assert
    }

}