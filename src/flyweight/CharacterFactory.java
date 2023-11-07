package flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
class CharacterFactory {
    private static final String DEFAULT_FONT_FAMILY = "Arial";
    private static final int DEFAULT_FONT_SIZE = 12;

    private static final Map<Character, TextCharacter> characterMap = new HashMap<>();

    public static TextCharacter getCharacter(char character) {
        if (characterMap.containsKey(character)) {
            return characterMap.get(character);
        } else {
            TextCharacter newCharacter = new ConcreteCharacter(character, DEFAULT_FONT_FAMILY, DEFAULT_FONT_SIZE);
            characterMap.put(character, newCharacter);
            return newCharacter;
        }
    }
}