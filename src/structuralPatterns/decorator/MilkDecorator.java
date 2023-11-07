package structuralPatterns.decorator;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // Additional cost for milk
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk";
    }
}
