package src.Assignment6;

import java.util.HashMap;

class CharacterFactory{
    private HashMap<Character, Character> characterMap=new HashMap<>();

    public Character getCharacter(char value, String font,int size){
        Character character=new Character(value,font,size);

        if(!characterMap.containsKey(character)){
            characterMap.put(character,character);
        }

        return characterMap.get(character);

    }

}
