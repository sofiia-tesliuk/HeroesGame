package character;

import behaviour.HardKick;

public class Elf extends Character {
    public Elf(){
        super("Elf", 10, 10, new HardKick());
    }

}
