package flyweight;
// Client code
public class Main {
    public static void main(String[] args) {
        TextCharacter a = CharacterFactory.getCharacter('A');
        TextCharacter b = CharacterFactory.getCharacter('B');
        TextCharacter c = CharacterFactory.getCharacter('A'); // Reusing 'A' from the flyweight pool

        a.printCharacter();
        b.printCharacter();
        c.printCharacter();

        System.out.println("a and c are the same object: " + (a == c));
    }
}