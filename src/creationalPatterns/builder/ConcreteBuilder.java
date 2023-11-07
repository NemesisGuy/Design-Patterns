package creationalPatterns.builder;

class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("Part 1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Part 2");
    }

    @Override
    public void buildPart3() {
        product.setPart3("Part 3");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
