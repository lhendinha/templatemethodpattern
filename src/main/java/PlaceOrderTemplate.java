public abstract class PlaceOrderTemplate {

    public final void placeOrder() {
        addToCart();
        setDeliveryAddress();
        setPaymentDetails();
        reviewOrderDetails();
        confirmOrder();

    }

    public abstract void setDeliveryAddress();

    public abstract void setPaymentDetails();

    public final void addToCart() {
        System.out.println("Items added to cart");

    }

    public final void reviewOrderDetails() {
        System.out.println("Review the order details");
    }

    public final void confirmOrder() {
        System.out.println("Place the order after reviewing");
    }
}