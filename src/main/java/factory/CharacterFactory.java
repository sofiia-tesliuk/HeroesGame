package factory;


import character.Character;
import character.*;
import config.Config;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class CharacterFactory {
    private HashMap<Integer, Class<? extends Character>> hm = new HashMap<>();

    public CharacterFactory(){
        hm.put(0, Hobbit.class);
        hm.put(1, Elf.class);
        hm.put(2, King.class);
        hm.put(3, Knight.class);
    }

    public Character createCharacter() throws IllegalAccessException, InstantiationException,
            NoSuchMethodException, InvocationTargetException {
            return hm.get(Config.generateRandom(0, 3)).getDeclaredConstructor().newInstance();

    }
}
