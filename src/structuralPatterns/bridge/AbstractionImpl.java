package structuralPatterns.bridge;

class AbstractionImpl implements Abstraction {
    protected Implementation implementation;

    public AbstractionImpl(Implementation implementation) {
        this.implementation = implementation;
    }

    @Override
    public void operation() {
        implementation.performOperation();
    }
}
