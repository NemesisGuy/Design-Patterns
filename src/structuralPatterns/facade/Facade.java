package structuralPatterns.facade;

class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }

    public void doTask() {
        System.out.println("Facade is doing the task...");
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}
