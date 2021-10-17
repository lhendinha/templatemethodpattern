public class StorePickupOrder extends PlaceOrderTemplate{

    @Override
    public void setDeliveryAddress() {
        System.out.println("Select nearest store for pickup");
    }

    @Override
    public void setPaymentDetails() {
        System.out.println("Pay at counter through cash");
    }
}