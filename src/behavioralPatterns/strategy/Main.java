package behavioralPatterns.strategy;
/*
*
* The PaymentStrategy interface defines the method (pay) that represents the payment behavior.

CreditCardPayment and PayPalPayment are concrete behavioralPatterns.strategy classes that implement the PaymentStrategy interface.
* They provide specific implementations of the pay method.

The ShoppingCart class represents the context.
*  It has a paymentStrategy field and a method to set the behavioralPatterns.strategy and perform the checkout.

In the Main class, we create instances of CreditCardPayment and
* PayPalPayment and set them as the payment behavioralPatterns.strategy for the shopping cart.
*
* We then perform checkouts with different payment methods.

This demonstrates how the Strategy pattern allows you to switch between different algorithms (in this case,
* payment methods) at runtime.

The Strategy pattern is particularly useful when you have multiple algorithms that can be used interchangeably,
* or when you want to select an algorithm at runtime based on some condition. It promotes flexibility and maintainability in your code.
*
* */
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy paypalPayment = new PayPalPayment("johndoe@example.com");

        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(50);
    }
}
