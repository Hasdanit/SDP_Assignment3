package src.Assignment6;

import java.util.HashMap;

class TextEditor {
    private CharacterFactory characterFactory = new CharacterFactory();
    public void renderCharacter(Character character){

    }

    public void insertText(String text, String font, int size) {
        for (char c : text.toCharArray()) {
            Character character = characterFactory.getCharacter(c, font, size);
            renderCharacter(character);
        }
    }
}
