package behavioralPatterns.flyweight;

// Concrete Flyweight
class ConcreteCharacter implements TextCharacter {
    private char character;
    private String fontFamily;
    private int fontSize;

    public ConcreteCharacter(char character, String fontFamily, int fontSize) {
        this.character = character;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }

    @Override
    public void printCharacter() {
        System.out.println("Character: " + character + ", Font Family: " + fontFamily + ", Font Size: " + fontSize);
    }
}