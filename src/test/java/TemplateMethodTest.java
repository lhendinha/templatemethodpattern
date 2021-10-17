import org.junit.jupiter.api.Test;

public class TemplateMethodTest {
    @Test
    void testTemplateMethod() {
        System.out.println("Running: testTemplateMethod");

        PlaceOrderTemplate regularOrder = new RegularOrder();
        regularOrder.placeOrder();

        PlaceOrderTemplate storePickupOrder = new StorePickupOrder();
        storePickupOrder.placeOrder();
    }
}
