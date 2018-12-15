package character;

import behaviour.HardKick;

public class Elf extends Character {
    public Elf(){
        super(10, 10, new HardKick());
    }

}
