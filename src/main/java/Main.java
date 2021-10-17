public class Main {
    public static void main(String[] args) {
        PlaceOrderTemplate regularOrder = new RegularOrder();
        regularOrder.placeOrder();

        PlaceOrderTemplate storePickupOrder = new StorePickupOrder();
        storePickupOrder.placeOrder();
    }
}