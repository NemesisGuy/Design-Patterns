package decorator;

class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0; // Base cost of simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
