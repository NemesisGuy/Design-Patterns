package builder;

interface Builder {
    void buildPart1();
    void buildPart2();
    void buildPart3();
    Product getResult();
}