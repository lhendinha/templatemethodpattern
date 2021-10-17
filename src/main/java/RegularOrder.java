public class RegularOrder extends PlaceOrderTemplate {

    @Override
    public void setDeliveryAddress() {
        System.out.println("Select or add new delivery address of customer");
    }

    @Override
    public void setPaymentDetails() {
        System.out.println("Provide payment details like Net banking, credit card");
    }
}